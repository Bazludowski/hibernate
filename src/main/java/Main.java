package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.hibernate.annotations.Parent;
import paka.SampleController;

import java.io.IOException;
import java.util.Optional;
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        SampleController sample = new SampleController();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("SUPERPROGRAM3000");
        primaryStage.setScene(new Scene(root, 750, 500));
        primaryStage.show();
//        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
//            public void handle(WindowEvent we) {
//                Alert alert = new Alert(Alert.AlertType.INFORMATION);
//                            alert.getButtonTypes().remove(ButtonType.OK);
//            alert.getButtonTypes().add(ButtonType.NO);
//            alert.getButtonTypes().add(ButtonType.YES);
//            alert.setTitle("Quit application");
//            alert.setContentText("Zapisac?");
//            Optional<ButtonType> res = alert.showAndWait();
//            if(res.isPresent()) {
//                if(res.get().equals(ButtonType.YES)) {
//                        sample.serializacja();
//                }
//         }
//            else{
//                primaryStage.close();
//            }
//            }
//        });

    }



    public static void main(String[] args) {
        launch(args);
    }


//    private void closeWindowEvent(WindowEvent event) {
//        System.out.println("Window close request ...");
//
//        if(storageModel.dataSetChanged()) {
//            Alert alert = new Alert(Alert.AlertType.INFORMATION);
//            alert.getButtonTypes().remove(ButtonType.OK);
//            alert.getButtonTypes().add(ButtonType.CANCEL);
//            alert.getButtonTypes().add(ButtonType.YES);
//            alert.setTitle("Quit application");
//            alert.setContentText("Close without saving?");
//            alert.initOwner(primaryStage.getOwner());
//            Optional<ButtonType> res = alert.showAndWait();
//            if(res.isPresent()) {
//                if(res.get().equals(ButtonType.CANCEL))
//                    event.consume();
//            }
//        }
//    }
}

