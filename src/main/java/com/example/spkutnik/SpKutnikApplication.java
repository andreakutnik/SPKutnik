package com.example.spkutnik;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.difexample.ClientComponent;
import com.difexample.SingletonComponent;
import com.difexample.TransientComponent;

@SpringBootApplication(scanBasePackages = {"com.example.spkutnik", "com.difexample"})
public class SpKutnikApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(SpKutnikApplication.class, args);
        TransientComponent transientBean =
                context.getBean(TransientComponent.class);
        transientBean.operation();
        transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();
        SingletonComponent singletonBean =
                context.getBean(SingletonComponent.class);
        singletonBean.operation();
        singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();
        ClientComponent c = context.getBean(ClientComponent.class);
        c.operation();
        c = (ClientComponent)context.getBean("clientComponent");
        c.operation();
    }
}
