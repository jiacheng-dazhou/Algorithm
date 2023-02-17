package design.strategy;

/**
 * @Author zhoujiacheng
 * @Date 2023-02-15
 **/
public class PrimaryMemberStartegy implements MemberStrategy{

    @Override
    public double calcPrice(double price, int n) {
        return price * n;
    }
}
