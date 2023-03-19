package com.model;

public class Carro { // class
    String cor;
    String modelo;
    int capacidadeTanque;

    public Carro() { // constructor
    }

    public Carro(String cor) {
        this.cor = cor;
    }

    public Carro(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }

    public Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }

    @Override
    public String toString() {
        return "Carro [cor=" + cor + ", modelo=" + modelo + ", capacidadeTanque=" + capacidadeTanque + "]";
    }

    
}
