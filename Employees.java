package Lessoon5;

public class Employees {

    private String fio;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;


    public Employees(String fio, String position, String email, String phoneNumber, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void information() {
        System.out.println("Name of employee: " + fio + "; Position is: " + position + "; Email: " + email + "; Phone Number: " + phoneNumber + "; Salary: " + salary + "; Age: " + age);
    }

    public int getAge() {
        return age;
    }

}
