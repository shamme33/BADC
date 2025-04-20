package com.example.badc.Nazmun_Nahar.supplier2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class supplier2 {

    @FXML
    private TextArea ConfirmationMessageTextArea;

    @FXML
    private DatePicker DOBDatePicker;

    @FXML
    private TableColumn<?, ?> ItemColumn;

    @FXML
    private ComboBox<?> ItemSuppliedCombobox;

    @FXML
    private RadioButton PaidRadiobox;

    @FXML
    private RadioButton PendingPaymenrRadiobox;

    @FXML
    private TableColumn<?, ?> PriceColumn;

    @FXML
    private TableColumn<?, ?> QuantityColumn;

    @FXML
    private TextField SupplierIdTextField;

    @FXML
    void ConfirmOnActionButton(ActionEvent event) {

    }

    @FXML
    void GenerateBillOnAction(ActionEvent event) {

    }

}
