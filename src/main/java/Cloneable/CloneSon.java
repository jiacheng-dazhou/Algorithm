package Cloneable;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author zhoujiacheng
 * @Date 2023-02-10
 **/
@Data
@AllArgsConstructor
public class CloneSon implements Cloneable{
    private Integer no;
    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
