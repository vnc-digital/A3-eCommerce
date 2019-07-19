package com.vnc.nextuple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @author DELL
 *
 */

@SpringBootApplication
@ComponentScan("com.vnc.nextuple")
public class Application {

	public static void main(String args[]) {
		SpringApplication.run(Application.class, args);

	}

}
