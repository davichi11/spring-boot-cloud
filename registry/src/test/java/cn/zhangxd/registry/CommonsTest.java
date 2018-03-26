package cn.zhangxd.registry;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ChunLiang Hu
 * @Company
 * @Project spring-boot-cloud
 * @Package cn.zhangxd.registry
 * @Description TODO(描述)
 * @create 2018/3/26-09:40
 */
//@RunWith(SpringJUnit4ClassRunner.class)
public class CommonsTest {
    @Test
    public void test() {
        System.out.println(threadTest());
    }


    private String threadTest() {
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 20; i++) {
            service.submit(() -> System.out.println(Thread.currentThread().getName() + "正在运行"));
        }
        //try {
        //    Thread.sleep(10000);
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}
        return "success";
    }
}
