package Adaptor.demo02;

import java.util.ArrayList;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        testDuck(mallardDuck);
        System.out.println("---------------------------------");
        //没有鸭子，只有火鸡，对火鸡做适配，让他符合鸭子的行为
        Turkey wildTurkey = new WildTurkey();
        TurkeyAdaptor turkeyAdaptor = new TurkeyAdaptor(wildTurkey);
        testDuck(turkeyAdaptor);
        ArrayList<Object> objects = new ArrayList<>();
        Vector<Object> objects1 = new Vector<>();

    }

    public static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
