package thegreychain.springframework.springdidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import thegreychain.springframework.springdidemo.controller.MyController;

@SpringBootApplication
public class SpringDiDemoApplication {

    public static void main(String[] args) {


        ApplicationContext context =  SpringApplication.run(SpringDiDemoApplication.class, args);

        MyController controller = (MyController) context.getBean("myController");

        controller.hello();

    }

}
