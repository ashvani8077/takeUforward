package BinarySearch;

public class MinimumTimeToCompleteTrip {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int totalTrip=5;
        System.out.println(brute(arr,totalTrip));
    }
    public static int brute(int arr[], int totalTrip){
        int time=0;
        while (true){
            time++;
            int total=0;
            for (int i:arr){
                total=total+time/i;
                if(total>=totalTrip){
                    return time;
                }
            }
        }
    }

}
