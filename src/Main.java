public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        checkLesson5();
    }

    public static void checkLesson5()
    {
        double neg_num = -1.25;
        double pos_num = 6;

        Lesson05 lesson05 = new Lesson05();

        System.out.println( neg_num + " is positive? ->" + lesson05.isPositive(neg_num));
        System.out.println( pos_num + " is positive? ->" + lesson05.isPositive(pos_num));
        pos_num = 0;
        System.out.println( pos_num + " is positive? ->" + lesson05.isPositive(pos_num));
    }

}
