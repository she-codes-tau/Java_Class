public class Lesson13 {

    public static class MyObjectClass implements MyObject {
        String name;
        int id;

        public MyObjectClass(String name, int id){
            this.name = name;
            this.id = id;
        }

        @Override
        public String GetMyObjectName() {
            return this.name;
        }
    }

    interface MyObject{
        String name = null;
        int id = 0;

        String GetMyObjectName();
    }


    public static class TestingInterfaceImplementation {
        public TestingInterfaceImplementation(){
            MyObjectClass myObject = new MyObjectClass("Shani", 1);
            System.out.println("Object name is: " + myObject.GetMyObjectName());
        }
    }

}
