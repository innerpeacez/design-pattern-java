package proxy;


/**
 * Create by zhaihongwei on 2018/3/17
 * 测试类
 */
public class ProxyTest {

    public static void main(String[] args) {

        Client client = new Client(new Object());
        client.getMethod();
        System.out.println("-----------------------------------");
        Client client2 = new Client(new Proxy());
        client2.getMethod();
    }
}
