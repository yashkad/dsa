import java.util.*;

class selectionSort {

  public static void main(String args[]) {
    int[] arr = { 112, 3, 42, 4, 123, 4, 2, 3, 1, 12, 3 };
    int len = arr.length;

    for (int i = 0; i < len; i++) {
      int min_index = i;

      for (int j = i + 1; j < len; j++) {
        if (arr[j] < arr[min_index]) min_index = j;
      }

      int temp = arr[i];
      arr[i] = arr[min_index];
      arr[min_index] = temp;
    }

    for (int i = 0; i < len; i++) {
      System.out.print(" " + arr[i]);
    }
  }
}
// https://www.geeksforgeeks.org/selection-sort/
