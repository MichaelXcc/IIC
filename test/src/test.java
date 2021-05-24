import java.util.Arrays;
import java.util.Scanner;

public class test {
    // 八种基本数据类型

    //boolean数据类型表示一位的信息
    //只有两个取值：true 和 false
    //这种类型只作为一种标志来记录 true/false 情况
    //默认值是 false
    static boolean bool;
    // byte 数据类型是 8 位, 有符号的， 以二进制补码表示的整数
    // byte 类型用在大型数组中节约空间，主要代替整数，因为byte变量占用的空间只有int类型的四分之一
    static byte by;
    //char类型是一个单一的 16 位 Unicode 字符
    //最小值是 \u0000（即为0）
    //最大值是 \uffff（即为65,535）
    //char 数据类型可以储存任何字符；
    static char ch;
    //double 数据类型是双精度、64 位、符合IEEE 754标准的浮点数
    //浮点数的默认类型为double类型
    //double类型同样不能表示精确的值，如货币
    //默认值是 0.0d
    static double d;
    //float 数据类型是单精度、32位、符合IEEE 754标准的浮点数
    //float 在储存大型浮点数组的时候可节省内存空间
    //默认值是 0.0f
    //浮点数不能用来表示精确的值，如货币
    //例子：float f1 = 234.5f
    static float f;
    //int 数据类型是32位、有符号的以二进制补码表示的整数
    //最小值是 -2,147,483,648（-2^31）
    //最大值是 2,147,483,647（2^31 - 1）
    //一般地整型变量默认为 int 类型
    //默认值是 0
    //例子：int a = 100000, int b = -200000
    static int i;
    //long 数据类型是 64 位、有符号的以二进制补码表示的整数
    //最小值是 -9,223,372,036,854,775,808（-2^63）
    //最大值是 9,223,372,036,854,775,807（2^63 -1）
    //这种类型主要使用在需要比较大整数的系统上
    //默认值是 0L
    //例子： long a = 100000L，Long b = -200000L
    //"L"理论上不分大小写，但是若写成"l"容易与数字"1"混淆，不容易分辩。所以最好大写
    static long l;
    //short 数据类型是 16 位、有符号的以二进制补码表示的整数
    //最小值是 -32768（-2^15）
    //最大值是 32767（2^15 - 1）
    //Short 数据类型也可以像 byte 那样节省空间。一个short变量是int型变量所占空间的二分之一
    //默认值是 0
    //例子：short s = 1000，short r = -20000
    static short sh;
    static String str;

    //byte < char = short < int < long < float < double
    //表示范围小的可以自动转换到表示范围较大的，而表示范围较大的需要强制转换到表示范围较小的数据

    private void psvm() {
        // 定义 Scanner 输入
        Scanner sc = new Scanner(System.in);
        int a;
        float b;
        boolean c;
        // 规定 输入类型
        a = sc.nextInt();
        b = sc.nextFloat();
        c = sc.nextBoolean();
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

//        byte test_byte = new Byte("");
        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }
        int w = 1;
        // do 在前无论什么情况都会先执行一次
        do {
            System.out.println(w);
            w++;
        } while (w <= 3);
        // TODO: 这两个有啥区别
        int[] arr = new int[3];
        float[] arrf = new float[1];
        arr[0] = 1;
        arrf[0] = 1;
        System.out.println(Arrays.toString(arrf));
        System.out.println(Arrays.toString(arr));
        int[] aa = {1,2,3,4,5};
        int[] aaa = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(aa));
        // 二维数组
        int[][] erweishuzu = new int[4][8];
        int length = erweishuzu.length;

        for (int[] i : erweishuzu){
            System.out.println(Arrays.toString(i));
        }

        // 函数 三个部分组成，定义域，值域，对应法则，
        // static 表示这是一个静态函数 static 定义的函数通过函数名调用同一个class下的函数,这个函数一定是static
        String[] s = {"1","2","3"};
        System.out.println(s);
        // 单引号是char  双引号是string
        char b[] = new char[]{'h','e','l'};



    }
    public static int functionName(int param1, int param2){
        int ans = param1 + param2;
        return ans;
    }
    int a = 4;
}
