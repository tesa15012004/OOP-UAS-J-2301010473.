
-- Membuat database klinik jika belum ada
CREATE DATABASE IF NOT EXISTS klinik;

-- Menggunakan database klinik
USE klinik;

-- Membuat tabel pasien
CREATE TABLE IF NOT EXISTS pasien (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nama VARCHAR(100) NOT NULL,
    umur INT NOT NULL,
    jenis_kelamin ENUM('L', 'P') NOT NULL,
    alamat TEXT,
    tanggal_daftar DATE DEFAULT CURRENT_DATE
);

-- Menambahkan data contoh pasien
INSERT INTO pasien (nama, umur, jenis_kelamin, alamat)
VALUES 
('Andi Saputra', 25, 'L', 'Jl. Melati No. 12'),
('Siti Aminah', 30, 'P', 'Jl. Kenanga No. 8'),
('Budi Hartono', 40, 'L', 'Jl. Mawar No. 3');
