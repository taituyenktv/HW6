import javax.xml.crypto.Data;
import java.time.LocalDate;

public class Patient extends Person{
    private String patientan;
    private LocalDate hospitalizedday;

    public Patient(String name, int age, String patient, LocalDate hospitalizedday) {
        super(name, age);
        this.patientan = patient;
        this.hospitalizedday = hospitalizedday;
    }
    public Patient(){
        super();
    }



    public String getPatient() {
        return patientan;
    }

    public void setPatient(String patient) {
        this.patientan = patient;
    }

    public LocalDate getHospitalizedday() {
        return hospitalizedday;
    }

    public void setHospitalizedday(LocalDate hospitalizedday) {
        this.hospitalizedday = hospitalizedday;
    }

    @Override
    public String toString() {
        return "Bệnh nhân {" +
                super.toString()+
                "Bệnh án là :'" + patientan + '\'' +
                ", Ngày nhập viện là :" + hospitalizedday +
                '}';
    }
}
