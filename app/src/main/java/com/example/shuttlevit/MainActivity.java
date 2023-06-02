package com.example.shuttlevit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent; // Add this import statement
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button WelcomeDriverButton;
    private Button WelcomeCustomerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WelcomeCustomerButton = (Button) findViewById(R.id.welcome_customer_btn);
        WelcomeDriverButton = (Button) findViewById(R.id.button2);

        WelcomeCustomerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LoginRegisterCustomerintent = new Intent(MainActivity.this, CustomerLoginRegisterActivity.class);
                startActivity(LoginRegisterCustomerintent);
            }
        });

        WelcomeDriverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LoginRegisterDriverrIntent = new Intent(MainActivity.this, DriverLoginRegisterActivity.class);
                startActivity(LoginRegisterDriverrIntent);
            }
        });
    }
}
