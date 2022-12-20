/*
Class Name: Main
Programmer: Ayush
Date Modified: Monday December 19
Description: Class for the submission of Unit 4 Review Problems
*/
package unit_4_review;
import hsa_ufa.*;

public class Main {
    static Console c;
    public static void main(String[] args) {
        c.println("Please enter an array size");
        int arraySize = c.readInt();
        c.println("Enter the lowest value of the array");
        int lowRange = c.readInt();
        c.println("Enter the highest value of the array");
        int highRange = c.readInt();

        int[] array = randomArray(arraySize, lowRange, highRange);
        printArray(array);
        c.println(maxValue(array));
        c.println(minValue(array));
        c.println(arrayRange(array));
        c.println(arraySum(array));
        c.println(arrayAverage(array));
    }

    public static int [] randomArray (int arraySize, int lowRange, int highRange) {
        int[] arr = new int[arraySize];
        for (int x = 0; x < arraySize; x++) {
            int randomNum = (int) Math.round(Math.random() * (lowRange - highRange)) + lowRange;
            arr[x] = randomNum;
        }
        return arr;
    }

    public static int arraySum (int inputArray []) {
        int sum = 0;
        for (int x = 0; x < inputArray.length; x++) {
           sum += inputArray[x]; 
        }
        return sum;
    }
    public static int maxValue (int inputArray []) {
        int max = inputArray[0];
        for (int x = 0; x < inputArray.length; x++) {
            if(inputArray[x] > max) {
                max = inputArray[x];
            }
        }
        return max;
    }
    public static int minValue (int inputArray []) {
        int min = inputArray[0];
        for (int x = 0; x < inputArray.length; x++) {
            if(min > inputArray[x]) {
                min = inputArray[x];
            }
        }
        return min;
    }
    public static int arrayRange (int inputArray []) {
        int max = maxValue(inputArray);
        int min = minValue(inputArray);
        int range = max - min;
        return range;
    }
    public static int arrayAverage (int inputArray []) {
        int sum = maxValue(inputArray);
        int average = (int) sum / inputArray.length;
        return average;
    }
    public static void printArray (int inputArray []) {
        for (int x = 0; x < inputArray.length; x++) {
            c.println(inputArray[x]);
        }
    }
}

/*
Command Method Psuedocode:

main method
OUTPUT "Please enter an array size"
arraySize = INPUT
OUTPUT "Please enter low range of array"
lowRange = INPUT
OUTPUT "Please enter high range of array"
highRange = INPUT

array = CALL randomArray(arraySize, lowRange, highRange)
CALL printArray(array)
OUTPUT CALL maxValue(inputArray)
OUTPUT CALL minValue(inputArray)
OUTPUT CALL arrayRange(inputArray)
OUTPUT CALL arraySum(inputArray)
OUTPUT CALL arrayAverage(inputArray)
END main method

randomArray(arraySize, lowRange, highRange) {int[]} method
    arr = new int[] size arraySize
    LOOP:
    for x < arraySize
        CALCULATE num = random number between low range and high range
        arr[x] = num
    END LOOP
    RETURN arr;
END randomArray method

arraySum(inputArray) {int} method
    sum = 0
    LOOP:
    for x < arraySize
        CALCULATE sum += inputArray[x]
    END LOOP
    RETURN sum
END arraySum method

maxValue(inputArray) {int} method
    max = 0
    LOOP:
    for x < arraySize
        IF inputArray[x] > max
            max = inputArray[x]
    RETURN max
END maxValue(inputArray) {int} method

minValue(inputArray) {int} method
    min = inputArray[0]
    for x < arraySize
        IF inputArray[x] < min
            min = inputArray[x]
    RETURN min
END minValue method

arrayRange(inputArray) {int} method
    max = CALL maxValue(inputArray)
    min = CALL minValue(inputArray)

    range = CALCULATE max - min
    RETURN range
END arrayRange method

arrayAverage(inputArray) {int} method
    total = CALL arraySum(inputArray)
    average = CALCULATE total / arraySize
    RETURN average
END arrayAverage method

printArray(inputArray) {void} method
    for x < arraySize
        OUTPUT inputArray[x]
END printArray method
 */