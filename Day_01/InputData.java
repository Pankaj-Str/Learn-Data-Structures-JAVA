import java.util.*;
class InputData{
    public static void main(String[] args) {
        // create a object
        Scanner sc = new Scanner(System.in);
        System.out.println("Your Array Size - ");
        int size = sc.nextInt();

        String[] data = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Data into Array = "+(i+1));
            data[i] = sc.next();
        }
        System.out.println("------output-------------");
        for (int i = 0; i < size; i++) {
            System.out.println(i+" = "+data[i]);
            
        }

        
    }
}