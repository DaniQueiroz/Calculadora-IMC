package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recuperar os componentes EditText
        // Criar uma variavel e assosiar(=) o componente de UI<EditText>
        // Recuperar o botao da tela

        // fazer o click do Button (btnCalcular.setOnClickListener )
        // Recuperar o texto digitado no peso edtPeso

        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)


        val btnCalcular = findViewById<Button>(R.id.btn_calcular)


        btnCalcular.setOnClickListener {

            val pesoStr: String= edtPeso.text.toString()
            val alturaStr: String = edtAltura.text.toString()

            if(pesoStr == "" || alturaStr == "") {
                // MOstrar mensagem par o usuario
            } else {
                val peso = pesoStr.toFloat()
                val altura = alturaStr.toFloat()

                val alturaQ2 = altura * altura
                val resultado = peso / alturaQ2


                println("Daniela acao do botao" + resultado)
            }

        }

    }


}

