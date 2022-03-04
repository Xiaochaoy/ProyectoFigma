package com.example.proyectofigma;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.jetbrains.annotations.Nullable;


public class cofre_tiendaFragment extends Fragment {

    NavController navController;
    ImageView logo,compracofre,compracantidad;
    TextView comprarco, comprarca;
    Button volver;
    dineroViewModel dineroViewModel;
    public static boolean compradoCofre = false;
    public static boolean compradoCantidad = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cofre_tienda, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        dineroViewModel = new ViewModelProvider(requireActivity()).get(dineroViewModel.class);
        volver = view.findViewById(R.id.exitTienda);
        logo = view.findViewById(R.id.logotienda);
        compracofre = view.findViewById(R.id.comprado);
        compracantidad = view.findViewById(R.id.comprado2);
        comprarco = view.findViewById(R.id.compracofre);
        comprarca = view.findViewById(R.id.compracantidad);

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_cofre);
            }
        });


        if(compradoCofre){
            compracofre.setImageResource(R.drawable.cofrecomprado);

        }
        if (compradoCantidad){
            compracantidad.setImageResource(R.drawable.dinerocomprado);
        }

        if (!compradoCantidad && dineroViewModel.getDinero() >= 50){
            comprarca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    compradoCantidad = true;
                    dineroViewModel.setDinero(dineroViewModel.getDinero()-50);
                    compracantidad.setImageResource(R.drawable.dinerocomprado);
                }
            });
        }

        if (!compradoCofre && dineroViewModel.getDinero() >= 100){
            comprarco.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    compradoCofre = true;
                    dineroViewModel.setDinero(dineroViewModel.getDinero()-100);
                    compracofre.setImageResource(R.drawable.cofrecomprado);
                }
            });
        }

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                navController.navigate(R.id.action_juegos);
            }
        });
    }
}