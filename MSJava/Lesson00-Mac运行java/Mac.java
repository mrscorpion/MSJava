// 手把手教你使用 Mac 玩转 Java 开发
/*
> JAVA 简介
    Java 是由Sun Microsystems公司于1995年5月推出的高级程序设计语言。
    Java可运行于多个平台，如Windows, Mac OS 及其他多种UNIX版本的系统。

> MAC 下 Java 开发环境配置
    1.下载java开发工具包JDK8，进入官网下载地址：http://www.oracle.com/technetwork/java/jdk8-downloads-2133151.html
    2.在 Java SE Development Kit 8u111 项中，选择同意 Accept License Agreement
    3.选择Mac OS X	227.39 MB  	jdk-8u111-macosx-x64.dmg 点击下载
    4.双击打开.dmg 进行安装 （其中需要输入密码，获取管理员权限，输入本账号登录密码即可）
    备注：如不安装JDK，编译时将报错 “您需要安装jdk才能使用java命令行工具”。

> 简单使用
    使用命令行工具（Command Line Tools） ／ iTerm2
    1. 进入工程目录，若无请先新建        cd /Users/ms/MSJava/MSJava/Lesson00-Mac运行java
    2. 创建.java测试文件              touch Mac.java
    3. 默认使用Xcode打开，即可进行编辑   open Mac.java
        (3.2 如果未安装Xcode,也可以直接使用vim进行创建和编辑  vim Mac.java)
    4. 输入第一个Java程序
         public class Mac
         {
            public static void main(String []args)
            {
                System.out.println("Hello Java!");
            }
         }
    5. 执行命令：
        5.1 $ javac Mac.java  // 用于将 java 源文件编译为 class 字节码文件  (执行完即可看到该文件目录下新增了 Mac.class)
        5.2 $ java Mac        // 输出打印信息 Hello Java!
        注意：1.输入以上指令时不要输入符号“$”，仅为表示此为指令； 2.输入“javac”后按“tab”键即可自动补全。
}
*/
public class Mac
{
    public static void main(String []args)
    {
        System.out.println("Hello Java!"); // 打印信息 Hello Java!
    }
}
