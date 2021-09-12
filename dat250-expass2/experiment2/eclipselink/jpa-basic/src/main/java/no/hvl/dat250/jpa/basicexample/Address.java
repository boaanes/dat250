package no.hvl.dat250.jpa.basicexample;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;

    @OneToMany(mappedBy = "address")
    private ArrayList<Person> owner = new ArrayList<>();
}
