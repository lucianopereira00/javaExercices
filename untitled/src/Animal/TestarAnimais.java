package Animal;

public class TestarAnimais {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Spike");
        cachorro.setIdade(3);
        cachorro.emitirSom();

        Animal animal = (Animal) cachorro;
        animal.emitirSom();

        if(animal instanceof Cachorro){
            Cachorro cachorro2 = (Cachorro) animal;
        }else {
            System.out.println("O objeto não é um cachorro");
        }
    }
}

