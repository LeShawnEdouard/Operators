package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 + 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;  // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;  // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;  // 20 / 5 = 4
        System.out.println("20 / 5 + " + result);

        result = result % 3;  // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 + " + result);

        // result = result + 1;
        result++;  // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; //2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result +2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 + " + result);

        // result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 + " + result);

        // result = result - 2;
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {// If you add ";" then you're no longer using conditional logic
            // Therefore, it will still print, "It is not an alien"
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) { // Called "Logical AND Operator"
            // ^ You can add "()" around your expressions/conditions to make
            // it easier to read. Still it will produce same output.
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) { // You can also use (!isCar) which checks for the alternative value
            // you can use (isCar) to check if set to false
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false; // example of a ternary operator which consist of three operands
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        double firstNum = 20.00;
        double secondNum = 80.00;

        double sumOfBothNum = ((firstNum + secondNum) * 100.00);
        System.out.println("SumOfBothNum = " + sumOfBothNum);
        double remainder = sumOfBothNum % 40.00;
        System.out.println("The remainder + " + remainder);

        boolean isSum = (remainder == 0) ? true : false;
        System.out.println("isSum = " + isSum);
        if (!isSum) {
            System.out.println("Got some remainder");
        }




    }
}
 