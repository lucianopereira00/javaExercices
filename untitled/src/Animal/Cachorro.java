package Animal;

public class Cachorro extends Animal {
    private String raça;

    @Override
    public void emitirSom(){
        System.out.println("Au, au, au");
    }
}
