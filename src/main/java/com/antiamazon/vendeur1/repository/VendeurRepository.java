package com.antiamazon.vendeur1.repository;

import com.antiamazon.vendeur1.entity.Vendeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendeurRepository extends JpaRepository<Vendeur, Integer> {

    Vendeur findVendeurById(int id);
    Vendeur findVendeurByNomSociete(String nom_societe);

}
