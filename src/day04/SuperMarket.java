package day04;

public class SuperMarket {
    public static void main(String[] args){
        /*使用new创建一个类的实例/对象（instance/object）
        使用new创建一个类的实例后，类中的定义的每种变量都会被赋予其类型的初始值，和数组一样
        使用一个同类型的对象变量，可以指向并操作这个实例，也跟数组很类似 */

        // 创建一个 Merchandise 实例，存储在内存中的heap中,并用m1指向它
        Merchandise m1 =new Merchandise();
        // 给m1指向的实例进行赋值
        System.out.println(m1.count);  //引用到初始值
        System.out.println(m1.name);
        m1.name="茉莉花茶20包";
        m1.id="00099518";
        m1.count=1000;
        m1.price=99.9;
        System.out.println(m1.count);  //重新赋值

        //创建m2
        Merchandise m2=new Merchandise();
        m2.name="可口可乐 330ml";
        m2.id="000099519";
        m2.count=99;
        m2.price=3.0;
        System.out.println(m2.count); // m1的重新赋值不影响其他新的引用

        // 引用数据类型的赋值，必须是一样的数据类型才能赋值
        Merchandise m3=m1;
        System.out.println(m1);
        System.out.println(m3);
        System.out.println(m3.name);
        m1.name="菊花茶20包";
        System.out.println(m3.name);  //m1的重新赋值，m3也改变了，因为他们指向同一个对象实例


    }
}
