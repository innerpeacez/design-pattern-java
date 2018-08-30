package composite;

/**
 * Create by zhaihongwei on 2018/3/21
 * 客户类，相当于测试类
 */
public class Client {

    public static void main(String[] args) {
        // 创建数码产品类目
        DigitalProduct digitalProduct = new DigitalProduct("数码产品");
        // 创建手机类目
        Phone phone = new Phone("手机");
        // 创建相机类目
        Camera camera = new Camera("相机");
        // 添加数码产品的下级目录
        digitalProduct.addSubGood(phone);
        digitalProduct.addSubGood(camera);

        // 创建苹果手机
        IPhone iPhone = new IPhone("苹果手机");
        // 创建小米手机
        XiaoMi xiaoMi = new XiaoMi("小米手机");
        // 添加手机的下级目录
        phone.addSubGood(iPhone);
        phone.addSubGood(xiaoMi);

        System.out.println(digitalProduct.getName()+"是否是叶子节点："+digitalProduct.isLeaf);
        digitalProduct.showSubInfo();
        System.out.println(phone.getName()+"是否是叶子节点："+phone.isLeaf);
        phone.showSubInfo();
        System.out.println(iPhone.getName()+"是否是叶子节点："+iPhone.isLeaf);
        iPhone.showSubInfo();
    }
}
