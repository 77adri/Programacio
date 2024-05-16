package Quicksort;

public class Quicksort {

	public static void main(String[] args) {
		int[] array = {7, 4, 3, 2, 6, 8, 1, 5};
        int primerIndex = 0;
        int segonIndex = array.length - 1;

        quicksort(array, primerIndex, segonIndex);

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    public static void quicksort(int[] array, int primerIndex, int segonIndex) {
        if (primerIndex < segonIndex) {
            int pivotIndex = partition(array, primerIndex, segonIndex);
            quicksort(array, primerIndex, pivotIndex - 1);
            quicksort(array, pivotIndex + 1, segonIndex);
        }
    }
    public static int partition(int[] array, int primerIndex, int segonIndex) {
        int pivot = array[primerIndex];
        int l = primerIndex + 1;
        int r = segonIndex;

        while (l <= r) {
            while (l <= r && array[l] < pivot) {
                l++;
            }
            while (l <= r && array[r] > pivot) {
                r--;
            }
            if (l <= r) {
                int temp = array[l];
                array[l] = array[r];
                array[r] = temp;
                l++;
                r--;
            }
        }
        int temp = array[primerIndex];
        array[primerIndex] = array[r];
        array[r] = temp;

        return r;
    }
}