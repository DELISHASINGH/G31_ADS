
public class G31PrefixSum {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6};
    int n = arr.length;
    int[] prefix = new int[n];
    prefix[0] = arr[0];
    for(int i = 1; i<n;i++){
        prefix[i] = prefix[i-1] + arr[i];
    }
    for(int i=0; i<n; i++){
        System.out.print(prefix[i]+" ");
    
}
}
    }

//it is printing the prifix sum array but with brackets like 1 3 6 10 15 21. 
// for brackets import java.util.Arrays; and then System.out.println(Arrays.toString(prefix)); 
//It will print the array in brackets.


