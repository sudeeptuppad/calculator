package com.example.UnConverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView4, textView2;
    private EditText edittext1, n1, n2;

    private Button button2;


    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView4 = findViewById(R.id.textView4);
        edittext1 = findViewById(R.id.edittext1);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        textView2 = findViewById(R.id.textView2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Thanks for using this app", Toast.LENGTH_SHORT).show();
                //Toast.makeText(MainActivity.this, "This is another toast ", Toast.LENGTH_SHORT).show();

                String str = edittext1.getText().toString();
                int kg = Integer.parseInt(str);

                    Toast.makeText(MainActivity.this, "ENTER THE VALUE", Toast.LENGTH_SHORT).show();

                    double pound = 2.205 * kg;

                    textView4.setText("The pound is " +pound);
                }
        });


        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = n1.getText().toString();
                String str2 = n2.getText().toString();
                int add = Integer.parseInt(str1) +Integer.parseInt(str2);
                Toast.makeText(MainActivity.this, "Addition done", Toast.LENGTH_SHORT).show();
                textView2.setText("The addition is " +add);
            }
        });
    }
}