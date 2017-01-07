/*! 
 Java 变量类型:
 > 1.局部变量
     局部变量声明在方法、构造方法或者语句块中；
     局部变量在方法、构造方法、或者语句块被执行的时候创建，当它们执行完成后，变量将会被销毁；
     访问修饰符不能用于局部变量；
     局部变量只在声明它的方法、构造方法或者语句块中可见；
     局部变量是在栈上分配的。
     局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用。
 
 > 2.成员变量
     实例变量声明在一个类中，但在方法、构造方法和语句块之外；
     当一个对象被实例化之后，每个实例变量的值就跟着确定；
     实例变量在对象创建的时候创建，在对象被销毁的时候销毁；
     实例变量的值应该至少被一个方法、构造方法或者语句块引用，使得外部能够通过这些方式获取实例变量信息；
     实例变量可以声明在使用前或者使用后；
     访问修饰符可以修饰实例变量；
     实例变量对于类中的方法、构造方法或者语句块是可见的。一般情况下应该把实例变量设为私有。通过使用访问修饰符可以使实例变量对子类可见；
     实例变量具有默认值。数值型变量的默认值是0，布尔型变量的默认值是false，引用类型变量的默认值是null。变量的值可以在声明时指定，也可以在构造方法中指定；
     实例变量可以直接通过变量名访问。但在静态方法以及其他类中，就应该使用完全限定名：ObejectReference.VariableName。
 
 > 3.类变量（静态变量）
     类变量也称为静态变量，在类中以static关键字声明，但必须在方法构造方法和语句块之外。
     无论一个类创建了多少个对象，类只拥有类变量的一份拷贝。
     静态变量除了被声明为常量外很少使用。常量是指声明为public/private，final和static类型的变量。常量初始化后不可改变。
     静态变量储存在静态存储区。经常被声明为常量，很少单独使用static声明变量。
     静态变量在程序开始时创建，在程序结束时销毁。
     与实例变量具有相似的可见性。但为了对类的使用者可见，大多数静态变量声明为public类型。
     默认值和实例变量相似。数值型变量默认值是0，布尔型默认值是false，引用类型默认值是null。变量的值可以在声明的时候指定，也可以在构造方法中指定。此外，静态变量还可以在静态语句块中初始化。
     静态变量可以通过：ClassName.VariableName的方式访问。
     类变量被声明为public static final类型时，类变量名称必须使用大写字母。如果静态变量不是public和final类型，其命名方式与实例变量以及局部变量的命名方式一致。
*/

public class Variable {
    /***** 局部变量 *****/
    public void empAge() {
        int age = 55; // 局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用。
        age = age - 2;
        System.out.println("年龄为：" + age);
    }
    
    /***** 实例变量 *****/
    public String name; // 这个实例变量对子类可见
    private double salary; // 私有变量，仅在该类可见
    // 在构造器中对name赋值
    public Variable (String empName) {
        name = empName;
    }
    // 设定salary的值
    public void setSalary(double empSalary) {
        salary = empSalary;
    }
    public void printEmp() {
        System.out.println("名字:" + name);
        System.out.println("薪水:" + salary);
    }
    
    /***** 静态变量 *****/
    private static double nums; // nums是静态的私有变量
    public static final String user = "boy"; // user是一个常量
    
    public static void main(String []args) {
        Variable var = new Variable("2b");
        var.empAge();
        
        Variable var1 = new Variable("mr");
        var1.setSalary(999);
        var1.printEmp();
        
        nums = 2;
        System.out.println(user + "排行老" + nums);
    }
}

/*! 打印信息
 年龄为：53
 名字:mr
 薪水:999.0
 boy排行老2.0
 */
