
package com.ejercicio3.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements Initializable {
 @FXML private TextField txtLogin;
 @FXML private PasswordField txtPassword;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
         //To change body of generated methods, choose Tools | Templates.
    }
    
    public void login (){
        
        if(txtPassword.getText().equals("admmin123")){
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Bienvenido" + txtLogin.getText());
        }else{ 
            javax.swing.JOptionPane.showMessageDialog(null,
                    "no Autorizado");
        }
    }
}
