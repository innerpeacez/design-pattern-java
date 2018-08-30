package composite;


import java.util.ArrayList;

/**
 * Create by zhaihongwei on 2018/3/21
 * 抽象商品类，定义商品的一些特性
 */
public abstract class Good {

    private String name;
    private ArrayList<Good> subGoods = new ArrayList<>();
    protected boolean isLeaf = true; // 是否是叶子节点

    public String getName() {
        return name;
    }

    public Good(String name) {
        this.name = name;
    }

    // 添加下级商品
    public void addSubGood(Good subGood) {
        subGoods.add(subGood);
        isLeaf = false;
    }

    // 删除下级商品
    public void removeSubGood(Good subGood) {
        subGoods.remove(subGood);
    }

    public void showSubInfo() {
        for (Good good : subGoods) {
            System.out.println(good.isLeaf?"商品名称:"+ good.getName() : "商品类目:" + good.getName());
        }
    }
}
