/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itwins.fournisseurproduit.models;

import java.util.Vector;

/**
 *
 * @author elmouradiamine98
 */
public class Produit {
    private int id;
    private String description;
    private int prix;
    private int idFournisseur;

    public Produit(){
        
    }

    public Produit(int id, String description, int prix, int idFournisseur) {
        this.id = id;
        this.description = description;
        this.prix = prix;
        this.idFournisseur = idFournisseur;
    }
    


    public int getId() {
        return id;
    }

    public int getPrix() {
        return prix;
    }

    public int getIdFournisseur() {
        return idFournisseur;
    }

    public void setIdFournisseur(int idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

    
    public void setPrix(int prix) {
        this.prix = prix;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", description=" + description + ", prix=" + prix + '}';
    }
   
    public Vector<Object> toVector(){
        Vector<Object> vector = new Vector<Object>();
        vector.add(id);
        vector.add(description);
        vector.add(prix);
        vector.add(idFournisseur);
        return vector;
    }
    
}
