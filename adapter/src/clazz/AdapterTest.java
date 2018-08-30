package clazz;

/**
 * Create by zhaihongwei on 2018/3/15
 */
public class AdapterTest {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.targetMethod();
    }
}
