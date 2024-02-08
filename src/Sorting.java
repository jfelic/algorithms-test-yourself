public class Sorting { 

    public static int[] createArray(int size) {
        int[] newArray = new int[size];
        for(int i = 0; i < size; i++) {
            newArray[i] = (int)(Math.random() * 10000);
        }
        return newArray;
    }

    public static void display(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
    
    public static void bubbleSort(int[] arr) {
        int i,j,n;
        n = arr.length;
        for(i = n - 1; i > 0; i--) {
            for(j = 0; j < i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j]; // Lower index (higher value) is stored in temp
                    arr[j] = arr[j+1]; // higher index (lower value) overwrites arr[j]
                    arr[j + 1] = temp; // higher index is overwritten by higher value
                }
            }
        }
    }

    public static void bubbleSortPractice(int[] arr) {
        int i, j, temp;
        int n = arr.length;

        for(i = n - 1; i > 0; i--) {
            for(j = 0; j < i; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void newSelectionSort(int[] arr) {
        int i, j, minIndex, temp;
        int n = arr.length;

        for(i = 0; i < n - 1; i++) {
            minIndex = i;
            for(j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if(minIndex != i) {
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void insertionSort(int[] arr) {
        int i, j;
        
                                            // i acts as a cutoff point in the array, separating
         for(i = 1; i < arr.length; i++) {  // the sorted portion (to the left of i) from the 
                                            // unsorted portion (to the right of i).
            int temp = arr[i];
            j = i;
            while(j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                j--;
            }
        arr[j] = temp;
        }
    }

    // /* ## Beginning of Quick sort methods 
    //  * We will need a partitioning method
    //  * We will need a sorting method
    // */

    // // Partition
    // public int Partition() {
    //     int lowIndex, highIndex, pivot, midpoint;
    //     boolean done = false;

    //     lowIndex = arr[0];
    //     highIndex = arr.length - 1;
    //     midpoint = (lowIndex + highIndex) / 2;
    //     pivot = arr[midpoint];

    //     while( done != true) {
    //         while(arr[lowIndex] < pivot) {
    //             lowIndex += 1;
    //         }
    //         while(arr[highIndex] > pivot) {
    //             highIndex -= 1;
    //         } 
    //     }

    //     // swap
    //     if(lowIndex >= highIndex) {
    //         done = true;
    //         return highIndex;
    //     } else {
    //         int temp = arr[lowIndex];
    //         arr[lowIndex] = arr[highIndex];
    //         arr[highIndex] = temp;
    //     }
    // }

    // Implement Quick sort
}
