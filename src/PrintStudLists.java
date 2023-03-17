import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintStudLists {
    public static void main(String[] args){
        Student stud1 = new Student("Иванов", "Иван", "Иванович",
                "21/03/2002", "Пушкинская, 31", "8-931-107-13-04",
                1, "Экономический", 3, 100);
        Student stud2 = new Student("Петров", "Петр", "Петрович",
                "25/09/2003", "Новая, 35", "8-911-104-01-01",
                2, "Политический", 2, 150);
        Student stud3 = new Student("Сергеев", "Сергей", "Сергеевич",
                "11/01/2002", "Пролетарская, 11", "8-800-555-35-35",
                3, "Экономический", 2, 150);
        Student stud4 = new Student("Алексеев", "Алексей", "Алексеевич",
                "01/05/2003", "Уличная, 10", "8-954-100-13-05",
                4, "Политический", 3, 150);

        List<Student> students = new ArrayList<>();
        List<Student> studentsCourse3 = new ArrayList<>();
        List<Student> studentsCourse2 = new ArrayList<>();
        List<Student> studentsFacultyEconomic = new ArrayList<>();
        List<Student> studentsFacultyPolitic = new ArrayList<>();

        students.add(stud1);
        students.add(stud2);
        students.add(stud3);
        students.add(stud4);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите факультет: ");
        String n = scanner.next();

        System.out.println("Студенты указанного факультета: ");
        for (int i = 0; i < students.size(); i++) {
            if (n.equals(students.get(i).getFaculty())){System.out.println(students.get(i));}
        }

        System.out.println("Введите год: ");
        String year = scanner.next();
        for (int i = 0; i < students.size(); i++) {
            String tempDate = students.get(i).getDate().substring(6,10);
            if (Integer.valueOf(tempDate) > Integer.valueOf(year)){System.out.println(students.get(i));}
        }

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFaculty().equals("Политический")){studentsFacultyPolitic.add(students.get(i));}
            else if (students.get(i).getFaculty().equals("Экономический")){studentsFacultyEconomic.add(students.get(i));}
            if (students.get(i).getCourse() == 3){studentsCourse3.add(students.get(i));}
            else if (students.get(i).getCourse() == 2){studentsCourse2.add(students.get(i));}
        }
        System.out.println("Студенты экономического факультета: ");
        System.out.println(studentsFacultyEconomic);
        System.out.println("Студенты политического факультета: ");
        System.out.println(studentsFacultyPolitic);
        System.out.println("Студенты третьего курса: ");
        System.out.println(studentsCourse3);
        System.out.println("Студенты второго курса: ");
        System.out.println(studentsCourse2);
    }
}
