-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th3 03, 2022 lúc 04:06 PM
-- Phiên bản máy phục vụ: 10.4.21-MariaDB
-- Phiên bản PHP: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quan_ly_thu_vien`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tailieu`
--

CREATE TABLE `tailieu` (
  `maTaiLieu` int(11) NOT NULL,
  `loaiTaiLieu` enum('Sách','Tạp Chí','Báo') COLLATE utf8_unicode_ci NOT NULL DEFAULT 'Sách',
  `tenNXB` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `soBanPhatHanh` int(11) NOT NULL,
  `tenTacGia` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `soTrang` int(11) DEFAULT NULL,
  `soPhatHanh` int(11) DEFAULT NULL,
  `thangPhatHanh` int(11) DEFAULT NULL,
  `ngayPhatHanh` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tailieu`
--

INSERT INTO `tailieu` (`maTaiLieu`, `loaiTaiLieu`, `tenNXB`, `soBanPhatHanh`, `tenTacGia`, `soTrang`, `soPhatHanh`, `thangPhatHanh`, `ngayPhatHanh`) VALUES
(8, 'Sách', '333333', 53333, '33333', 3333333, 0, 0, 0),
(9, 'Tạp Chí', '1', 3213, NULL, 0, 1, 11, 0),
(10, 'Báo', '333', 3, NULL, 0, 0, 3, 3),
(11, 'Tạp Chí', '33', 3, NULL, 0, 3, 3, 0),
(12, 'Sách', 'anhtoan', 10, 'wwww', 10, 0, 0, 0),
(13, 'Tạp Chí', 'taoChilan1', 2, NULL, 0, 2, 1, 0),
(14, 'Báo', 'baolan1', 2, NULL, 0, 0, 6, 1),
(15, 'Tạp Chí', '333ghjhgjgh', 71111, NULL, 0, 31, 7, 0),
(16, 'Sách', 'lll', 2, 'lll', 2, 0, 0, 0),
(17, 'Tạp Chí', 'lllkljl', 5, NULL, 0, 5, 10, 0),
(18, 'Báo', '333', 9, NULL, 0, 0, 9, 9);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `tailieu`
--
ALTER TABLE `tailieu`
  ADD PRIMARY KEY (`maTaiLieu`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `tailieu`
--
ALTER TABLE `tailieu`
  MODIFY `maTaiLieu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
