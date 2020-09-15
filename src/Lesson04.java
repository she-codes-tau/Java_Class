public class Lesson04 {

    public void using_for_loop()
    {
        int i, sum=0; //defining both parameters in the same row. Both are type "int" so no need to write "int" again! :)

        for(i=1 ; i<=1000 ; i++) //for loop that runs from 1 until 1000 (including 1000)
        {
            sum+= i; //shorter prettier way to write sum = sum + i;
        }

        System.out.println(sum); //printing the result to the console
    }

    public void using_while_loop()
    {
        int num = 1024; //define the parameter with the number 1024

        while(num>1) // we want to run this loop until we get 1 from dividing num by 2
        {
            num = num / 2; //num will now be last num divided by 2
            System.out.println(num); //print result
        }
    }

    public void whoIsOlder(int myAge, int myFriendAge) //naming parameters like that is called Camel Case Writing (LikeThat)
    {
        if(myAge > myFriendAge) //put breakpoint on this line and see what happens when you try to run the code
            System.out.println("I am older than my friend!");

        else if (myAge == myFriendAge) //try a breakpoint on this line as well! :)
            System.out.println("Me and my friend are the same age!");

        else                        //no need for {} after "if" or after "else" here cause it is only 1 line
            System.out.println("My friend is older than me!");
    }

    public void forLoopWithDebug()
    {
        for(int i=1; i<=10; i++) //Did you know you can write the definition of i inside the loop? well now you know! ;)
        {
            System.out.println(i); //put a breakpoint on this line and see what happens.
                                  // How many times will the program stop?
        }
    }
}
