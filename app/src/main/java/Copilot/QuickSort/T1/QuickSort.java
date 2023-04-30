package Copilot.QuickSort.T1;

// Implement a non-static quick sort algorithm class named QuickSort with a public void sort(int[]) method
public class QuickSort {
  public void sort(int[] list) {
    sort(list, 0, list.length - 1);
  }

  private static void sort(int[] list, int first, int last) {
    if (last > first) {
      int pivotIndex = partition(list, first, last);
      sort(list, first, pivotIndex - 1);
      sort(list, pivotIndex + 1, last);
    }
  }

  private static int partition(int[] list, int first, int last) {
    int pivot = list[first];
    int low = first + 1;
    int high = last;

    while (high > low) {
      while (low <= high && list[low] <= pivot) {
        low++;
      }

      while (low <= high && list[high] > pivot) {
        high--;
      }

      if (high > low) {
        int temp = list[high];
        list[high] = list[low];
        list[low] = temp;
      }
    }

    while (high > first && list[high] >= pivot) {
      high--;
    }

    if (pivot > list[high]) {
      list[first] = list[high];
      list[high] = pivot;
      return high;
    } else {
      return first;
    }
  }
}