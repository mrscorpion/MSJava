/*!  Java 基本数据类型
 
 Java的两大数据类型:
    > 内置数据类型 (byte \ short \ int \ long \ float \ double \ boolean \ char)
        - 实际上，JAVA中还存在另外一种基本类型void，它也有对应的包装类 java.lang.Void，不过我们无法直接对它们进行操作。
    > 引用数据类型 (对象、数组)
        - Java中，引用类型的变量非常类似于C/C++的指针，所有引用类型的默认值都是null。
 
 Java常量（在程序运行时，不会被修改的量）
    - 在 Java 中使用 final 关键字来修饰常量，在 Objective-C 中使用 const 关键字来修饰常量。
 
 Java数据类型转换
    - 整型、实型（常量）、字符型数据可以混合运算。运算中，不同类型的数据先转化为同一类型，然后进行运算。
    - 转换从低级到高级 (byte,short,char —> int —> long—> float —> double)
    - 规则:
        1. 不能对boolean类型进行类型转换。
        2. 不能把对象类型转换成不相关类的对象。
        3. 在把容量大的类型转换为容量小的类型时必须使用强制类型转换。
        4. 转换过程中可能导致溢出或损失精度，例如：
            int i = 128;
            byte b = (byte)i;
            因为byte类型时8位，最大值为127，所以当强制转换为int类型值128时候就会导致溢出。
        5. 浮点数到整数的转换是通过舍弃小数得到，而不是四舍五入，例如：
            (int)99.9 == 99;
 */

public class PrimitiveType {
    public static void main(String []agrs) {
        /******** Java内置数据类型  ********/
        // byte
        System.out.println("基本类型: byte 二进制位数：" + Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        
        // short
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
        System.out.println();
        
        // int
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println();
        
        // long
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
        System.out.println();
        
        // float
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();
        
        // double
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        System.out.println();
        
        // char
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE="
                           + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE="
                           + (int) Character.MAX_VALUE);
        
        
        /******** Java常量  ********/
        // 声明方式和变量类似, 通常使用大写字母表示常量。
        final double PI = 3.1415927;
        System.out.println("\n\nPI的值：" + PI);
        /*!
         字符串常量
         - Java的字符串常量也是包含在两个引号之间的字符序列。
         - 字符串常量和字符常量都可以包含任何Unicode字符。
         */
        System.out.println("mr\n" + "\"This is in quotes\"" + "\u0001");
        
        
        /******** 强制类型转换  ********/
        int i1 = 123;
        byte b = (byte)i1;
        System.out.println("\n\nint 强制类型转换为 byte 后的值等于" + b);
    }
}


 
/*! 打印信息
 基本类型: byte 二进制位数：8
 包装类：java.lang.Byte
 最小值：Byte.MIN_VALUE=-128
 最大值：Byte.MAX_VALUE=127
 基本类型：short 二进制位数：16
 包装类：java.lang.Short
 最小值：Short.MIN_VALUE=-32768
 最大值：Short.MAX_VALUE=32767
 
 基本类型：int 二进制位数：32
 包装类：java.lang.Integer
 最小值：Integer.MIN_VALUE=-2147483648
 最大值：Integer.MAX_VALUE=2147483647
 
 基本类型：long 二进制位数：64
 包装类：java.lang.Long
 最小值：Long.MIN_VALUE=-9223372036854775808
 最大值：Long.MAX_VALUE=9223372036854775807
 
 基本类型：float 二进制位数：32
 包装类：java.lang.Float
 最小值：Float.MIN_VALUE=1.4E-45
 最大值：Float.MAX_VALUE=3.4028235E38
 
 基本类型：double 二进制位数：64
 包装类：java.lang.Double
 最小值：Double.MIN_VALUE=4.9E-324
 最大值：Double.MAX_VALUE=1.7976931348623157E308
 
 基本类型：char 二进制位数：16
 包装类：java.lang.Character
 最小值：Character.MIN_VALUE=0
 最大值：Character.MAX_VALUE=65535
 
 
 PI的值：3.1415927
 mr
 "This is in quotes"
*/
