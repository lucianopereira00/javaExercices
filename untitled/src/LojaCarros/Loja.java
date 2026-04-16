package LojaCarros;

import java.util.ArrayList;

public class Loja {
    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<String>();
        carros.add("Honda Civic");
        carros.add("Toyota Corolla ");
        carros.add("Ford Raptor");

        carros.forEach(carro -> System.out.println(carro));
    }
}
