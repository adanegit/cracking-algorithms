package com.adane.binarrysearch;

/**
 * Created by agebrem on 9/13/16.
 */
public class BinarySearch {

    public int iterativeSearchElement(int[] array, int n) {
        return iterativeSearchElementHelper(array, n);
    }

    public int recursiveSearchElement(int[] array, int n) {
         return recursiveSearchElementHelper(array, n, 0, array.length);

    }

    private int iterativeSearchElementHelper(int[] array, int n) {

        int start = 0, end = array.length;

        while(start <=  end) {
            int mid = start + (end - start)/2; // same as (start + end)/2 but prevents stackoverflow error if integer exceeds
            if(n == array[mid]) {
                return mid;
            } else if (n < array[mid]) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    private int recursiveSearchElementHelper(int[] array, int n, int start, int end) {
            int mid = start + (end - start)/2;

            if(start > end) {
                return -1;
            }
            if (n == array[mid]) {
                return mid;
            } else if(n < array[mid]) {
                return recursiveSearchElementHelper(array, n, start, mid - 1);
            } else {
                return  recursiveSearchElementHelper(array, n, mid + 1, end);
            }

    }

    public int findFirstOccurrence(int[] array, int n) {

        int start = 0, end = array.length;
        int result = -1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(n == array[mid]) {
                result = mid;
                end = mid - 1;
            } else if(n < array[mid]) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    public int findLastOccurrence(int[] array, int n) {

        int start = 0, end = array.length;
        int result = -1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(n == array[mid]) {
                result = mid;
                start = mid + 1;
            } else if(n < array[mid]) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    public int countOccurrence(int[] array, int n) {
        int firstIndex = findFirstOccurrence(array, n);
        if (firstIndex == -1) {
            return 0;
        }
        return findLastOccurrence(array, n) - firstIndex + 1;
    }
}
