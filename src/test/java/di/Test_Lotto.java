
package di;

import com.mycompany.springbasic1106.di.Lotto;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Lotto {
    
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beansLotto-config.xml");
    
    @Test
    public void t1(){
        
        // Singleton
        // The result will be the same (isSingleton() return true)
        // Lotto{amount=5, begin=10, end=39, nums=[30, 23, 21, 36, 18]}
        // Lotto{amount=5, begin=10, end=39, nums=[30, 23, 21, 36, 18]}
        // Opossed, the result will be different (isSingleton() return false)
        // Lotto{amount=5, begin=10, end=39, nums=[16, 29, 27, 28, 32]}
        // Lotto{amount=5, begin=10, end=39, nums=[39, 32, 12, 17, 27]}
        Lotto lotto1 = ctx.getBean("lotto", Lotto.class);
        System.out.println("Lotto1: " + lotto1);
        
        Lotto lotto2 = ctx.getBean("lotto", Lotto.class);
        System.out.println("Lotto2: " + lotto2);
        
        
        // scope="prototype"
        // the result will be different
        // LottoA: Lotto{amount=5, begin=1, end=39, nums=[24, 31, 21, 15, 38]}
        // LottoB: Lotto{amount=5, begin=1, end=39, nums=[37, 32, 18, 39, 14]}
        Lotto lottoA = ctx.getBean("lottoA", Lotto.class);
        System.out.println("LottoA: " + lottoA);
        
        Lotto lottoB = ctx.getBean("lottoB", Lotto.class);
        System.out.println("LottoB: " + lottoB);
        
        // ---------------------------------------------------------------------
        
        Lotto lottoC = ctx.getBean("lottoC", Lotto.class);
        System.out.println("LottoC: " + lottoC);

        ctx.close();
    }
}
