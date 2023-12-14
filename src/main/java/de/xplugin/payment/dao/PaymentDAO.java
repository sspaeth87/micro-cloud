package de.xplugin.payment.dao;

import de.xplugin.payment.domain.Payment;
import de.xplugin.payment.storage.MicroStream;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class PaymentDAO {

    public List<Payment> findAll() {
        return MicroStream.root().getPayments();
    }

    public void save(Payment payment) {
        MicroStream.root().getPayments().add(payment);
        MicroStream.storage().store(MicroStream.root().getPayments());
    }
}
