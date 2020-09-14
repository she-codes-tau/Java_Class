public class Lesson05 {
    public boolean isPositive(double num)
    {
        if(num>=0)
            return true; //no need for {} here because it's only 1 line

        //no need for else here because if(true) then we go out from this function
        //so this code will only run if the condition is false
        return false;
    }
}
