package it.apuliadigitalmaker.GestioneCarrello.serviceCarrello;

import it.apuliadigilalmaker.GestioneCarrello.model.Carrello;
import it.apuliadigilalmaker.GestioneCarrello.model.NotaSpesa;
import it.apuliadigilalmaker.GestioneCarrello.repository.carrelloRepository;
import it.apuliadigitalmaker.GestioneCarrello.repository.carrelloRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class serviziCarrelloImpl implements serviziCarrello {
    public final it.apuliadigitalmaker.GestioneCarrello.repository.carrelloRepository carrelloRepository;

    public serviziCarrelloImpl(it.apuliadigilalmaker.GestioneCarrello.repository.carrelloRepository carrelloRepository) {
        this.carrelloRepository = carrelloRepository;
    }


    @Override
    public List<main.java.it.apuliadigitalmaker.GestioneCarrello.model.Carrello> getAllCarrrelli() {
        return this.carrelloRepository.findAll();
    }

    @Override
    public main.java.it.apuliadigitalmaker.GestioneCarrello.model.Carrello creaCarrello(List<NotaSpesa> listaSpesa) {

        Date data = new Date();

        long prezzoTot;

        Integer quantita = listaSpesa.stream()
                .mapToInt(p -> p.getQuantita())
                .sum();


        prezzoTot = listaSpesa.stream()
                .mapToLong(p->(long)(p.getQuantita() * p.getProdotto().getPrezzo())).sum();

        main.java.it.apuliadigitalmaker.GestioneCarrello.model.Carrello carrello = new main.java.it.apuliadigitalmaker.GestioneCarrello.model.Carrello(listaSpesa, data, (float) prezzoTot);
        return carrelloRepository.save(carrello);
    }

    @Override
    public
    findCarrelloById(String carr_id) {
        return null;
    }
}
