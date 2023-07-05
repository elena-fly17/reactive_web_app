package com.example.reactive_web_app.services.impl;

import com.example.reactive_web_app.models.Invoice;
import com.example.reactive_web_app.repositories.InvoiceRepository;
import com.example.reactive_web_app.services.abstracts.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    InvoiceRepository invoiceRepository;

    @Override
    public Flux<Invoice> findAllInvoices() {
        return invoiceRepository.findAll();
    }

    @Override
    public Mono<Invoice> getOneInvoice(Integer id) {
        return invoiceRepository.findById(id);
    }

}
