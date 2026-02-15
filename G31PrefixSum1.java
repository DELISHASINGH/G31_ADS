public class G31PrefixSum1 {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,9};
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i=1; i<n;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        int l=2, r=6;
        int sum;
        if(l==0){
            sum = prefix[r];
        }
        else{
            sum = prefix[r] - prefix[l-1];
        }
        System.out.println("sum of the range is:" +sum);
    }
}

