package com.mycompany.springbasic1106.di;

import org.springframework.beans.factory.FactoryBean;

public class LottoFactory implements FactoryBean<Lotto> {

    @Override
    public Lotto getObject() throws Exception {
        return new Lotto(5, 10, 39);
    }

    @Override
    public Class<?> getObjectType() {
        return Lotto.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

}
