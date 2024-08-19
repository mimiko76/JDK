package HW4;

import lombok.Data;
import lombok.Getter;

@Data
public class Worker {
    private int idNumber;
    private Long phoneNumber;
    private String name;
    @Getter
    private int experience;

    public Worker(int serviceNumber, Long phoneNumber, String name, int experience) {
        this.idNumber = serviceNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "serviceNumber= " + idNumber +
                ", phoneNumber= " + phoneNumber +
                ", name= '" + name + '\'' +
                ", experience= " + experience +
                '}';
    }
}
