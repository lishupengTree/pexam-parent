package cn.lsp;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lishupeng
 * @create 2017-09-05 下午 10:07
 **/
public class StartUp {
    private final Logger logger =  Logger.getLogger(getClass());

    @SuppressWarnings("resource")
    public void serverBoot() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring/spring-config.xml"});
        context.start();
        logger.info("pexam-service-user startup.");
        while(true){
            try {
                Thread.sleep(300000);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        new StartUp().serverBoot();
    }
}
