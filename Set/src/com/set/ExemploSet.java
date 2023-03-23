package com.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8d, 9d, 10d, 11d, 12d, 13d));
        System.out.println(notas);

        System.out.println("Confira se a nota 5 esta no conjunto: " + notas.contains(5d));
        System.out.println("Confira se a nota 8 esta no conjunto: " + notas.contains(8d));

        System.out.println("Mostre a menor nota: " + Collections.min(notas));
        System.out.println("Mostre a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Soma dos valores: " + soma);

        System.out.println("Media das notas: " + soma / notas.size());

        System.out.println("Remova o numero 9");
        notas.remove(9d);
        System.out.println(notas);

        System.out.println("Remova notas menores ou iguais a 8");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double x = iterator1.next();
            if (x <= 8)
                iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Mostre todas as notas na ordem que foram informadas");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8d);
        notas2.add(9d);
        notas2.add(13d);
        notas2.add(10d);
        notas2.add(12d);
        notas2.add(11d);
        System.out.println(notas2);

        System.out.println("Mostre todos as notas em ordem crescente");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todas as notas");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se os conjuntos estao vazios");
        System.out.println("Conjunto 1: " + notas.isEmpty());
        System.out.println("Conjunto 2: " + notas2.isEmpty());
        System.out.println("Conjunto 3: " + notas3.isEmpty());
    }
}
