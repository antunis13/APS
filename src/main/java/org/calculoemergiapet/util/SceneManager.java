package org.calculoemergiapet.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public final class SceneManager {
    private static Stage stage;

    private SceneManager(){}
    public static void init(Stage primary){ stage=primary; stage.setTitle("Cálculo de Emergia - PET"); }
    public static void switchTo(String fxmlPath){
        try{
            FXMLLoader fx=new FXMLLoader(SceneManager.class.getResource(fxmlPath));
            Scene sc=new Scene(fx.load());
            sc.getStylesheets().add(SceneManager.class.getResource("/css/style.css").toExternalForm());
            stage.setScene(sc); stage.show();
        }catch(Exception e){e.printStackTrace();}
    }
}
