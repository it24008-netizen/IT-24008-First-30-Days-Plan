class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    String company;

    Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    void showCompany() {
        System.out.println("Company: " + company);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, String company, String department) {
        super(name, company);
        this.department = department;
    }

    void showDepartment() {
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Manager m = new Manager("Alice", "Google", "Engineering");
        m.display();
        m.showCompany();
        m.showDepartment();
    }
}
