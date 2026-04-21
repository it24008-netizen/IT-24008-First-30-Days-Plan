class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println(name + " is barking.");
    }

    public static void main(String[] args) {
        Dog d = new Dog("Bruno");
        d.eat();
        d.bark();
    }
}
