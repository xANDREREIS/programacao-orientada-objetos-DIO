package com.Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionario e relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrosPolulares = new HashMap<>(){{
            put("Gol", 12.4);
            put("Fiat", 11.3);
            put("BMW", 22.2);
            put("Ferrari", 19.2);
            put("Kwid", 15.9);
        }};
        System.out.println(carrosPolulares);

        System.out.println("--------------------------------");

        System.out.println("Substitua o consumo do Gol por 14.3");
        carrosPolulares.replace("Gol", 12.4, 14.3);
        System.out.println(carrosPolulares);

        System.out.println("--------------------------------");

        System.out.println("Confira se o modelo Tucson esta no dicionario");
        System.out.println(carrosPolulares.containsKey("Tucscon"));
        System.out.println("Confira se o modelo BMW esta no dicionario");
        System.out.println(carrosPolulares.containsKey("BMW"));

        System.out.println("Exiba o consumo do Gol: " + carrosPolulares.get("Gol"));

        System.out.println("--------------------------------");

        System.out.println("Exiba os modelos: ");
        Set<String> models = carrosPolulares.keySet();
        System.out.println(models);

        System.out.println("--------------------------------");

        System.out.println("Exiba os consumos: ");
        Collection<Double> values = carrosPolulares.values();
        System.out.println(values);

        System.out.println("--------------------------------");

        System.out.println("Exiba o modelo mais eficiente e seu consumo");
        Double consumoMaisEficiente = Collections.max(carrosPolulares.values());
        Set<Entry<String, Double>> entrySet = carrosPolulares.entrySet();
        String modeloMaisEficiente = "";

        for (Entry<String,Double> entry : entrySet) {
            if(entry.getValue().equals(consumoMaisEficiente)) {
            modeloMaisEficiente = entry.getKey();
            System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + "-" + consumoMaisEficiente);
            }
        } 
        
        System.out.println("--------------------------------");

        System.out.println("Exiba o modelo menos eficiente e seu consumo");
        Double consumoMenosEficiente = Collections.min(carrosPolulares.values());
        String modeloMenosEficiente = "";
        for (Entry<String,Double> entry : carrosPolulares.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos Eficiente: " + modeloMenosEficiente + "-" + consumoMenosEficiente);
            }
        }

        System.out.println("--------------------------------");
        System.out.println("Exiba a soma dos consumos");
        Iterator<Double> iterator = carrosPolulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Soma: " + soma);
        System.out.printf("Exiba a media dos consumos: %.2f" ,soma/carrosPolulares.size());

        System.out.println("\n --------------------------------");
        System.out.println("\n" + carrosPolulares);
        System.out.println("Remova os modelos com o consumo igual a 14.3");
        Iterator<Double> iterator2 = carrosPolulares.values().iterator();
        while (iterator2.hasNext()){
            if(iterator2.next().equals(14.3)) iterator2.remove();
        }
        System.out.println(carrosPolulares);

        System.out.println("--------------------------------");
        System.out.println("Exiba todos os carros na ordem em que foram informados");
        Map<String, Double> carrosPolulares1 = new LinkedHashMap<>(){{
            put("Gol", 12.4);
            put("Fiat", 11.3);
            put("BMW", 22.2);
            put("Ferrari", 19.2);
            put("Kwid", 15.9);
        }};
        System.out.println(carrosPolulares1);

        System.out.println("--------------------------------");
        System.out.println("Exiba o dicionario pela ordem de modelo");
        Map<String, Double> carrosPolulares2 = new TreeMap<>(carrosPolulares1);
        System.out.println(carrosPolulares2);

        System.out.println("--------------------------------");
        System.out.println("Apague o dicionario");
        carrosPolulares2.clear();
        System.out.println(carrosPolulares2);

        System.out.println("--------------------------------");
        System.out.println("Confira se esta vazia: " + carrosPolulares2.isEmpty());
    }
}
