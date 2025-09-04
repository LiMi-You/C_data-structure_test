#include <stdio.h>
#include <windows.h>

int leap(int year){
    if ( (year%4 == 0 && year%100 != 0 )|| (year%400 == 0) ){
        return 1;
    }
    else{
        return 0;
    }
    
}

int main(){
    SetConsoleOutputCP(65001);  // 设置控制台输出为 UTF-8
    int year;
    
    printf("请输入一个数：");
    scanf("%d",&year);
    if(leap(year)){
        printf("是");
    }
    else
    {
        printf("是");
    }
    return 0;
}


// 处理C/C++编码输出乱码
// 方式一：切换编码
// 方式二：
// 添加头文件
// #include <windows.h>
// 下面这个放到main里面
// SetConsoleOutputCP(65001);  // 设置控制台输出为 UTF-8