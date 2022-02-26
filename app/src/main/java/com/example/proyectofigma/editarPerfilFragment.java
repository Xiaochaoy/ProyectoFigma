package com.example.proyectofigma;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.google.android.material.textfield.TextInputLayout;

import org.jetbrains.annotations.Nullable;

public class editarPerfilFragment extends Fragment {

    TextInputLayout nombre, correo, password;
    ImageView e1, e2, e3, foto,subir,borrar;
    LinearLayout fotos;
    RelativeLayout fondo;
    Button guardar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_editar_perfil, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        nombre = view.findViewById(R.id.nombre_perfil2);
        correo = view.findViewById(R.id.correo_perfil2);
        password = view.findViewById(R.id.contrasenya_perfil2);
        e1 = view.findViewById(R.id.editarNombre);
        e2 = view.findViewById(R.id.editarCorreo);
        e3 = view.findViewById(R.id.editarPassword);
        foto = view.findViewById(R.id.foto2);
        subir = view.findViewById(R.id.subir);
        borrar = view.findViewById(R.id.borrar);
        fotos = view.findViewById(R.id.editarFoto);
        fondo = view.findViewById(R.id.fondo);
        guardar = view.findViewById(R.id.guardar);

        fotos.setVisibility(View.GONE);

        nombre.getEditText().setFocusableInTouchMode(false);
        nombre.getEditText().setClickable(false);
        correo.getEditText().setFocusableInTouchMode(false);
        correo.getEditText().setClickable(false);
        password.getEditText().setFocusableInTouchMode(false);
        password.getEditText().setClickable(false);

        fondo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fotos.setVisibility(View.GONE);
                guardar.setVisibility(View.VISIBLE);
            }
        });

        subir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fotos.setVisibility(View.GONE);
                foto.setImageResource(R.drawable.chica);
                guardar.setVisibility(View.VISIBLE);
            }
        });

        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fotos.setVisibility(View.GONE);
                foto.setImageResource(R.drawable.perfil);
                guardar.setVisibility(View.VISIBLE);
            }
        });

        foto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fotos.setVisibility(View.VISIBLE);
                guardar.setVisibility(View.GONE);
            }
        });

        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombre.getEditText().setFocusableInTouchMode(true);
                nombre.getEditText().setClickable(true);
            }
        });
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                correo.getEditText().setFocusableInTouchMode(true);
                correo.getEditText().setClickable(true);
            }
        });
        e3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password.getEditText().setFocusableInTouchMode(true);
                password.getEditText().setClickable(true);
            }
        });
    }
}