package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.radiobutton.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//Declaramos lso radiobuttons
        binding.rbtSuma.setOnClickListener(view -> operacion());
        binding.rbtResta.setOnClickListener(view -> operacion());
        binding.rbtMult.setOnClickListener(view -> operacion());
        binding.rbtDiv.setOnClickListener(view -> operacion());

    }

    public void operacion(){

        // Declaramos dos enteros para las operaciones
        int num1 = Integer.parseInt(binding.etxNum1.getText().toString());
        int num2 = Integer.parseInt(binding.etxNum2.getText().toString());
        //Un String para poder devolver el resultado final
        String resulStrin;
        //Para el resultado seguún las operaciones
        int resultado;
        //Para la division por si el resultado es con decimales.
        float resulDiv;

        if (binding.rbtSuma.isChecked()) {
            resultado = num1 + num2;
            resulStrin = String.valueOf(resultado);
            binding.etxRes.setText(resulStrin);
        }else if (binding.rbtResta.isChecked()){
            resultado = num1 - num2;
            resulStrin = String.valueOf(resultado);
            binding.etxRes.setText(resulStrin);
        }else if (binding.rbtMult.isChecked()) {
            resultado = num1 * num2;
            resulStrin = String.valueOf(resultado);
            binding.etxRes.setText(resulStrin);
        }else if (binding.rbtDiv.isChecked()) {
            resulDiv = num1 / num2;
            resulStrin = String.valueOf(resulDiv);
            binding.etxRes.setText(resulStrin);
        }

    }

}