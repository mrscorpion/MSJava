//  深拷贝和浅拷贝.m
#import <Foundation/Foundation.h>

/*
问题：
 父类实现深拷贝时，子类如何实现深度拷贝。父类没有实现深拷贝时，子类如何实现深度拷贝？

 > 浅拷贝：是指针拷贝，对一个对象进行浅拷贝，相当于对指向对象的指针进行复制，产生一个新的指向这个对象的指针，那么就是有两个指针指向同一个对象，这个对象销毁后两个指针都应该置空。
 > 深拷贝：是对一个对象进行拷贝，相当于对对象进行复制，产生一个新的对象，那么就有两个指针分别指向两个对象。当一个对象改变或者被销毁后拷贝出来的新的对象不受影响。
        - 实现深拷贝需要实现NSCoying协议，实现- (id)copyWithZone:(NSZone *)zone 方法。当对一个property属性含有copy修饰符的时候，在进行赋值操作的时候实际上就是调用这个方法。
 
 父类实现深拷贝之后，子类只要重写copyWithZone方法，在方法内部调用父类的copyWithZone方法，之后实现自己的属性的处理。
 父类没有实现深拷贝，子类除了需要对自己的属性进行处理，还要对父类的属性进行处理。
*/


// 浅拷贝
// 浅拷贝就是对内存地址的复制，让目标对象指针和源对象指向同一片内存空间。如：
char* str = (char*)malloc(100);
char* str2 = str;
// 浅拷贝只是对对象的简单拷贝，让几个对象共用一片内存，当内存销毁的时候，指向这片内存的几个指针需要重新定义才可以使用，要不然会成为野指针。

// 拓展1:copy 与 retain 的区别
// 拓展2:copy拷贝构造 和 mutableCopy拷贝构造
