package it.apuliadigitalmaker.GestioneCarrello.serviceProdotti;

import java.util.List;

public interface prodottiService {

    List<main.java.it.apuliadigitalmaker.GestioneCarrello.model.Prodotti> getProdotti();

    void insertProdotto(main.java.it.apuliadigitalmaker.GestioneCarrello.model.Prodotti prodotti);

    void updateProdotto(main.java.it.apuliadigitalmaker.GestioneCarrello.model.Prodotti prodotti);

    void deleteProdotto(String id);

    main.java.it.apuliadigitalmaker.GestioneCarrello.model.Prodotti findProdottoByNome(String nomeProd);
}
