package pl.interview.tasks;

public class Main {

    /**
     Created by xciechan
     on 2022-05-07

     The application finds the value of the first triangle number
     to have over five hundred divisors
     */

    public static void main(String[] args) {
        int rangeNumber = 1000000;
        int triangleNumber = 0;

        for (int i=1; i<rangeNumber; i++){
            triangleNumber += i;
            System.out.println(i);

            if (findDivisorsOfTriangleNumber(triangleNumber) > 500) {
                System.out.println("First triangle number to have over five hundred divisors: " + triangleNumber);
                break;
            }
        }

    }

    public static int findDivisorsOfTriangleNumber(int triangleNumber){
        int countDivisorsOfTriangleNumber = 0;

        for (int i=1; i<=triangleNumber; i++){
            if (triangleNumber % i == 0){
                countDivisorsOfTriangleNumber += 1;
            }
        }

        return countDivisorsOfTriangleNumber;

    }

}
