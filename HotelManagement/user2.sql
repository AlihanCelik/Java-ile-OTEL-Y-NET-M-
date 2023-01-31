-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 31 Oca 2023, 17:26:10
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
-- Veritabanı: `user2`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `admin`
--

CREATE TABLE `admin` (
  `ID` int(11) NOT NULL,
  `Adminİsim` text CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL,
  `AdminParola` text CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `admin`
--

INSERT INTO `admin` (`ID`, `Adminİsim`, `AdminParola`) VALUES
(1, 'Alihan', '1234');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `müşteri`
--

CREATE TABLE `müşteri` (
  `ID` int(11) NOT NULL,
  `Müşteriİsim` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `MüşteriSoyisim` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `MüşteriEPosta` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `MüşteriTelNo` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `MüşteriCinsiyet` text COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci COMMENT='müşteri';

--
-- Tablo döküm verisi `müşteri`
--

INSERT INTO `müşteri` (`ID`, `Müşteriİsim`, `MüşteriSoyisim`, `MüşteriEPosta`, `MüşteriTelNo`, `MüşteriCinsiyet`) VALUES
(1, 'Nisa', 'Çelik', 'nisa@gmail.com', '0555 555 55 00', 'KADIN');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `odayönetimi`
--

CREATE TABLE `odayönetimi` (
  `ID` int(11) NOT NULL,
  `OdaNumara` text CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL,
  `OdaTipi` text CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL,
  `TelNo` text CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL,
  `Rezervermi` text CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `odayönetimi`
--

INSERT INTO `odayönetimi` (`ID`, `OdaNumara`, `OdaTipi`, `TelNo`, `Rezervermi`) VALUES
(5, '5', 'Tip 2', '555', 'EVET'),
(6, '4', 'Tip 3', '0 555 555 55 55', 'HAYIR'),
(7, '9', 'Tip 2', '1555', 'HAYIR');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `personel`
--

CREATE TABLE `personel` (
  `ID` int(11) NOT NULL,
  `İsimSoyad` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `Parola` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `TelefonNo` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `Maaş` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `Cinsiyet` text COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci COMMENT='personel';

--
-- Tablo döküm verisi `personel`
--

INSERT INTO `personel` (`ID`, `İsimSoyad`, `Parola`, `TelefonNo`, `Maaş`, `Cinsiyet`) VALUES
(3, 'Alihan Çelik', '123456', '0555 555 55 50', '8 005', 'ERKEK');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`ID`);

--
-- Tablo için indeksler `müşteri`
--
ALTER TABLE `müşteri`
  ADD PRIMARY KEY (`ID`);

--
-- Tablo için indeksler `odayönetimi`
--
ALTER TABLE `odayönetimi`
  ADD PRIMARY KEY (`ID`);

--
-- Tablo için indeksler `personel`
--
ALTER TABLE `personel`
  ADD PRIMARY KEY (`ID`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `admin`
--
ALTER TABLE `admin`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `müşteri`
--
ALTER TABLE `müşteri`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Tablo için AUTO_INCREMENT değeri `odayönetimi`
--
ALTER TABLE `odayönetimi`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Tablo için AUTO_INCREMENT değeri `personel`
--
ALTER TABLE `personel`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
