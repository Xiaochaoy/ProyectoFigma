package com.example.proyectofigma;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.q42.android.scrollingimageview.ScrollingImageView;

import org.jetbrains.annotations.Nullable;

public class juego_correrFragment extends Fragment {

    ImageView personaje, agachar, saltar, personaje2, personaje3, ganasteIMG, pausa;
    int tempo = 0;
    boolean campo;
    ScrollingImageView s1, s2, s3, s4, s5;
    TextView ganar;
    NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_juego_correr, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        campo = false;
        navController = Navigation.findNavController(view);
        personaje = view.findViewById(R.id.personaje);
        personaje2 = view.findViewById(R.id.personaje2);
        personaje3 = view.findViewById(R.id.personaje3);
        agachar = view.findViewById(R.id.agachar);
        saltar = view.findViewById(R.id.saltar);
        ganasteIMG = view.findViewById(R.id.ganasteImg);
        ganar = view.findViewById(R.id.ganastebro);
        pausa = view.findViewById(R.id.pausa);

        s1 = view.findViewById(R.id.fondo1);
        s2 = view.findViewById(R.id.fondo2);
        s3 = view.findViewById(R.id.fondo3);
        s4 = view.findViewById(R.id.fondo4);
        s5 = view.findViewById(R.id.fondo5);

        pausa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.correr_pausaFragment);
            }
        });
        agachar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!campo) {
                    campo = true;
                    personaje.setVisibility(View.GONE);
                    personaje3.setVisibility(View.VISIBLE);
                    tempo++;
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            // Do something after 5s = 5000ms
                            personaje.setVisibility(View.VISIBLE);
                            personaje3.setVisibility(View.GONE);
                            campo = false;
                        }
                    }, 500);
                }
                terminar(tempo);
            }
        });
        saltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!campo) {
                    campo = true;
                    personaje.setVisibility(View.GONE);
                    personaje2.setVisibility(View.VISIBLE);
                    tempo++;
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            // Do something after 5s = 5000ms
                            personaje.setVisibility(View.VISIBLE);
                            personaje2.setVisibility(View.GONE);
                            campo = false;
                        }
                    }, 500);
                }
                terminar(tempo);
            }
        });


    }

    public void ganaste() {
        ganasteIMG.setVisibility(View.VISIBLE);
        ganar.setVisibility(View.VISIBLE);
    }

    public void terminar(int halo) {
        if (halo == 20) {
            s1.stop();
            s2.stop();
            s3.stop();
            s4.stop();
            s5.stop();
            ganaste();
        }
    }
}