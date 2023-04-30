package Copilot.QuickSort.T12;

public class QuickSort {
    public void sort(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        quickSort(nums, 0, nums.length - 1);
    }

    private void quickSort(int[] nums, int start, int end) {
        if (start >= end)
            return;
        int pivot = partition(nums, start, end);
        quickSort(nums, start, pivot - 1);
        quickSort(nums, pivot + 1, end);
    }

    private int partition(int[] nums, int start, int end) {
        int pivot = nums[start];
        int left = start, right = end;
        while (left < right) {
            while (left < right && nums[right] >= pivot)
                right--;
            nums[left] = nums[right];
            while (left < right && nums[left] <= pivot)
                left++;
            nums[right] = nums[left];
        }
        nums[left] = pivot;
        return left;
    }
}
