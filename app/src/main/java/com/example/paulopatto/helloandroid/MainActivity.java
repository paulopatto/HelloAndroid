package com.example.paulopatto.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText;
    private TextView saudacaoTextView;
    private String saudacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /// Obter referencias aos componentes da view

        this.nameEditText = (EditText) findViewById(R.id.nameEditText);
        this.saudacaoTextView = (TextView) findViewById(R.id.saudacaoTextView);
        this.saudacao = getResources().getString(R.string.saudacao);
    }

    public void surpreenderUsuario(View v) {
        Editable nome = this.nameEditText.getText();
        String message = saudacao + " " + nome + "!";
        this.saudacaoTextView.setText(message);
    }
}
