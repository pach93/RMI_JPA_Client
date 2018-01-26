/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sti3.rmi;

import java.rmi.RemoteException;
import java.util.List;
import stic3.mapping.Employe;
import stic3.mapping.User;

/**
 *
 * @author Pach
 */
public interface IUtilisateur {
    public User connexion(String login, String password)throws RemoteException;
     public List<Employe> getEmpBySalDept(String nomDept , String salaire);
}
