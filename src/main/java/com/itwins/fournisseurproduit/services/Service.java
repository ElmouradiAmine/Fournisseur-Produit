/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itwins.fournisseurproduit.services;

import com.itwins.fournisseurproduit.models.Fournisseur;
import com.itwins.fournisseurproduit.models.Produit;
import com.itwins.fournisseurproduit.repository.Repository;
import java.util.List;

/**
 *
 * @author elmouradiamine98
 */
public class Service {
    
    Repository repository;

    public Service() {
        this.repository = new Repository();
    }
    
    public Produit findProduitById(int id){
        return repository.findProduitById(id);
    }
    
    public Fournisseur findFournisseurById(int id){
        return repository.findFournisseurById(id);
    }
    
    public List<Produit> findAllProduit(){
        return repository.findAllProduit();
    }
    
    public List<Fournisseur> findAllFournisseur(){
        return repository.findAllFournisseur();
    }
    
    public List<Produit> findAllProduitByIdFournisseur(int idFourn){
        return repository.findAllProduitByIdFournisseur(idFourn);
    }

    public boolean addProduit(String description, int prix, int idFourn){

        return repository.addProduit(description, prix, idFourn);
        
    }
    
    public boolean addFournisseur(String nom, String ville){
        return repository.addFournisseur(nom, ville);
    }
    
    
}
