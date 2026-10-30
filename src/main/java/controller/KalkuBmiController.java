package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Bmi;
import java.util.Locale;

public class KalkuBmiController {

    @FXML private ComboBox<String> cmbJenisKelamin;
    @FXML private TextField txtBerat;
    @FXML private TextField txtTinggi;
    @FXML private Label lblHasil;

    @FXML
    public void initialize() {
        cmbJenisKelamin.getItems().addAll("Laki-laki", "Perempuan");
    }

    @FXML
    private void hitungBMI() {
        if (cmbJenisKelamin.getValue() == null) {
            tampilkanAlert("Pilih jenis kelamin terlebih dahulu!");
            return;
        }

        try {
            double berat = Double.parseDouble(
                txtBerat.getText().trim().replace(",", ".")
            );
            double tinggi = Double.parseDouble(
                txtTinggi.getText().trim().replace(",", ".")
            );

            if (!Double.isFinite(berat) || !Double.isFinite(tinggi)
                    || berat <= 0 || tinggi <= 0) {
                tampilkanAlert(
                    "Berat dan tinggi badan harus berupa angka lebih dari nol!"
                );
                return;
            }

            Bmi bmi = new Bmi(berat, tinggi);
            double hasil = bmi.hitungBMI();

            if (!Double.isFinite(hasil)) {
                tampilkanAlert("Nilai berat atau tinggi badan tidak valid.");
                return;
            }

            lblHasil.setText(String.format(
                Locale.forLanguageTag("id-ID"),
                "Hasil BMI: %.2f\nJenis Kelamin: %s\nKategori: %s",
                hasil, cmbJenisKelamin.getValue(), bmi.getKategori()
            ));

        } catch (NumberFormatException e) {
            tampilkanAlert(
                "Masukkan berat dan tinggi badan dengan angka yang valid!"
            );
        }
    }

    @FXML
    private void resetForm() {
        cmbJenisKelamin.setValue(null);
        txtBerat.clear();
        txtTinggi.clear();
        lblHasil.setText("Hasil BMI akan tampil di sini.");
        txtBerat.requestFocus();
    }

    private void tampilkanAlert(String pesan) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Peringatan");
        alert.setHeaderText(null);
        alert.setContentText(pesan);
        alert.showAndWait();
    }
}
