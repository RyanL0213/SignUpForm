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
        final String password = "ThisIsPassword";
        final String email = "myemail@email.com";
        final EditText useremail = findViewById(R.id.editTextTextEmailAddress);
        final EditText userpassword = findViewById(R.id.editTextTextPassword);

        Button loginbutton = findViewById(R.id.button);
        loginbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            String userinputemail = useremail.getEditableText().toString();
            String userinputpassword = userpassword.getEditableText().toString();
            if(userinputemail.isEmpty()||userinputpassword.isEmpty())
                Toast.makeText(FormActivity.this,"Please enter both of your email and password.",Toast.LENGTH_SHORT).show();
            else if(userinputemail.equals(email)&&userinputpassword.equals(password))
                Toast.makeText(FormActivity.this,"Welcome, Jane Dough, to the SignUpForm App",Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(FormActivity.this,"Login information is wrong, check your email and password.",Toast.LENGTH_SHORT).show();

            }



        });

//                Toast.makeText(MainActivity.this,"You have clicked the button",Toast.LENGTH_SHORT).show();

}

}