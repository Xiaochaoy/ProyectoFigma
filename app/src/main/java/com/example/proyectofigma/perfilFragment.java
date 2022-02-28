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

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import org.jetbrains.annotations.Nullable;

public class perfilFragment extends Fragment {

    TextInputLayout nombre,correo,password;
    Button editar,cerrar;
    ImageView exit;
    NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perfil, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        exit = view.findViewById(R.id.patras5);
        navController = Navigation.findNavController(view);
        nombre = view.findViewById(R.id.nombre_perfil);
        correo = view.findViewById(R.id.correo_perfil);
        password = view.findViewById(R.id.contrasenya_perfil);
        editar = view.findViewById(R.id.editar);
        cerrar = view.findViewById(R.id.cerrar);

        nombre.getEditText().setFocusable(false);
        nombre.getEditText().setClickable(false);
        correo.getEditText().setFocusable(false);
        correo.getEditText().setClickable(false);
        password.getEditText().setFocusable(false);
        password.getEditText().setClickable(false);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuFragment);
            }
        });

        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_editar);
            }
        });
        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_log_inFragment);
            }
        });
    }
}