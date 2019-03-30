package comp.example.hreday.learnandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//package comp.example.hreday.firebaseauthentication;

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

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText username, password;
    private Button signInButton;
    private TextView signinButton2;
    private ProgressBar progressBar;
    private FirebaseAuth mAuth;
// ...
// Initialize Firebase Auth


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.setTitle("Sign In Activity");

        username = findViewById(R.id.signInName);
        password = findViewById(R.id.signInPassword);
        mAuth = FirebaseAuth.getInstance();

        progressBar = findViewById(R.id.progressbarId);

        signInButton = findViewById(R.id.signIn);
        signinButton2 = findViewById(R.id.button1);


        signInButton.setOnClickListener(this);
        signinButton2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.signIn) {

            progressBar.setVisibility(View.VISIBLE);


            loginUser();


        } else if (v.getId() == R.id.button1) {

            Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
            startActivity(intent);


        }

    }

    private void loginUser() {


        String email = username.getText().toString().trim();
        String pass = password.getText().toString().trim();

        mAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (task.isSuccessful()) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                    Toast.makeText(LoginActivity.this, "Log in successfull", Toast.LENGTH_SHORT).show();


                } else {
                    Toast.makeText(LoginActivity.this, "Log in  is not successfull", Toast.LENGTH_SHORT).show();

                }

            }
        });


    }


}


