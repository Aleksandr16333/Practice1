import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {

        String name = "Александр";
        String surname = "Рачков";
        int age = 29;
        while (true) {

            Scanner scaner = new Scanner(System.in);
            System.out.print("Введите возраст: ");
            int myage = scaner.nextInt();

            {

            }

            if (age == myage) {
                System.out.print("Введите город: ");
                String siti = scaner.next();
                System.out.printf("\n" + "Имя:" + " " + name + "\n" + "Фамилия:" + " " + surname + "\n" + "Возраст:" + " " + age + "лет" + "\n" + "Город:" + " " + siti);
                System.exit(0);
            } else {
                System.out.println("Возраст введен неверно");
            }
        }
    }
}

