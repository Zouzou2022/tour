package Adaptor.demo01;
/**
 * 对现有的高电压通过适配器将其转为低电压
 * adaptee（被适配对象）高电压
 * adaptor（适配器）转换器
 * target（目标对象）低电压
 * 被适配对象
 * @author frank
 */
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
