package LessonOOP.Lesson3;

public class TestAnimal {
    public static void main(String[] args) {
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
