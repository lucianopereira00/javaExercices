package Campeonato;

import java.util.ArrayList;

public class Classificacao {
    private int pontos;
    private String time;

    @Override
    public String toString() {
        return "EQUIPE: " + time + "\nPONTOS: "+ pontos+"\n";
    }

    public Classificacao(int pontos,  String time) {
        this.pontos = pontos;
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

}
