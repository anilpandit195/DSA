import java.util.*;
public class digit{
public static void main (String[]args){
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int tmp = 1;
int copyofn = n;
while(copyofn>9){
    copyofn = copyofn/10;
    tmp = tmp*10;

}
while(tmp!=0){
    int digit = n/tmp;
    System.out.println(digit);
    n=n%tmp;
    tmp=tmp/10;
    scn.close();
}
}
}
