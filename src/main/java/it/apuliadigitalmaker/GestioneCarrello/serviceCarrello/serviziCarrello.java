package it.apuliadigitalmaker.GestioneCarrello.serviceCarrello;

import java.util.List;

public interface serviziCarrello {
    List<main.java.it.apuliadigitalmaker.GestioneCarrello.model.Carrello> getAllCarrrelli();
    main.java.it.apuliadigitalmaker.GestioneCarrello.model.Carrello creaCarrello(List<NotaSpesa> listaSpesa);

    main.java.it.apuliadigitalmaker.GestioneCarrello.model.Carrello findCarrelloById(String carr_id);
}
