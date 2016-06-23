package app.first.in.furore;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity implements View.OnClickListener {

    Button bSign;
    EditText etvName, etvPhone, etUsername, etvPassword, etvConformPaswword, etvEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        bSign = (Button) findViewById(R.id.bSign);
        etvName = (EditText) findViewById(R.id.etName);
        etvPhone = (EditText) findViewById(R.id.etPhone);
        etvEmail = (EditText) findViewById(R.id.etEmail);
        etvPassword = (EditText) findViewById(R.id.etPassword);
        etvConformPaswword = (EditText) findViewById((R.id.etConformPassword));

        bSign.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bSign:
                SharedPreferences sharedpreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("vname", etvName.getText().toString());
                editor.putString("vphone", etvPhone.getText().toString());
                editor.putString("vEmail", etvEmail.getText().toString());
                editor.putString("vpassword", etvPassword.getText().toString());
                editor.commit();
                Toast.makeText(this, "saved", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, MainActivity.class));
                break;


        }
    }
}
