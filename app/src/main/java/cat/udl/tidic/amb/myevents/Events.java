package cat.udl.tidic.amb.myevents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import cat.udl.tidic.amb.myevents.Presenter.User_Presenter;

public class Events extends AppCompatActivity implements UserViewActions {

    private User_Presenter presenter;
    private TextView resultat;
    private int contador=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button cancel = (Button) findViewById(R.id.Cancel_Events);
        Button accept = (Button) findViewById(R.id.Create_Events);

        presenter = new User_Presenter(this);
        resultat = (TextView) findViewById(R.id.Design);

        //update();

        Bundle extras = getIntent().getExtras();
        assert extras != null;
        String output_name = extras.getString("name");
        String output_description = extras.getString("description");
        String output_date = extras.getString("date");
        presenter.setUserFullName(output_name);
        presenter.setUserDescription(output_description);
        presenter.setEventDate(output_date);
        presenter.showBio();

        contador = extras.getInt("Contador");

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Events.this, Registrate.class);
                startActivity(intent);
            }
        });

        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Events.this, MainActivity.class);
                intent.putExtra("Contador", contador);
                startActivity(intent);
            }
        });

    }

    public void update()
    {
        Bundle extras = getIntent().getExtras();
        assert extras != null;
        String output_name = extras.getString("name");
        String output_description = extras.getString("description");
        String output_date = extras.getString("date");
        presenter.setUserFullName(output_name);
        presenter.setUserDescription(output_description);
        presenter.setEventDate(output_date);

        presenter.showBio();
    }


    @Override
    public void updateUI(String message) {
        resultat.setText(message);
    }
}
