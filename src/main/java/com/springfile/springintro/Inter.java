package com.springfile.springintro;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Inter implements InitializingBean, DisposableBean {
    public int version;
    public String name;

    @Override
    public void destroy() throws Exception {
        System.out.println("This is the destruction of the bean!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("This is the initialization of the bean!");

    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
