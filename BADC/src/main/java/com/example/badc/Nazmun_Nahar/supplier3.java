package com.example.badc.Nazmun_Nahar.supplier3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class supplier3  {

    @FXML
    private TextField DescriptionTextField;

    @FXML
    private RadioButton InStockRadioButton;

    @FXML
    private TextField NameTextField;

    @FXML
    private RadioButton OutOfStockRadioButton;

    @FXML
    private ComboBox<?> PriceCombobox;

    @FXML
    private TextField ProductTextField;

    @FXML
    private TextArea ProductupdatedsuccessfullyTextArea;

    @FXML
    private ToggleGroup stockToggleGroup;

    @FXML
    void UpdateProductOnAction(ActionEvent event) {

    }

}
