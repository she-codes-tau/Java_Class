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

        while(num>1) // we want to run this loop until we get 1 from dividing by 2
        {
            num = num / 2; //num will now be last num divided by 2
            System.out.println(num); //print result
        }

        System.out.println(num); //print last result, making sure it is 1
    }
}
