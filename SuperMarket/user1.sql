-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 08 Eki 2022, 02:23:42
-- Sunucu sürümü: 10.4.24-MariaDB
-- PHP Sürümü: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `user1`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `admin`
--

CREATE TABLE `admin` (
  `AdminID` int(11) NOT NULL,
  `Adminİsim` text CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL,
  `AdminParola` text CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `admin`
--

INSERT INTO `admin` (`AdminID`, `Adminİsim`, `AdminParola`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kategori`
--

CREATE TABLE `kategori` (
  `KategoriID` int(11) NOT NULL,
  `Kategoriİsim` text CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL,
  `KategoriÇeşit` text CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `kategori`
--

INSERT INTO `kategori` (`KategoriID`, `Kategoriİsim`, `KategoriÇeşit`) VALUES
(4, 'İçecek', 'İçecek'),
(5, 'Sebze', 'Sebze');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `müşteri`
--

CREATE TABLE `müşteri` (
  `ID` int(11) NOT NULL,
  `Müşteriİsim` text CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL,
  `MüşteriSoyisim` text CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL,
  `MüşteriEPosta` text CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL,
  `MüşteriParola` text CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL,
  `MüşteriCinsiyet` text CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Tablo döküm verisi `müşteri`
--

INSERT INTO `müşteri` (`ID`, `Müşteriİsim`, `MüşteriSoyisim`, `MüşteriEPosta`, `MüşteriParola`, `MüşteriCinsiyet`) VALUES
(1, 'Alihan', 'Çelik', 'ali@hotmail.com', '123456', 'ERKEK'),
(11, 'Alihan', 'Çelik', 'alihan@hotmail.com', 'alihan1234', 'ERKEK');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `sellertb`
--

CREATE TABLE `sellertb` (
  `SatıcıID` int(11) NOT NULL,
  `Satıcıİsim` text CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL,
  `SatıcıSoyad` text NOT NULL,
  `SatıcıCinsiyet` text CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL,
  `SatıcıParola` text CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `sellertb`
--

INSERT INTO `sellertb` (`SatıcıID`, `Satıcıİsim`, `SatıcıSoyad`, `SatıcıCinsiyet`, `SatıcıParola`) VALUES
(15, 'Alihan', 'Çelik', 'Erkek', '1234'),
(16, 'Nisa', 'Çelik', 'Kadın', '12345'),
(18, 'a', 'bbb', 'Erkek', '123');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `ürünler`
--

CREATE TABLE `ürünler` (
  `ÜrünID` int(11) NOT NULL,
  `Ürünİsim` text CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL,
  `ÜrünMiktar` int(11) NOT NULL,
  `ÜrünFiyat` double NOT NULL,
  `ÜrünKategori` text CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `ürünler`
--

INSERT INTO `ürünler` (`ÜrünID`, `Ürünİsim`, `ÜrünMiktar`, `ÜrünFiyat`, `ÜrünKategori`) VALUES
(2, 'Patates', 10, 5.99, 'İçecekler'),
(3, 'Domates', 53, 10.8, 'Sebze'),
(4, 'Kola', 1, 4, 'İçecekler'),
(5, 'Patates', 13, 5.99, 'Et');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`AdminID`);

--
-- Tablo için indeksler `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`KategoriID`);

--
-- Tablo için indeksler `müşteri`
--
ALTER TABLE `müşteri`
  ADD PRIMARY KEY (`ID`);

--
-- Tablo için indeksler `sellertb`
--
ALTER TABLE `sellertb`
  ADD PRIMARY KEY (`SatıcıID`);

--
-- Tablo için indeksler `ürünler`
--
ALTER TABLE `ürünler`
  ADD PRIMARY KEY (`ÜrünID`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `admin`
--
ALTER TABLE `admin`
  MODIFY `AdminID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `kategori`
--
ALTER TABLE `kategori`
  MODIFY `KategoriID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Tablo için AUTO_INCREMENT değeri `müşteri`
--
ALTER TABLE `müşteri`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Tablo için AUTO_INCREMENT değeri `sellertb`
--
ALTER TABLE `sellertb`
  MODIFY `SatıcıID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- Tablo için AUTO_INCREMENT değeri `ürünler`
--
ALTER TABLE `ürünler`
  MODIFY `ÜrünID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
