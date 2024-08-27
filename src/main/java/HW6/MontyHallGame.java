package HW6;

import lombok.Data;

import java.util.Random;

@Data
public class MontyHallGame {
    private int winsSwitch;
    private int winsStay;
    private int totalGames;

    public void playGame(int iterations) {
        for (int i = 0; i < iterations; i++) {
            boolean winSwitch = playRound(true);
            boolean winStay = playRound(false);
            if (winSwitch) winsSwitch++;
            if (winStay) winsStay++;
        }
        totalGames = iterations;
    }

    private boolean playRound(boolean switchDoor) {
        Random random = new Random();
        int carDoor = random.nextInt(3); // Случайная дверь с машиной
        int chosenDoor = random.nextInt(3); // Игрок выбирает дверь

        // Определяем дверь, которую откроет ведущий
        int revealedDoor;
        do {
            revealedDoor = random.nextInt(3);
        } while (revealedDoor == carDoor || revealedDoor == chosenDoor);

        if (switchDoor) {
            // Игрок меняет дверь
            for (int i = 0; i < 3; i++) {
                if (i != chosenDoor && i != revealedDoor) {
                    chosenDoor = i; // Меняем на оставшуюся дверь
                    break;
                }
            }
        }

        return chosenDoor == carDoor; // Возвращаем результат
    }
}
