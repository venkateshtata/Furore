package app.first.in.furore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Conformation extends AppCompatActivity {
    public static final String DEFAULT = "N/A";
    Button bconfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conform);

        bconfirm = (Button)findViewById(R.id.bconfirm);
        bconfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_volunteer_registration);
                EditText et=(EditText) findViewById(R.id.etName);
                EditText ea=(EditText) findViewById(R.id.etPhone);
                EditText eb=(EditText) findViewById(R.id.etEmail);
                et.setText("");

            }
        });




    }





        }

