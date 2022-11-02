/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ipsl.projet_appdist_client;

import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author mac
 */
public class ProduitModel extends AbstractTableModel {
    private final List<String> prs;
    
    
    public ProduitModel() {
      ClientRMI cll=new ClientRMI();
      prs = cll.afficher();
    }
    String res;
   
    @Override
    public int getRowCount() {
       return prs.size();
    }

    @Override
    public int getColumnCount() {
       return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[] e=prs.get(rowIndex).split(":");
        System.out.println(e);
        Object res = null;
        switch(columnIndex){
            case 0:
                res=e[0];
                break;
            case 1:
                res=e[1];
                break;
               
        }
       
        return res;
    }
       
}
