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
    private int balance;
    private int limit;

    private Person person;

    private Bank bank;
}
