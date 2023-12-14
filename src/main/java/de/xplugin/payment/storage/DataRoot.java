package de.xplugin.payment.storage;

import de.xplugin.payment.domain.Payment;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class DataRoot
{
	private final List<Payment> payments = new ArrayList<>();
}
