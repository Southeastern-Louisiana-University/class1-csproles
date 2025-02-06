package src;

public class arrayReview {
    public static void main(String[] args) {
        //elementType arrayRefVar[]; - declaring a reference to an array
        double doubleArray[]; //Makes a reference variable thats holding a address
        doubleArray = new double[10]; //Allocating memory (10 chuncks of 64bit memory)

        System.out.println("Before ");
        printArray(doubleArray);

        editArray(doubleArray);

        System.out.println("\nAfter");
        printArray(doubleArray);

        System.out.println("\nThe sum of all the elements in the array is " + sumArray(doubleArray));
    }

    public static void printArray(double[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println("Value of anyArray[" + i + "] is: " + arr[i]);
        }
    }

    public static void editArray(double[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
    }

    public static double sumArray(double[] arr){
        double sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }
}
