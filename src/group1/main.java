package group1;

public class main {
    public static void main(String[] args) {
        Phone ph1=new Phone();
        Phone ph2=new Phone(7654455,"samsung");
        Phone ph3=new Phone(3344567,"xiaomi",189);
        ph1.sendMessage(7654455,7654455);
        ph2.sendMessage(4567788);
        ph1.receiveCall("BOBY");
        ph1.getNumber();
        ph1.receiveCall("BOBY",3456677);
        System.out.println(ph1);
        System.out.println(ph2);
        System.out.println(ph3);    }
    }

