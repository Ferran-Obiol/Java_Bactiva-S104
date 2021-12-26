package org.itacademy.javatesting.junit.n1exercici2;

public class CalculoDNI {

    private int numeroDNI;
    private final char [] lletra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};


    public char calculaLletra(int num){
        int resta;
        resta = num % 23;
        return lletra[resta];
    }
}
