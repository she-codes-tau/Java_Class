public class Lesson06 {

    public String getBiggerString(String str1, String str2)
    {
        if(str1.length() > str2.length()) //we don't need to loop inside the strings.
            return str1;                 //we can just write stringName.length() and get the length of that string!

        if(str2.length() > str1.length()) //no need to write else here, cause if the condition is true -
                return str2;              //the return will end this function and these lines will never run

        return str1; //if both are the same length - doesn't matter what we send back :)
    }



}
