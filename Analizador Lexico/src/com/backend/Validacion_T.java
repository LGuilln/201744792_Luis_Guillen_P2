/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend;

/**
 *
 * @author luedu
 */
public class Validacion_T {

    private String Reservadas[] = {"funcion", "principal", "retornar", "vacio", "variable", "entero", "decimal", "booleano", "cadena", "carácter", "si", "sino", "mientras", "para", "hacer", "imprimir"};
    private String operadores[] = {"+", "-", "*", "/", "%", "=", "==", "<", ">", ">=", "<="};
    private String agrupadores[] = {"(", ")", "{", "}"};
    private String signos[] = {"\"", ";"};
    private String estadosMatriz[] = {"E", "C", "V", "D", "T", "L", "PARAM", "NUM", "DIG", "OPERADOR"};

  
     /**
     * Método para validar las palabras reservadas
     *
     * @param evt
     */
    
    public boolean isPalabraReservada(String palabra) {
        for (int i = 0; i < Reservadas.length; i++) {
            if (Reservadas[i].equals(palabra)) {
                return true;
            }
        }
        return false;
    }

     /**
     * Método para validar operador
     *
     * @param evt
     */
    
    public boolean isOperador(String palabra) {
        for (int i = 0; i < operadores.length; i++) {
            if (operadores[i].equals(palabra)) {
                return true;
            }
        }
        return false;
    }

    
     /**
     * Método para validar los signos de agrupacion
     *
     * @param evt
     */
    
    public boolean isAgrupador(String palabra) {
        for (int i = 0; i < agrupadores.length; i++) {
            if (agrupadores[i].equals(palabra)) {
                return true;
            }
        }
        return false;
    }

    
     /**
     * Método para validar los signos
     *
     * @param evt
     */
    
    public boolean isSigno(String palabra) {
        for (int i = 0; i < signos.length; i++) {
            if (signos[i].equals(palabra)) {
                return true;
            }
        }
        return false;
    }
    
    
     /**
     * Método para validar la matriz de estados
     *
     * @param evt
     */

    public boolean isEstado(String palabra) {
        for (int i = 0; i < estadosMatriz.length; i++) {
            if (estadosMatriz[i].equals(palabra)) {
                return true;
            }
        }
        return false;
    }
    
    
     /**
     * Método para validar verificar la cola con la Pila
     *
     * @param evt
     */

    public boolean verificarIgualdad(String simboloPila, String simboloCadena) {

        if (simboloPila.equals(simboloCadena)) {
            return true;
        }
        return false;
    }

    //Posicion X, Y 
    public int regresarPosicionColumna(String palabra) {
        switch (palabra) {
            case "funcion":
                return 1;
            case "for":
                return 2;
            case "V":
                return 3;
            case "imprimir":
                return 5;
            case "while":
                return 7;
            case "if":
                return 6;
            case "variable":
                return 2;
            case "entero":
                return 7;
            case "decimal":
                return 8;
            case "booleano":
                return 9;
            case "caracter":
                return 10;
            case "false":
                return 12;
            case ".":
                return 13;
            case "true":
                return 14;
            case "NUM":
                return 15;
            case "ID":
                return 0;
            case "e":
                return 3;
            case "D":
                return 7;
            case "DIGITO":
                return 15;
            default:
                return 0;
        }

    }

    // Envia la Posicion del Token 
    public int regresarposicionFila(String estado) {

        switch (estado) {
            case "E":
                return 1;
            case "C":
                return 2;
            case "V":
                return 3;
            case "D":
                return 4;
            case "T":
                return 5;
            case "L":
                return 6;
            case "PARAM":
                return 7;
            case "NUM":
                return 8;
            case "DIG":
                return 9;
            case "OPERADOR":
                return 10;
            default:
                return 0;
        }
    }
}
