package no.hvl.dat250.jpa.basicexample;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int number;
    private int limit;
    private int balance;

    @ManyToOne
    private Bank bank;

    @OneToOne(mappedBy = "card")
    private final Pin pin = new Pin();
}
