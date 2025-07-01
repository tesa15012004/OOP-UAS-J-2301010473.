package javaapplication24;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Koneksi ke Database untuk Aplikasi Data Pasien
 * @author [Nama]
 * @since 1 Juli 2025
 */
public class dbKoneksi {
    // Konfigurasi koneksi database
    static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static String DB_URL = "jdbc:mysql://localhost:3306/klinik"; // Ubah nama DB sesuai nama database kamu
    static String DB_USER = "root";
    static String DB_PASSWORD = ""; // Kosong jika belum diatur password

    // Method untuk membuat koneksi
    public static Connection koneksi() {
        try {
            Class.forName(JDBC_DRIVER);
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (ClassNotFoundException | SQLException err) {
            System.out.println("Gagal Koneksi ke Database: " + err.getMessage());
        }
        return null;
    }
}

