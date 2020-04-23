package LessonOOP.lesson2;

class Dog extends Animal {
    public Dog(String name) {
        super("Пес " + name);
        this.runLimit = 500;
        this.jumpLimit = 0.5;
        this.swimLimit = 10;
    }
}