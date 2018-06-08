package com.ejercicio3;

import com.ejercicio3.Controller.LoginController;
import java.io.IOException;
import java.io.InputStream;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Ejercicio3 extends Application {    
    
    private Stage escenarioPrincipal;
    private final String PAQUETE_VISTA = "/com/ejercicio3/view/";
    @Override
    
    public void start(Stage escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
        this.escenarioPrincipal.setTitle("andres");
      
        mostrarLogin();
        this.escenarioPrincipal.show();
    }
    
    public void mostrarLogin(){
        try{
            LoginController login = (LoginController)cambiarEscena("LoginView.fxml",600,400);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    public Initializable cambiarEscena(String fxml, int ancho, int alto) throws IOException{
        Initializable resultado = null;
        
        FXMLLoader cargadorFXML = new FXMLLoader();
        
        InputStream archivo = Ejercicio3.class.getResourceAsStream(PAQUETE_VISTA + fxml);
        
        cargadorFXML.setBuilderFactory(new JavaFXBuilderFactory());
        
        cargadorFXML.setLocation(Ejercicio3.class.getResource(PAQUETE_VISTA + fxml));        
        
        Scene escena = new Scene((AnchorPane)cargadorFXML.load(archivo),ancho,alto); 
       
        this.escenarioPrincipal.setScene(escena);
        
        this.escenarioPrincipal.sizeToScene();
       
        resultado = (Initializable)cargadorFXML.getController();
        return resultado;
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
