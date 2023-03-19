package com.interface_;

public class Calculadora implements OperacaoMatematica{

    @Override
    public void somar(double a, double b) {
        System.out.println("Somar: " + (a + b));
    }

    @Override
    public void subtrair(double a, double b) {
        System.out.println("Subtrair: " + (a - b));
    }

    @Override
    public void dividir(double a, double b) {
        System.out.println("Divide: " + (a/b));
    }

    @Override
    public void multiplicar(double a, double b) {
        System.out.println("Multiplica: " + (a*b));
    }
    
}
