package BinarySearch;

public class SmallestDivisor {
    public static void main(String[] args) {
        int arr[]={1,2,5,9};
        int tr=6;
        System.out.println(binarySearch(arr,tr));
    }

    public static int binarySearch(int arr[], int tr){
        int answer=-1;
        int low=1;
        int high=maximum(arr);
        while (low<=high){
            int mid=low+(high-low)/2;
            int sum=sumOfArr(arr,mid);
            if(sum<=tr){
                answer=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return answer;
    }

    public static int maximum(int arr[]){
        int ans=-1;
        for (int i:arr){
            if(i>ans){
                ans=i;
            }
        }
        return ans;
    }

    public static int sumOfArr(int arr[], int mid){
        int sum=0;
        for(int i:arr){
            sum=sum+(int)Math.ceil((double) i/mid);
        }
        return sum;
    }
}
