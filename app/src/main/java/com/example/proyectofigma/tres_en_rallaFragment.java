package com.example.proyectofigma;

import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import org.jetbrains.annotations.Nullable;

public class tres_en_rallaFragment extends Fragment {

    private int jugadores = 2;
    private int[] casillas;
    private int[] tachados;
    private Partida partida;
    ImageView a1, a2, a3, b1, b2, b3, c1, c2, c3;
    ImageView t0, t1, t2, t3, t4, t5, t6, t7;
    TextView j1, j2;
    TextView mensaje;
    int p1, p2 = 0;
    ImageView chat, llorar,enfadar, chat1,chat2;
    LinearLayout emoji;
    boolean a = true;
    boolean espera = true;
    boolean espera2 = true;
    Button restart, exit;
    NavController navController;

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

        chat = view.findViewById(R.id.chat);
        chat1 = view.findViewById(R.id.chat1);
        chat2 = view.findViewById(R.id.chat2);
        llorar = view.findViewById(R.id.llorar);
        enfadar = view.findViewById(R.id.enfadado);
        emoji = view.findViewById(R.id.emoji);
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
        mensaje = view.findViewById(R.id.ganador);
        restart = view.findViewById(R.id.restart);
        exit = view.findViewById(R.id.exit_3ralla);
        navController = Navigation.findNavController(view);

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a){
                    emoji.setVisibility(View.VISIBLE);
                    a = false;
                }else{
                    emoji.setVisibility(View.GONE);
                    a = true;
                }
            }
        });

        llorar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (partida.getJugador() == 1){
                    if (espera){
                        espera = false;
                        chat1.setImageResource(R.drawable.llorar_left);
                        chat1.setVisibility(View.VISIBLE);
                        emoji.setVisibility(View.GONE);
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                chat1.setVisibility(View.GONE);
                                final Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        espera = true;
                                    }
                                }, 1500);
                            }
                        }, 1000);
                    }

                }else{
                    if (espera2){
                        espera2 = false;
                        chat2.setImageResource(R.drawable.llorar_right);
                        chat2.setVisibility(View.VISIBLE);
                        emoji.setVisibility(View.GONE);
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                chat2.setVisibility(View.GONE);
                                final Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        espera2 = true;
                                    }
                                }, 1500);
                            }
                        }, 1000);
                    }
                }
            }
        });

        enfadar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (partida.getJugador() == 1){
                    if (espera){
                        espera = false;
                        chat1.setImageResource(R.drawable.enfadado_left);
                        chat1.setVisibility(View.VISIBLE);
                        emoji.setVisibility(View.GONE);
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                chat1.setVisibility(View.GONE);
                                final Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        espera = true;
                                    }
                                }, 1500);
                            }
                        }, 1000);
                    }

                }else{
                    if (espera2){
                        espera2 = false;
                        chat2.setImageResource(R.drawable.enfadado_right);
                        chat2.setVisibility(View.VISIBLE);
                        emoji.setVisibility(View.GONE);
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                chat2.setVisibility(View.GONE);
                                final Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        espera2 = true;
                                    }
                                }, 1500);
                            }
                        }, 1000);
                    }
                }
            }
        });

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restart(8,view);
                mensaje.setVisibility(View.GONE);
                restart.setVisibility(View.GONE);
                exit.setVisibility(View.GONE);
                j1.setText("0");
                j2.setText("0");
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_inicioralla);
            }
        });


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

    public void tocarCasilla(View view) {

        int casilla = 0;

        for (int i = 0; i < casillas.length; i++) {
            if (casillas[i] == view.getId()) {
                casilla = i;
                break;
            }
        }

        if (!partida.isTerminada() && partida.getCasillasSeleccionadas(casilla) == 0 && jugadores == 2)
            marcarCasilla(casilla, view);
    }

    /**
     * Metodo que marca una casilla con un aspa o con un circulo
     *
     * @param casilla Numero de la casilla que se marcara
     */
    private void marcarCasilla(int casilla, View view) {

        ImageView imagen;

        imagen = view.findViewById(casillas[casilla]);

        if (partida.getJugador() == 1 && partida.getCasillasSeleccionadas(casilla) == 0) {
            imagen.setImageResource(R.drawable.aspa);
            partida.setCasillasSeleccionadas(partida.getJugador(), casilla);
            partida.cambiarJugador();
        } else if (partida.getJugador() == 2 && partida.getCasillasSeleccionadas(casilla) == 0) {
            imagen.setImageResource(R.drawable.circulo);
            partida.setCasillasSeleccionadas(partida.getJugador(), casilla);
            partida.cambiarJugador();
        }

        //
        //comprobar si alguien ha ganado
        if (partida.comprobarGanador()[0] == 1) {
            partida.setTerminada(true);
            p1++;
            String puntos = String.valueOf(p1);
            j1.setText(puntos);

            tachar(partida.comprobarGanador()[1], view);

        } else if (partida.comprobarGanador()[0] == 2) {
            partida.setTerminada(true);
            p2++;
            String puntos = String.valueOf(p2);
            j2.setText(puntos);
            tachar(partida.comprobarGanador()[1], view);

        }else if (partida.comprobarGanador()[0] == 3) {
            partida.setTerminada(true);
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    restart(8, view);
                }
            }, 2000);
        }
    }

    /**
     * Metodo que tacha con una linea roja la combinación ganadora
     *
     * @param n Numero de la combinacion ganadora
     */
    public void tachar(int n, View view) {
        switch (n) {
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

                int punto1 = Integer.parseInt((String) j1.getText());
                int punto2 = Integer.parseInt((String) j2.getText());

                if (punto1 > punto2 && punto1 == 3) {
                    mensaje.setVisibility(View.VISIBLE);
                    mensaje.setText("Ha ganado el Jugador 1");
                    restart.setVisibility(View.VISIBLE);
                    exit.setVisibility(View.VISIBLE);
                } else if (punto2 > punto1 && punto2 == 3) {
                    mensaje.setVisibility(View.VISIBLE);
                    mensaje.setText("Ha ganado el Jugador 2");
                    restart.setVisibility(View.VISIBLE);
                    exit.setVisibility(View.VISIBLE);
                } else {
                    restart(n, view);
                }
            }
        }, 2000);
    }

    public void restart(int n, View view) {
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
                t0.setVisibility(View.GONE);
                t1.setVisibility(View.GONE);
                t2.setVisibility(View.GONE);
                t3.setVisibility(View.GONE);
                t4.setVisibility(View.GONE);
                t5.setVisibility(View.GONE);
                t6.setVisibility(View.GONE);
                t7.setVisibility(View.GONE);
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