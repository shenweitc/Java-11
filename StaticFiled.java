package Demo;

public class StaticFiled {
    public static void main(String[] args) {
        Student one=new Student("一号",19);
        Student two=new Student("二号",16);
        one.room="101教室";
        System.out.println("姓名："+one.getName()+"  年龄："+one.getAge()+"  教室："+one.room);
        System.out.println("姓名："+two.getName()+"  年龄："+two.getAge()+"  教室："+two.room);
     }
}
