package com.example.proyectofigma;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.jetbrains.annotations.Nullable;

public class juego_cofreFragment extends Fragment {

    NavController navController;
    TextView money;
    ImageView tienda,cofre, cofre2,cofre3;
    int veces = 0;
    int veces2 = 0;
    int veces3 = 0;
    static int cantidad = 1;
    boolean muerto = false;
    boolean muerto2 = false;
    boolean muerto3 = false;
    dineroViewModel dineroViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_juego_cofre, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);

        dineroViewModel = new ViewModelProvider(requireActivity()).get(dineroViewModel.class);
        tienda = view.findViewById(R.id.patienda);
        cofre = view.findViewById(R.id.matacofre);
        cofre2 = view.findViewById(R.id.matacofre2);
        cofre3 = view.findViewById(R.id.matacofre3);
        money = view.findViewById(R.id.money);

        money.setText(String.valueOf(dineroViewModel.getDinero()));

        if (cofre_tiendaFragment.compradoCofre){
            cofre.setVisibility(View.GONE);
            cofre2.setVisibility(View.VISIBLE);
            cofre3.setVisibility(View.VISIBLE);
        }

        if (cofre_tiendaFragment.compradoCantidad){
            cantidad = 2;
        }

        tienda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_cofre_tienda);
            }
        });
        cofre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                veces++;
                if (!muerto){
                    dineroViewModel.setDinero(dineroViewModel.getDinero()+cantidad);
                    money.setText(String.valueOf(dineroViewModel.getDinero()));
                }
                switch (veces){
                    case 1:
                        cofre.setImageResource(R.drawable.matacofre2);
                        break;
                    case 2:
                        cofre.setImageResource(R.drawable.matacofre3);
                        break;
                    case 3:
                        cofre.setImageResource(R.drawable.matacofre4);
                        break;
                    case 4:
                        cofre.setImageResource(R.drawable.matacofre5);
                        break;
                    case 5:
                        muerto = true;
                        dineroViewModel.setDinero(dineroViewModel.getDinero()+5);
                        money.setText(String.valueOf(dineroViewModel.getDinero()));
                        cofre.setImageResource(R.drawable.matacofre6);
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                // Do something after 5s = 5000ms
                                cofre.setVisibility(View.GONE);
                                final Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        // Do something after 5s = 5000ms
                                        veces = 0;
                                        cofre.setImageResource(R.drawable.matacofre1);
                                        cofre.setVisibility(View.VISIBLE);
                                        muerto = false;
                                    }
                                }, 1500);
                            }
                        }, 1000);
                        break;
                }
            }
        });
        cofre2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                veces2++;
                if (!muerto2){
                    dineroViewModel.setDinero(dineroViewModel.getDinero()+cantidad);
                    money.setText(String.valueOf(dineroViewModel.getDinero()));
                }
                switch (veces2){
                    case 1:
                        cofre2.setImageResource(R.drawable.matacofre2);
                        break;
                    case 2:
                        cofre2.setImageResource(R.drawable.matacofre3);
                        break;
                    case 3:
                        cofre2.setImageResource(R.drawable.matacofre4);
                        break;
                    case 4:
                        cofre2.setImageResource(R.drawable.matacofre5);
                        break;
                    case 5:
                        muerto2 = true;
                        cofre2.setImageResource(R.drawable.matacofre6);
                        dineroViewModel.setDinero(dineroViewModel.getDinero()+5);
                        money.setText(String.valueOf(dineroViewModel.getDinero()));;
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                // Do something after 5s = 5000ms
                                cofre2.setVisibility(View.GONE);
                                final Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        // Do something after 5s = 5000ms
                                        veces2 = 0;
                                        cofre2.setImageResource(R.drawable.matacofre1);
                                        cofre2.setVisibility(View.VISIBLE);
                                        muerto2 = false;
                                    }
                                }, 1500);
                            }
                        }, 1000);
                        break;
                }
            }
        });
        cofre3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                veces3++;
                if (!muerto3){
                    dineroViewModel.setDinero(dineroViewModel.getDinero()+cantidad);
                    money.setText(String.valueOf(dineroViewModel.getDinero()));
                }
                switch (veces3){
                    case 1:
                        cofre3.setImageResource(R.drawable.matacofre2);
                        break;
                    case 2:
                        cofre3.setImageResource(R.drawable.matacofre3);
                        break;
                    case 3:
                        cofre3.setImageResource(R.drawable.matacofre4);
                        break;
                    case 4:
                        cofre3.setImageResource(R.drawable.matacofre5);
                        break;
                    case 5:
                        muerto3 = true;
                        cofre3.setImageResource(R.drawable.matacofre6);
                        dineroViewModel.setDinero(dineroViewModel.getDinero()+5);
                        money.setText(String.valueOf(dineroViewModel.getDinero()));
                        final Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                // Do something after 5s = 5000ms
                                cofre3.setVisibility(View.GONE);
                                final Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        // Do something after 5s = 5000ms
                                        veces3 = 0;
                                        cofre3.setImageResource(R.drawable.matacofre1);
                                        cofre3.setVisibility(View.VISIBLE);
                                        muerto3 = false;
                                    }
                                }, 1500);
                            }
                        }, 1000);
                        break;
                }
            }
        });
    }
}