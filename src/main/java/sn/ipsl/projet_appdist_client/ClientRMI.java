/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ipsl.projet_appdist_client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.produit;
import rmi.ProduitInterface;

/**
 *
 * @author Dell
 */
public class ClientRMI {

    public ClientRMI() {
    }

    public String consulter(String nom) {
        try {
            ProduitInterface stub = (ProduitInterface) Naming.lookup("rmi://localhost:1099/RK");
            return "Il vous reste dans votre stock : " + stub.VerifierProduit(nom) + " " + nom;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    
     public List<String> afficher() {
        try {
            ProduitInterface stub = (ProduitInterface) Naming.lookup("rmi://localhost:1099/RK");
            System.out.println(stub.afficherProduits());
            return stub.afficherProduits();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
//    public static void main(String[] args) {
//
//        try {
//            ProduitInterface stub = (ProduitInterface) Naming.lookup("rmi://localhost:1099/RK");
//            Scanner sc = new Scanner(System.in);
//            System.out.println("============================================");
//            System.out.println("||      Veuillez saisir un numéro :       ||");
//            System.out.println("||1-Pour consulter le stock d'un produit: ||");
//            System.out.println("||2-Pour consulter tout le stock :        ||");
//            System.out.println("============================================");
//            String str = sc.nextLine();
//            if (str.equalsIgnoreCase("1")) {
//                System.out.println("veuillez donner le nom du produit");
//                String pr = sc.nextLine();
//                System.out.println("Il vous reste dans votre stock : " + stub.VerifierProduit(pr) + " " + pr);
//            } else {
//                List<String> prs = stub.afficherProduits();
//                System.out.println("============================================");
//                for (String p : prs) {
//                    System.out.println(p.toString());
//                }
//                System.out.println("============================================");
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
