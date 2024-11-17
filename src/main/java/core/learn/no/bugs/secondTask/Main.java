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

        /**
         * Задача 5
         */
        System.out.println("#5 Задача");

        Student[] students = {
                new Student("Alex", 1, 4.5),
                new Student("Bob", 2, 3.0),
                new Student("Dima", 3, 4.9),
                new Student("Bob", 5, 5.0)
        };

        for (Student student : students) {
            student.printStudentDetails();
        }

        /**
         * Задача 6
         */
        System.out.println("#6 Задача");
        Currency rubles = new Currency("Rubles", 100);
        rubles.printCurrencyInfo();
        System.out.println(rubles.convertToUSD(1565));

        /**
         * Задача 7
         */
        System.out.println("#7 Задача");
        Phone iphone = new Phone("Apple", "Iphone 16", 1499);
        iphone.applyDiscount(15);
        iphone.printPhoneDetails();

        /**
         * Задача 8
         */
        System.out.println("#8 Задача");
        Employee kate = new Employee("Kate", "Senior QA", 4500);
        Employee martin = new Employee("Martin", "Junior DevOps", 2000);
        Employee jack = new Employee("Jack", "Team Lead", 9850);

        kate.increaseSalary(10);
        martin.increaseSalary(99.75);
        jack.increaseSalary(50);

        System.out.println(kate);
        System.out.println(martin);
        System.out.println(jack);

        /**
         * Задача 9
         */
        System.out.println("#9 задача");
        Triangle firstTr = new Triangle(1,2,3);
        firstTr.printTriangleInfo();

        Triangle secondTr = new Triangle(3,4,5);
        secondTr.printTriangleInfo();

        /**
         * Задача 10
         */
        System.out.println("#10 задача");
        Player player = new Player("Player123", 1, 0);
        player.levelUp();
        player.addScore(100);
        player.levelUp();
        player.addScore(340);

        System.out.println(player);

        /**
         * Задача 11
         */
        System.out.println("#11 задача");
        Rectangle rectangle = new Rectangle(10, 10);
        System.out.println("Площадь: " + rectangle.calculateArea() + ", Периметер: " + rectangle.calculatePerimeter());
        Rectangle rectangle1 = new Rectangle(25, 15);
        System.out.println("Площадь: " + rectangle1.calculateArea() + ", Периметер: " + rectangle1.calculatePerimeter());

        /**
         * Задача 12
         */
        System.out.println("#12 задача");

        Customer customer = new Customer("Alex", "alex@gmail.com");
        customer.addPurchase("TV");
        customer.addPurchase("Radio");
        customer.addPurchase("Phone");
        System.out.println(customer);

        Customer customer1 = new Customer("Jack", "jack@yandex.ru");
        System.out.println(customer1);
        customer1.addPurchase("Laptop");
        customer1.addPurchase("Sandwich");
        System.out.println(customer1);

        /**
         * Задача 13
         */
        System.out.println("#13 задача");
        Company apple = new Company("Apple", 3000, 5500000);
        apple.printCompanyInfo();
    }
}
