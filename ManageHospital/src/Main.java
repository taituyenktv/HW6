import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // cái này là j?
//        Doctor doctor = new Doctor();
//        Patient patient = new Patient();
        Doctor[] doctors = new Doctor[1000];
        Patient[] patients = new Patient[10000];
        int chose;
        do {

            System.out.println("====== Chào mừng bạn đến với phần mềm quản lý của bệnh viện ======");
            System.out.println("Mời bạn chọn chức năng thêm thông tin :\n " +
                    "1. Thêm thông tin Bác sỹ. \n " +
                    "2. Thêm thông tin Bệnh nhân. \n " +
                    "3. Hiện thị thông tin Bác sỹ. \n " +
                    "4. Hiển thị thông tin Bệnh nhân. \n " +
                    "5. Thoát ");

            chose = Integer.parseInt(sc.nextLine());
            if (chose == 5) break;
            while (chose <= 0 || 4 < chose) {
                System.out.println("Bạn chỉ được chọn từ 1 đến 4. \n " +
                        "Mời bạn chọn lại :  ");
                chose = Integer.parseInt(sc.nextLine());

            }

            switch (chose) {
                case 1:
                    System.out.println("Mời bạn nhập số lượng bác sỹ cần thêm thông tin: ");
                    int numDoctor = Integer.parseInt(sc.nextLine());
                    while (numDoctor < 0) {
                        System.out.println(" Hãy nhập số >0 " +
                                "Mời bạn nhập lại : ");
                        numDoctor = Integer.parseInt(sc.nextLine());
                    }
                    for (int i = 0; i < numDoctor; i++) {
                        System.out.println("Mời bạn nhập Tên bác sỹ thứ "+i+1+" : ");
                        String name = sc.nextLine();
                        System.out.println("Mời bạn nhập tuổi :");
                        int age = Integer.parseInt(sc.nextLine());
                        System.out.println("Mời bạn nhập tên khoa: ");
                        String special = sc.nextLine();
                        System.out.println("Mời bạn nhập thời gian làm việc : (HH:mm)");
                        String time = sc.nextLine();
                        LocalTime time1 = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm"));
                        Doctor doctor1 = new Doctor(name, age, special, time1);
                        doctors[i] = doctor1;
                    }
                    break;
                case 2:
                    System.out.println("Mời bạn nhập số lượng bệnh nhân cần thêm thông tin: ");
                    int numPatient = Integer.parseInt(sc.nextLine());
                    while (numPatient < 0) {
                        System.out.println(" Hãy nhập số >0 " +
                                "Mời bạn nhập lại : ");
                        numPatient = Integer.parseInt(sc.nextLine());
                    }
                    for (int i = 0; i < numPatient; i++) {
                        System.out.println("Mời bạn nhập Tên bệnh nhân thứ "+i+1+": ");
                        String name = sc.nextLine();
                        System.out.println("Mời bạn nhập tuổi :");
                        int age = Integer.parseInt(sc.nextLine());
                        System.out.println("Mời bạn nhập tên khoa: ");
                        String patilentan = sc.nextLine();
                        System.out.println("Mời bạn nhập thời gian làm việc : (yyyy/MM/dd)");
                        String date = sc.nextLine();
                        LocalDate date1 = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
                        Patient patient1 = new Patient(name, age, patilentan, date1);
                        patients[i] = patient1;
                    }
                    break;
                case 3:
                         for (Doctor d : doctors
                    ) {
                        if (d == null) break;
                        System.out.println(d);
                    }break;
                case 4:
                    for (Patient p : patients
                    ) {
                        if (p == null) break;
                        System.out.println(p);
                    }
                    break;


            }

        } while (true);


        System.out.println("Cảm ơn các bạn đã điền các thông tin hữu ích .");


    }
//    public static

}

