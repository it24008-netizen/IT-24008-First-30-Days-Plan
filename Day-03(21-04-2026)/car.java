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
