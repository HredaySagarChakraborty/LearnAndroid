package comp.example.hreday.learnandroid;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;




        public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

            private EditText username, password;
            private Button signUpButton;
            private TextView signUpButton2;
            private ProgressBar progressBar;
            private FirebaseAuth mAuth;
// ...
// Initialize Firebase Auth

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_sign_up);
                this.setTitle("Sign Up Activity");


                mAuth = FirebaseAuth.getInstance();
                progressBar = findViewById(R.id.progressbarId);


                username = findViewById(R.id.signUpName);
                password = findViewById(R.id.signUpPassword);

                signUpButton = findViewById(R.id.signUp);
                signUpButton2 = findViewById(R.id.button2);


                signUpButton.setOnClickListener(this);
                signUpButton2.setOnClickListener(this);
            }

            @Override
            public void onClick(View v) {

                if (v.getId() == R.id.signUp) {

                    userResister();
                    progressBar.setVisibility(View.VISIBLE);


                } else if (v.getId() == R.id.button2) {

                    Intent intent2 = new Intent(SignUpActivity.this, LoginActivity.class);
                    startActivity(intent2);


                }


            }

            private void userResister() {


                String email = username.getText().toString().trim();
                String pass = password.getText().toString().trim();


                mAuth.createUserWithEmailAndPassword(email, pass)
                        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {


                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progressBar.setVisibility(View.GONE);
                                if (task.isSuccessful()) {


                                    Toast.makeText(SignUpActivity.this, "Data has been registered", Toast.LENGTH_SHORT).show();


                                } else {

                                    if(task.getException() instanceof FirebaseAuthUserCollisionException){


                                        Toast.makeText(SignUpActivity.this, "Data has  already been registered", Toast.LENGTH_SHORT).show();


                                    }

                                    else {

                                        Toast.makeText(SignUpActivity.this, " Error :"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();


                                    }
                                }


                            }
                        });


            }


        }



