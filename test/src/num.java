import java.util.Arrays;

public class num {
    public static void main(String[] args) {
        int num = 1 ;
        int res1,res2;
        res1 = num++;
        res2 = ++num;
        System.out.println(res1);
        System.out.println(res2);
        System.out.println("test:" + ++num);
        // i++表示先引用i变量的数值然后再对i进行加1的操作，而++i是先对i变量进行加1的操作，然后再引用i变量的数值。
        // i++中的“++”运算符的优先级比++i中“++”运算符的优先级高。
        // 执行c=i++，会先将i变量的值1赋值给c，然后c=1，然后i才等于2，执行c=++i，会先将i变量加1变成2，然后赋值给c，c的值为2。

        switch (num){
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + num);
        }

    }
}
