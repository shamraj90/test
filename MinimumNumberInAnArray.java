public class MinimumNumberInAnArray {

    public static void main(String[] args) {
        int[] arr= new int[]{5,3,7,2,4};
        int minimum=findMinNum(arr);
        System.err.println("Minimum number "+minimum);

    }

    public static int findMinNum(int[] arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
