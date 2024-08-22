package HW5;

import java.util.concurrent.Semaphore;

public class DiningPhilosophers {
    public static void main(String[] args) {
        final int NUM_PHILOSOPHERS = 5;
        Semaphore[] forks = new Semaphore[NUM_PHILOSOPHERS];

        // Инициализация вилок
        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            forks[i] = new Semaphore(1); // Каждая вилка доступна
        }

        Philosopher[] philosophers = new Philosopher[NUM_PHILOSOPHERS];

        // Создание философов
        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            philosophers[i] = new Philosopher(i, forks[i], forks[(i + 1) % NUM_PHILOSOPHERS]);
            philosophers[i].start();
        }

        // Ждем завершения всех философов
        for (Philosopher philosopher : philosophers) {
            try {
                philosopher.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("All philosophers have finished eating.");
    }
}
