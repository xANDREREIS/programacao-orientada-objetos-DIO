package com.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoList {
    public static void main(String[] args) {
        List<Gato> lista = new ArrayList<>() {
            {
                add(new Gato("Miau", 10, "Preto"));
                add(new Gato("Xamxam", 23, "Laranja"));
                add(new Gato("Ymir", 18, "Rajado"));
            }
        };
        System.out.println("Ordem de insercao");
        System.out.println(lista);
        System.out.println("--------------------------------");

        System.out.println("Ordem aleatoria");
        Collections.shuffle(lista);
        System.out.println(lista);
        System.out.println("--------------------------------");

        System.out.println("Ordem natural - NOME");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("--------------------------------");

        System.out.println("Ordem - IDADE");
        // Collections.sort(lista,new ComparatorIdade()); mesma coisa da linha abaixo
        lista.sort(new ComparatorIdade());
        System.out.println(lista);
        System.out.println("--------------------------------");

        System.out.println("Ordem - Cor");
        lista.sort(new ComparatorCor());
        System.out.println(lista);
        System.out.println("--------------------------------");

        System.out.println("Ordem - Nome, cor, idade");
        lista.sort(new ComparatorNomeCorIdade());
        System.out.println(lista);
    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }

}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getCor().compareToIgnoreCase(g2.getNome());
        if (nome != 0)
            return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0)
            return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

}
