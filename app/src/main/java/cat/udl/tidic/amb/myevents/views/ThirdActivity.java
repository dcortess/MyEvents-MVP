package cat.udl.tidic.amb.myevents.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import cat.udl.tidic.amb.myevents.R;
import cat.udl.tidic.amb.myevents.interactor.OperationInteractorImpl;
import cat.udl.tidic.amb.myevents.interfaces.OperationView;
import cat.udl.tidic.amb.myevents.views.MainActivity;
import cat.udl.tidic.amb.myevents.views.SecondActivity;

public class ThirdActivity extends AppCompatActivity implements OperationView {

    private OperationView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);



        final TextView editText_bio = (TextView) findViewById(R.id.tv_resposta);
        final Button button_cancel = findViewById(R.id.button_cancel);
        final Button button_accept = findViewById(R.id.button_accept);
        final TextView text_final = findViewById(R.id.textView_final);

        button_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SecondActivity.class);
                intent.putExtra("argumentKey", "argumentValue");
                startActivity(intent);
            }
        });

        button_accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                intent.putExtra("argumentKey", "argumentValue");
                startActivity(intent);
            }
        });

        text_final.setText(OperationInteractorImpl.onClick(SecondActivity.name,
                SecondActivity.description));
    }

/*
    @Override
    public void showResult(String bio) {
        text_final.setText(result);
        editText_bio.setText(bio);
        if (view != null) {
            view.showResult(bio);
        }
    }
    
 */
}
