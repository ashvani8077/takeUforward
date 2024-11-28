package BinarySearch;

public class FirstAndLastOccurrenceUsingBound {
    public static void main(String[] args) {
        int arr[]={3,5,8,15,19,19,19};
    }

    public static int [] solution(int arr[], int k){
        int ans[]=new int[2];
        if(lowerBound(arr,k)==arr.length||arr[lowerBound(arr,k)]!=k){
            ans[0]=-1;
            ans[1]=-1;
        }
        else {
            ans[0]=lowerBound(arr,k);
            ans[1]=upperBound(arr,k)-1;
        }
        return ans;
    }

    public static int lowerBound(int arr[], int k){
        int ans=-1;
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=k){
                ans= mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static int upperBound(int arr[], int k){
        int ans=-1;
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>k){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}


//Use Lower and upper bound
//Time Complexity-->
//                    lb=log n
//                    ub=log n
//                    Total=2*logn