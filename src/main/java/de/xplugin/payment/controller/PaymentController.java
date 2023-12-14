package de.xplugin.payment.controller;

import de.xplugin.payment.dao.PaymentDAO;
import de.xplugin.payment.domain.Payment;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

import java.util.List;

@Controller
public class PaymentController {
    @Inject
    PaymentDAO paymentDAO;

    @Get
    public HttpResponse<List<Payment>> findAll() {
        return HttpResponse.ok(paymentDAO.findAll());
    }

    @Post
    public HttpResponse<String> create(@Body Payment payment) {
        paymentDAO.save(payment);
        return HttpResponse.created("created");
    }
}
