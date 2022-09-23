// Cat class definition
public class Cat {

    // instance variables
    private String name;
    private int age;
    private double weight;

    private boolean isHappy;

    // constructor
    public Cat(String catName, int catAge, double catWeight, boolean catHappy) {
        name = catName;
        age = catAge;
        weight = catWeight;
        isHappy = catHappy;
    }

    // method that introduces the Cat
    public void introduce() {
        if (age<7) {
            System.out.println("Hello my name is " + name + " and I am a younger cat.");
        }else {
            System.out.println("Hello my name is " + name + " and I am an older cat.");
        }
    }

    // method that prints Cat info
    public void printCatInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        if (isHappy==true) {
            System.out.println("I'm quite a happy cat.");
        }else {
            System.out.println("I could be a happier cat.");
        }
    }
}

