import java.util.Scanner;
//相邻两个字符不一样，已知一个字符串，找到最少需要更换的数量
public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(main(s));
    }
    public static int main(String s){
        if(s.length()>10 || s.length()<=0)
            return 0;
         int num=0;
       for(int i=0;i+1<s.length();i++){
               if(s.charAt(i)==s.charAt(i+1)){
                   num++;
                   i=i+1;
               }
           }
        return num;
       }
    }

