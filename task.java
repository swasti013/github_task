import java.util.*;


//========== User's Code Starts Here ==========

class Solution {
    public int[] element_search(int[] nums, int target) {
        
        int[] result = {-1, -1};
        //intialize two pointers
    int left = 0, right = nums.length - 1;
        //using binary search
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            result[0] = mid;
            right = mid - 1; 
        }
         else if (nums[mid] < target) {
            left = mid + 1;
        } 
        else {
            right = mid - 1;
        }
    }

    left = 0;
    right = nums.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            result[1] = mid;
            left = mid + 1; 
        } 
        else if (nums[mid] < target) {
            left = mid + 1;
        }
         else {
            right = mid - 1;
        }
    }

    return result;
    }
}

//========== User's Code Ends Here ==========



public class Main
{
   
    
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        Solution s = new Solution();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int output[] = s.element_search(arr,sc.nextInt());
        Arrays.sort(output);
        for(int i=0;i<output.length;i++)
            System.out.print(output[i]+" ");
        System.out.println();
    }
}
