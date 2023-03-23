package com.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemplosOrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("Ordem aleatoria");
        Set<Serie> minhaSerie = new HashSet<>() {
            {
                add(new Serie("The Last of Us", "Suspense", 60));
                add(new Serie("Dark", "Fantasia", 60));
                add(new Serie("The Office", "Comedia", 25));
            }
        };

        for (Serie serie : minhaSerie) {
            System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoEpisodio());
        }

        System.out.println("----------------------------------------------------------------");

        System.out.println("Ordem de insercao");
        Set<Serie> minhaSerie2 = new LinkedHashSet<>() {
            {
                add(new Serie("The Last of Us", "Suspense", 60));
                add(new Serie("Dark", "Fantasia", 60));
                add(new Serie("The Office", "Comedia", 25));
            }
        };
        for (Serie serie : minhaSerie2) {
            System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoEpisodio());
        }

        System.out.println("----------------------------------------------------------------");

        System.out.println("Ordem natural (tempo episodio)");
        Set<Serie> minhaSerie3 = new TreeSet<>(minhaSerie2);
        for (Serie serie : minhaSerie3) {
            System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoEpisodio());
        }

        System.out.println("----------------------------------------------------------------");

        System.out.println("Ordem nome/genero/tempoEpisodio");
        Set<Serie> minhaSerie4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhaSerie4.addAll(minhaSerie3);
        for (Serie serie : minhaSerie4) {
            System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoEpisodio());
        }
    }
}

class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((tempoEpisodio == null) ? 0 : tempoEpisodio.hashCode());
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
        Serie other = (Serie) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (tempoEpisodio == null) {
            if (other.tempoEpisodio != null)
                return false;
        } else if (!tempoEpisodio.equals(other.tempoEpisodio))
            return false;
        return true;
    }

    @Override
    public int compareTo(Serie serie) {
        int tempo = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempo != 0)
            return tempo;
        return this.getGenero().compareTo(serie.getGenero());
    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {
    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0)
            return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0)
            return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}
