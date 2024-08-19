package HW4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CollectionsWorkers {
    private final List<Worker> collectionsWorkers;
    public CollectionsWorkers() {
        collectionsWorkers = new ArrayList<>();
    }
    public  void createWorker(int serviceNumber, Long phoneNumber, String name, int experience){
        Worker newWorker = new Worker(serviceNumber, phoneNumber, name, experience);
        collectionsWorkers.add(newWorker);
    }

    /**
     * Метод для поиска работников по стажу
     * @param num наименьший дапазон стажа
     * @param num2 наибоьшей дапазон стажа
     * @return работников указанны между двумя стажами
     */

   public List<Worker> searchWorkerByExperience(int num, int num2) {
       List<Worker> list = new ArrayList<>();
       for (Worker temp : collectionsWorkers) {
           if (temp.getExperience() >= num && temp.getExperience() <= num2) {
               list.add(temp);
           }
       }
       return list;
   }

    /**
     * Метод для поиска работников по стажу
     * @param num искомый стаж
     * @return список работников с нужным стажом
     */
    public List<Worker> searchWorkerByExperience(int num){
        List<Worker> list = new ArrayList<>();
        for(Worker temp : collectionsWorkers){
            if(temp.getExperience() == num){
                list.add(temp);
            }
        }
        return list;
    }

    public List<Long> searchNumberPhoneByName(String name){
        List<Long> result = new ArrayList<>();
        for (Worker temp : collectionsWorkers){
            if(Objects.equals(temp.getName(), name)){
                result.add(temp.getPhoneNumber());
            }
        }
        return result;
    }

    public List<Worker> searchWorkerAboutIdNumber(int idNumber){
        List<Worker> result = new ArrayList<>();
        for(Worker temp : collectionsWorkers){
            if(temp.getIdNumber() == idNumber){
                result.add(temp);
            }
        }
        return result;
    }

    public  List<Worker> getAllWorker(){
        return collectionsWorkers;
    }
}
