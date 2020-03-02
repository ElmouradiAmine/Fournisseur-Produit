/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itwins.fournisseurproduit.repository;

import com.itwins.fournisseurproduit.models.Fournisseur;
import com.itwins.fournisseurproduit.models.Produit;
import java.util.List;

/**
 *
 * @author elmouradiamine98
 */
public interface IRepository {
    
    public Fournisseur findFournisseurById(int id);
    public Produit findProduitById(int id);
    public List<Fournisseur> findAllFournisseur();
    public List<Produit> findAllProduitByIdFournisseur(int idFourn);
    public List<Produit> findAllProduit();
    public boolean addProduit(String description,int prix, int id_fourn);
    public boolean addFournisseur(String nom, String ville);
        

    
}
