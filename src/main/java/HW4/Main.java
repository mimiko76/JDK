package HW4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CollectionsWorkers collectionsWorkers = new CollectionsWorkers();
        collectionsWorkers.createWorker(1, 99604455856L, "Misha1", 5);
        collectionsWorkers.createWorker(6, 97704564856L, "Marina2", 3);
        collectionsWorkers.createWorker(8, 99604566756L, "Sasha3", 1);
        collectionsWorkers.createWorker(9, 99604455856L, "Misha4", 32);
        collectionsWorkers.createWorker(12, 97704564856L, "Marina5", 67);
        collectionsWorkers.createWorker(2, 99604566756L, "Sasha6", 24);
        collectionsWorkers.createWorker(24, 99604455856L, "Misha7", 10);
        collectionsWorkers.createWorker(34, 97704564856L, "Marina8", 1);
        collectionsWorkers.createWorker(33, 99604566756L, "Sasha9", 12);
        System.out.println(collectionsWorkers.searchNumberPhoneByName("Misha1"));
        System.out.println(collectionsWorkers.searchWorkerAboutIdNumber(6));
        System.out.println(collectionsWorkers.searchWorkerByExperience(10,20));
    }
}
