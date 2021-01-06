package org.openjfx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.stage.StageStyle;

import java.io.*;
import java.net.URL;

import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

public class SampleController {

    @FXML
    private Button button;
    @FXML
    private Button baton;
    @FXML
    private Button baton2;
    @FXML
    private ComboBox<String> combox;
    @FXML
    private TextField search;
    @FXML
    private TableView<Vehicle> table;
    @FXML
    private TableColumn<Vehicle, String> marka;
    @FXML
    private TableColumn<Vehicle, String> model;
    @FXML
    private TableColumn<Vehicle, Integer> rok_produkcji;
    @FXML
    public TableColumn<Vehicle, Double> cena;
    @FXML
    public TableColumn<Vehicle, String> salon;
    @FXML
    public TableView<Vehicle> kupione;
    @FXML
    private TableColumn<Vehicle, String> markakupione;
    @FXML
    private TableColumn<Vehicle, String> modelkupione;
    @FXML
    private TableColumn<Vehicle, Integer> rok_produkcjikupione;
    @FXML
    public TableColumn<Vehicle, Double> cenakupione;
    @FXML
    public TableColumn<Vehicle, String> salonkupione;
    @FXML
    private ObservableList<Vehicle> boughtList = FXCollections.observableArrayList();
    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle) {

        marka.setCellValueFactory(new PropertyValueFactory<Vehicle, String>("marka"));
        model.setCellValueFactory(new PropertyValueFactory<Vehicle, String>("model"));
        cena.setCellValueFactory(new PropertyValueFactory<Vehicle, Double>("Cena"));
        rok_produkcji.setCellValueFactory(new PropertyValueFactory<Vehicle,Integer>("Rokprodukcji"));
    }
}
