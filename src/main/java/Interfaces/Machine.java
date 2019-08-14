package Interfaces;

public class Machine implements Info{//klasa implementująca interface musi implementować metody z interface`u lub być abstrakcyjną

    private int id = 7;

    public void start(){
        System.out.println("Machine started.");
    }
@Override
    public void showInfo() {
    System.out.println("Machine ID is " + id);

    }
}
