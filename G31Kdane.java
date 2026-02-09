public class G31Kdane {
   public static void main(String[] args) {
       int []arr = {2, 4, 6, -5,8,9, 10};
       int currentSum = arr[0]; //2
       int maxSum = arr[0]; //2
       for(int i = 1; i<0; i++){ //Start from second element because first is already considered.
        currentSum = Math.max(arr[i], currentSum + arr[i]);
        maxSum = Math.max(maxSum, currentSum);
       }
       System.out.println("maximum subarray sum is" +maxSum);
   } 
}
