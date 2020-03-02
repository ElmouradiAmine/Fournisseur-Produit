/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itwins.fournisseurproduit.controllers;

import com.itwins.fournisseurproduit.models.Produit;
import com.itwins.fournisseurproduit.services.Service;
import java.util.List;

/**
 *
 * @author elmouradiamine98
 */
public class Controller {
    
    Service service;
    
    public Controller(){
        service = new Service();
    }
    
    public List processRequest(int numeroRequest, int idFournisseur){
        List list = null;
        switch(numeroRequest){
            case 1:
                list = service.findAllProduit();
                break;
            case 2:
                list = service.findAllProduitByIdFournisseur(idFournisseur);
                break;
            case 3:
                list = service.findAllFournisseur();
                System.out.println(list);
                break;
                
            }
        
        return list;
    }
    
    public List processRequest(int numeroRequest, String description, int prix, int idFourn ){
        switch(numeroRequest){
            case 4:
                service.addProduit(description, prix, idFourn);
                break;
            }
        return null;
    }
    
    public List processRequest(int numeroRequest, String nom, String ville ){
        switch(numeroRequest){
            case 5:
                service.addFournisseur(nom, ville);
                break;
            }
        return null;
    }
    
}
