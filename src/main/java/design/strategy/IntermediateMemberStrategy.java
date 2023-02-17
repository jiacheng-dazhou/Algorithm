package design.strategy;

/**
 * @Author zhoujiacheng
 * @Date 2023-02-15
 **/
public class IntermediateMemberStrategy implements MemberStrategy{

    @Override
    public double calcPrice(double price, int n) {
        double money = (price * n) - price * n * 0.1;
        return money;
    }
}
