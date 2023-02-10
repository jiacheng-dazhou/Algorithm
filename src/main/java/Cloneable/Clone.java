package Cloneable;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author zhoujiacheng
 * @Date 2023-02-09
 **/
@Data
@AllArgsConstructor
public class Clone implements Cloneable{

    private Integer no;
    private String name;
    private CloneSon son;

    @Override
    protected Clone clone() throws CloneNotSupportedException {
        Clone clone = null;
        clone = (Clone) super.clone();
        clone.setSon((CloneSon) clone.getSon().clone());
        return clone;
    }
}
