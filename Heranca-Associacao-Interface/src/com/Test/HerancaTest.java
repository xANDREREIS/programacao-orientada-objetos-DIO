package com.Test;

import com.model2.Funcionario;
import com.model2.Gerente;
import com.model2.Vendedor;

public class HerancaTest {
    public static void main(String[] args) {
        Funcionario[] classes = new Funcionario[]{new Gerente(), new Vendedor(), new Funcionario()};

        for (Funcionario classe : classes) {
            classe.metodo1();
        }
        System.out.println("");

        for (Funcionario funcionario : classes) {
            funcionario.metodo2();
        }
        System.out.println("");

        Vendedor vendedor = new Vendedor();
        vendedor.metodo2();
    }
    
}


