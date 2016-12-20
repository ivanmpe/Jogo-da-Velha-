package com.example.ivan.jogodavelha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.*;
import android.view.View;
import android.widget.EditText;

public class JogoActivity extends AppCompatActivity {

    private EditText jogador1;
    private EditText jogador2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jogo);
        jogador1 = (EditText)findViewById(R.id.primeirojogador);
        jogador2 = (EditText)findViewById(R.id.segundojogador);

    }

    public void jogar(View v){
        Intent i = new Intent(this, MainActivity.class );
        i.putExtra("Jogador1",jogador1.getText().toString());
        i.putExtra("Jogador2", jogador2.getText().toString());
        startActivity(i);

    }
}
