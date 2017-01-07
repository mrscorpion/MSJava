//
//  ViewController.m
//  深拷贝和浅拷贝
//
//  Created by ms on 2017/1/7.
//  Copyright © 2017年 mrscorpion. All rights reserved.
//  NSString中为什么用copy？
/*
一般我们将对象声明为NSString类型时，都不希望它改变，所以大多数情况下，使用copy，以免因可变字符串的修改导致一些非预期问题。
*/

#import "ViewController.h"

@interface ViewController ()
@property (nonatomic, strong) NSString *strongString;
@property (nonatomic, copy) NSString *copString;
@property (nonatomic, strong) NSMutableString *strongStringM;
@property (nonatomic, copy) NSMutableString *copStringM;
@end

@implementation ViewController
- (void)viewDidLoad
{
    [super viewDidLoad];
    NSString *str = @"mr";
    self.strongString = str;
    self.copString = str;
    NSLog(@"str => %p, strong => %p, copy => %p", str, self.strongString, self.copString);
    // str => 0x10fc42078, strong => 0x10fc42078, copy => 0x10fc42078
    
    NSMutableString *strM = [NSMutableString stringWithFormat:@"hh"];
    self.strongStringM = strM;
    self.copStringM = strM;
    NSLog(@"strM => %p, strongM => %p, copyM => %p", strM, self.strongStringM, self.copStringM);
    // strM => 0x600000268180, strongM => 0x600000268180, copyM => 0xa000000000068682
}


- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
}
@end
