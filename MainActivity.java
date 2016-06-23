package app.first.in.furore;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bLogin,bSignup,schedule,notes,aboutus;
    UserLocalStore userLocalStore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bLogin = (Button) findViewById(R.id.blogin);
        bSignup = (Button) findViewById(R.id.bSignup);
        schedule = (Button) findViewById(R.id.schedule);
        notes = (Button) findViewById(R.id.notes);
        aboutus = (Button) findViewById(R.id.aboutus);


        userLocalStore = new UserLocalStore(this);

        bLogin.setOnClickListener(this);
        bSignup.setOnClickListener(this);
        schedule.setOnClickListener(this);
        notes.setOnClickListener(this);
        aboutus.setOnClickListener(this);
    }


    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.blogin:
                startActivity(new Intent(this, Login.class));
                break;

            case R.id.bSignup:
                startActivity(new Intent(this,OtpRegistration.class));
                break;
            case R.id.schedule:
                startActivity(new Intent(this,schedule.class));
                break;
            case R.id.notes:
                startActivity(new Intent(this,notes.class));
                break;
            case R.id.aboutus:
                startActivity(new Intent(this,aboutus.class));
                break;

        }

    }
}
