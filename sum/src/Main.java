import java.util.*;

//前面是sum
public class Main {
    /**
     * 加法器，a，b的位数必须相同，首位为符合位，0代表正，9代表负
     * @param a
     * @param b
     * @return
     */
    private static int[] add(int[] a, int[] b) {
        if(a.length<b.length){
            return null;
        }
        int size = a.length;
        int t = 0;//进位
        for (int i = 0; i < size; i++) {
            int k = a[size - i - 1] + b[size - i - 1];
            k+= t;//加进位
            if (k >= 10) {
                t = 1;
            }else{
                t = 0;
            }
            k %= 10;
            a[size - i - 1] = k;
        }

        return a;
    }

    /**
     * 大数相加
     * @param a
     * @param b
     * @return
     */
    public static String bigAdd(String a,String b){
        if(a==null || b == null){
            throw new NullPointerException();
        }
        boolean af = true,bf =true;
        if(a.charAt(0)=='-'){
            af = false;
            a = a.substring(1);
        }
        if(b.charAt(0)=='-'){
            bf = false;
            b = b.substring(1);
        }
        int maxsize = a.length()>b.length()?a.length()+2:b.length()+2;
        int[] m = new int[maxsize];
        int[] n = new int[maxsize];
        m[0] = af?0:9;
        n[0] = bf?0:9;
        for (int i = 0; i < a.length(); i++) {
            m[maxsize-a.length()+i] = Integer.parseInt(""+a.charAt(i));
        }
        for (int i = 0; i < b.length(); i++) {
            n[maxsize-b.length()+i] = Integer.parseInt(""+b.charAt(i));
        }
        int[] result = add(buma(m),buma(n));
        return intToString(buma(result));
    }
    /**
     * 标准输出
     * @param a
     * @return
     */
    public static String intToString(int[] a){
        StringBuffer s = new StringBuffer();
        if(a[0]==9){
            s.append('-');
        }else{
            //s.append('0');
        }
        int tag = 0;
        for (int i = 1; i < a.length; i++) {
            if(a[i]==0){
                tag++;
            }else{
                break;
            }
        }
        for (int j = tag+1; j < a.length; j++) {
            s.append(a[j]);
        }
        if(s.length()==0){
            return "0";
        }
        return s.toString();
    }
    /**
     * 10进制求补码
     * @param a
     * @return
     */
    public static int[] buma(int[] a) {
        if (a[0] == 9) {
            for (int i = 1; i < a.length; i++) {
                a[i] = 9 - a[i];
            }
            int[] tmp  = new int[a.length];
            tmp[a.length-1] = 1;
            return add(a, tmp);
        }else{
            return a;
        }
    }


    public void demoSet(){
        Set<String> strSet=new HashSet<String>();
        for (int i=0;i<3;i++){
            strSet.add(String.valueOf(i));
        }
    }
    public void demoKeyValue(){
        Map<String,String> map=new HashMap<>();
        for(int i=0;i<4;i++){
            map.put(String.valueOf(i),String.valueOf(i*i));
        }
        for(Map.Entry<String ,String > entry:map.entrySet() ){
            System.out.println(entry.getKey());
        }
    }
    public static void main(String[] args) {
        //用字符串表示大数
        Scanner in=new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        System.out.println(bigAdd(str1, str2));;
    }
}

