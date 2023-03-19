package com.test;

import com.model.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        
        carro.setCor("Vermelho");
        carro.setModelo("Fiat");
        carro.setCapacidadeTanque(20);

        double totalValorTanque = carro.totalValorTanque(4.30);

        System.out.println(carro);
        System.out.println("Valor para encher tanque: R$" + totalValorTanque);
        
        Carro carro1 = new Carro("Azul", "BMW",25);
        
        double totalValorTanque1 = carro1.totalValorTanque(4.30);
        System.out.println(carro1);
        System.out.println("Valor para encher tanque: R$" + totalValorTanque1);
    }
}
