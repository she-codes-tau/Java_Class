public class Main {

    public static void main(String[] args) {
        //Lesson01
        System.out.println("Hello World!");
        System.out.println(" "); //just printing another row for fun :)

        tryLessons();
    }

    public static void tryLessons(){
        checkLesson3();

        //checkLesson4_Q1();
        //checkLesson4_Q2();
        //checkLesson4_Q3();
        //checkLesson4_Q4();

        //checkLesson5_Q1();
        //checkLesson5_Q2();

        //checkLesson6_Q1();
        //checkLesson6_Q2();
        //checkLesson6_Q3();
        //checkLesson6_Q4();
        //checkLesson6_Q5();
        //checkLesson6_Q6();

        //checkLesson9();

         //Lesson07_ExtraHomeExercise ls7ex = new Lesson07_ExtraHomeExercise();
        // ls7ex.memoryGame();

       // checkLesson13();
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
        System.out.println(birth);
    }

    public static void checkLesson6_Q1()
    {
        Lesson06 lesson06 = new Lesson06();

        String str1= "I'm the bigger string!";
        String str2 = "My dear, I am, without a doubt - the bigger one!";

        String whosIsBigger = lesson06.getBiggerString(str1,str2);

        System.out.println(whosIsBigger);
    }

    public static void checkLesson6_Q2()
    {
        Lesson06 lesson06 = new Lesson06();

        String str1= "Hello";
        String str2 = "World";

        String combined = lesson06.combineTwoStrings(str1,str2);

        System.out.println(combined);
    }

    public static void checkLesson6_Q3()
    {
        Lesson06 lesson06 = new Lesson06();
        lesson06.interactWithUser();
    }

    public static void checkLesson6_Q4()
    {
        Lesson06 lesson06 = new Lesson06();
        int maxNum = lesson06.getBiggerFromUser();

        System.out.println("The maximum of these numbers is: " + maxNum);
    }

    public static void checkLesson6_Q5()
    {
        Lesson06 lesson06 = new Lesson06();
        lesson06.printInputUntilZero();
    }

    public static void checkLesson6_Q6()
    {
        Lesson06 lesson06 = new Lesson06();
        lesson06.rollTheDice();
    }

    public static void checkLesson9()
    {
        //For more info on inner classes go to: https://www.geeksforgeeks.org/inner-class-java/
        Lesson09 lesson09 = new Lesson09();
        Lesson09.TestingPlayerClass lesson09_tester =  lesson09.new TestingPlayerClass();

        lesson09_tester.mainTest();
    }

    public static void checkLesson13()
    {
        Lesson13 lesson13 = new Lesson13();
        Lesson13.TestingInterfaceImplementation tst = new Lesson13.TestingInterfaceImplementation();
    }

}
