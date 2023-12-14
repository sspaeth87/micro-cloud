package de.xplugin.payment.domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Payment {
    private String firstname;

    private String lastname;

    private BigDecimal value;
}
