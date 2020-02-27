package cat.udl.tidic.amb.myevents.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cat.udl.tidic.amb.myevents.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button_createinvitacio = findViewById(R.id.button_create);

        button_createinvitacio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SecondActivity.class);
                intent.putExtra("argumentKey", "argumentValue");
                startActivity(intent);
            }
        });
    }
}
