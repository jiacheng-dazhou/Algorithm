package design.strategy;

/**
 * @Author zhoujiacheng
 * @Date 2023-02-15
 **/
public class MemberContext {
    private MemberStrategy memberStrategy;

    public MemberContext(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }

    // 计算价格
    public double qoutePrice(double goodsPrice, int n){
        // 通过接口变量调用对应的具体策略
        return memberStrategy.calcPrice(goodsPrice, n);
    }


}
