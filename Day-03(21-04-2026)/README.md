#   The example 1
```
class Student {
    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alif", 20);

        s1.display();
        s2.display();
    }
}
```
# The example 2
```
class Car {
    String brand;
    String color;
    int year;

    Car() {
        this("Toyota", "White", 2020);
    }

    Car(String brand) {
        this(brand, "Black", 2022);
    }

    Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year  = year;
    }

    void display() {
        System.out.println(brand + " | " + color + " | " + year);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Honda");
        Car c3 = new Car("BMW", "Red", 2023);

        c1.display();
        c2.display();
        c3.display();
    }
}
```
