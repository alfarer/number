package es.svqjug.java101.number;

public class PersonFactory {
    public static Person newPerson() {
        return new Person();
    }

    public static Student101 new101Student() {
        return new Student101();
    }
}
