package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText useremail = findViewById(R.id.editTextTextEmailAddress);
        final EditText userpassword = findViewById(R.id.editTextTextPassword);
        final EditText passwordcomfirm = findViewById(R.id.editTextTextPassword2);
        final EditText name = findViewById(R.id.editTextTextPersonName);
        Button loginbutton = findViewById(R.id.button);
        loginbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            String userinputemail = useremail.getEditableText().toString();
            String userinputpassword = userpassword.getEditableText().toString();
            String passwordcomfirmation = passwordcomfirm .getEditableText().toString();
            String username = name.getEditableText().toString();

            if(userinputemail.isEmpty()||userinputpassword.isEmpty()||passwordcomfirmation.isEmpty()||username.isEmpty())
                Toast.makeText(FormActivity.this,"Please fill out all the field.",Toast.LENGTH_SHORT).show();
            else if(userinputpassword.equals(passwordcomfirmation))
                Toast.makeText(FormActivity.this,"Welcome, "+ username + ", to the SignUpForm App",Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(FormActivity.this,"Error: Password and password comfirmation does not match!.",Toast.LENGTH_SHORT).show();

            }



        });

//                Toast.makeText(MainActivity.this,"You have clicked the button",Toast.LENGTH_SHORT).show();

}

}