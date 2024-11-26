package BinarySearch;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,5,5,6,6,7,7};
        System.out.println(bruteSolution(arr));
        System.out.println(usingXOR(arr));
        System.out.println(binarySearch(arr));
    }
    public static int bruteSolution(int arr[]){
        if(arr.length==1){
            return arr[0];
        }
        for(int i=0;i<arr.length;i++){
            if(i==0){
                if(arr[i]!=arr[i+1]){
                    return arr[i];
                }
            }
            else if(i==arr.length-1){
                if(arr[i-1]!=arr[i]){
                    return arr[i];
                }
            }
            else if(arr[i]!=arr[i+1]&&arr[i]!=arr[i-1]){
                return arr[i];
            }
        }
        return -1;
    }

    public static int usingXOR(int arr[]){
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }
        return xor;
    }

    public static int binarySearch(int arr[]) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (mid < high && arr[mid] == arr[mid + 1]) {
                int count = high - mid;
                if (count % 2 == 0) {
                    low = mid + 2;
                } else {
                    high = mid - 1;
                }
            } else if (mid > low && arr[mid] == arr[mid - 1]) {
                int count = mid - low;
                if (count % 2 == 0) {
                    high = mid - 2;
                } else {
                    low = mid + 1;
                }
            } else {
                return arr[mid];
            }
        }
        return arr[low];
    }

}
