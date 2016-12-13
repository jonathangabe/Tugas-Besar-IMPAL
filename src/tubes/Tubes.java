/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import Controller.ControllerLogin;
import Model.Aplikasi;

/**
 *
 * @author UPC
 */
public class Tubes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aplikasi model = new Aplikasi();
        ControllerLogin cl = new ControllerLogin(model);
        
    }
    
}
