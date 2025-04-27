package com.example.badc.Nazmun_Nahar;

import javafx.event.ActionEvent;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.util.ArrayList;

public class TransporterRegister
{
    @javafx.fxml.FXML
    private TextField vehicleDetailsTextField;
    @javafx.fxml.FXML
    private TextField addressTextField;
    @javafx.fxml.FXML
    private TextField contactInformationTextField;
    @javafx.fxml.FXML
    private RadioButton approveRadiobox;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private ToggleGroup licenseNumberToggleGroup;
    @javafx.fxml.FXML
    private RadioButton rejectedRadiobox;

    @javafx.fxml.FXML
    public void initialize() {
        ArrayList<Transporter> TransporterRegisterlist = new ArrayList<>();
    }

    @javafx.fxml.FXML
    public void registerOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addToArrayListForTransporter(ActionEvent actionEvent) {
    }
}