package lesson5;

public class Person {

    String firstName;
    String lastName;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    Person(String firstName, String lastName, String position, String email, String phone, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void getInfoPerson() {
        System.out.println(this.firstName + "; " + this.lastName + "; " + this.position + "; " + this.email + "; " + this.phone + "; " + this.salary + "; " + this.age);
    }

}
