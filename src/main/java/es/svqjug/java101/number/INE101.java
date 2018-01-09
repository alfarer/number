package es.svqjug.java101.number;

public class INE101 {
    private static Integer numberOfPersons = 0;
    private static Integer numberOfStudents = 0;

    public static Integer getNumberOfPerson() {
        return numberOfPersons;
    }

    public static Integer getNumberOfStudent() {
        return numberOfStudents;
    }

    public static void add1ToNumberOfPersons() { numberOfPersons++; }
    public static void add1ToNumberOfStudents() { numberOfStudents++; }

    public static void resetNumberOfPersons() { numberOfPersons = 0; }
    public static void resetNumberOfStudents() { numberOfStudents = 0; }
}
