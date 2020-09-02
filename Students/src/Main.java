import DAO.StudentDAO;
import DAO.StudentDAOImpl;
import Model.Student;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String [] args) {


        System.out.println("Выберите, что вы хотите узнать: ");
        System.out.println("1. Три лучших студента, исходя из среднего балла");
        System.out.println("2. Количество студентов с минимальным и максимальным баллами");
        System.out.println("3. Лучшие студенты в группах");
        System.out.println();
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();


        StudentDAO studentDAO = new StudentDAOImpl();
        List<Student> students = studentDAO.getAll();

        if (number == 1) {

            System.out.println("Три лучших студента, исходя из среднего балла: ");

            for (Student student : students) {
                System.out.println();
                System.out.println("имя: " + student.getFio());
                System.out.println("средний балл: " + student.getAvg_score());
                System.out.println("возраст: " + student.getAge());
                System.out.println("группа: " + student.getGroup());
            }
            System.out.println();
        }

        else if (number == 2) {

            List<String> list = studentDAO.getMin();
            System.out.println("Количество студентов с минимальным и максимальным баллом: ");


            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }

            else if (number == 3) {

            List<Student> topStudent = studentDAO.getTopStudents();

            System.out.println();


            System.out.println("Лучшие студенты в группах: ");

            for (Student student : topStudent) {
                System.out.println(student.getFio());
                System.out.println(student.getAvg_score());
                System.out.println(student.getGroup());
                System.out.println(student.getAge());
            }
        }

            else {
            System.out.println("Извините, но ввели некоректное число");
        }

    }
}
