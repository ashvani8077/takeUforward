package BinarySearch;

public class CapacityOfShip {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int day=5;
        System.out.println(binarySearch(arr,day));
    }
    public static int binarySearch(int arr[],int days){
        int ans=-1;
        int n=arr.length;
        int low=maximum(arr);
        int high=sum(arr);
        while (low<=high){
            int mid=low+(high-low)/2;
            if(isWorked(arr,mid,days)){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }

        }
        return ans;
    }

    public static int maximum(int arr[]){
        int max=-1;
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
    public static int sum(int arr[]){
        int total=0;
        for (int i:arr){
            total+=i;
        }
        return total;
    }

    public static boolean isWorked(int arr[],int mid, int d){
        int count=0;
        int sum=0;
        for (int i:arr){
            sum=sum+i;
            if(sum>mid){
                sum=i;
                count++;
            }
        }
        count++;
        if(count<=d){
            return true;
        }
        return false;
    }
}
