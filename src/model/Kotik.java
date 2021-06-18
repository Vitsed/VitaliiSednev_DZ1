package model;

/*TODO
  - fix issues cat must loose energy
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
                    if (play()) {
                        System.out.println("Cat is playing");
                    } else {
                        wantEat();
                    }
                    break;
                case 2:
                    if (chaseMouse()) {
                        System.out.println("Cat is chasing a mouse");
                    } else {
                        wantEat();
                    }
                    break;
                case 3:
                    if (sleep()) {
                        System.out.println("Cat is sleeping");
                    } else {
                        wantEat();
                    }
                    break;
                case 4:
                    if(sayMeow()) {
                        System.out.println(this.getMeow());
                    } else {
                        wantEat();
                    }
                    break;
                case 5:
                    if (useToilet()) {
                        System.out.println("Cat uses the toilet");
                    } else {
                        wantEat();
                    }
                    break;
            }
        }
    }

    public boolean chaseMouse() {
        if (isSatiety()) {
            satiety -= (int) (Math.random() * 25 + 1);
            return true;
        } else {
            return false;
        }
    }

    public boolean play() {
        if (isSatiety()) {
            satiety -= (int) (Math.random() * 15 + 1);
            return true;
        } else {
            return false;
        }
    }

    public boolean sleep() {
        if (isSatiety()) {
            satiety -= (int) (Math.random() * 10 + 1);
            return true;
        } else {
            return false;
        }
    }

    public boolean sayMeow() {
        if (isSatiety()) {
            satiety -= 1;
            return true;
        } else {
            return false;
        }
    }

    public boolean useToilet() {
        if (isSatiety()) {
            satiety -= 10 + (int) (Math.random() * 20 + 1);
            return true;
        } else {
            return false;
        }
    }

    public void eat(int satietyIndex, String food) {
        this.satiety += satietyIndex;
        this.food = food;
    }

    public void eat(int satietyIndex) {
        this.satiety += satietyIndex;
    }

    public void eat() {
        int satietyIndex = 5 + (int) (Math.random() * 15 + 1);
        eat(satietyIndex, "Food");
    }

    private boolean isSatiety() {
        return satiety > 0;
    }

    private void wantEat() {
        System.out.println("I want eat");
        eat();
    }
}
