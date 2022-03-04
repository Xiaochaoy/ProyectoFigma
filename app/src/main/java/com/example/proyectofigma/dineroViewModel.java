package com.example.proyectofigma;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class dineroViewModel extends AndroidViewModel {
    int dinero;

    public dineroViewModel(@NonNull Application application) {
        super(application);
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

}
