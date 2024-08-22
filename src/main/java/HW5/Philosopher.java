package HW5;

import java.util.concurrent.Semaphore;

class Philosopher extends Thread {
    private final int id;
    private final Semaphore leftFork;
    private final Semaphore rightFork;

    public Philosopher(int id, Semaphore leftFork, Semaphore rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                think();
                eat();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void think() throws InterruptedException {
        System.out.println("Philosopher " + id + " is thinking.");
        Thread.sleep((long) (Math.random() * 1000)); // Симуляция размышлений
    }

    private void eat() throws InterruptedException {
        leftFork.acquire(); // Берем левую вилку
        rightFork.acquire(); // Берем правую вилку

        System.out.println("Philosopher " + id + " is eating.");
        Thread.sleep((long) (Math.random() * 1000)); // Симуляция еды

        rightFork.release(); // Освобождаем правую вилку
        leftFork.release(); // Освобождаем левую вилку
    }
}
