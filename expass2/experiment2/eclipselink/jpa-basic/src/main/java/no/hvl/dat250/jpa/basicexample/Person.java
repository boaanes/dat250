package no.hvl.dat250.jpa.basicexample;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "person")
    private final List<CreditCard> cards = new ArrayList<>();

    @ManyToMany(mappedBy = "owners")
    private final List<Address> addresses = new ArrayList<>();
}
