package com.example.volumecalculator;

import android.health.connect.datatypes.units.Volume;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class shpere extends AppCompatActivity {
    TextView shapevol;
    TextView result;
    EditText rad;
    Button btnnn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shpere);


        rad=findViewById(R.id.enterradiousid);
        shapevol=findViewById(R.id.shpereid);
        result=findViewById(R.id.resultid);
        btnnn=findViewById(R.id.btnnid);
        btnnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius =rad.getText().toString();

                int r=Integer.parseInt(radius);
                double volume =(4/3)* 3.14*r*r;

                result.setText("V= "+ volume+"m^3");

            }
        });










        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}