package HW6;

public class Main {
    public static void main(String[] args) {
        MontyHallGame game = new MontyHallGame();
        int iterations = 1000;

        game.playGame(iterations);

        System.out.println("Количсетво игр: " + game.getTotalGames());
        System.out.println("Выйгрышей при смене варианта: " + game.getWinsSwitch());
        System.out.println("Выйгришей не меняя варианта: " + game.getWinsStay());
    }
}
