import com.cn.EurekaApplicationClient9001;
import com.cn.controller.CController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EurekaApplicationClient9001.class)
public class TestMain {

    @Autowired
    private CController cController;



    @Test
    public void test(){
        System.out.println("1111");
        String str = cController.serverName();
        System.out.println("str:"+str);
    }
}
