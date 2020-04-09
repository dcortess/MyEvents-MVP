package cat.udl.tidic.amb.myevents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private TextView num_Event;
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button create = (Button) findViewById(R.id.button_create);
        num_Event = (TextView) findViewById(R.id.Num_Events);

        Bundle extras = getIntent().getExtras();
        assert extras != null;
        try
        {
            contador = 1 + extras.getInt("Contador");;
            updateContador(contador);
        }
        catch(Exception e)
        {
            Toast.makeText(getApplicationContext(),
                            "Contador inicializado", Toast.LENGTH_SHORT).show();
        }

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Registrate.class);
                intent.putExtra("Contador", contador);
                startActivity(intent);
            }
        });

    }

    public void updateContador(int contador)
    {
        String contador_plus = Integer.toString(contador);
        num_Event.setText(contador_plus);
        System.out.println("Contador" +contador_plus);
    }

}
