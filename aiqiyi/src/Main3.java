import java.util.Arrays;
//将两个数组交叉合并方法：
public class Main3{
    public int[] crossfix(int data[], int data1[])
    {
        int result[] = new int[data.length + data1.length];
        int common = Math.min(data.length, data1.length);
        int long_data[] = data.length > data1.length ? data:data1;
        int max = long_data.length;
        int j = 0;
        for(int i = 0; i < common; i++)
        {
            result[j++] = data[i];
            result[j++] = data1[i];
        }
        for(int i = common; i < max; i++)
        {
            result[j++] = long_data[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int b[] = {4,5,6,7,8};
        Main3 temp = new Main3();
        System.out.println(Arrays.toString(temp.crossfix(a, b)));
    }
}
