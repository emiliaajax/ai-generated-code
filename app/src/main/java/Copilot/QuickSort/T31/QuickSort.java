package Copilot.QuickSort.T31;

public class QuickSort {
    public void sort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        quickSort(nums, 0, nums.length - 1);
    }

    private void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = partition(nums, left, right);
        quickSort(nums, left, pivot - 1);
        quickSort(nums, pivot + 1, right);
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        int l = left + 1;
        int r = right;
        while (l <= r) {
            if (nums[l] < pivot) {
                l++;
            } else if (nums[r] >= pivot) {
                r--;
            } else {
                swap(nums, l, r);
                l++;
                r--;
            }
        }
        swap(nums, left, r);
        return r;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
