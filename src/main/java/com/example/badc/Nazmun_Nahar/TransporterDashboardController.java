package com.example.badc.Nazmun_Nahar;

import com.example.badc.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class TransporterDashboardController
{

    @javafx.fxml.FXML
    private BorderPane transporterDashboardBorderPane;

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
    public void updateProfileOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nazmun_Nahar/updateProfile.fxml"));
        Parent root = fxmlLoader.load();
        transporterDashboardBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void requestPaymentOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nazmun_Nahar/requestPayment.fxml"));
        Parent root = fxmlLoader.load();
        transporterDashboardBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void updateDeliveryOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nazmun_Nahar/updateDelivery.fxml"));
        Parent root = fxmlLoader.load();
        transporterDashboardBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void trackDeliveryOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nazmun_Nahar/trackDelivery.fxml"));
        Parent root = fxmlLoader.load();
        transporterDashboardBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void deleteAccountOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nazmun_Nahar/deleteAccount.fxml"));
        Parent root = fxmlLoader.load();
        transporterDashboardBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void registerOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nazmun_Nahar/register.fxml"));
        Parent root = fxmlLoader.load();
        transporterDashboardBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void viewPaymentHistoryOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nazmun_Nahar/viewPaymentHistory.fxml"));
        Parent root = fxmlLoader.load();
        transporterDashboardBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void generateDeliveryReportOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nazmun_Nahar/generateDeliveryReport.fxml"));
        Parent root = fxmlLoader.load();
        transporterDashboardBorderPane.setCenter(root);
    }
}