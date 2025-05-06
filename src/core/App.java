package core;

/**
 * @author Jesimar S. Arantes
 * @Aluno Lucas Kauã Silva
 */

public class App {
    public static void main(String[] args) {
        Robo objRobo = new Robo();
        objRobo.printStatus();
        objRobo.move(60, 50);
        objRobo.printStatus();
        objRobo.move(55);
        objRobo.printStatus();
    }
}
