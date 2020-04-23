package LessonOOP.lesson1;

public class Company {
    public static void main(String[] args) {
        //3. написать метод, который выводит информацию об объекте в консоль;
        Employee employee1 = new Employee("Ivanov Ivan","manager","ivanov@mail.ru", "+79119423004", 100000, 30);
        System.out.println("Один сотрудник: " + employee1.name +" - "+ employee1.position + " email: " + employee1.email + ", phone: " + employee1.phone +", age: " + employee1.age);
        System.out.println();

        //4. Создать массив из 5 сотрудников:
        Employee[] employeesArray = new Employee[5]; // Вначале объявляем массив объектов
        employeesArray[0] = new Employee("Ivanov Ivan", "Engineer", " ivivan@mailbox.com ", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
        employeesArray[1] = new Employee("Petrov Pavel", "Engineer", " petpav@mailbox.com ", "892312312", 30000, 50);
        employeesArray[2] = new Employee("Sidorov Egor", "Engineer", " sideg@mailbox.com ", "892312312", 30000, 45);
        employeesArray[3] = new Employee("Ivanova Ivanna", "Engineer", " ivanna@mailbox.com ", "892312312", 30000, 35);
        employeesArray[4] = new Employee("Samoylova Irina", "Engineer", " samira@mailbox.com ", "892312312", 30000, 39);

        System.out.println("Сотрудники старше 40:");
                //С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].age >= 40)
            System.out.println(employeesArray[i].name + " Возраст: " + employeesArray[i].age +" Должность: "+ employeesArray[i].position + " email: " + employeesArray[i].email + " Зарплата: " + employeesArray[i].salary);
            //else
                //System.out.println("no employees under 40");
        }
    }
}
