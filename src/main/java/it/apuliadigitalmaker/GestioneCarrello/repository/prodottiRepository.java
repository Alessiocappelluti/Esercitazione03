package it.apuliadigitalmaker.GestioneCarrello.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface prodottiRepository extends MongoRepository<main.java.it.apuliadigitalmaker.GestioneCarrello.model.Prodotti, String> {
        @Query("{ 'nomeProd' :?0 }")
        main.java.it.apuliadigitalmaker.GestioneCarrello.model.Prodotti findProdottoByNome(String nomeProd);
}
