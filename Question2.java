public class Question2{
    static int fO(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] >= target) {
                end = mid - 1; 
            } else {
                start = mid + 1;
            }
        }
        if (start < arr.length && arr[start] == target)
            return start;
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3};
        System.out.println(fO(arr, 2));
    }
}