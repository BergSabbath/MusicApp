package br.com.alura.musicapp.modelos;

public class Audio {


    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int totalDeCurtidas;
    private int classificacao;

    //getters and setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotaldeCurtidas() {
        return totalDeCurtidas += 1;
    }

    public int getClassificacao() {
        return classificacao;
    }

    //fim do getters and setters

    //    metodos
    public void curtir() {
        this.totalDeCurtidas++;
    }

    public void reproduzir() {
        this.totalDeReproducoes++;
    }

//    public void classificar(double classificacao){
//        classificacao += 1;
//    }

}