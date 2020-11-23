import java.util.HashMap;
import java.util.Set;

public class Lesson07 {
  //Arrays - codility Solution



  public void basicSolution(){
    //creating an array
   int[] arr = {0};
   //looping through the array, 
   //first part of the loop:creating an initial index, 
   //second part of the loop:describing what the loop goes over in the arry.
   //last part of the loop: what action needs to be done once the loop is over
    for( int I=0 ; I< arr.length; I++ ){
     //condition if the array is bigger print the array
      if (I+1 == arr.length){
        System.out.println(arr);
      }
      //if not...still print the array :D
      else {
        System.out.println(arr);
      }
    }



    /*
  //Basic solution

    def solution(A):
    if (len(A) == 1):
      return A[0];

    A = sorted(A)
    for (i in range(0 , len (A) , 2)):
      if i+1 == len(A)
        return A[i];
      if A[i] != A[i+1]:
        return A[i];
*/
  }

  //Advanced solution - Using HashMap and set
  //package com.codility.lesson02.arrays;
  public int solutionOddOccurrencesInArray(int[] A) {
    HashMap <Integer, Integer> occurrencesMap = new HashMap<Integer, Integer>();

    for(int i=0; i<A.length; i++) {
      if(occurrencesMap.containsKey(A[i])) {
        int occurrences = occurrencesMap.get(A[i]);
        occurrences++;
        occurrencesMap.put(A[i], occurrences); //increment occurrence counter and store it
      }
      else {
        occurrencesMap.put(A[i], 1); //1st occurrences of this value
      }
    }

    Set<Integer> keySet = occurrencesMap.keySet();

    for(int currentKey : keySet) {
      int occurrences = occurrencesMap.get(currentKey);

      //if occurs odd number of times, we found the unpaired value - no need to continue checking
      if(occurrences % 2 != 0) return currentKey;
    }
    //should never get here
    throw new RuntimeException("shouldn't get to here - should've return unpaired value by now");
  }

  public void twoDimensionalArrays()
  {
    //Last exercise, printing 2-dimensional arrays

    //The array groups are rows and each index is a column basically- we always start from 0.
    String my_Array[][] = {{"Maya","Neta","Keren"},{"Eyal","Leon","Nimrod"}};
    System.out.println(my_Array[1][2]);
  }

}
