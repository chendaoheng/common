import com.skill.base.poiutils.Boss;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * <p>description</p>
 *
 * @author chendaoheng
 * @date 2019/11/20 12:28
 */

public class BossTest {
    @Test
    public void test() {
        Boss myBoss1 = Boss.getInstance();
        System.out.println(myBoss1.toString());
        Boss myBoss2 = Boss.getInstance();
        System.out.println(myBoss2.toString());
        System.out.println(myBoss1 == myBoss2);
    }

    @Test
    public void testForEachLambda() {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        num.forEach(n -> {
            if (n == 3) {
                return;
            }
            System.out.println(n);
        });
    }
}
