package br.com.arcelino.cepclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CepClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CepClientApplication.class, args);
	}

}
