package LessonOOP.lesson2;

public class SuperCat extends Cat{
    protected int appetite; //количество еды, которое он съедает за один раз;
    protected String dish;
    public SuperCat(String name, int runLimit, int jumpLimit, int appetite) {
        super(name, appetite);
        this.jumpLimit = jumpLimit; //predeli
        this.runLimit = runLimit;
        this.appetite = appetite;
    }

    public void eat(int food){
        if (appetite > 0 && food <= appetite){
            System.out.println(this.name + " съел " + food + " грамм ");
        }
        else {
            System.out.println(this.name + " не может съесть столько еды");
        }
    }
}
