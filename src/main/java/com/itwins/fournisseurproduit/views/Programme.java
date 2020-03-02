/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itwins.fournisseurproduit.views;

import com.itwins.fournisseurproduit.services.Service;





/**
 *
 * @author elmouradiamine98
 */
public class Programme {
    public static void main(String[] args){
        Service service = new Service();
        
        System.out.println(service.findProduitById(2));
        
    }
    
}
