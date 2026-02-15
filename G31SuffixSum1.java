public class G31SuffixSum1 {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        int n = arr.length;
        int [] suffix = new int[n];
        suffix[n-1] = arr[n-1];
        for(int i = n-2; i>=0; i--){
            suffix[i] = suffix[i+1] + arr[i];
        }
        int l = 1, r= 3;
        int sum;
        if(r==n-1){
            sum=suffix[l];
        }
        else{
            sum=suffix[l] - suffix[r+1];
        }
        System.out.println(sum);
    }
}
