package com.example.proyectofigma;;

import java.util.Random;

public class Partida {

    private int jugador;
    private boolean terminada;
    private int[] casillas_seleccionadas;
    private final int[][] combinaciones = {{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6},
            {1,4,7}, {2,5,8}, {0,4,8}, {2,4,6}};

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

    public int dosEnRaya(int jugador){

        int [][] combinaciones = getCombinaciones();
        int casilla = -1;
        int cuantas_lleva = 0;

        for(int i = 0; i < getCombinaciones().length; i++){
            cuantas_lleva = 0;
            for(int j = 0; j < 3; j++){
                if(casillas_seleccionadas[combinaciones[i][j]]==jugador)
                    cuantas_lleva++;
            }
            if(cuantas_lleva==2){
                for(int j = 0; j < 3; j++){
                    if(casillas_seleccionadas[combinaciones[i][j]]==0)
                        return combinaciones[i][j];
                }
            }
        }
        return casilla;
    }

    public int numeroCasillasSeleccionadas(int jugador){
        int contador = 0;
        for(int i = 0; i < casillas_seleccionadas.length; i++){
            if(casillas_seleccionadas[i]==jugador)
                contador++;
        }
        return contador;
    }

    public int combinacionesConAspa(){

        int [][] combinaciones = getCombinaciones();
        int casilla = -1;
        int [] combinaciones_aspa = new int[8];

        int casilla0 = 0;
        int casilla2 = 0;
        int casilla6 = 0;
        int casilla8 = 0;

        //comprobar que combinaciones tienen aspa
        for(int i = 0; i < getCombinaciones().length; i++){
            for(int j = 0; j < 3; j++){
                if(casillas_seleccionadas[combinaciones[i][j]]==1)
                    combinaciones_aspa[i]=1;
            }
        }
        //comprobar que casilla cortaría más combinaciones
        for(int i = 0; i < getCombinaciones().length; i++){
            if(combinaciones_aspa[i]==1){
                for(int j = 0; j < 3; j++){
                    if(combinaciones[i][j]==0 && casillas_seleccionadas[combinaciones[i][j]]==0)
                        casilla0++;
                    else if(combinaciones[i][j]==2 && casillas_seleccionadas[combinaciones[i][j]]==0)
                        casilla2++;
                    else if(combinaciones[i][j]==6 && casillas_seleccionadas[combinaciones[i][j]]==0)
                        casilla6++;
                    else if(combinaciones[i][j]==8 && casillas_seleccionadas[combinaciones[i][j]]==0)
                        casilla8++;
                }
            }
        }

        if(casilla0==2)
            return 0;
        else if(casilla2==2)
            return 2;
        else if(casilla6==2)
            return 6;
        else if(casilla8==2)
            return 8;

        return -1;
    }

    public int dosEnRayaGanar(){

        int [][] combinaciones = getCombinaciones();
        int casilla = -1;
        int cuantas_lleva = 0;

        for(int i = 0; i < getCombinaciones().length; i++){
            cuantas_lleva = 0;
            for(int j = 0; j < 3; j++){
                if(casillas_seleccionadas[combinaciones[i][j]]==2)
                    cuantas_lleva++;
                if(casillas_seleccionadas[combinaciones[i][j]]==1)
                    cuantas_lleva--;
            }
            if(cuantas_lleva==1){
                for(int j = 0; j < 3; j++){
                    if(casillas_seleccionadas[combinaciones[i][j]]==0)
                        return combinaciones[i][j];
                }
            }
        }
        return casilla;
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
        if(contador==9)
        {
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
