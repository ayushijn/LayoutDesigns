package com.example.layoutdesigns.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.databinding.DataBindingUtil;

import com.example.layoutdesigns.R;
import com.example.layoutdesigns.databinding.ActivityOneBinding;

public class DesignOneActivity extends Activity {
String no;
String pwd;
private ActivityOneBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_one);
        binding.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                no=binding.number.getText().toString();
                pwd=binding.password.getText().toString();
                if(no.isEmpty() || no.length()<10)
                {
                    binding.number.setError("Enter Valid Mobile No");
                }
                else if (pwd.isEmpty() || pwd.length()<8)
                {
                    binding.password.setError("Enter valid Password");
                }
                else
                Toast.makeText(getApplicationContext(),"Username : "+no+"\nPassword : "+pwd,Toast.LENGTH_LONG).show();
            }
        });
        binding.signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(DesignOneActivity.this,SignUpActivity.class);
                startActivity(i);

            }
        });
    }
}