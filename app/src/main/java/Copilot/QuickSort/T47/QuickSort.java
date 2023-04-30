package Copilot.QuickSort.T47;

public class QuickSort {
  public void sort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	private void quickSort(int[] arr, int left, int right) {
		if (left < right) {
			int pivot = partition(arr, left, right);
			quickSort(arr, left, pivot - 1);
			quickSort(arr, pivot + 1, right);
		}
	}

	private int partition(int[] arr, int left, int right) {
		int pivot = arr[left];
		int i = left + 1;
		int j = right;
		while (true) {
			while (i < right && arr[i] <= pivot) {
				i++;
			}
			while (j > left && arr[j] >= pivot) {
				j--;
			}
			if (i >= j) {
				break;
			}
			swap(arr, i, j);
		}
		swap(arr, left, j);
		return j;
	}

	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
