package com.example.reactive_web_app.services.abstracts;

import com.example.reactive_web_app.models.Invoice;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface InvoiceService {

    Flux<Invoice> findAllInvoices();

    Mono<Invoice> getOneInvoice(Integer id);

}
