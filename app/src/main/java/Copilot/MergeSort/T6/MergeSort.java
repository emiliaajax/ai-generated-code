package Copilot.MergeSort.T6;

public class MergeSort {
  public void mergeSort(int[] list) {
    if (list.length > 1) {
      int[] firstHalf = new int[list.length / 2];
      System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
      mergeSort(firstHalf);
      int secondHalfLength = list.length - list.length / 2;
      int[] secondHalf = new int[secondHalfLength];
      System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
      mergeSort(secondHalf);
      int[] temp = merge(firstHalf, secondHalf);
      System.arraycopy(temp, 0, list, 0, temp.length);
    }
  }

  private int[] merge(int[] list1, int[] list2) {
    int[] temp = new int[list1.length + list2.length];
    int current1 = 0;
    int current2 = 0;
    int current3 = 0;
    while (current1 < list1.length && current2 < list2.length) {
      if (list1[current1] < list2[current2]) {
        temp[current3++] = list1[current1++];
      } else {
        temp[current3++] = list2[current2++];
      }
    }
    while (current1 < list1.length) {
      temp[current3++] = list1[current1++];
    }
    while (current2 < list2.length) {
      temp[current3++] = list2[current2++];
    }
    return temp;
  }
}
