package lesson4;

public class Student {
    private static int counter = 1;
    private int id;
    private String name;
    private String surname;
    private int year;
    private double averageGradeMath;
    private double averageGradeEconomy;
    private double averageGradeEnglish;

    public Student(String name, String surname, int year, double averageGradeMath, double averageGradeEconomy, double averageGradeEnglish) {
        id = counter++;
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.averageGradeMath = averageGradeMath;
        this.averageGradeEconomy = averageGradeEconomy;
        this.averageGradeEnglish = averageGradeEnglish;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getAverageGradeMath() {
        return averageGradeMath;
    }

    public void setAverageGradeMath(double averageGradeMath) {
        this.averageGradeMath = averageGradeMath;
    }

    public double getAverageGradeEconomy() {
        return averageGradeEconomy;
    }

    public void setAverageGradeEconomy(double averageGradeEconomy) {
        this.averageGradeEconomy = averageGradeEconomy;
    }

    public double getAverageGradeEnglish() {
        return averageGradeEnglish;
    }

    public void setAverageGradeEnglish(double averageGradeEnglish) {
        this.averageGradeEnglish = averageGradeEnglish;
    }

    public double averageRating(double averageGradeEconomy, double averageGradeEnglish,double averageGradeMath){
        return (averageGradeEconomy + averageGradeEnglish + averageGradeMath)/3;
    }

    @Override
    public String toString() {
        return "Студент " +
                "id " + id +
                ", имя " + name  +
                ", фамилия " + surname +
                ", год поступления " + year +
                ", средняя оценка по математике " + averageGradeMath +
                ", средняя оценка по экономике " + averageGradeEconomy +
                ", средняя оценка по иностранному языку " + averageGradeEnglish;
    }
}
