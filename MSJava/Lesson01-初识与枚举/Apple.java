/*!
 * JAVA 枚举
 */
class App {
    enum AppleSize {
        SMALL,
        MEDIUM,
        LARGE
    }
    AppleSize size;
}

public class Apple {
    
    public static void main(String []args) {
        App app = new App();
        app.size = App.AppleSize.MEDIUM;
        System.out.println("大小：" + app.size); // 大小：MEDIUM
    }
}
