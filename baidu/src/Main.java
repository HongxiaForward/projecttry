import java.util.Scanner;
//未完成代码未通过
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //String str1 = in.nextLine();
        //String str2 = in.nextLine();
        //int n=Integer.valueOf(str1);
        //int m=Integer.valueOf(str2);
        int n=in.nextInt();
        int m=in.nextInt();
        int sx=in.nextInt();
        int sy=in.nextInt();
        int [][] arr=new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println( main(m,n,sx,sy,arr));
       /* String str3 = in.nextLine();

        String str4 = in.nextLine();
        int sx=Integer.valueOf(str3);
        int sy=Integer.valueOf(str4);*/
        /*String str= in.nextLine();
        String arr[][]=String.;
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m; j++){
                a[i][j]=Integer.valueOf(arr[n][m]);
            }*/

       /* for (int i = 0; i < n; i++)
            arr[i][0]=in.nextLine();
            for(int j=0;j<m;j++){
                arr[0][j]=in.nextLine();
        }*/
        //int h=in.nextInt();

    }
    public static int main( int m, int n,int sx, int sy, int[][] a){
        /*sx=0;
        sy=0;*/
        int h=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                sx=i+1;
                sy=j+1;
                h=a[i][j];
                if(!(a[i][j]>a[i-1][j] || a[i][j]>a[i][j+1] || a[i][j]>a[i+1][j] || a[i][j]>a[i][j-1]) ){
                    return  h;
                }
                else{
                    if(a[i][j]<a[i-1][j] ){
                    h=a[i-1][j];
                    if(sx<=a.length && sy<=a[0].length)
                        return main( sx,sy,m,n,a);
                    }
                    if(a[i][j]<a[i][j+1] ){
                        h=a[i][j+1];
                        if(sx<=a.length && sy<=a[0].length)
                        return main( sx,sy,m,n,a);
                    }
                    if(a[i][j]<a[i+1][j] ){
                        h=a[i+1][j];
                        if(sx<=a.length && sy<=a[0].length)
                        return main( sx,sy,m,n,a);
                    }
                    if(a[i][j]<a[i][j-1] ){
                        h=a[i][j-1];
                        if(sx<=a.length && sy<=a[0].length)
                        return main( sx,sy,m,n,a);
                    }

                }
            }
        }

        return h;}
}

