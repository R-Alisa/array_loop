

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Task1();
        Task2();
        Task3();
    }

    static void Task1() {

 /*       int[] myArray = {5, 3, 7, 6, 2, 8};

        for (int i=0; i<6; i++) {
            System.out.println(myArray[i]);
        }

        for(int tempVar:myArray){
            System.out.println(tempVar);
        }

        int i= 0;
        while(i < myArray.length){
            System.out.println(myArray[i]);
            i++;
        }

        int i = 0;
        do {
            System.out.println(myArray[i]);
            i++;
        }
        while (i < myArray.length);
*/
    }

    static void Task2() {
/*
        int[] myArray = {10, 4, -4, 7, 0, 9, 1, 3, 7, -5};  // creates an array with 10 set elements


      for (int i=0; i<10; i++) {
            if(myArray[i]<0) {
                System.out.println("Negative element:" + myArray[i]); // prints out negative elements
            }
        }

      for (int i=0; i<=10; i++) {
            if (myArray[i] % 2 != 0) {
                System.out.println("Odd element: " + myArray[i]); // prints out odd elements
            }
        }


        int odd_count = 0;

        for (int i=0; i< myArray.length; i++ ) {
            if (myArray[i] % 2 != 0) {
                odd_count++;
            }
        }
            System.out.printf("\nNumber of odd numbers: %d", odd_count); // prints out count of odd elements


        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j ++) {
                if (myArray[i] == myArray[j]) {
                    System.out.println(" There are elements with the same value: " + myArray[i]); // print out elements with same value
                }
            }
        }



        for (int i = 0; i<myArray.length; i=i+2) {
                System.out.println(myArray[i]);
                }                                       //prints out each second element

        int sum = 0;
        for(int i=0; i<myArray.length; i++)
            sum = sum + myArray[i];
        double average = sum / myArray.length;
        System.out.println("Average value of the array is: "+ average); // print out average value of array

        int sum = 0;
        for(int i=0; i<myArray.length; i++)
            sum = sum + myArray[i];
        double average = sum / myArray.length;

       for(int i=0; i<myArray.length;i++ )
        if(myArray[i] < average)
            System.out.println(myArray[i] +"" ); /// prints out elements smaller than average
*/


    }

    static void Task3(){

        byte[]myArray = new byte[10];
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 10 grades from 1 to 10: ");
        for (int i = 0; i<myArray.length; i++) {
            while (!input.hasNextByte()) {
                System.out.println("That's not a number. Please try again!");
                input.next();
            }

            byte grades = input.nextByte();
            if (grades > 0 && grades <= 10) {
                myArray[i] = grades;
            } else {
                System.out.println("Grade incorrect.Please enter grade from 1 to 10!");

            }

        }
        byte failedCount = 0;
        byte ACount = 0;

        for (int i = 0; i<myArray.length; i++) {


            if (myArray[i] < 4) {
                failedCount++;
            }
            if (myArray[i] == 10) {
                ACount++;
            }
        }
        System.out.println(failedCount + " students failed.");
        System.out.println(ACount + " students got A.");


    byte countgrades  = 0;   // does not work as it should
        for(int check = 0; check <=10; check++){
            for(int i = 0; i< myArray.length; i++) {
                if (myArray[i] == check) {
                    countgrades++;
                }

            }
            System.out.println(countgrades + " students with the grade " + check);

        }




    }

}
