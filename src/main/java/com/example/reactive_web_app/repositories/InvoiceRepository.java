package com.example.reactive_web_app.repositories;

import com.example.reactive_web_app.models.Invoice;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface InvoiceRepository extends ReactiveMongoRepository<Invoice, Integer> {

}
