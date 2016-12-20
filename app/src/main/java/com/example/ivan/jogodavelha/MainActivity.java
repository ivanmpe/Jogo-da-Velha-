package com.example.ivan.jogodavelha;

import android.support.annotation.BoolRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.*;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int controlador = 1;
    int contador = 0;

    int matriz[][] = new int[3][3];
    private TextView resultado;
    private TextView ordem;
    private TextView primeiroJogador;
    private TextView segundoJogador;
    private TextView vs;


    private Button primeiro;
    private Button segundo;
    private Button terceiro;
    private Button quarto;
    private Button quinto;
    private Button sexto;
    private Button setimo;
    private Button oitavo;
    private Button nono;
    private Button zera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.resultado = (TextView)findViewById(R.id.resultado);
        this.ordem = (TextView)findViewById(R.id.ordem);
        this.primeiroJogador = (TextView)findViewById(R.id.primeirojogador);
        this.segundoJogador = (TextView)findViewById(R.id.segundojogador);
        this.vs = (TextView)findViewById(R.id.vs);


        //Todos os buttons
        this.primeiro = (Button)findViewById(R.id.primeiro);
        this.segundo = (Button)findViewById(R.id.segundo);
        this.terceiro = (Button)findViewById(R.id.terceiro);
        this.quarto = (Button)findViewById(R.id.quarto);
        this.quinto = (Button)findViewById(R.id.quinto);
        this.sexto= (Button)findViewById(R.id.sexto);
        this.setimo = (Button)findViewById(R.id.setimo);
        this.oitavo = (Button)findViewById(R.id.oitavo);
        this.nono = (Button)findViewById(R.id.nono);
        this.zera = (Button)findViewById(R.id.zera);

        //Pacote com todos parametros do Intent
        Bundle bundle = getIntent().getExtras();
        //Pegando as variaves
        // (bundle.containsKey("Jogador1") && bundle.containsKey("Jogador2"));
        String jogador1 = bundle.getString("Jogador1");
        String jogador2 = bundle.getString("Jogador2");
        primeiroJogador.setText(jogador1);
        segundoJogador.setText(jogador2);
        ordem.setText("Vez do(a) " + jogador1);


    }

     // Views dos buttons
    public void primeiro(View v){

        if((testaResultado(matriz,1)!=true) && ((testaResultado(matriz,2)!=true))){
              if ((primeiro.getText().equals("X") ) || (primeiro.getText().equals("O")) ){
                   Toast.makeText(getBaseContext(), "Escolha outro espaço.", Toast.LENGTH_SHORT).show();
             }else{
                    int n = status();
                    contador++;

                    if (n == 1) {
                      this.primeiro.setText("X");
                      matriz[0][0] = 1;
                      this.ordem.setText("Vez do(a) " + segundoJogador.getText());
                       if (testaResultado(matriz, 1) == true) {
                            this.resultado.setText(resultado("X"));
                       }

                       if((contador ==9) && (testaResultado(matriz,1)!=true)){
                            this.resultado.setText(resultado("Empatou"));
                       }

                    } else {
                         this.primeiro.setText("O");
                         matriz[0][0] = 2;
                         this.ordem.setText("Vez do(a) " + primeiroJogador.getText());
                         if (testaResultado(matriz, 2) == true) {
                            this.resultado.setText(resultado("O"));
                          }
                         if((contador ==9) && (testaResultado(matriz,2)!=true)){
                             this.resultado.setText(resultado("Empatou"));
                        }
                    }
             }
        }
    }

    public void segundo(View v) {
        if((testaResultado(matriz,1)!=true) && ((testaResultado(matriz,2)!=true))) {

            if ((segundo.getText().equals("X")) || (segundo.getText().equals("O"))) {
                Toast.makeText(getBaseContext(), "Escolha outro espaço.", Toast.LENGTH_SHORT).show();
            } else {

                int n = status();
                contador++;
                if (n == 1) {
                    this.segundo.setText("X");
                    matriz[0][1] = 1;
                    this.ordem.setText("Vez do(a) " + segundoJogador.getText());
                    if (testaResultado(matriz, 1) == true) {
                        this.resultado(resultado("X"));
                    }
                    if ((contador == 9) && (testaResultado(matriz, 1) != true)) {
                        this.resultado.setText(resultado("Empatou"));
                    }

                } else {
                    this.segundo.setText("O");
                    matriz[0][1] = 2;
                    this.ordem.setText("Vez do(a) " + primeiroJogador.getText());
                    if (testaResultado(matriz, 2) == true) {
                        this.resultado(resultado("O"));
                    }
                    if ((contador == 9) && (testaResultado(matriz, 2) != true)) {
                        this.resultado.setText(resultado("Empatou"));
                    }
                }
            }
        }
    }

    public void terceiro(View v) {
        if((testaResultado(matriz,1)!=true) && ((testaResultado(matriz,2)!=true))) {
            if ((terceiro.getText().equals("X")) || (terceiro.getText().equals("O"))) {
                Toast.makeText(getBaseContext(), "Escolha outro espaço.", Toast.LENGTH_SHORT).show();
            } else {
                int n = status();
                contador++;
                if (n == 1) {
                    this.terceiro.setText("X");
                    matriz[0][2] = 1;
                    this.ordem.setText("Vez do(a) " + segundoJogador.getText());
                    if (testaResultado(matriz, 1) == true) {
                        this.resultado.setText(resultado("X"));
                    }
                    if ((contador == 9) && (testaResultado(matriz, 1) != true)) {
                        this.resultado.setText(resultado("Empatou"));
                    }

                } else {
                    this.terceiro.setText("O");
                    matriz[0][2] = 2;
                    this.ordem.setText("Vez do(a) " + primeiroJogador.getText());
                    if (testaResultado(matriz, 2) == true) {
                        this.resultado.setText(resultado("O"));
                    }
                    if ((contador == 9) && (testaResultado(matriz, 2) != true)) {
                        this.resultado.setText(resultado("Empatou"));
                    }
                }
            }
        }
    }

    public void quarto(View v) {
        if((testaResultado(matriz,1)!=true) && ((testaResultado(matriz,2)!=true))) {

            if ((quarto.getText().equals("X")) || (quarto.getText().equals("O"))) {
                Toast.makeText(getBaseContext(), "Escolha outro espaço.", Toast.LENGTH_SHORT).show();
            } else {
                int n = status();
                contador++;
                if (n == 1) {
                    this.quarto.setText("X");
                    matriz[1][0] = 1;
                    this.ordem.setText("Vez do(a) " + segundoJogador.getText());
                    if (testaResultado(matriz, 1) == true) {
                        this.resultado.setText(resultado("X"));
                    }
                    if ((contador == 9) && (testaResultado(matriz, 1) != true)) {
                        this.resultado.setText(resultado("Empatou"));
                    }


                } else {
                    this.quarto.setText("O");
                    matriz[1][0] = 2;
                    this.ordem.setText("Vez do(a) " + primeiroJogador.getText());
                    if (testaResultado(matriz, 2) == true) {
                        this.resultado.setText(resultado("O"));
                    }
                    if ((contador == 9) && (testaResultado(matriz, 2) != true)) {
                        this.resultado.setText(resultado("Empatou"));
                    }
                }
            }
        }

    }

    public void quinto(View v){
        if((testaResultado(matriz,1)!=true) && ((testaResultado(matriz,2)!=true))) {

            if ((quinto.getText().equals("X")) || (quinto.getText().equals("O"))) {
                Toast.makeText(getBaseContext(), "Escolha outro espaço.", Toast.LENGTH_SHORT).show();
            } else {
                int n = status();
                contador++;
                if (n == 1) {
                    this.quinto.setText("X");
                    matriz[1][1] = 1;
                    this.ordem.setText("Vez do(a) " + segundoJogador.getText());
                    if (testaResultado(matriz, 1) == true) {
                        this.resultado.setText(resultado("X"));
                    }
                    if ((contador == 9) && (testaResultado(matriz, 1) != true)) {
                        this.resultado.setText(resultado("Empatou"));
                    }
                } else {
                    this.quinto.setText("O");
                    matriz[1][1] = 2;
                    this.ordem.setText("Vez do(a) " + primeiroJogador.getText());
                    if (testaResultado(matriz, 2) == true) {
                        this.resultado.setText(resultado("O"));
                    }
                    if ((contador == 9) && (testaResultado(matriz, 2) != true)) {
                        this.resultado.setText(resultado("Empatou"));
                    }


                }
            }
        }
    }


    public void sexto(View v){
        if((testaResultado(matriz,1)!=true) && ((testaResultado(matriz,2)!=true))){
            if ((sexto.getText().equals("X")) || (sexto.getText().equals("O"))) {
                Toast.makeText(getBaseContext(), "Escolha outro espaço.", Toast.LENGTH_SHORT).show();
            } else {
                int n = status();
                contador++;
                if (n == 1) {
                    this.sexto.setText("X");
                    matriz[1][2] = 1;
                    this.ordem.setText("Vez do(a) " + segundoJogador.getText());
                    if (testaResultado(matriz, 1) == true) {
                        this.resultado.setText(resultado("X"));
                    }
                    if ((contador == 9) && (testaResultado(matriz, 1) != true)) {
                        this.resultado.setText(resultado("Empatou"));
                    }

                } else {
                    this.sexto.setText("O");
                    matriz[1][2] = 2;
                    this.ordem.setText("Vez do(a) " + primeiroJogador.getText());
                    if (testaResultado(matriz, 2) == true) {
                        this.resultado.setText(resultado("O"));
                    }
                    if ((contador == 9) && (testaResultado(matriz, 2) != true)) {
                        this.resultado.setText(resultado("Empatou"));
                    }
                }
            }
        }
    }


    public void setimo(View v) {
        if((testaResultado(matriz,1)!=true) && ((testaResultado(matriz,2)!=true))){
            if ((setimo.getText().equals("X")) || (setimo.getText().equals("O"))) {
                Toast.makeText(getBaseContext(), "Escolha outro espaço.", Toast.LENGTH_SHORT).show();
            } else {
                int n = status();
                contador++;
                if (n == 1) {
                    this.setimo.setText("X");
                    matriz[2][0] = 1;
                    this.ordem.setText("Vez do(a) " + segundoJogador.getText());
                    if (testaResultado(matriz, 1) == true) {
                        this.resultado.setText(resultado("X"));
                    }
                    if ((contador == 9) && (testaResultado(matriz, 1) != true)) {
                        this.resultado.setText(resultado("Empatou"));
                    }
                } else {
                    this.setimo.setText("O");
                    matriz[2][0] = 2;
                    this.ordem.setText("Vez do(a) " + primeiroJogador.getText());
                    if (testaResultado(matriz, 2) == true) {
                        this.resultado.setText(resultado("O"));
                    }
                    if ((contador == 9) && (testaResultado(matriz, 2) != true)) {
                        this.resultado.setText(resultado("Empatou"));
                    }
                }
            }
        }
    }

    public void oitavo(View v){
        if((testaResultado(matriz,1)!=true) && ((testaResultado(matriz,2)!=true))){
               if ((oitavo.getText().equals("X") ) || (oitavo.getText().equals("O")) ){
                 Toast.makeText(getBaseContext(), "Escolha outro espaço.", Toast.LENGTH_SHORT).show();
               }else {
                   int n = status();
                   contador++;
                   if (n == 1) {
                       this.oitavo.setText("X");
                       matriz[2][1] = 1;
                       this.ordem.setText("Vez do(a) " + segundoJogador.getText());
                       if (testaResultado(matriz, 1) == true) {
                           this.resultado.setText(resultado("X"));
                       }
                       if ((contador == 9) && (testaResultado(matriz, 1) != true)) {
                           this.resultado.setText(resultado("Empatou"));
                       }
                   } else {
                       this.oitavo.setText("O");
                       matriz[2][1] = 2;
                       this.ordem.setText("Vez do(a) " + primeiroJogador.getText());
                       if (testaResultado(matriz, 2) == true) {
                           this.resultado.setText(resultado("O"));
                       }
                       if ((contador == 9) && (testaResultado(matriz, 2) != true)) {
                           this.resultado.setText(resultado("Empatou"));
                       }
                   }

               }
            }
    }


    public void nono(View v){
        if((testaResultado(matriz,1)!=true) && ((testaResultado(matriz,2)!=true))){
            if ((nono.getText().equals("X")) || (nono.getText().equals("O"))) {
                Toast.makeText(getBaseContext(), "Escolha outro espaço.", Toast.LENGTH_SHORT).show();
            } else {
                int n = status();
                contador++;
                if (n == 1) {
                    this.nono.setText("X");
                    matriz[2][2] = 1;
                    this.ordem.setText("Vez do(a) " + segundoJogador.getText());
                    if (testaResultado(matriz, 1) == true) {
                        this.resultado.setText(resultado("X"));
                    }
                    if ((contador == 9) && (testaResultado(matriz, 1) != true)) {
                        this.resultado.setText(resultado("Empatou"));
                    }


                } else {
                    this.nono.setText("O");
                    matriz[2][2] = 2;
                    this.ordem.setText("Vez do(a) " + primeiroJogador.getText());
                    if (testaResultado(matriz, 2) == true) {
                        this.resultado.setText(resultado("O"));
                    }
                    if ((contador == 9) && (testaResultado(matriz, 2) != true)) {
                        this.resultado.setText(resultado("Empatou"));
                    }
                }
            }
        }

    }


    public Boolean testaResultado(int matriz[][],int valor){
        //Operadores da primeira linha
        Boolean terminou = false;

        //testando linhas
        if ((valor == matriz[0][0]) && ( matriz[0][0] == matriz[0][1]) && (matriz[0][0] == matriz[0][2])) {
            return terminou = true;
        }
        if ((valor == matriz[1][0]) &&(matriz[1][0] == matriz[1][1]) && (matriz[1][0] == matriz[1][2])) {
            return terminou = true;
        }
        if ((valor == matriz[2][0]) && (matriz[2][0] == matriz[2][1]) && (matriz[2][0] == matriz[2][2])) {
            return terminou = true;
        }
        //diagonal principal
        if ((valor == matriz[1][1]) && (matriz[1][1] == matriz[0][0]) && (matriz[0][0] == matriz[2][2])){
            return terminou = true;
        }
        //testando colunas
        if ((valor == matriz[0][0]) && (matriz[0][0] == matriz[1][0]) && (matriz[0][0] == matriz[2][0])) {
            return terminou = true;
        }
        if ((valor == matriz[0][1]) && (matriz[0][1] == matriz[1][1]) && (matriz[0][1] == matriz[2][1])){
            return terminou = true;
        }
        if ((valor == matriz[0][2]) && (matriz[0][2] == matriz[1][2]) && (matriz[0][2] == matriz[2][2])) {
            return terminou = true;
        }
        //diagonal secundaria
        if((valor == matriz[0][2]) && (matriz[0][2] == matriz[1][1]) && (matriz[0][2] == matriz[2][0]) ){
            return terminou = true;
        }

        return terminou;
    }

    public String resultado(String vencedor){

        if(vencedor.equals("O")){
            zera.setVisibility(View.VISIBLE);
            return vencedor = segundoJogador.getText() + " venceu!";
        }

        if(vencedor.equals("X")){
            zera.setVisibility(View.VISIBLE);
            return vencedor= primeiroJogador.getText() + " venceu!";
        }
        if(vencedor.equals("Empatou")){
           zera.setVisibility(View.VISIBLE);
            return vencedor="EMPATE!";
        }

        return vencedor=" ";
    }

    public  int status(){
        if (controlador==1){
            controlador = 0;
            return 1;
        }
        controlador = 1;
        return 0;
    }

    public void zera(View v){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matriz[i][j] = 0;
            }
        }
        primeiro.setText("");
        segundo.setText("");
        terceiro.setText("");
        quarto.setText("");
        quinto.setText("");
        sexto.setText("");
        setimo.setText("");
        oitavo.setText("");
        nono.setText("");
        resultado.setText("");
        contador=0;
        ordem.setText( "Vez do(a) " + primeiroJogador.getText());
        zera.setVisibility(View.INVISIBLE);
    }


}
