-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 05-07-2024 a las 02:16:05
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

create database proyectoldp2;

use  proyectoldp2;

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `proyectoldp2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE IF NOT EXISTS `productos` (
  `cod` char(6) NOT NULL,
  `cant` int(11) DEFAULT NULL,
  `nomprod` varchar(255) DEFAULT NULL,
  `desprod` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

drop table productos;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`cod`, `cant`, `nomprod`, `desprod`) VALUES
('c0001', 21, 'Lapicero Pilot A', 'Lapicero Azul Pilot'),
('c0002', 16, 'Plumon Pizarra N', 'Plumon Pizarra Negro Faber Castell Punta gruesa'),
('c0004', 23, 'Cuaderno Deluxe  P Minerva', 'Cuaderno Plomo Anillado A4'),
('c0005', 79, 'PLumon Vinifan', 'Plumon indeleble negro Vinifan'),
('c0006', 47, 'Resaltador Parker A', 'Resaltador Parker Amarillo'),
('c0007', 26, 'Plumon Pizarra FC V', 'Plumon Pizarra Verde Faber Castell'),
('c0008', 96, 'Notas Adhesivas Post It', 'Notas adhesivas postit 3x3 500hojas'),
('c0009', 40, 'Archivador Pagoda V', 'Archivador Pagoda Verde Plastificado'),
('c0010', 21, 'Plumon OVE R', 'Plumon OVE permanente rojo'),
('c0011', 35, 'Resaltador Vinifan A', 'Resaltador Vinifan amarillo'),
('c0012', 28, 'Lapiz Stabilo Swano', 'lapiz Stabilo Swano con borrrador'),
('c0013', 55, 'Archivador Beautonne', 'Archivador Beautonne a4 13 divisiones'),
('c0014', 74, 'Engrapador OVE', 'Engrapador OVe 25 hojas con sacagrapas'),
('c0015', 47, 'Boligrafo Artesco', 'Bolgrafo Azul Artesco x6un'),
('c0016', 46, 'Goma Liquida OVE', 'Goma Liquida OVe 50ml'),
('c0017', 29, 'Masking Pegafan', 'Cinta Masking Pegafan x20'),
('c0018', 98, 'Reasltador Stabilo D', 'resaltador stabilo boss durazno'),
('c0019', 52, 'Boligrafo Pilot Fr', 'Boligrafo Plot Frixion FR7 negro'),
('c0020', 120, 'Block Canson D', 'Block Dibujo Canson A4 50 hojas'),
('c0021', 69, 'Cuaderno Minerva CA', 'Cuaderno Minerva Croly Deluxe Azul a4 80 hojas');

create table if not exists usuarios(
  `nomus` char(5) NOT NULL,
  `contraus` varchar(50) NOT NULL,
  PRIMARY KEY (`nomus`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


insert into `usuarios` (`nomus`,`contraus`) values 
('ad103','c274$!');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
