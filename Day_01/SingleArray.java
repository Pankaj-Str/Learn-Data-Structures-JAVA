class SingleArray{

    public static void main(String[] args) {
        
        int[] data = new int[5];
        
        data[0] = 18;
        data[1] = 19;
        data[2] = 20;
        data[3] = 21;
        data[4] = 22;

        System.out.println(data[0]);// single access data 

        for (int i : data) {
            System.out.println("Number - "+i);
        }
        System.out.println("------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(i+"Number = "+data[i]);
        }
        
    }

}