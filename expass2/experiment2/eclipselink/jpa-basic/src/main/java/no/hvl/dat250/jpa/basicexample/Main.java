package no.hvl.dat250.jpa.basicexample;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {
    private static final String PERSISTENCE_UNIT_NAME = "todos";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        // read the existing entries and write to console

        //persistence
        em.getTransaction().begin();

        Person person = new Person();
        Address address = new Address();
        Pin pin = new Pin();
        Bank bank = new Bank();
        CreditCard card = new CreditCard();

        person.setName("Bob");

        address.setStreet("Gaten");
        address.setNumber(10);
        address.getOwners().add(person);

        pin.setPinCode(5432);
        pin.setCount(3);

        bank.setName("Norges bank");

        card.setBank(bank);
        card.setNumber(1234);
        card.setBalance(1000000);
        card.setLimit(10);
        card.setPerson(person);
        card.setPin(pin);

        em.persist(person);
        em.persist(address);
        em.persist(pin);
        em.persist(bank);
        em.persist(card);

        em.getTransaction().commit();
    }
}
