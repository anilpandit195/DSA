import java.util.*;
public class basicString{
    public static void main(String[] args){
        int v1 = 10 , v2 = 20;
        String s = "Hello";
        System.out.println(v1+v2+s);
        System.out.println(s+v1+v2);
        System.out.println(v1*v2+s);
        System.out.println(s+v1*v2);
        System.out.println(v1+s+v2);
        String s1 = "Hello i am Anil";
        String[] word = s1.split(" ");//(""); //("i"); 
        for(int i=0; i<=word.length; i++){
            System.out.println(word[i]);
        }
    }
    
}
