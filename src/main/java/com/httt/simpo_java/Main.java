package com.httt.simpo_java;

import com.httt.simpo_java.control.Server.IpGet;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Main extends Application {
    @FXML
    private Button lamDe;

    @FXML
    private Button server;


    @FXML
    void lamDeClick(ActionEvent event) {

    }
    @FXML
    void serverClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/com/httt/simpo_java/Server/serverWindow.fxml"));
        Parent content = loader.load();

        Scene scene = new Scene(content);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("mainServer.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Main");
        stage.sizeToScene();
        stage.show();

    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        launch();
    }
}