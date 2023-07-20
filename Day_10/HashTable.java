package Day_10;
//@p4n.in
//codeswithpankaj.com
import java.util.HashMap;

class HashTable{


        public static void main(String[] arg){

                // create a new hash map instance 
                HashMap<String, Integer> hashMap = new HashMap<>();
                // insrting key and value pairs into the hash table 
                hashMap.put("java",1001);
                hashMap.put("C++",1002);
                hashMap.put("C",1003);
                hashMap.put("Python",1004);
                hashMap.put("JavaScript",1005);

                // test print
                System.out.println("test output - \n"+hashMap);

                // accessing value using key 

                System.out.println("course id - "+hashMap.get("java"));
                System.out.println(" c++ course id "+hashMap.get("C++"));

            //updating value of keys..
            hashMap.put("C++", 45001);
            System.out.println("update go in hashmap : "+ hashMap.get("C++"));

            // checking if key exists in the hash table 

            String key = "java";
            if(hashMap.containsKey(key)){
                System.out.println(key+"= exists in the hash table... ");
            }else{
                System.out.println(key+" = does not exists in the hash table ...");
            }
            // removing a key value pair from the hash table 

            hashMap.remove("C++");
            System.out.println("size of the hash table after remove .. "+hashMap.size());

        }


}