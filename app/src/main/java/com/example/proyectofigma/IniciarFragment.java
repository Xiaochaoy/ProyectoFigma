package com.example.proyectofigma;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import org.jetbrains.annotations.Nullable;


public class IniciarFragment extends Fragment {

    TextInputLayout contrasenya, email;
    Button iniciarsesion;
    CheckBox ok;
    Context mcontext;
    NavController navController;
    public static final String MY_PREFS_NAME = "user_pass_pref";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_iniciar, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        contrasenya = view.findViewById(R.id.contrasenya);
        email = view.findViewById(R.id.usuario);
        iniciarsesion = view.findViewById(R.id.iniciarsesion);
        ok = view.findViewById(R.id.ok);
        mcontext = getActivity();
        navController = Navigation.findNavController(view);

        SharedPreferences prefs = mcontext.getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        String restoredText = prefs.getString("text",null);
        if (restoredText != null){
            String name = prefs.getString("username", "");
            String password = prefs.getString("password", "");
            email.getEditText().setText(name);
            contrasenya.getEditText().setText(password);
        }

        iniciarsesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ok.isChecked()){
                    SharedPreferences.Editor editor = mcontext.getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
                    editor.putString("username", email.getEditText().getText().toString());
                    editor.putString("password", contrasenya.getEditText().getText().toString());
                    editor.apply();
                }
                navController.navigate(R.id.menuFragment);
            }
        });

    }
}