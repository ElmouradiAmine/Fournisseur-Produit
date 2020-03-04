/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itwins.fournisseurproduit.repository;

import com.itwins.fournisseurproduit.models.Fournisseur;
import com.itwins.fournisseurproduit.models.Produit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author elmouradiamine98
 */
public class Repository implements IRepository {

    private Connection connection;

    public Repository() {
        init();
    }

    private void init() {
        String url = "jdbc:mysql://localhost:3306/fournisseurProduit?useSSL=false";
        String user = "root";
        String password = "fuckyou?123";

        try {
            connection = DriverManager.getConnection(url, user, password);
            if (connection == null) {
                System.out.println("Failled to connect to database.");
            } else {
                System.out.println("Connected successfully.");
            }

        } catch (SQLException ex) {

            System.out.println("Failled to connect to database.");
            System.out.println(ex.toString());
        }
    }


    @Override
    public Fournisseur findFournisseurById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produit findProduitById(int id) {
        try {
            String query = "SELECT * FROM produits WHERE id = " + id;
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                String description = rs.getString("description");
                int prix = rs.getInt("prix");
                int idFournisseur = rs.getInt("id_fourn");
                
                return new Produit(id, description,prix,idFournisseur);
            }

        } catch (SQLException e) {

        }

        return null;
    }

    @Override
    public List<Fournisseur> findAllFournisseur() {
            List list = new ArrayList<Fournisseur>();
        try {
            String query = "SELECT * FROM fournisseur";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                String ville = rs.getString("ville");

                list.add(new Fournisseur(id, nom,ville));
                
            }
            return list;

        } catch (SQLException e) {
        }
        return null;
    }

    @Override
    public List<Produit> findAllProduit() {
        List<Produit> list = new ArrayList<Produit>();
        try {
            String query = "SELECT * FROM produits";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String description = rs.getString("description");
                int prix = rs.getInt("prix");
                int idFournisseur = rs.getInt("id_fourn");
                list.add(new Produit(id, description,prix,idFournisseur));
                
            }
            return list;

        } catch (SQLException e) {
        }
        return null;
    }

    @Override
    public List<Produit> findAllProduitByIdFournisseur(int idFourn) {
        List<Produit> list = new ArrayList<Produit>();
        try {
            String query = "SELECT * FROM produits WHERE id_fourn =" + idFourn;
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                String description = rs.getString("description");
                int prix = rs.getInt("prix");
                int id = rs.getInt("id");
                list.add(new Produit(id, description,prix,idFourn));
                
            }
            return list;

        } catch (SQLException e) {
        }
        return null;
    
    }

    @Override
    public boolean addProduit(String description, int prix, int id_fourn) {
        try {
            String query = "INSERT  INTO produits(description,id_fourn,prix) VALUES ('" + description + "', " + id_fourn + ", " + prix + " )";
            Statement st = connection.createStatement();
            st.execute(query);

            
            return true;

        } catch (SQLException e) {
            
        }
        return false;

    }

    @Override
    public boolean addFournisseur(String nom, String ville) {
        try {
            String query = "INSERT  INTO fournisseur(nom,ville) VALUES ('" + nom + "', '" + ville + "' )";
            Statement st = connection.createStatement();
            st.execute(query);

            
            return true;

        } catch (SQLException e) {
            
        }
        return false;
    }

    @Override
    public boolean deleteProduit(int id) {
        try {
            String query = "DELETE  FROM produits WHERE id="+id
                    ;
            Statement st = connection.createStatement();
            st.execute(query);

            
            return true;

        } catch (SQLException e) {
            
        }
        return false;
    }

    @Override
    public boolean deleteFournisseur(int id) {
        try {
                String query = "DELETE  FROM fournisseur WHERE id="+id
                        ;
                Statement st = connection.createStatement();
                st.execute(query);


                return true;

            } catch (SQLException e) {

            }
            return false;
        }



}
