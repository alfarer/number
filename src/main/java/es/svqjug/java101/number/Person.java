package es.svqjug.java101.number;

class Person {
    private String root = "person-";
    private String name = root;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = root;
        this.name += name;
    }

    public void setRoot(String root) {
        this.root = root;
    }
}
