package com.osoleksandr;

public class BinarySearch {

    public static void main(String[] args) {

        int numbers[] = {5, 6, 9, 10, 15, 1, 3, 4};

        System.out.println(binarySearch(numbers, 9));
    }

    public static int binarySearch(int[] array, int key) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) >>> 1;

            if (array[mid] == key) {
                return mid;
            }

            if (array[mid] >= key) {
                if (array[left] <= key) {
                    right = mid - 1;
                } else if (array[left] >= key) {
                    left = mid + 1;
                }
            }

            if (array[mid] <= key) {
                if (array[left] <= key) {
                    left = mid + 1;
                } else if (array[left] >= key) {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }

}