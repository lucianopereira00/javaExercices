package Campeonato;

import java.security.interfaces.RSAMultiPrimePrivateCrtKey;
import java.util.ArrayList;
import java.util.Timer;

public class CampeonatoFutebol {
    public static void main(String[] args) {
        ArrayList<Classificacao> tabela = new ArrayList<>();
        Classificacao time1 = new Classificacao(92, "Corinthians");
        Classificacao time2 = new Classificacao(87, "Flamengo");
        Classificacao time3 = new Classificacao(77, "Palmeiras");
        Classificacao time4 = new Classificacao(65, "Cruzeiro");
        Classificacao time5 = new Classificacao(31, "Vasco");
        Classificacao time6 = new Classificacao(11, "Avaí");
        Classificacao time7 = new Classificacao(23, "Sport");
        Classificacao time8 = new Classificacao(58, "Atletico-MG");

        tabela.add(time1);
        tabela.add(time2);
        tabela.add(time3);
        tabela.add(time4);
        tabela.add(time5);
        tabela.add(time6);
        tabela.add(time7);
        tabela.add(time8);

        tabela.sort((a, b) -> b.getPontos() - a.getPontos());

        Classificacao campeao = tabela.get(0);
        for (Classificacao time : tabela) {
            if (time.getPontos() > campeao.getPontos()) {
                campeao = time;
            }

        }
        System.out.println("====CAMPEÃO==== \n" + campeao);

        Classificacao viceCampeao = null;
        for (Classificacao time : tabela){
            if(time != campeao) {
                if (viceCampeao == null || time.getPontos() > viceCampeao.getPontos()) {
                    viceCampeao = time;
                }
            }
        }
        System.out.println("====VICE-CAMPEÃO==== \n" + viceCampeao);


        System.out.println("====CLASSIFICADOS PARA COPA LIBERTADORES");
        int posicaoLib = 1;
        for(Classificacao time : tabela){
            if(posicaoLib <= 3)
                System.out.println(posicaoLib+ "° - "+ time);
            posicaoLib++;
        }

        Classificacao terceiro = null;
        for (Classificacao time : tabela) {
            if (time != campeao && time != viceCampeao) {
                if (terceiro == null || time.getPontos() > terceiro.getPontos()) {
                    terceiro = time;
                }
            }
        }
        
        System.out.println("====CLASSIFICADOS PARA COPA SUL-AMERICANA==== \n");
        int posicaoSul = 4;
        for(Classificacao time :tabela){
            if(posicaoSul <= 5){
                if (time != campeao && time != viceCampeao && time != terceiro) {
                    System.out.println(posicaoSul +"° - "+ time);
                    posicaoSul++;
                }
            }
        }

        System.out.println("====REBAIXADOS PARA A SEGUNDA DIVISÃO DO CAMPEONATO====");
        int posicaoSegunda = 1;
        for(Classificacao time :tabela){
            if(posicaoSegunda > tabela.size()-3){
                System.out.println(posicaoSegunda + "° - "+ time);
            }
            posicaoSegunda++;
        }

        double soma = 0;
        for (Classificacao time : tabela){
            soma += time.getPontos();
        }
        System.out.println("====SOMA DOS PONTOS NO CAMPEONATO==== \n" + soma);
    }
}
