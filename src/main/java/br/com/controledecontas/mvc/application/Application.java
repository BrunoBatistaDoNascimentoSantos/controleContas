package br.com.controledecontas.mvc.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
 
@SpringBootApplication
@EntityScan(basePackages = { "br.com.controledecontas.mvc.entity"})
@EnableJpaRepositories(basePackages = {"br.com.controledecontas.mvc.contaRepository" })
@ComponentScan(basePackages = {"br.com.controledecontas.mvc.controller"})
public class Application {
      public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
      }
}