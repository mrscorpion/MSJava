/*!
 * JAVA 创建对象、设置属性和调用方法
 */
public class Puppy
{
    int puppyAge;
    void sleeping(int age) {
        System.out.println(" 岁的puppy在睡觉！" );
    }
	public Puppy(String name) {
		// 该构造器仅有一个参数：name
		System.out.println("名字是：" + name);  // 名字是：java
	}
    public void setAge(int age) {
        puppyAge = age;
    }
    public int getAge() {
        System.out.println("年龄为：" + puppyAge);
        return puppyAge;
    }
    
	public static void main(String []args){
		// 创建一个Puppy对象
		Puppy thePuppy = new Puppy("java");
        // 通过setter方法来设定age
        thePuppy.setAge(2);
        // 通过getter方法来获取age
        thePuppy.getAge();
        /*
         调用 sleeping 方法
         thePuppy.name  通过.访问成员变量
         */
        thePuppy.sleeping(thePuppy.puppyAge);
	}
    
    
    /*
     打印信息为：
     
        名字是：java
        年龄为：2
        岁的puppy在睡觉！
     */
}
