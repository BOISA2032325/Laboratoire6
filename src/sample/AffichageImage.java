package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class AffichageImage {

    public ImageView imageView1(){
        Image image1 = new Image("image1.jpg");
        ImageView imageView = new ImageView(image1);
        imageView.setPreserveRatio(true);
        imageView.setFitWidth(500);
        imageView.setFitHeight(500);
        return imageView;
    }

    public ImageView imageView2(){
        Image image2 = new Image("image2.jpg");
        ImageView imageView = new ImageView(image2);
        imageView.setPreserveRatio(true);
        imageView.setFitWidth(500);
        imageView.setFitHeight(500);
        return imageView;
    }

    public ImageView imageView3(){
        Image image3 = new Image("image3.jpg");
        ImageView imageView = new ImageView(image3);
        imageView.setPreserveRatio(true);
        imageView.setFitWidth(500);
        imageView.setFitHeight(500);
        return imageView;
    }

    public ImageView imageViewDefault(){
        Image imageDefault = new Image("default.jpg");
        ImageView imageView = new ImageView(imageDefault);
        imageView.setPreserveRatio(true);
        imageView.setFitWidth(500);
        imageView.setFitHeight(500);
        return imageView;
    }
}
