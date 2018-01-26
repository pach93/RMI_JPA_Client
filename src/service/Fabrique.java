/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import sti3.rmi.IUtilisateur;
import stic3.mapping.User;

/**
 *
 * @author Pach
 */
public class Fabrique {
    private static IUtilisateur userDistant;
public static IUtilisateur getUserDistant() {
        return userDistant;
    }
    
    public static void init() throws RemoteException, NotBoundException
    {
        try {
            Registry registry = LocateRegistry.getRegistry("Localhost",1069);
            userDistant = (IUtilisateur)registry.lookup("remoteUser");
        } catch (RemoteException| NotBoundException e) {
            e.printStackTrace();
        }
     
       
    
    }
}
