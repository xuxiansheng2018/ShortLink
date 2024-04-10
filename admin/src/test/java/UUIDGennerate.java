import cn.hutool.core.lang.UUID;
import org.junit.jupiter.api.Test;

/**
 * @Author xuguozhu
 * @Create 2024/4/10 14:11
 * Level:
 * Description:
 */

/**
 * 生成UUID测试
 */
public class UUIDGennerate {
    @Test
    public void test(){
        String s = UUID.fastUUID().toString(true);
        System.out.println("s = " + s);


        String s1 = UUID.randomUUID().toString(true);
        System.out.println("s1 = " + s1);
        ;
    }
}
