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
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;

import org.jetbrains.annotations.Nullable;

public class tres_en_rallaFragment extends Fragment {

    private int jugadores = 2;
    private int[] casillas;
    private int[] tachados;
    private Partida partida;
    ImageView a1,a2,a3,b1,b2,b3,c1,c2,c3;
    ImageView t0,t1,t2,t3,t4,t5,t6,t7;
    TextView j1,j2;
    int p1,p2 = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tres_en_ralla, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        casillas = new int[9];
        casillas[0] = R.id.a1;
        casillas[1] = R.id.a2;
        casillas[2] = R.id.a3;
        casillas[3] = R.id.b1;
        casillas[4] = R.id.b2;
        casillas[5] = R.id.b3;
        casillas[6] = R.id.c1;
        casillas[7] = R.id.c2;
        casillas[8] = R.id.c3;

        tachados = new int[8];
        tachados[0] = R.id.tach_0;
        tachados[1] = R.id.tach_1;
        tachados[2] = R.id.tach_2;
        tachados[3] = R.id.tach_3;
        tachados[4] = R.id.tach_4;
        tachados[5] = R.id.tach_5;
        tachados[6] = R.id.tach_6;
        tachados[7] = R.id.tach_7;

        partida = new Partida();

        a1 = view.findViewById(R.id.a1);
        a2 = view.findViewById(R.id.a2);
        a3 = view.findViewById(R.id.a3);
        b1 = view.findViewById(R.id.b1);
        b2 = view.findViewById(R.id.b2);
        b3 = view.findViewById(R.id.b3);
        c1 = view.findViewById(R.id.c1);
        c2 = view.findViewById(R.id.c2);
        c3 = view.findViewById(R.id.c3);
        t0 = view.findViewById(R.id.tach_0);
        t1 = view.findViewById(R.id.tach_1);
        t2 = view.findViewById(R.id.tach_2);
        t3 = view.findViewById(R.id.tach_3);
        t4 = view.findViewById(R.id.tach_4);
        t5 = view.findViewById(R.id.tach_5);
        t6 = view.findViewById(R.id.tach_6);
        t7 = view.findViewById(R.id.tach_7);
        j1 = view.findViewById(R.id.jugador1);
        j2 = view.findViewById(R.id.jugador2);


        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tocarCasilla(view);
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tocarCasilla(view);
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tocarCasilla(view);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tocarCasilla(view);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tocarCasilla(view);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tocarCasilla(view);
            }
        });
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tocarCasilla(view);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tocarCasilla(view);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tocarCasilla(view);
            }
        });
    }

    public void tocarCasilla(View view){

        int casilla = 0;

        for(int i = 0; i < casillas.length; i++){
            if(casillas[i] == view.getId()){
                casilla = i;
                break;
            }
        }

        if(!partida.isTerminada() && partida.getCasillasSeleccionadas(casilla)==0 && jugadores==2)
            marcarCasilla(casilla, view);
    }

    /**
     * Metodo que marca una casilla con un aspa o con un circulo
     * @param casilla Numero de la casilla que se marcara
     */
    private void marcarCasilla(int casilla,View view){

        ImageView imagen;

        imagen = view.findViewById(casillas[casilla]);

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
            p1++;
            String puntos = String.valueOf(p1);
            j1.setText(puntos);

            //mostrar mensaje por pantalla
//            TextView mensaje = findViewById(R.id.mensaje);
//            mensaje.setText("Ha ganado el jugador 1");
//
//            mensaje.setVisibility(View.VISIBLE);


            tachar(partida.comprobarGanador()[1],view);
            //
//            final Handler handler = new Handler();
//            handler.postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    //volver al layout original de la actividad
//                    ImageView tachado = view.findViewById(tachados[partida.comprobarGanador()[1]]);
//
//                    tachado.setVisibility(View.GONE);
//                    partida = new Partida();
//                }
//            }, 2500);
        }
        else if(partida.comprobarGanador()[0]==2) {
            partida.setTerminada(true);
            p2++;
            String puntos = String.valueOf(p2);
            j2.setText(puntos);
            //mostrar mensaje por pantalla
//            TextView mensaje = findViewById(R.id.mensaje);
//            mensaje.setText(R.string.gana_jugador2);
//
//            mensaje.setVisibility(View.VISIBLE);

            //

            tachar(partida.comprobarGanador()[1],view);
            //
//            final Handler handler = new Handler();
//            handler.postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    //volver al layout original de la actividad
//                    ImageView tachado = view.findViewById(tachados[partida.comprobarGanador()[1]]);
//
//                    tachado.setVisibility(View.GONE);
//                    partida = new Partida();
//                }
//            }, 2500);
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
//            final Handler handler = new Handler();
//            handler.postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    //volver al layout original de la actividad
//                    ImageView tachado = view.findViewById(tachados[partida.comprobarGanador()[1]]);
//
//                    tachado.setVisibility(View.GONE);
//                    partida = new Partida();
//                }
//            }, 2500);
        }

    }

    /**
     * Metodo que tacha con una linea roja la combinación ganadora
     * @param n Numero de la combinacion ganadora
     */
    public void tachar(int n, View view){
        switch (n){
            case 0:
                t0.setVisibility(View.VISIBLE);
                break;
            case 1:
                t1.setVisibility(View.VISIBLE);
                break;
            case 2:
                t2.setVisibility(View.VISIBLE);
                break;
            case 3:
                t3.setVisibility(View.VISIBLE);
                break;
            case 4:
                t4.setVisibility(View.VISIBLE);
                break;
            case 5:
                t5.setVisibility(View.VISIBLE);
                break;
            case 6:
                t6.setVisibility(View.VISIBLE);
                break;
            case 7:
                t7.setVisibility(View.VISIBLE);
                break;
            default:
                break;
        }
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Do something after 5s = 5000ms
                int punto1 = Integer.parseInt((String) j1.getText());
                int punto2 = Integer.parseInt((String) j2.getText());
                if (punto1 > punto2 && punto1 == 3){
                    // gano la rata 1
                }else if(punto2 > punto1 && punto2 == 3){
                    // gano la rata 2
                }else{
                    restart(n,view);
                }
            }
        }, 2000);
    }
    public void restart(int n, View view){
        partida = new Partida();
        switch (n) {
            case 0:
                t0.setVisibility(View.GONE);
                break;
            case 1:
                t1.setVisibility(View.GONE);
                break;
            case 2:
                t2.setVisibility(View.GONE);
                break;
            case 3:
                t3.setVisibility(View.GONE);
                break;
            case 4:
                t4.setVisibility(View.GONE);
                break;
            case 5:
                t5.setVisibility(View.GONE);
                break;
            case 6:
                t6.setVisibility(View.GONE);
                break;
            case 7:
                t7.setVisibility(View.GONE);
                break;
            default:
                break;
        }
        a1.setImageResource(R.drawable.casilla);
        a2.setImageResource(R.drawable.casilla);
        a3.setImageResource(R.drawable.casilla);
        b1.setImageResource(R.drawable.casilla);
        b2.setImageResource(R.drawable.casilla);
        b3.setImageResource(R.drawable.casilla);
        c1.setImageResource(R.drawable.casilla);
        c2.setImageResource(R.drawable.casilla);
        c3.setImageResource(R.drawable.casilla);

    }
}