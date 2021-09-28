package it.apuliadigitalmaker.GestioneCarrello.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface carrelloRepository extends MongoRepository<main.java.it.apuliadigitalmaker.GestioneCarrello.model.Carrello, String> {

    @Query ("{'carr_id': ?0}")
    main.java.it.apuliadigitalmaker.GestioneCarrello.model.Carrello findCarrelloById(String carr_id );
}
