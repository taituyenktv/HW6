import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Doctor extends Person implements CharSequence {
    private String specialist;
    private LocalTime workingTime;

    public Doctor(String name, int age, String specialist, LocalTime workingTime) {
        super(name, age);
        this.specialist = specialist;
        this.workingTime = workingTime;
    }

    public Doctor() {
        super();
    }


    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public LocalTime getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(LocalTime workingTime) {
        this.workingTime = workingTime;
    }


    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public String toString() {
        return  "Bác sỹ {" +
                super.toString()+
                "Chuyên khoa :'" + specialist + '\'' +
                ", Thời gian làm việc : " + workingTime +
                '}';
    }
//    public static void inpudDT(Scanner sc){
//
//    }

}
