package algorithms;

public class Algorithms {

    // O(n)
    public static int linearSearch(Object[] array, Object value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;

    }

    // O(log n)
    public static int binarySearch(int[] array, int target) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

            int middle = low + (high - low) / 2;
            int value = array[middle];

            if (value < target) low = middle + 1;
            else if (value > target) high = middle - 1;
            else return middle;
        }

        return -1;

    }

    // Average case: O(log(log(n)))
    // Worst case: O(n)
    public static int interpolationSearch(int[] array, int value) {

        int high = array.length - 1;
        int low = 0;

        while (value >= array[low] && value <= array[high] && low <= high) {

            int probe = low + ((high - low) / (array[high] - array[low])) * (value - array[low]);

            System.out.println(probe);

            if (array[probe] == value) {
                return probe;
            } else if (array[probe] < value) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }

        return -1;

    }

    // O(n^2);
    public static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // O(n^2)
    public static void selectionSort(int[] array) {

        for(int i = 0; i < array.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[min] > array[j]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

}
