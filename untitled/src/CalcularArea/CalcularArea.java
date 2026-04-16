package CalcularArea;

import java.util.ArrayList;

public class CalcularArea {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(8);
        Quadrado quadrado1 = new Quadrado(6);

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circulo1);
        formas.add(quadrado1);
        for (Forma f : formas){
            f.calcularArea();
            System.out.println("Resultado : "+ f.calcularArea());
        }
    }
}
