package com.spring.skaiciuotuvas;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//TODO:
// SERVLET yra JAVA programa veikianti WEB serveryje.
// SERVLET paleidziamas kaip vartotojas paspaudzia nuoroda, pateikia forma ar atlieka kito tipo veiksmus, WEB svetaineje.
// Kiekviena kliento uzklausa (request) pereina per SERVLET, kuris ji perduoda kontrolerio REQUEST MAPPING atributui.
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(InternetinisSkaiciuotuvasApplication.class);
	}

}
