public class Main {

    public static void main(String[] args) {
        //Lesson01
        System.out.println("Hello World!");
        System.out.println(" "); //just printing another row for fun :)

        //checkLesson3();

        //checkLesson4_Q1();
        //checkLesson4_Q2();
        //checkLesson4_Q3();
        //checkLesson4_Q4();

        //checkLesson5_Q1();
        //checkLesson5_Q2();
    }

    public static void checkLesson3()
    {
        Lesson03 lesson03 = new Lesson03();
        lesson03.HowOldAreYou();
    }

    public static void checkLesson4_Q1()
    {
        Lesson04 lesson04 = new Lesson04();
        lesson04.using_for_loop();
    }

    public static void checkLesson4_Q2()
    {
        Lesson04 lesson04 = new Lesson04();
        lesson04.using_while_loop();
    }

    public static void checkLesson4_Q3()
    {
        Lesson04 lesson04 = new Lesson04();
        int ShaniAge = 26, ShakedAge = 23;
        lesson04.whoIsOlder(ShaniAge, ShakedAge); //play with the order of names or with the ages for different results
    }

    public static void checkLesson4_Q4()
    {
        Lesson04 lesson04 = new Lesson04();
        lesson04.forLoopWithDebug();
    }


    public static void checkLesson5_Q1()
    {
        double neg_num = -1.25;
        double pos_num = 6;

        Lesson05 lesson05 = new Lesson05();

        System.out.println( neg_num + " is positive? ->" + lesson05.isPositive(neg_num));
        System.out.println( pos_num + " is positive? ->" + lesson05.isPositive(pos_num));
        pos_num = 0;
        System.out.println( pos_num + " is positive? ->" + lesson05.isPositive(pos_num));
    }

    public static void checkLesson5_Q2()
    {
        int birth;
        Lesson05 lesson05 = new Lesson05();

        birth = lesson05.getBirthYear("Shani", 26);
    }

}
