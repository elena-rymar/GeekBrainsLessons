package LessonOOP.Lesson3;

//5. Создать классы Собака и Кот с наследованием от класса Животное;
//6. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков);
//7. У каждого животного есть ограничения на действия (бег: кот – 200 м., собака – 500 м.; прыжок: кот – 2 м., собака – 0.5 м.; плавание: кот не умеет плавать, собака – 10 м.);
//8. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true);

public abstract class Animal {
    protected String name;
    protected int runLimit = 0;
    protected double jumpLimit = 0;
    protected int swimLimit = 0;
//конструктор по умолчанию
    public Animal () {this.name = "No name";}
//конструктор по передаче имени
    public Animal (String name) {this.name = name;}

    public void run(int distance){
        if (runLimit > 0 && distance <= runLimit){
            System.out.println(this.name + " пробежал " + distance + " метров ");
        }
        else {
            System.out.println(this.name + " не может столько пробежать");
        }
    }

    public void swim(int distance){
        if (swimLimit > 0 && distance <= swimLimit){
            System.out.println(this.name + " проплыл " + distance + " метров ");
        }
        else {
            System.out.println(this.name + " не может столько проплыть");
        }
    }

    public void jump(double height){
        if (jumpLimit > 0 && height <= jumpLimit){
            System.out.println(this.name + " прыгнул " + height + " метров ");
        }
        else {
            System.out.println(this.name + " не может прыгнуть");
        }
    }

}
