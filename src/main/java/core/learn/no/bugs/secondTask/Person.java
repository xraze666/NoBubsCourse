package core.learn.no.bugs.secondTask;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {}

    public void printInfo() {
        System.out.println("Имя: " + this.name + ", Возраст: " + this.age + ", Пол: " + this.gender);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
