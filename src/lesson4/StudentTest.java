package lesson4;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Ваня", "Иванов", 2023, 3.2, 5, 4.8);
        Student student2 = new Student("Злата", "Носач", 2023, 4.9, 4.5, 5);
        Student student3 = new Student("Антонина", "Счастье", 2023, 4, 3.9, 4.2);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("Средняя оценка по всем предметам у " + student1.getName() + " " + student1.averageRating(3.2, 5, 4.8));
        System.out.println("Средняя оценка по всем предметам у " + student2.getName() + " " + student2.averageRating(4.9, 4.5, 5));
        System.out.println("Средняя оценка по всем предметам у " + student3.getName() + " " + student3.averageRating(4, 3.9, 4.2));


    }
}
