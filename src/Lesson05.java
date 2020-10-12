import java.time.LocalDate;

public class Lesson05 {

    //-----------------------Functions------------------------------
    //Question 1
    public boolean isPositive(double num)
    {
        if(num>=0)
            return true; //no need for {} here because it's only 1 line

        //no need for else here because if(true) then we go out from this function
        //so this code will only run if the condition is false
        return false;
    }

    //Question 2
    public int getBirthYear(String name, int age)
    {
        int birth_year=-1;
        //set initial value to indicate a mistake if something goes wrong,
        // without breaking in runtime

        int year;
        LocalDate today = LocalDate.now(); //to get current date from computer
        year = today.getYear(); //we can also set manually: year = 2020
        birth_year = year - age;

        System.out.println(name + "'s age is: " + age);
        System.out.println(name + "'s birth year is: " + birth_year);

        return birth_year;
    }
}
