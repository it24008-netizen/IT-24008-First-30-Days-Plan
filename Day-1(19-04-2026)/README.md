###The code of Example 01

public class Car {
    String color;
    String model;
    int year;
    void displayInfo(){
        System.out.println("Car's Color : "+color);
        System.out.println("Car's Model : "+model);
        System.out.println("Car's Year  : "+year);
    }
}

public class Main{
    public static void main(String[] args){
  Car myCar=new Car();
  myCar.color="Black";
  myCar.model="Toyota";
  myCar.year=2025;
  myCar.displayInfo();
    }
}

###The Code of Example 02

public class Student{
    String name;
    int Roll;
    String district;
    String Number;
    void Show() {
        System.out.println(name);
        System.out.println(Roll);
        System.out.println(district);
        System.out.println(Number);
    }
}
public class Main{
    static void main(String[] args){
        Student s1=new Student();
        s1.name="Md Mahmudur rahman";
        s1.Roll=10;
        s1.district="Bhola";
        s1.Number="01749272722";
        s1.Show();
        Student s2=new Student();
        s2.name="Kutub Ali";
        s2.Roll=11;
        s2.district="Cumilla";
        s2.Number="01629277953";
        s2.Show();
        Student s3=new Student();
        s3.name="Hukumat Ali";
        s3.Roll=12;
        s3.district="chittagang";
        s3.Number="01749123456";
        s3.Show();
    }
}
