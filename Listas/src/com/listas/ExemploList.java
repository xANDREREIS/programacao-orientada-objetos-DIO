package com.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        notas.add(30d);
        notas.add(24d);
        notas.add(27d);
        notas.add(22d);
        notas.add(45d);
        notas.add(29d);
        notas.add(22d);
        System.out.println(notas);
        System.out.println(notas.indexOf(22d));
        notas.add(4, 8.0);
        System.out.println(notas);
        System.out.println(notas.indexOf(8d));
        notas.set(4, 24d);
        System.out.println(notas);
        for (Double double1 : notas) {
            System.out.println(double1);
        }
        System.out.println("--------------------------------");
        System.out.println(notas.get(4));
        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));
        Iterator<Double> notasIterator = notas.iterator();
        Double soma = 0d;
        while (notasIterator.hasNext()) {
            double next = notasIterator.next();
            soma += next;
        }
        System.out.println("Soma: " + soma);
        Double media = soma / notas.size();
        System.out.printf("Media: %.2f \n", media);
        System.out.println(notas);
        notas.remove(22.0d);
        System.out.println(notas);
        notas.remove(1);
        System.out.println(notas);

        Iterator<Double> notas1 = notas.iterator();
        while (notas1.hasNext()) {
            Double next = notas1.next();
            if (next < 29)
                notas1.remove();
        }
        System.out.println(notas);

        notas.clear();
        System.out.println(notas);
        System.err.println(notas.isEmpty());
    }
}
