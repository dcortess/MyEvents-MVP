package cat.udl.tidic.amb.myevents.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import cat.udl.tidic.amb.myevents.R;
import cat.udl.tidic.amb.myevents.interfaces.OperationView;

public class SecondActivity extends AppCompatActivity implements OperationView {

    private EditText name;
    private EditText description;
    private EditText textresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final Button button_cancel = findViewById(R.id.button_cancel);
        final Button button_create = findViewById(R.id.button_create3);
        final EditText editText_nom = findViewById(R.id.editText_nom);
        final EditText editText_descripcio = findViewById(R.id.editText_description);
        final TextView resultat = findViewById(R.id.textView_resultat);

        button_create.setOnClickListener(new View.OnClickListener() {
            public void addonClick(View view) {
                String fullName = editText_nom.getText().toString();
                String description = editText_descripcio.getText().toString();
            }
        });
    }


    public void showResult(String result) {
        textresult.setText(result);
    }
}