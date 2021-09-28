package it.apuliadigitalmaker.GestioneCarrello.config;

import it.apuliadigitalmaker.GestioneCarrello.model.NotaSpesa;
import it.apuliadigitalmaker.GestioneCarrello.repository.carrelloRepository;
import it.apuliadigitalmaker.GestioneCarrello.repository.prodottiRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
public class prodottoConfig {
    @Bean
    CommandLineRunner commandLineRunner(prodottiRepository repository, carrelloRepository carrello) {
        return args -> {
            main.java.it.apuliadigitalmaker.GestioneCarrello.model.Prodotti prod1 = new main.java.it.apuliadigitalmaker.GestioneCarrello.model.Prodotti("1", "libro", 15.50F,"cancelleria");
            main.java.it.apuliadigitalmaker.GestioneCarrello.model.Prodotti prod2 = new main.java.it.apuliadigitalmaker.GestioneCarrello.model.Prodotti("2", "quaderno", 25F,"cancelleria");

        List<NotaSpesa> lista1 = new ArrayList<>();
        lista1.add(new NotaSpesa(prod1, 3));
        lista1.add(new NotaSpesa(prod2, 5));

        List<NotaSpesa> lista2 = new ArrayList();
        lista2.add(new NotaSpesa(prod1, 1));
        lista2.add(new NotaSpesa(prod2, 2));

        Date data1 = new Date();
        Date data2 = new Date();

        main.java.it.apuliadigitalmaker.GestioneCarrello.model.Carrello carrello1 = new main.java.it.apuliadigitalmaker.GestioneCarrello.model.Carrello("carr1",lista1, data1, 171.5F);
        main.java.it.apuliadigitalmaker.GestioneCarrello.model.Carrello carrello2 = new main.java.it.apuliadigitalmaker.GestioneCarrello.model.Carrello("carr2",lista2, data2, 65.50F);

        List<main.java.it.apuliadigitalmaker.GestioneCarrello.model.Carrello> temp1 =  new ArrayList<>();
        temp1.add(carrello1);
        temp1.add(carrello2);
            carrello.deleteAll();
            carrello.saveAll(temp1);

        List<main.java.it.apuliadigitalmaker.GestioneCarrello.model.Prodotti> temp =  new ArrayList<>();
        temp.add(prod1);
        temp.add(prod2);
        repository.deleteAll();
        repository.saveAll temp);
        };
    }
}
