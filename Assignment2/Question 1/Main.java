import java.util.*;
import java.lang.*;
import java.io.*;



public class Main {

    public static void main(String[] args) {

        //  So the main method here is simply used to implement the function below and calls it.

        int[] array1 = {23, 23, 67, 23, 67, 23, 45};
        System.out.println(testFunction(array1));

        int[] array2 = {23, 24, 67, 23, 67, 23, 45};
        System.out.println(testFunction(array2));
    }

    // method / function below takes a parameter / input of an array (which we call and input in the main method / driver class

    public static int testFunction(int[] newArray){
        Stack<Integer> myStack = new Stack<>();     // Initialized an empty stack called - myStack

        for(int i = 0; i < newArray.length; i++){        // Created a forLoop which will iterate through the array which is passed in through the main method
            if(myStack.isEmpty()){                      // Here we check if the stack is empty, and if so then we push element at position i into the stack
                myStack.push(i);
            } else if(newArray[myStack.peek()] == newArray[i]){     // here we check to see if the element in the array matches the new element and if so it pushes it to the stack otherwise it pops it off
                myStack.push(i);
            } else {
                myStack.pop();
            }
        }

        int checkNumber = newArray[myStack.peek()]; // Here I initialized the int checkNumber and int count which begins at 0.
        int count = 0;

        for(int i = 0; i < newArray.length; i++){
            if(newArray[i] == checkNumber){
                count++;
            }
        }

        if(count < newArray.length / 2){ // if the count is less than the length of the array divided by 2 then return -1 because the number in question needs to repeat more than half.
            return -1;
        }

        return myStack.pop(); // else return the number from the stack


    }
}
