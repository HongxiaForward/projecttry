import java.util.Scanner;
//洗牌过程：一叠分上下两叠，上叠放左手，下叠放右手，从左手最下边先拿牌，然后右手下边，，有哪个拿没了就把有的那一叠都放上去；
//输入13个正整数代表点数，然后输入洗牌操作次数就是分叠的次数，然后输入每次操作左手放多少张牌，牌是从上面拿到左手的。输出最后洗牌后的点数
public class Main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String [] s=str.split(" ");
        int N=in.nextInt();
        int [] arr=new int[N];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("hello");
    }
    public static void xipai(String [] s,int N,int [] arr){
        int [] result=new int[13];
        int temp=0;
        for(int i=0;i<N;i++){
          temp=arr[i];
          for(int j=temp-1;j>=0;j--){
              result[j]=Integer.valueOf(s[j]);
          }
      }
    }
}
