package com.spring.skaiciuotuvas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Springboot anotacija, yra lygi @Configuration @EnableAutoConfiguration ir @ComponentScan
// Si anotacija nurodama klaseje turincioje pagrindini main metoda.
@SpringBootApplication
public class InternetinisSkaiciuotuvasApplication {

	public static void main(String[] args) {

		// Programos kontrole deleguojama, statiniam klases metodui RUN
		//nurodant Aplikacijos šakninį komponentą (ROOT).
		//SPRING karkasas paleis aplikaciją, t.y. startas TomCat serveryje.
		SpringApplication.run(InternetinisSkaiciuotuvasApplication.class, args);
	}

}
