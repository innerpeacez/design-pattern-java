package obj;

/**
 * Create by zhaihongwei on 2018/3/15
 * 这是适配器类，将已有的Adaptee类中的方法适配给目标接口
 */
public class Adapter implements Target{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void targetMethod() {
        adaptee.adapteeMethod();
    }
}
