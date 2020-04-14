package cat.udl.tidic.amb.myevents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Registrate extends AppCompatActivity {

    private int contador=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button cancel = (Button) findViewById(R.id.Cancel_Events);
        Button create = (Button) findViewById(R.id.Create_Events);

        final TextView name = (TextView) findViewById(R.id.User_name);
        final TextView description = (TextView) findViewById(R.id.User_Description);
        final CalendarView calendar = (CalendarView) findViewById(R.id.calendarView);
        final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        final String selectedDate = sdf.format(new Date(calendar.getDate()));

        name.setText("");
        description.setText("");

        Bundle extras = getIntent().getExtras();
        assert extras != null;
        contador = extras.getInt("Contador");

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registrate.this, MainActivity.class);
                intent.putExtra("Contador",contador);
                startActivity(intent);
            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String get_name = name.getText().toString();
                String get_description = description.getText().toString();
                String get_date = selectedDate;
                Intent intent = new Intent(Registrate.this, Events.class);
                intent.putExtra("name", get_name);
                intent.putExtra("description", get_description);
                intent.putExtra("date", get_date);
                intent.putExtra("Contador",contador);
                startActivity(intent);
            }
        });
    }
}
