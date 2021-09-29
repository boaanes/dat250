package no.hvl.dat250.jpa.basicexample;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Data
public class Pin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int pinCode;
    private int count;

    @OneToOne(mappedBy = "pin")
    private final CreditCard card = new CreditCard();
}
