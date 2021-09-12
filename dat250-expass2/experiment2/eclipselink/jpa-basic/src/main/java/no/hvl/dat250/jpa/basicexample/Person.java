package no.hvl.dat250.jpa.basicexample;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private final ArrayList<Address> address = new ArrayList<>();

    private ArrayList<CreditCard> cards;
}
