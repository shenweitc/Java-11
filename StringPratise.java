package Demo;
/*
定义一个方法，把数组{1，2，3}按照指定格式拼接成一个字符串。格式：【word1#word2#word3】

1.定义一个int[]数组
2.定义方法，实现把数组转换字符串
3.格式需要用的：for循环，字符串拼接，每一个前面的word，是否最后一个
4.调用方法，得到返回值，打印
 */


public class StringPratise {
    public static void main(String[] args) {
        int[] array={1,2,3};
        System.out.println(fromArrayToString(array));
    }

    public static String fromArrayToString(int[] array) {
        String str="[";
        for (int i = 0; i < array.length; i++) {           // 遍历数组
            if(i==array.length-1){                         // 判断是否最后一个
                str+="word"+array[i]+"]";
            }else {
                str+="word"+array[i]+"#";
            }
         }
        return str;

    }
}
