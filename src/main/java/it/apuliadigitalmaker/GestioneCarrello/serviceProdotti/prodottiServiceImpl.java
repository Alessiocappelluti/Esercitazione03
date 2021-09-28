package it.apuliadigitalmaker.GestioneCarrello.serviceProdotti;


import it.apuliadigitalmaker.GestioneCarrello.repository.prodottiRepository;
import it.apuliadigitalmaker.GestioneCarrello.serviceProdotti.prodottiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class prodottiServiceImpl implements prodottiService {
    private final prodottiRepository prodottiRepsository;

    public prodottiServiceImpl(prodottiRepository prodottiRepsository) {
        this.prodottiRepsository = prodottiRepsository;
    }


    @Override
    public List<main.java.it.apuliadigitalmaker.GestioneCarrello.model.Prodotti> getProdotti() {
        return this.prodottiRepsository.findAll();
    }

    @Override
    public void insertProdotto(main.java.it.apuliadigitalmaker.GestioneCarrello.model.Prodotti prodotti) {
        this.prodottiRepsository.save(prodotti);
    }

    @Override
    public void updateProdotto(main.java.it.apuliadigitalmaker.GestioneCarrello.model.Prodotti prodotti) {
        if(this.findProdottoByNome(prodotti.getNomeProd()).equals(prodotti))
           prodottiRepsository.save(prodotti);
        else
            log.error("Prodotto da aggiornare {} non trovato nel db ", prodotti.getNomeProd());
    }

    @Override
    public void deleteProdotto(String id){
    prodottiRepsository.deleteById(id);
    }

    @Override
    public main.java.it.apuliadigitalmaker.GestioneCarrello.model.Prodotti findProdottoByNome(String nomeProd) {
        return prodottiRepsository.findProdottoByNome(nomeProd);
    }
}
