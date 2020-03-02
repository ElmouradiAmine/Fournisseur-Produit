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
public class Fournisseur {
    private int id;
    private String nom;
    private String ville;

    public Fournisseur(int id, String nom, String ville) {
        this.id = id;
        this.nom = nom;
        this.ville = ville;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return nom;
    }
    
    
        public Vector<Object> toVector(){
        Vector<Object> vector = new Vector<Object>();
        vector.add(id);
        vector.add(nom);
        vector.add(ville);
        return vector;
    }
    
    
}
