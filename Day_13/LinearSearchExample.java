public class LinearSearchExample{

   public static int linearSearch(int[] arr , int target){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;// retrun the index where the target is found
            }
        }
        return -1; // retrun -1 if the tagert is not found in the array 

   }
   public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60};

        int tagert = 2;

        int index = linearSearch(arr, tagert);

        if(index != -1){
            System.out.println("Target "+tagert+"found at index "+ index);
        }else{
            System.out.println(" Target not Found ....in the array ");
        }

   }

}