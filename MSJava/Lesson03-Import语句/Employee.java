import java.io.*;

public class Employee{
    String name;
    int age;
    String designation;
    double salary;
    // Employee 类的构造器
    public Employee(String name){
        this.name = name;
    }
    // 设置age的值
    public void empAge(int empAge){
        age =  empAge;
    }
    /* 设置designation的值*/
    public void empDesignation(String empDesig){
        designation = empDesig;
    }
    /* 设置salary的值*/
    public void empSalary(double empSalary){
        salary = empSalary;
    }
    /* 打印信息 */
    public void printEmployee(){
        System.out.println("名字:"+ name );
        System.out.println("年龄:" + age );
        System.out.println("职位:" + designation );
        System.out.println("薪水:" + salary);
    }
    
    
    /*！
     如果单独编译 Employee。java，将遇到报错：
     
     错误: 在类 Employee 中找不到 main 方法, 请将 main 方法定义为:
     public static void main(String[] args)
     否则 JavaFX 应用程序类必须扩展javafx.application.Application
     
     原因：
        程序都是从main方法开始执行。为了能运行这个程序，必须包含main方法并且创建一个实例对象。
     */
}
