/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.io.Serializable;

/**
 *
 * @author Dell
 */
public class produit implements Serializable{
       private int id;
       private String nom;
       private float prix;

    public produit() {
    }

    public produit(int id, String nom, float prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
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

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "produit{" + "id=" + id + ", nom=" + nom + ", prix=" + prix + '}';
    }
       
       
    
}
