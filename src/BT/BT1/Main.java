package BT.BT1;

public class Main {
    public static void main(String[] args) {
        MyClass myClass=new MyClass("Khanh");
        System.out.println("giá trị ban đầu là: "+myClass.getMyClass());
        myClass.setMyClass("Linh");
        System.out.println("giá trị sau là: "+myClass.getMyClass());
    }
}
