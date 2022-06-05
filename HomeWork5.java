package Lessoon5;

public class HomeWork5 {

    public static void main(String[] args) {

        Employees[] employeesArray = new Employees[5];
        employeesArray[0] = new Employees("Ivanov Ivan Ivanovich", "Manager", "III@gb.ru", "+79991234567", 50000, 27);
        employeesArray[1] = new Employees("Petrov Petr Pavlovich", "Assistant", "PPP@gb.ru", "+79981234567", 500000, 57);
        employeesArray[2] = new Employees("Sergeev Sergay Sergeevich", "Cleaner", "SSS@gb.ru", "+79971234567", 550000, 67);
        employeesArray[3] = new Employees("Zinaidova Zinaida Zinaidovna", "Guard", "ZZZ@gb.ru", "+79961234567", 6000000, 77);
        employeesArray[4] = new Employees("Antonov Anton Antonovich", "Driver", "AAA@gb.ru", "+79951234567", 700000, 107);

        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].getAge() > 40){
                employeesArray[i].information();
            }

        }
    }
}
