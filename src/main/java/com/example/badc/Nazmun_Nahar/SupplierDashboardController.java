package com.example.badc.Nazmun_Nahar;

import com.example.badc.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class SupplierDashboardController
{
    @javafx.fxml.FXML
    private BorderPane supplierDashboardBorderPane;

    String id;
    String password;

    public void getter(){

    }
    public void setter(String id, String password){
        this.id= id;
        this.password=password;
    }


    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void viewOrdersOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nazmun_Nahar/supplier7.fxml"));
        Parent root = fxmlLoader.load();
        supplierDashboardBorderPane.setCenter(root);

    }

    @javafx.fxml.FXML
    public void addNewProductOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nazmun_Nahar/supplier5.fxml"));
        Parent root = fxmlLoader.load();
        supplierDashboardBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void checkStockAvailabilityOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nazmun_Nahar/supplier4.fxml"));
        Parent root = fxmlLoader.load();
        supplierDashboardBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void registerOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nazmun_Nahar/supplier1.fxml"));
        Parent root = fxmlLoader.load();
        supplierDashboardBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void generateBillsOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nazmun_Nahar/supplier2.fxml"));
        Parent root = fxmlLoader.load();
        supplierDashboardBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void downloadStockReportOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nazmun_Nahar/supplier8.fxml"));
        Parent root = fxmlLoader.load();
        supplierDashboardBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void deleteProductOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nazmun_Nahar/supplier6.fxml"));
        Parent root = fxmlLoader.load();
        supplierDashboardBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void updateProductDetailsOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nazmun_Nahar/supplier3.fxml"));
        Parent root = fxmlLoader.load();
        supplierDashboardBorderPane.setCenter(root);
    }
}