package Demo;

import java.util.Scanner;

/*
键盘输入一个字符串，并且统计其中各种字符出现的次数  大写，小写，字母，数字，其他

1.定义一个字符串，从键盘输入
2.把字符串转换成char[]数组
3.用for循环实现判别各种字符
 */
public class StringCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String input=sc.next();
        int countUpper=0;
        int countLower=0;
        int countNumber=0;
        int countOther=0;

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch=charArray[i];//当前字符
            if('A'<=ch&&ch<='Z'){
                countUpper++;
            }else if('a'<=ch&&ch<='z'){
                countLower++;
            }else if('0'<=ch&&ch<='9'){
                countNumber++;
            }else {
                countOther++;
            }
        }
        System.out.println("大写出现次数："+countUpper);
        System.out.println("小写出现次数："+countLower);
        System.out.println("数字出现次数："+countNumber);
        System.out.println("其他出现次数："+countOther);
        }






}
