package LessonOOP.lesson1;

// 1. Создать класс «Сотрудник» с полями: ФИО, должность, email, телефон, зарплата, возраст;
public class Employee {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    //2. Конструктор класса должен заполнять эти поля при создании объекта;
    public Employee(String _name,String _position, String _email, String _phone,int _salary, int _age){
        name = _name;
        //name = "Ivanov Ivan";
        position = _position;
        email = _email;
        phone = _phone;
        salary = _salary;
        age = _age;

    }



}
