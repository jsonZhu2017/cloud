import com.cn.EurekaApplicationServer7001;
import com.cn.controller.AController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EurekaApplicationServer7001.class)
public class TestMain {

    @Autowired
    private AController aController;

    @Test
    public void test(){
        System.out.println("1111");
        String str = aController.serverName();
        System.out.println("str:"+str);
    }
}
