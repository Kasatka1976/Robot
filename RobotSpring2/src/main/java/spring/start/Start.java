package spring.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.impls.robot.ModelT1000;
import spring.impls.sony.SonyHand;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AplicationContext.xml");

        //SonyHand modelSonyHand = (SonyHand) context.getBean("sonyHand");
       // modelSonyHand.catchSomething();
        ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
//        t1000.dance();
//        t1000.action();
    }
}
