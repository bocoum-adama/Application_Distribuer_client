/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import metier.produit;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Dell
 */
public interface ProduitInterface extends Remote{
    public String VerifierProduit(String nom)throws RemoteException;
        public List<String> afficherProduits()throws RemoteException;

}
