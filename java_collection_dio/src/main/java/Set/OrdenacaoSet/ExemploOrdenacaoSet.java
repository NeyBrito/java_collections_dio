package Set.OrdenacaoSet;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        Set<Serie> series = new HashSet<>(){{
            add(new Serie("Prision Break", "Trama", 60 ));
            add(new Serie("Breaking Bad", "Ação", 58 ));
            add(new Serie("That 70' show", "Comédia", 58 ));

        }};

        for (Serie serie: series) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                + serie.getTempoEpisodio());

        Set<Serie> series1 = new LinkedHashSet<>(){{
            add(new Serie("Prision Break", "Trama", 60 ));
            add(new Serie("Breaking Bad", "Ação", 58 ));
            add(new Serie("That 70' show", "Comédia", 58 ));

        }};
        System.out.println("\n--\tOrdem de Inserção\t--");
        for (Serie serie: series1) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                + serie.getTempoEpisodio());

        System.out.println("\n--\tOdem natural (TempoEpisodio)\t--");
        Set<Serie> series2 = new TreeSet<>(series1);
        for (Serie serie: series2) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                + serie.getTempoEpisodio());

        System.out.println("\n--\tOrdem Nome/Genero/TempoEpisodio\t--");
        Set<Serie> series3 = new TreeSet<>(new CompatorNomeGeneroTempoEpisodio());
        series3.addAll(series);
        for (Serie serie: series3) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                + serie.getTempoEpisodio());

    }



}

class CompatorNomeGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}

class Serie implements Comparable<Serie>{
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

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if(tempoEpisodio != 0) return tempoEpisodio;

        return this.getGenero().compareTo(serie.getGenero());

    }
}
