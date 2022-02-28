package com.example.proyectofigma;

import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.Nullable;

public class tres_en_rallaFragment extends AppCompatActivity {

    private int jugadores;
    private int[] casillas;
    private int[] tachados;
    private Partida partida;

    ImageView a1,a2,a3,b1,b2,b3,c1,c2,c3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_tres_en_ralla);

        casillas = new int[9];
        casillas[0] = R.id.a1; casillas[1] = R.id.a2; casillas[2] = R.id.a3;
        casillas[3] = R.id.b1; casillas[4] = R.id.b2; casillas[5] = R.id.b3;
        casillas[6] = R.id.c1; casillas[7] = R.id.c2; casillas[8] = R.id.c3;

        tachados = new int[8];
        tachados[0] = R.id.tach_0; tachados[1] = R.id.tach_1; tachados[2] = R.id.tach_2;
        tachados[3] = R.id.tach_3; tachados[4] = R.id.tach_4; tachados[5] = R.id.tach_5;
        tachados[6] = R.id.tach_6; tachados[7] = R.id.tach_7;

    }


    /**
     * Metodo que se ejecuta al seleccionar uno de los dos modos de juego para comenzar la partida
     * @param view Identifica que vista ha sido pulsada
     */
    public void jugar(View view) {

        ImageView imagen;

        for(int i = 0; i < casillas.length; i++){
            imagen = findViewById(casillas[i]);
            imagen.setImageResource(R.drawable.casilla);
        }

        jugadores = 2;

        partida = new Partida();
    }


    /**
     * Metodo que se ejecuta al pulsar una casilla
     * @param view Identifica que vista ha sido pulsada
     */
    public void tocarCasilla(View view){

        if(partida==null)
            return;
        //
        int casilla = 0;

        for(int i = 0; i < casillas.length; i++){
            if(casillas[i] == view.getId()){
                casilla = i;
                break;
            }
        }



        if(!partida.isTerminada() && partida.getCasillasSeleccionadas(casilla)==0 && jugadores==2)
            marcarCasilla(casilla);
    }

    /**
     * Metodo que marca una casilla con un aspa o con un circulo
     * @param casilla Numero de la casilla que se marcara
     */
    private void marcarCasilla(int casilla){

        ImageView imagen;

        imagen = findViewById(casillas[casilla]);

        if(partida.getJugador()==1 && partida.getCasillasSeleccionadas(casilla)==0){
            imagen.setImageResource(R.drawable.aspa);
            partida.setCasillasSeleccionadas(partida.getJugador(), casilla);
            partida.cambiarJugador();
        }
        else if(partida.getJugador()==2 && partida.getCasillasSeleccionadas(casilla)==0){
            imagen.setImageResource(R.drawable.circulo);
            partida.setCasillasSeleccionadas(partida.getJugador(), casilla);
            partida.cambiarJugador();
        }

        //
        //comprobar si alguien ha ganado
        if(partida.comprobarGanador()[0]==1) {
            partida.setTerminada(true);

            //mostrar mensaje por pantalla
//            TextView mensaje = findViewById(R.id.mensaje);
//            mensaje.setText("Ha ganado el jugador 1");
//
//            mensaje.setVisibility(View.VISIBLE);


            tachar(partida.comprobarGanador()[1]);
            //
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //volver al layout original de la actividad
                    setContentView(R.layout.fragment_tres_en_ralla);
                }
            }, 2500);
        }
        else if(partida.comprobarGanador()[0]==2) {
            partida.setTerminada(true);

            //mostrar mensaje por pantalla
//            TextView mensaje = findViewById(R.id.mensaje);
//            mensaje.setText(R.string.gana_jugador2);
//
//            mensaje.setVisibility(View.VISIBLE);

            //

            tachar(partida.comprobarGanador()[1]);
            //
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //volver al layout original de la actividad
                    setContentView(R.layout.fragment_tres_en_ralla);
                }
            }, 2500);
        }else if(partida.comprobarGanador()[0]==3) {
            partida.setTerminada(true);

            //mostrar mensaje por pantalla
//            TextView mensaje = findViewById(R.id.mensaje);
//            mensaje.setText(R.string.empate);
//
//            mensaje.setVisibility(View.VISIBLE);

//            AlphaAnimation animation_alpha = new AlphaAnimation(0f, 1f);
//            animation_alpha.setDuration(1000);
//            mensaje.startAnimation(animation_alpha);
            //
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //volver al layout original de la actividad
                    setContentView(R.layout.fragment_tres_en_ralla);
                }
            }, 2500);
        }

    }

    /**
     * Metodo que tacha con una linea roja la combinación ganadora
     * @param n Numero de la combinacion ganadora
     */
    public void tachar(int n){
        ImageView tachado = findViewById(tachados[n]);

        tachado.setVisibility(View.VISIBLE);

        AlphaAnimation animation_alpha = new AlphaAnimation(0f, 1f);
        animation_alpha.setDuration(225);
        tachado.startAnimation(animation_alpha);
    }
}
