package com.example.calculadora_inca;

import android.os.Bundle;
//importante importar para logCat
import android.util.Log;
import android.view.View;
import android.widget.EditText;
//importante importar button
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    //para las variable de botones colocar btn = btnAccion
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,btnSuma, btnMenos, btnMultiplicar, btnDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // referencia
        // El método findViewById() en Android se utiliza para obtener una referencia
        // buscando el componente visual por su ID
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btn0 = findViewById(R.id.button0);
        btnSuma = findViewById(R.id.button_suma);
        btnMenos = findViewById(R.id.button_menos);
        btnMultiplicar = findViewById(R.id.button_multiplicar);
        btnDividir = findViewById(R.id.button_dividir);

        //setOnClickListener() se utiliza para registrar un listener que responde a eventos de clics
        btn1.setOnClickListener(new View.OnClickListener() {
            //@Override es una anotación en Java que indica que un método está sobrescribiendo
            @Override
            //onClick(View view) es el método que se ejecuta cuando un usuario hace clic
            public void onClick(View view) {
                //Tomar texto de button
                String textButton = btn1.getText().toString();
                //Mostrarlo en LogCat
                Log.d("TAG_", "BUTTON PRESIONADO: " + textButton);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                String textButton = btn2.getText().toString();
                Log.d("TAG_", "BUTTON PRESIONADO: " + textButton);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textButton = btn3.getText().toString();
                Log.d("TAG_", "BUTTON PRESIONADO: " + textButton);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textButton = btn4.getText().toString();
                Log.d("TAG_", "BUTTON PRESIONADO: " + textButton);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textButton = btn5.getText().toString();
                Log.d("TAG_", "BUTTON PRESIONADO: " + textButton);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textButton = btn6.getText().toString();
                Log.d("TAG_", "BUTTON PRESIONADO: " + textButton);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textButton = btn7.getText().toString();
                Log.d("TAG_", "BUTTON PRESIONADO: " + textButton);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textButton = btn8.getText().toString();
                Log.d("TAG_", "BUTTON PRESIONADO: " + textButton);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textButton = btn9.getText().toString();
                Log.d("TAG_", "BUTTON PRESIONADO: " + textButton);
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textButton = btn0.getText().toString();
                Log.d("TAG_", "BUTTON PRESIONADO: " + textButton);
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textButton = btnSuma.getText().toString();
                Log.d("TAG_", "BUTTON PRESIONADO: " + textButton);
            }
        });

        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textButton = btnMenos.getText().toString();
                Log.d("TAG_", "BUTTON PRESIONADO: " + textButton);
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textButton = btnMultiplicar.getText().toString();
                Log.d("TAG_", "BUTTON PRESIONADO: " + textButton);
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textButton = btnDividir.getText().toString();
                Log.d("TAG_", "BUTTON PRESIONADO: " + textButton);
            }
        });

    }
}