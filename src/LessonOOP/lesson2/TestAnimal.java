package LessonOOP.lesson2;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] arrayOfAnimals = new Animal[3];

        arrayOfAnimals[0] = new Cat("Vasiliy", 100);
        arrayOfAnimals[1] = new Dog("Zhuchka");
        arrayOfAnimals[2] = new SuperCat("Kasia", 350, 3, 100);

        for (Animal animal : arrayOfAnimals){
            animal.run(150);
            animal.jump(2.5);
            animal.swim(5);
        }
        System.out.println();
        //массив котов
        Cat[] cats = {
                new Cat("Мурзик", 70),
                new Cat("Барсик", 25),
                new Cat("Васька", 10),
        };
        //тарелка с едой,
        Plate plate = new Plate(100);
        for(Cat itemCat:cats) {
            itemCat.eat(plate);
            itemCat.info();
        }

    }
}
