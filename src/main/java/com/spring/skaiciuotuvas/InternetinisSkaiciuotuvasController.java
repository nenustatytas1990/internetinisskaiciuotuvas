package com.spring.skaiciuotuvas;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
//WEB kontroleris leidzia viduje naudoti @RequestMappping.
//@RestController anatoacija nurodo, jo pvz.: String tipo rezultatas turetu buti isspausdintas toks koks yra.

@RestController
//Zymi konfiguracijos komponenta viduje leidzia kurti BEAN per metodus su @Bean anotacija.
// Si klases lygio anotacija nurodo Spring karkasui "Atspeti" konfiguracija.
//Remiantis priklausomobybemis (JAR bibliotekomis) kurias programuotojas itraukia i projekta (pom.xml).
//Siuo atveju ji veikia kartu su Main metodu.
@EnableAutoConfiguration
public class InternetinisSkaiciuotuvasController {
    @RequestMapping(method = RequestMethod.GET, value = "/skaiciuoti")
    //RequestParam anotacija perduoda siuo atveju per URL duomenis (skaiciai, operacijos zenklas) kurie patalpinami i sarasa (raktas, reiksme).
    //Pirmas String`as yra raktas (SK1,SK2), antras String`as reiksme (8,5,+)
    //Raktai Forntend tiek Backend turi sutapri !!!
    //URL pavizdys: http://localhost:8080/skaiciuoti?sk1=2&sk2=3&zenklas=*
    public String skaiciuoti(@RequestParam HashMap <String, String> skaiciai) {

        //per URL perduodamas raktas, turi pavadinima SK1 (kintamasis).
        //pagal rakta SK1 istraukiama reiksme. PVZ. ivede skaiciu 8
        //vadinasi mums reikia is String konvertuoti i int`a kad paskaiciuotu rezultata.
        int sk1 = Integer.parseInt(skaiciai.get("sk1"));
        int sk2 = Integer.parseInt(skaiciai.get("sk2"));
        double suma = 0;
        String zenklas = skaiciai.get("zenklas");

        if (zenklas.equals("+")){
            suma = sk1 + sk2;
        } else if (zenklas.equals("-")){
            suma = sk1 - sk2;
        } else if (zenklas.equals("*")){
            suma = sk1 * sk2;
        } else if (zenklas.equals("/")) {
            suma = sk1 / sk2;

        }
        return sk1 + " " + zenklas + " " + sk2 +"  = " +suma;


        //ApplicationContext yra interfeisas skirtas suteikti informacija apie aplikacijos konfiguracija
        //siuo atveju naudojama configuracija paiimama is xml failo.
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        //BEAN- klases objektas kuris atitinka SINGLETON sablona.
        //HelloWorld bean = (HelloWorld) applicationContext.getBean("helloWorld");
        //return bean.getHello();




        /*
        return " |======> Internetinis skaičiuotuvas <======| <p>" +
                "<b>Galimos operacijos:</b><br>" +
                "<li>&nbsp;&nbsp; sudėti </br></li>" +
                "<li>&nbsp;&nbsp; dauginti </br></li>" +
                "<li>&nbsp;&nbsp; dalinti </br></li>" +
                "<li>&nbsp;&nbsp; atimti </br></li></p>";
       */


    }



}
