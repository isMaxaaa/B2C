import com.max.b2c.item.ItemsApplication;
import com.max.b2c.item.dao.ProductSpecsDao;
import com.max.b2c.item.service.CategoryService;
import com.max.b2c.item.service.ServiceImp.CategoryServiceImp;
import com.max.b2c.model.ProductSpecsValue;
import io.swagger.annotations.ApiImplicitParam;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
import redis.clients.jedis.JedisPool;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ItemsApplication.class)
public class thread {

    @Autowired
    CategoryServiceImp categoryServiceImp;

    @Autowired
    ProductSpecsDao productSpecsDao;

//    @Autowired
//    @Qualifier("jedisPool")
//    JedisPool jedisPool;

    @Test
    public void Test() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"准备获取categoryService");
                categoryServiceImp.Getcategorys();
                System.out.println(Thread.currentThread().getName()+"获取到categoryService");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"准备获取categoryService");
                categoryServiceImp.Getcategorys();
                System.out.println(Thread.currentThread().getName()+"获取到categoryService");
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();

    }

    @Test
    public void TestInsert(){
        List<ProductSpecsValue> specsValueList=new ArrayList<>();

        ProductSpecsValue specsValue1=new ProductSpecsValue();
        specsValue1.setProduct_id(1);
        specsValue1.setIs_sku(1);
        specsValue1.setSpecs_value("aa");
        specsValue1.setSpecs_id(1);
        specsValueList.add(specsValue1);
        ProductSpecsValue specsValue2=new ProductSpecsValue();
        specsValue2.setProduct_id(1);
        specsValue2.setIs_sku(1);
        specsValue2.setSpecs_value("bb");
        specsValue2.setSpecs_id(1);
        specsValueList.add(specsValue2);
        ProductSpecsValue specsValue3=new ProductSpecsValue();
        specsValue3.setProduct_id(1);
        specsValue3.setIs_sku(1);
        specsValue3.setSpecs_value("cc");
        specsValue3.setSpecs_id(1);
        specsValueList.add(specsValue3);

        int i = productSpecsDao.insertSpecs(specsValueList);



    }
}
