import java.util.Scanner;

public class SentenceReverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String rev=in.nextLine();
        String[] words=rev.split(" ");
        String temp="";
        for(String s:words){
            temp=s+" "+temp;
        }
        System.out.println(temp);
    }
}
