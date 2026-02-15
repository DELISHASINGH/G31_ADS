// suffix array sum
public class G31SuffixSum {
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5};
        int n = arr.length;
        int[] suffix= new int[n];
        suffix[n-1] = arr[n-1];
        for(int i = n-2; i>=0;i--){
            suffix[i] = suffix[i+1] + arr[i];
        }
        System.out.println("Suffix array sum:");
        for(int i=n-2; i>=0;i--){
            System.out.print(suffix[i] + " ");        
        }
    }
    
}
