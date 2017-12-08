package com.jmoreira.springframework.didemo;

import com.jmoreira.springframework.didemo.controllers.ConstructorInjectedController;
import com.jmoreira.springframework.didemo.controllers.GetterInjectedController;
import com.jmoreira.springframework.didemo.controllers.MyController;
import com.jmoreira.springframework.didemo.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println(ctx.getBean(MyController.class).hello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
	}
}
