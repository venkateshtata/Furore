package app.first.in.furore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OtpRegistration extends AppCompatActivity implements View.OnClickListener{

    Button bContinue;
    EditText etNumber, etOtp;
    String a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        bContinue = (Button)findViewById(R.id.bContinue);
        etNumber = (EditText)findViewById(R.id.etNumber);
        etOtp = (EditText)findViewById(R.id.etOtp);

        a = etOtp.getText().toString().trim();


        bContinue.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bContinue:
                if (etOtp.getText().toString().trim().equalsIgnoreCase("1997")){
                    startActivity(new Intent(this,Register.class));
                    finish();
                }else{
                    Toast.makeText(OtpRegistration.this, "OTP not found", Toast.LENGTH_SHORT).show();
                }

        }
    }
}
