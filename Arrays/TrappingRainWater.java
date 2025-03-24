package Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int arr[]={4,2,0,3,2,5};
        System.out.println(trappingWater(arr));
    }
    public static int trappingWater(int arr[]){
        int n=arr.length;
        int prefixMax[]=preMaximum(arr);
        int suffixMax[]=suffMaximum(arr);
        int total=0;
        for(int i=0;i<n;i++){
            int left=prefixMax[i];
            int right=suffixMax[i];
            if(arr[i]<left&& arr[i]<right){
                int min=Math.min(prefixMax[i], suffixMax[i]);
                total=total+(min-arr[i]);
            }
        }
        return total;
    }

    public static int[] preMaximum(int arr[]){
        int n=arr.length;
        int prefixMax[]=new int[n];
        prefixMax[0]=arr[0];
        for (int i=1;i<n;i++){
            prefixMax[i]=Math.max(prefixMax[i-1],arr[i]);
        }
        return prefixMax;
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

