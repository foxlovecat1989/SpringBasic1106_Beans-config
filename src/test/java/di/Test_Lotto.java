
package di;

import com.mycompany.springbasic1106.di.Lotto;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Lotto {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beansLotto-config.xml");
    @Test
    public void t1(){
        
        // Singleton
        Lotto lotto1 = ctx.getBean("lotto", Lotto.class);
        System.out.println(lotto1);
        
        Lotto lotto2 = ctx.getBean("lotto", Lotto.class);
        System.out.println(lotto2);
        
        // The result will be the same (isSingleton() return true)
        // Lotto{amount=5, begin=10, end=39, nums=[30, 23, 21, 36, 18]}
        // Lotto{amount=5, begin=10, end=39, nums=[30, 23, 21, 36, 18]}
        // Opossed, the result will be different (isSingleton() return false)
        // Lotto{amount=5, begin=10, end=39, nums=[16, 29, 27, 28, 32]}
        // Lotto{amount=5, begin=10, end=39, nums=[39, 32, 12, 17, 27]}
        ctx.close();
    }
}
