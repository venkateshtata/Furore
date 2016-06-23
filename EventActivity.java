package app.first.in.furore;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import java.util.ArrayList;

public class EventActivity extends AppCompatActivity implements View.OnClickListener{

    ArrayList<String> selections = new ArrayList<String>();
    TextView pevents,userData;

    Button bContinue;
    CheckBox wgd,sd,tgam,iwsm,iwgm,cm,bb,wd,sp,fp,collage,quiz,debate,mads,street,dumb,
            shortfilm,photography;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);


        wgd = (CheckBox)findViewById(R.id.wgd);
        sd = (CheckBox)findViewById(R.id.sd);
        tgam = (CheckBox)findViewById(R.id.tgam);
        iwsm = (CheckBox)findViewById(R.id.iwsm);
        iwgm = (CheckBox)findViewById(R.id.iwgm);
        cm = (CheckBox)findViewById(R.id.cm);
        bb = (CheckBox)findViewById(R.id.bb);
        wd = (CheckBox)findViewById(R.id.wd);
        sp = (CheckBox)findViewById(R.id.sp);
        fp = (CheckBox)findViewById(R.id.fp);
        collage = (CheckBox)findViewById(R.id.collage);
        quiz = (CheckBox)findViewById(R.id.quiz);
        debate = (CheckBox)findViewById(R.id.debate);
        mads = (CheckBox)findViewById(R.id.mads);
        street = (CheckBox)findViewById(R.id.street);
        dumb = (CheckBox)findViewById(R.id.dumb);
        shortfilm = (CheckBox)findViewById(R.id.shortfilm);
        photography = (CheckBox)findViewById(R.id.photography);


        bContinue = (Button)findViewById(R.id.bContinue);

        bContinue.setOnClickListener(this);

    }

    public void selectitem(View v){
        boolean checked = ((CheckBox) v).isChecked();
        switch (v.getId()){
            case R.id.wgd:
                if (checked)
            {selections.add("western group dance");}
                else {
                    selections.remove("western group dance");
                }
                break;
            case R.id.sd:
                if (checked)
                {selections.add("solo dance");}
                else {
                    selections.remove("solo dance");
                }
                break;
            case R.id.tgam:
                if (checked)
                {selections.add("tapang guchi adu machi");}
                else {
                    selections.remove("tapang guchi adu machi");
                }
                break;
            case R.id.iwsm:
                if (checked)
                {selections.add("Indian and western solo music");}
                else {
                    selections.remove("Indian and western solo music");
                }
                break;
            case R.id.iwgm:
                if (checked)
                {selections.add("Indian and western group music");}
                else {
                    selections.remove("Indian and western group music");
                }
                break;
            case R.id.cm:
                if (checked)
                {selections.add("classical music");}
                else {
                    selections.remove("classical music");
                }
                break;
            case R.id.bb:
                if (checked)
                {selections.add("beat boxing");}
                else {
                    selections.remove("beat boxing");
                }
                break;
            case R.id.wd:
                if (checked)
                {selections.add("war of DJ's");}
                else {
                    selections.remove("war of DJ's");
                }
                break;
            case R.id.sp:
                if (checked)
                {selections.add("spot painting");}
                else {
                    selections.remove("spot painting");
                }
                break;
            case R.id.fp:
                if (checked)
                {selections.add("face painting");}
                else {
                    selections.remove("face painting");
                }
                break;
            case R.id.collage:
                if (checked)
                {selections.add("collage");}
                else {
                    selections.remove("collage");
                }
                break;
            case R.id.quiz:
                if (checked)
                {selections.add("quiz");}
                else {
                    selections.remove("quiz");
                }
                break;
            case R.id.debate:
                if (checked)
                {selections.add("debate");}
                else {
                    selections.remove("debate");
                }
                break;
            case R.id.mads:
                if (checked)
                {selections.add("mads");}
                else {
                    selections.remove("mads");
                }
                break;
            case R.id.street:
                if (checked)
                {selections.add("street");}
                else {
                    selections.remove("street");
                }
                break;
            case R.id.dumb:
                if (checked)
                {selections.add("dumb");}
                else {
                    selections.remove("dumb");
                }
                break;
            case R.id.shortfilm:
                if (checked)
                {selections.add("shortfilm");}
                else {
                    selections.remove("shortfilm");
                }
                break;
            case R.id.photography:
                if (checked)
                {selections.add("photography");}
                else {
                    selections.remove("photography");
                }
                break;

        }


    }
    public void finalSelection(View v){
        setContentView(R.layout.conform);

        userData = (TextView)findViewById(R.id.userData);
        SharedPreferences sharedpreferences=getSharedPreferences("MyData", Context.MODE_PRIVATE);
        String name =sharedpreferences.getString("name", "");
        String phone =sharedpreferences.getString("phone", "");
        String Email =sharedpreferences.getString("Email","");
        String college =sharedpreferences.getString("college","");

        userData.setText(name +" "+ phone +" "+ Email+" "+college+" ");

        pevents = (TextView)findViewById(R.id.pevents);
        String final_events="";
        for (String selection : selections){
            final_events=final_events+selection+"\n";
        }
        pevents.setText(final_events);
        pevents.setEnabled(true);


    }
    public void back(View v){
        startActivity(new Intent(this,VolunteerRegistration.class));
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.bconform:
                startActivity(new Intent(this,Conformation.class));
        }

    }
}
