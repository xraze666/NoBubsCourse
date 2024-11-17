package core.learn.no.bugs.secondTask;

public class Main {
    public static void main(String[] args) {
        /**
         * Задача 1
         */
        System.out.println("#1 Задача");

        Book book = new Book("В погоне за демоном", "Кира Киммерс", 999);
        book.setAuthor("Джеймс Кемерон");
        book.setPrice(3999);

        System.out.println("Книга: " + book.getTitle() + ", автор: " + book.getAuthor() + ", стоимость: " + book.getPrice());


        /**
         * Задача 2
         */
        System.out.println("#2 Задача");

        Person alex = new Person("Alex", 24);
        Person jon = new Person("Jon", 33);
        Person julia = new Person("Julia", 18);

        alex.printInfo();
        jon.printInfo();
        julia.printInfo();

        alex.setGender("man");
        alex.printInfo();

        /**
         * Задача 3
         */
        System.out.println("#3 Задача");

        Car bmw = new Car("BMW", "X5", 2007);
        bmw.setPrice(52000.209);
        bmw.printCarInfo();

        /**
         * Задача 4
         */
        System.out.println("#4 Задача");

        Product cola = new Product("Coca-Cola", "Drink", 999, 75);
        cola.setQuantity(10);
        cola.printProductInfo();
    }
}
