package com.example.reactive_web_app;

import com.example.reactive_web_app.models.Invoice;
import com.example.reactive_web_app.repositories.InvoiceRepository;
import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@SpringBootApplication
public class ReactiveWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveWebAppApplication.class, args);
	}

	// TODO - этот код выполнился - я его закомментировала, чтобы он
	// TODO - не выполнился еще раз при перезапуске приложения
//	@Bean
//	CommandLineRunner runner(InvoiceRepository invoiceRepository) {
//		return args -> {
//			Invoice inv_1 = new Invoice(1, "InvOne", "one", 3.4);
//			Invoice inv_2 = new Invoice(2, "InvTwo", "two", 5.3);
//			Invoice inv_3 = new Invoice(3, "InvThree", "three", 1.5);
//			Invoice inv_4 = new Invoice(4, "InvFour", "four", 8.4);
//			Invoice inv_5 = new Invoice(5, "InvFive", "five", 4.4);
//
//			invoiceRepository.insert(inv_1).block();
//			invoiceRepository.insert(inv_2).block();
//			invoiceRepository.insert(inv_3).block();
//			invoiceRepository.insert(inv_4).block();
//			invoiceRepository.insert(inv_5).block();
//
//		};
//	}

}
