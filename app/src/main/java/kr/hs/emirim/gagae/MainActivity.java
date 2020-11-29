package kr.hs.emirim.gagae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirebaseUser user= FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            setContentView(R.layout.activity_home);
            startActivity(new Intent(MainActivity.this, activity_home.class));
        } else {
            setContentView(R.layout.activity_login);
            startActivity(new Intent(MainActivity.this, activity_login.class));
        }

    }

}