package Polimorfizm;

public class Main {
    public static void main(String[] args) {
        Roślina roślina1 = new Roślina();
        Drzewo drzewo = new Drzewo();

        Roślina roślina2 = drzewo;

        roślina2.rosnij();

        drzewo.gubieLiscie();

        ((Drzewo) roślina2).gubieLiscie();// tu mi scastowało nie wiem czemu z automatu. W  tutorialu podświetla na błąd

    }
}
