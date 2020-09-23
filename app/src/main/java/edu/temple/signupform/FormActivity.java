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

        String password = "ThisIsPassword";
        String email = "myemail@email.com";
        EditText useremail = findViewById(R.id.editTextTextEmailAddress);
        EditText userpassword = findViewById(R.id.editTextTextPassword);

        Button loginbutton = findViewById(R.id.button);
        loginbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Toast.makeText(FormActivity.this,"You have clicked the button",Toast.LENGTH_SHORT).show();
            }


        });

}
}