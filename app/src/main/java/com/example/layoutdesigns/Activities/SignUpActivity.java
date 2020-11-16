package com.example.layoutdesigns.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.databinding.DataBindingUtil;

import com.example.layoutdesigns.R;
import com.example.layoutdesigns.databinding.ActivitySignupBinding;

public class SignUpActivity extends Activity {
    private ActivitySignupBinding binding;
public boolean validatePassword(String s){
    return true;
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_signup);
        binding.nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((binding.name.getText().toString().isEmpty() )|| binding.lastname.getText().toString().isEmpty())
                {
                    binding.name.setError("Enter Full Name");
                }
               else if(!(binding.email.getText().toString().contains("@") && binding.email.getText().toString().contains(".com")) || binding.email.getText().toString().isEmpty())
                {
                   binding.email.setError("Enter valid Email");
                }
                else if(!validatePassword(binding.signpwd.getText().toString()))
                {
                   binding.signpwd.setError("Enter valid Password with atleast one special Character");
                }
                else if(!(binding.signpwd.getText().toString().equals(binding.repeatPwd.getText().toString()))|| binding.signpwd.getText().toString().isEmpty())
                {
                    binding.repeatPwd.setError("Password is different");
                }
               else {
                Toast.makeText(getApplicationContext(),"Name : "+binding.name.getText().toString()+" "+binding.lastname.getText().toString()+"\nEmail : "+binding.email.getText().toString()+"\nPassword : "+binding.signpwd.getText().toString(),Toast.LENGTH_LONG).show();
            }
            }
        });
    }
}
