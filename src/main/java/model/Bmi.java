package model;

public class Bmi {
    private final double berat;
    private final double tinggi;

    public Bmi(double berat, double tinggi) {
        this.berat = berat;
        this.tinggi = tinggi;
    }

    public double hitungBMI() {
        double tinggiMeter = tinggi / 100.0;
        return berat / (tinggiMeter * tinggiMeter);
    }

    public String getKategori() {
        double bmi = hitungBMI();

        if (bmi < 18.5) {
            return "Berat badan kurang";
        } else if (bmi < 25.0) {
            return "Normal";
        } else if (bmi < 30.0) {
            return "Berat badan berlebih";
        } else {
            return "Obesitas";
        }
    }
}
