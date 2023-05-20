package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* 
 definindo os arquivos a serem lidos para o funcionamento do programa
 deixando explicito os packages a serem scaneados
@SpringBootApplication(
	scanBasePackages = {"com.luv2code.springcoredemo",
						"util"}
)
*/
@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
