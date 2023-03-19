package com.Test;

import com.model2.Faxineiro;
import com.model2.Funcionario;
import com.model2.Gerente;
import com.model2.Vendedor;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Vendedor vendedor_ = (Vendedor) new Funcionario(); //Downcast to Vendedor
    }
}
