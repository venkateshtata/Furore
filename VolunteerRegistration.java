package app.first.in.furore;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class VolunteerRegistration extends AppCompatActivity implements View.OnClickListener {

    EditText etName, etEmail, etPhone,etUsn;
    Button bRegister, bLogout, bSelectEvent;
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer_registration);

        etName = (EditText) findViewById(R.id.etName);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPhone = (EditText) findViewById(R.id.etPhone);


        spinner=(Spinner)findViewById(R.id.spinner);

        bRegister = (Button) findViewById(R.id.bRegister);
        bLogout = (Button) findViewById(R.id.bLogout);
        bSelectEvent = (Button) findViewById(R.id.bSelectEvent);

        bRegister.setOnClickListener(this);
        bLogout.setOnClickListener(this);
        bSelectEvent.setOnClickListener(this);



        adapter = ArrayAdapter.createFromResource(this,R.array.colleges,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    String text = spinner.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

public void save(View v)
{
    SharedPreferences sharedpreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
    SharedPreferences.Editor editor = sharedpreferences.edit();
    editor.putString("name",etName.getText().toString());
    editor.commit();
}

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bSelectEvent:
                SharedPreferences sharedpreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("name",etName.getText().toString());
                editor.putString("phone",etPhone.getText().toString());
                editor.putString("Email", etEmail.getText().toString());
                editor.putString("college",spinner.getSelectedItem().toString());
                editor.commit();
                startActivity(new Intent(this, EventActivity.class));
                break;
            case R.id.bRegister:
                startActivity(new Intent(this, VolunteerRegistration.class));
                break;
            case R.id.bLogout:
                startActivity(new Intent(this, MainActivity.class));
                break;
        }


    }

}

