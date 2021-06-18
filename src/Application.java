
import model.Kotik;

public class Application {

    public static void main(String[] args) {

        Kotik one = new Kotik(5, "Barsik", 6, "Meow-meow");
        one.eat(100, "Whiskas");
        System.out.println("Имя котика: " + one.getName() + " вес котика: " + one.getWeight());
        one.liveAnotherDay();

        System.out.println("=================Разделитель котиков================");
        Kotik two = new Kotik();
        two.setKotik(7,"Murzik", 5, "Meeeeaouuuu");
        System.out.println("Имя котика: " + two.getName() + " вес котика: " + two.getWeight());
        System.out.println();

        System.out.println("Сравнение мяуканья котиков: 1-й " + one.getMeow() + " 2-ой " + two.getMeow() );

        System.out.println("Количество котиков " + Kotik.getInstanceCounter());
    }
}
