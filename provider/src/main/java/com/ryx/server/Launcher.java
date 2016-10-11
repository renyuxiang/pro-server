package com.ryx.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2016/10/11.
 */
public class Launcher {
    public static Logger logger = LoggerFactory.getLogger(Launcher.class);
    public static void main(String[] args) {
        logger.info("正在读取配置信息...");
        System.out.println("正在读取配置信息[application-context.xml]...");
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath*:application-context.xml");
        System.out.println("pay平台服务实例启动完毕，请查看日志");
        while (true){
            try {
                Thread.currentThread();
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
