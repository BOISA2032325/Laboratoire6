package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Laboratoire6");
        Group group = new Group();
        AffichageImage affichageImage = new AffichageImage();

        /*
        Pour faire ceci j'ai eu besoin du site suivant et comme je n'était pas sur que je devais mettre les sources j'ai
        décider de les mettre pour etre sur : https://askcodez.com/comment-faire-pour-redimensionner-automatiquement-les-fenetres-en-javafx-pour-differentes-resolutions.html
         */
        GraphicsDevice graphicsDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = graphicsDevice.getDisplayMode().getWidth();
        int height = graphicsDevice.getDisplayMode().getHeight();

        //Bar en haut

        Menu file = new Menu("Fichier");
        Menu chargerImage = new Menu("Charger une Image");
        MenuItem image1 = new MenuItem("Image #1");
        MenuItem image2 = new MenuItem("Image #2");
        MenuItem image3 = new MenuItem("Image #3");
        Menu possibilite = new Menu("Action");
        MenuItem renitialiser = new MenuItem("Rénitialiser");
        BorderPane bordure = new BorderPane();
        bordure.setPrefSize(width,height);

        possibilite.getItems().addAll(renitialiser);
        chargerImage.getItems().addAll(image1,image2,image3);
        file.getItems().addAll(chargerImage);
        MenuBar menuBar = new MenuBar(file,possibilite);
        bordure.setTop(menuBar);

        //Fonctionnement De la barre

        //Afficher Image
        image1.setOnAction(actionEvent -> bordure.setCenter(affichageImage.imageView1()));
        image2.setOnAction(actionEvent -> bordure.setCenter(affichageImage.imageView2()));
        image3.setOnAction(actionEvent -> bordure.setCenter(affichageImage.imageView3()));

        //Modification de Image
        

        bordure.setCenter(affichageImage.imageViewDefault());
        group.getChildren().addAll(bordure);
        primaryStage.setMaximized(true);
        primaryStage.setScene(new Scene(group));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
