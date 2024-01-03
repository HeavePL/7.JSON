package com.example.json;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;
import org.json.JSONObject;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        JSONObject jo = new JSONObject();
        jo.put("Imie","Tomasz");
        jo.put("Nazwisko","Urbaniak");
        jo.put("Wiek","18");
        jo.put("Klasa","4TD");
        jo.put("Nr dziennika","25");
        jo.put("Adres","XYZ");
        jo.put("Miejscowosc","Gorzow Wielkopolski");
        jo.put("Telefon","+48123123123");
        jo.put("Mail","jidojak973@vkr1.com");




        String tekst = jo.toString();
        System.out.println(tekst);
String gotowy = (
        "imie : " + jo.get("Imie") + "\n" +
        "nazwisko : " + jo.get("Nazwisko") + "\n" +
        "wiek : " + jo.get("Wiek") + "\n" +
        "klasa : " + jo.get("Klasa") + "\n" +
        "nr dziennika: " + jo.get("Nr dziennika") + "\n" +
        "adres : " + jo.get("Adres") + "\n" +
        "miejscowosc: " + jo.get("Miejscowosc") + "\n" +
        "telefon : " + jo.get("Telefon") + "\n" +
        "Mail : " + jo.get("Mail"));

        Text nieSformatowany = new Text(50,50,tekst);
        Text sformatowany = new Text(50,70,gotowy);
        Group root = new Group(nieSformatowany,sformatowany);
        Scene scene = new Scene(root,600,500);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}