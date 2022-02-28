package com.example.proyectofigma;;

import java.util.Random;

public class Partida {

    private int jugador;
    private boolean terminada;
    private int[] casillas_seleccionadas;
    private final int[][] combinaciones = {
            {0,1,2},
            {3,4,5},
            {6,7,8},
            {0,3,6},
            {1,4,7},
            {2,5,8},
            {0,4,8},
            {2,4,6}};

    public Partida(){
        jugador = 1;
        terminada = false;
        casillas_seleccionadas = new int[9];
    }

    public int getJugador(){
        return jugador;
    }

    public void cambiarJugador(){
        if(this.jugador==1)
            this.jugador = 2;
        else
            this.jugador = 1;
    }

    public boolean isTerminada(){
        return terminada;
    }

    public void setTerminada(boolean terminada){
        this.terminada = terminada;
    }

    public int getCasillasSeleccionadas(int casilla){
        return casillas_seleccionadas[casilla];
    }

    public void setCasillasSeleccionadas(int valor, int casilla){
        this.casillas_seleccionadas[casilla] = valor;
    }

    public int[] comprobarGanador(){

        int array[] = new int[2];

        final int[][] combinaciones = getCombinaciones();

        for(int i = 0; i < 8; i++){
            if(casillas_seleccionadas[combinaciones[i][0]]==1 &&
                    casillas_seleccionadas[combinaciones[i][1]]==1 &&
                    casillas_seleccionadas[combinaciones[i][2]]==1) {

                array[0]=1;
                array[1]=i;
                return array;
            }
            else if(casillas_seleccionadas[combinaciones[i][0]]==2 &&
                    casillas_seleccionadas[combinaciones[i][1]]==2 &&
                    casillas_seleccionadas[combinaciones[i][2]]==2){

                array[0]=2;
                array[1]=i;
                return array;
            }
        }

        int contador = 0;
        for(int i = 0; i<9; i++){
            if(casillas_seleccionadas[i]!=0)
                contador++;
        }
        if(contador==9) {
            array[0]=3;
            array[1]=3;
            return array;
        }

        array[0]=0;
        array[1]=0;
        return array;
    }

    public int[][] getCombinaciones(){
        return combinaciones;
    }

}
