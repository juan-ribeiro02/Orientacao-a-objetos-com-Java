package ExHeranca.ex4;

import java.util.ArrayList;

public class Controlador {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro());
        animais.add(new Gato());

        for (Animal item : animais) {
            item.fazerSom();
        }
    }
}
