package com.example.proyectofigma;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

import org.jetbrains.annotations.Nullable;

public class sig_inFragment extends Fragment {

    NavController navController;
    TextView terminos, iniciar;
    Button crear;
    TextInputLayout nombre,email,password;
    ImageView exit;
    boolean fallo = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sig_in, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);

        nombre = view.findViewById(R.id.nombre);
        email = view.findViewById(R.id.usuario);
        password = view.findViewById(R.id.contrasenya);
        terminos = view.findViewById(R.id.terminos);
        crear = view.findViewById(R.id.crearcuenta);
        iniciar = view.findViewById(R.id.texto2);
        exit = view.findViewById(R.id.patras);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_log_inFragment);
            }
        });

        terminos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_terminos);
            }
        });
        crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nombre.getEditText().length()==0){
                    nombre.setError("eeeeee ponte algo");
                    fallo = true;
                }else{
                    nombre.setError("");
                    fallo = false;
                }
                if (email.getEditText().length()==0){
                    email.setError("pon algo cabrom");
                    fallo = true;
                }else if (email.getEditText().length()<=4){
                    email.setError("ponlo bien");
                    fallo = true;
                } else{
                    email.setError("");
                    fallo = false;
                }
                if (password.getEditText().length()==0) {
                    password.setError("pon algo cabrom");
                    fallo = true;
                }else if (password.getEditText().length()<=5){
                    fallo = true;
                    email.setError("Muy flojo tu contraseña, pon lo mas largo");
                }else{
                    password.setError("");
                    fallo = false;
                }

                if (!fallo){
                    navController.navigate(R.id.action_menuFragment);
                }
            }
        });


        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_iniciarFragment);
            }
        });


    }
}