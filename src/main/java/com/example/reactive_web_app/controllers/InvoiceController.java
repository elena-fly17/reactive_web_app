package com.example.reactive_web_app.controllers;

import com.example.reactive_web_app.models.Invoice;
import com.example.reactive_web_app.services.abstracts.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    @Autowired
    InvoiceService invoiceService;

    @GetMapping("/allInvoices")
    public Flux<Invoice> getAllInvoices(){
        return invoiceService.findAllInvoices();
    }

    @GetMapping("/get/{id}")
    public Mono<Invoice> getOneInvoice(@PathVariable Integer id){
        return invoiceService.getOneInvoice(id);
    }

}
