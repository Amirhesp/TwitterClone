package com.example.twitterclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.SaveCallback;
import com.shashank.sony.fancytoastlib.FancyToast;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        ParseInstallation.getCurrentInstallation().saveInBackground();

    }
    public void helloWorldClick(View v){
        ParseObject boxer = new ParseObject("Boxer");
        boxer.put("puchSpeed", 200);
        boxer.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e == null){
                    FancyToast.makeText(SignUp.this, "Boxer object saed seccessfuly!", FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true).show();
                }
            }
        });
    }
}
