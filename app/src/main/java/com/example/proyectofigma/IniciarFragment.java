package com.example.proyectofigma;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.royrodriguez.transitionbutton.TransitionButton;

import org.jetbrains.annotations.Nullable;


public class IniciarFragment extends Fragment {

    TextInputLayout contrasenya, email;
    TransitionButton iniciarsesion;
    TextView olvidado, crear;
    NavController navController;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_iniciar, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        email = view.findViewById(R.id.usuario);
        contrasenya = view.findViewById(R.id.contrasenya);
        navController = Navigation.findNavController(view);
        iniciarsesion = view.findViewById(R.id.iniciarsesion);
        olvidado = view.findViewById(R.id.olvidado);
        crear = view.findViewById(R.id.texto2);
//        navController.navigate(R.id.action_menuFragment);

        iniciarsesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarsesion.startAnimation();

                // Do your networking task or background work here.
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        boolean isSuccessful = false;

                        if (email.getEditText().length()!=0 && contrasenya.getEditText().length()!=0){
                            isSuccessful = true;
                        }

                        // Choose a stop animation if your call was succesful or not
                        if (isSuccessful) {
                            iniciarsesion.stopAnimation(TransitionButton.StopAnimationStyle.EXPAND, new TransitionButton.OnAnimationStopEndListener() {
                                @Override
                                public void onAnimationStopEnd() {
                                    navController.navigate(R.id.action_menuFragment);
                                }
                            });
                        } else {
                            iniciarsesion.stopAnimation(TransitionButton.StopAnimationStyle.SHAKE, null);
                        }
                    }
                }, 2000);
            }
        });
        olvidado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_recuperar);
            }
        });
        crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_registrarFragment);
            }
        });


    }
}