import java.io.*;

public class EmployeeDemo {
    public static void main (String args[]) {
        // 使用构造器创建两个对象
        Employee emp1 = new Employee("one");
        Employee emp2 = new Employee("two");
        
        // 调用这两个对象的成员方法
        emp1.empAge(33);
        emp1.empDesignation("em1");
        emp1.empSalary(50000);
        emp1.printEmployee();
        
        emp2.empAge(22);
        emp2.empDesignation("em2");
        emp2.empSalary(5000);
        emp2.printEmployee();
    }
    
    /*
     编译这两个文件并且运行 EmployeeDemo 类
        $ javac EmployeeDemo.java
        $ java EmployeeDemo
     
     
     打印信息：
         名字:one
         年龄:33
         职位:em1
         薪水:50000.0
         名字:two
         年龄:22
         职位:em2
         薪水:5000.0
     */
}
