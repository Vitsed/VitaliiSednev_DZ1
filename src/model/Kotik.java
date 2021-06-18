package model;

/*TODO
   -mark this package as model
   - create 3 eat() methods (override)
   -
*/
public class Kotik {

    private static int instanceCounter = 0;
    private int satiety;
    private int prettiness;
    private String name;
    private int weight;
    private String meow;
    private String food;


    public Kotik(int prettiness, String name, int weight, String meow) {
        this();
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }


    public Kotik() {
        instanceCounter++;
    }

    public static int getInstanceCounter() {
        return instanceCounter;
    }

    public int getSatiety() {
        return satiety;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getMeow() {
        return meow;
    }

    public String getFood() {
        return food;
    }

    public void setKotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }

    public void liveAnotherDay() {
        for (int i = 0; i < 24; i++) {
            int catDoThis = (int) (Math.random() * 5 + 1);
            switch (catDoThis) {
                case 1:
                    play();
                    break;
                case 2:
                    chaseMouse();
                    break;
                case 3:
                    sleep();
                    break;
                case 4:
                    sayMeow();
                    break;
                case 5:
                    useToilet();
                    break;
            }
        }
    }

    public boolean chaseMouse() {
        if (isSatiety()) {
            System.out.println("Cat is chasing a mouse");
            return true;
        }
        return false;
    }

    public boolean play() {
        if (isSatiety()) {
            System.out.println("I'm playing.");
            return true;
        } else {
            System.out.println("I want eat");
        }
        return false;
    }

    public boolean sleep() {
        if (isSatiety()) {
            System.out.println("I'm sleeping.");
            return true;
        } else {
            System.out.println("I want eat");
        }
        return false;
    }

    public boolean sayMeow() {
        if (isSatiety()) {
            System.out.println(getMeow());
            return true;
        } else {
            System.out.println("I want eat");
        }
        return false;
    }

    public boolean useToilet() {
        if (isSatiety()) {
            System.out.println("Cat uses the toilet");
            return true;
        } else {
            System.out.println("I want eat");
        }
        return false;

    }

    public void eat(int satietyIndex, String food) {
        this.satiety += satietyIndex;
        this.food = food;
    }

    public void eat(int satietyIndex) {
        this.satiety += satietyIndex;
    }

    public void eat() {
        eat(0, "Food");
    }

    private boolean isSatiety() {
        return satiety > 0;
    }
}
