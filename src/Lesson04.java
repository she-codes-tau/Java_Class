public class Lesson04 {

    //Loops
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

    //-----------------------------------------------------------------------------------------------------------------------

    //Debugging
    public void whoIsOlder(int myAge, int myFriendAge) //naming parameters like that is called Camel Case Writing (LikeThat).
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

    //-----------------------------------------------------------------------------------------------------------------------

    //Print 'X' Shape to screen (from quiz)
    public void printX_for5()
    {
        int num = 5;
        for(int i=0; i<num; i++){ // outer loop - rows
            if(i==0 || i==num-1){
                for(int j=0; j<num; j++){ // inner loop for 1st and last rows
                    if(j==0 || j==num-1){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            else if(i==1 || i==num-2){
                for(int j=0; j<num; j++){ // inner loop for 2st and 1 before last rows
                    if(j==1 || j==num-2){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            else {
                for(int j=0; j<num; j++){ // inner loop for middle row
                    if(j == num/2){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }

    //Print 'X' Shape to screen (Extra - Generic)
    public void printX()
    {
        int num = 7;

        int left = 0;
        int right = num-1;

        for(int i=0; i<num; i++){ // outer loop - rows
            left = i;

            for(int j=0; j<num; j++){ // inner loop - deals with the chars in each row
                if(j==left || j==right) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            left++;
            right--;
            System.out.println("");
        }
    }

}
