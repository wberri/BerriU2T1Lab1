public class CatRunner {
    public static void main (String[] args){
        Cat cat1 = new Cat("Jane", 6, 18.1, true);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Mark", 11, 38, false);
        cat2.introduce();
        cat2.printCatInfo();


    }
}
