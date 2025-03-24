package Arrays;

public class TrappingRainWater2 {
    public static void main(String[] args) {
        int arr[]={4,2,0,3,2,5};
        System.out.println(trappingWater(arr));
    }
    public static int trappingWater(int arr[]){
        int n=arr.length;
        int suffixMax[]=suffMaximum(arr);
        int total=0;
        int left=arr[0];
        for(int i=0;i<n;i++){
            int right=suffixMax[i];
            if(arr[i]<left&& arr[i]<right){
                int min=Math.min(left, right);
                total=total+(min-arr[i]);
            }
            left=Math.max(left,arr[i]);
        }
        return total;
    }


    public static int [] suffMaximum(int arr[]){
        int n=arr.length;
        int suffixMax[]=new int[n];
        suffixMax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            suffixMax[i]=Math.max(suffixMax[i+1],arr[i]);
        }
        return suffixMax;
    }
}

