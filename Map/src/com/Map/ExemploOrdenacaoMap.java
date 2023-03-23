package com.Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("Ordem aleatoria");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking,Stephen", new Livro("IT", 300));
            put("Duhigg,Charles", new Livro("O poder do habito", 408));
            put("Harari,Yuval Naah", new Livro("21 Licoes Seculo 21", 309));
        }};
        for (Map.Entry<String,Livro> entry : meusLivros.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue().getNome());
        }

        System.out.println("Ordem de insercao");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking,Stephen", new Livro("IT", 420));
            put("Duhigg,Charles", new Livro("O poder do habito", 408));
            put("Harari,Yuval Naah", new Livro("21 Licoes Seculo 21", 309));
        }};
        for (Map.Entry<String,Livro> entry : meusLivros1.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue().getNome());
        }

        System.out.println("Ordem dos autores");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String,Livro> entry : meusLivros2.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue().getNome());
        }

        System.out.println("Ordem dos livros");
        Set<Map.Entry<String,Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String,Livro> entry : meusLivros3) {
            System.out.println(entry.getKey() + "-" + entry.getValue().getNome());
        }
    }
}

class Livro{
    private String nome;
    private Integer paginas;
    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getPaginas() {
        return paginas;
    }
    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (paginas == null) {
            if (other.paginas != null)
                return false;
        } else if (!paginas.equals(other.paginas))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
    }
    
}

class ComparatorNome implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
    
}
