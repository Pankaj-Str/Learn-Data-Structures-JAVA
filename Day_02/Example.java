package Day_02;

public class Example {

    int Node;
    Example(int node){
        Node = node;
        System.out.println(node);

    }
    
    public static void main(String[] args) {
        Example obj = new Example(12);
        System.out.println("NODE :- "+obj.Node);
    }
}


