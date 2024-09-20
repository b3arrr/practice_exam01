package exam;

public class ArrayManager {

    public static void hey() {
        System.out.println("absolute wtf");
    }

    public void elementsOverZero(int[] array) {
        int overZero = 0;
        for (int element : array)
            if (element > 0) {
                overZero++;
            }
        System.out.println("There are " + overZero + " elements over zero.");
    }

    public void printSpecificNumber(int[] array, int number) {
        int numberAmount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                numberAmount++;
            }
        }
        System.out.println("The number was accounted for " + numberAmount + "  times in the array");
    }

    public void printBiggestNumber(int[] array) {
        int biggestNumber = 0;
        for (int element : array) {
            if (element > biggestNumber) {
                biggestNumber = element;
            }
        }
        System.out.println("The biggest number is " + biggestNumber);
    }
}
