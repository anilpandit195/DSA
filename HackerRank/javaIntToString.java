import java.util.*;

public class javaIntToString {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String s = Integer.toString(n);
        if(n == Integer.parseInt(s)){
             System.out.println("Good  job");
        } else{
            System.out.println("Wrong answer");
        }
        scn.close();
        
    }
}