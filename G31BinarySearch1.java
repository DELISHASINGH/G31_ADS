// public class G31BinarySearch1 {
//     public static void main(String[] args){//execution start from here
//         int arr[] = {1, 3 , 5, 7 ,9 ,11, 13, 15};
//         int target = 16;
//         int low=0, high = arr.length-1;
//         boolean found = false;  //keep track whether element is found or not
//         while(low<=high){ //Search continues as long as a valid range exists.
//             int mid = low+(high - low)/2; //This avoids overflow (better than (low+high)/2)
//             if(arr[mid] == target){
//                 System.err.println("Found!!");
//                 found = true;
//                 break;
//             }
//             else if(arr[mid]<target){
//                 low = mid + 1;
//             }
//             else{
//                 high = mid - 1;
//             }
//         }
//         if(!found){
//             System.out.println("Element not found");
//         }
            
//         }
//     }

//when array is not given
// public class G31BinarySearch1{
//     public static void main(String[] args){
//     int low = 0, high = 100;
//     int target = 101;
//     boolean found = false;
//     while(low<=high){
//         int mid = low+(high - low)/2;
//         if(mid==target){
//             System.out.println("Found");
//             break;
//         }
//         else if(mid<target){
//             low=mid+1;
//         }
//         else{
//             high = mid-1;
//         } 
//     }
//    if(!found){
//             System.out.println("Element not found");
            
//         }    
// }
// }


// leetcode 704(Binary Search), will pass all test cases
// class Solution {
//     public int search(int[] nums, int target) {
//         int low=0, high = nums.length-1;
//         while(low<=high){
//             int mid = low+(high - low)/2;
//             if(nums[mid]==target){
//                 return mid;
//             }
//             else if(nums[mid]<target){
//                 low = mid + 1;
//             }
//             else{
//                 high = mid - 1;
//             }
//         }
//     return -1;
//     }
// }