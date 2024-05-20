-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 20, 2024 at 08:34 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `trabajojsp`
--

-- --------------------------------------------------------

--
-- Table structure for table `acb`
--

CREATE TABLE `acb` (
  `record` varchar(90) NOT NULL,
  `teamname` varchar(90) NOT NULL,
  `coach` varchar(90) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `acb`
--

INSERT INTO `acb` (`record`, `teamname`, `coach`, `id`) VALUES
('26-5', 'Unicaja', 'Ivan Caro', 1),
('21-7', 'Barcelona', 'Sarunas Jasikevicius', 2),
('20-8', 'Real Madrid', 'Pablo Laso', 3),
('19-9', 'Baskonia', 'Dusko Ivanovic', 4),
('18-10', 'Valencia Basket', 'Jaume Ponsarnau', 5),
('17-11', 'UCAM Murcia', 'Sito Alonso', 6),
('16-12', 'Herbalife Gran Canaria', 'Porfirio Fisac', 7),
('15-13', 'Bilbao Basket', 'Alex Mumbru', 8),
('14-14', 'San Pablo Burgos', 'Joan Penarroya', 9),
('13-15', 'MoraBanc Andorra', 'Ibon Navarro', 10),
('12-16', 'TD Systems Baskonia', 'Velimir Perasovic', 11),
('11-17', 'Coosur Real Betis', 'Curro Segura', 12),
('10-18', 'Casademont Zaragoza', 'Porfirio Fisac', 13),
('20-10', 'Monbus Obradoiro', 'Moncho Fernandez', 14),
('7-21', 'Saski Baskonia', 'Dusko Ivanovic', 16),
('6-22', 'Herbalife Gran Canaria', 'Porfirio Fisac', 17),
('5-23', 'Retabet Bilbao Basket', 'Alex Mumbru', 18),
('4-24', 'San Pablo Burgos', 'Joan Penarroya', 19),
('3-25', 'Iberostar Tenerife', 'Txus Vidorreta', 20),
('2-26', 'MoraBanc Andorra', 'Ibon Navarro', 21);

-- --------------------------------------------------------

--
-- Table structure for table `este`
--

CREATE TABLE `este` (
  `record` varchar(90) NOT NULL,
  `teamname` varchar(90) NOT NULL,
  `coach` varchar(90) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `este`
--

INSERT INTO `este` (`record`, `teamname`, `coach`, `id`) VALUES
('55-21', 'Nets', 'Steve Nash', 1),
('52-24', 'Bucks', 'Mike Budenholzer', 2),
('51-25', 'Heat', 'Erik Spoelstra', 3),
('48-28', 'Hawks', 'Nate McMillan', 4),
('47-28', 'Celtics', 'Ime Udoka', 5),
('46-29', 'Knicks', 'Tom Thibodeau', 6),
('44-32', 'Sixers', 'Doc Rivers', 7),
('44-32', 'Bulls', 'Billy Donovan', 8),
('38-37', 'Hornets', 'James Borrego', 9),
('36-36', 'Pacers', 'Rick Carlisle', 10),
('34-38', 'Raptors', 'Nick Nurse', 11),
('32-40', 'Wizards', 'Wes Unseld Jr.', 12),
('31-41', 'Magic', 'Jamahl Mosley', 13),
('25-47', 'Cavaliers', 'J.B. Bickerstaff', 14),
('25-57', 'Pistons', 'Dwane Casey', 15);

-- --------------------------------------------------------

--
-- Table structure for table `oeste`
--

CREATE TABLE `oeste` (
  `record` varchar(90) NOT NULL,
  `teamname` varchar(90) NOT NULL,
  `coach` varchar(90) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `oeste`
--

INSERT INTO `oeste` (`record`, `teamname`, `coach`, `id`) VALUES
('53-23', 'Timberwolves', 'Chris Finch', 1),
('53-23', 'Nuggets', 'Michael Malone', 2),
('47-28', 'Clippers', 'Tyronn Lue', 4),
('45-30', 'Mavericks', 'Jason Kidd', 5),
('45-31', 'Suns', 'Frank Vogel', 6),
('45-31', 'Pelicans', 'Willie Green', 7),
('44-31', 'Kings', 'Mike Brown', 8),
('44-33', 'Lakers', 'Darvin Ham', 9),
('41-34', 'Warriors', 'Steve Kerr', 10),
('38-37', 'Rockets', 'Ime Udoka', 11),
('29-47', 'Jazz', 'Will Hardy', 12),
('26-50', 'Grizzlies', 'Taylor Jenkins', 13),
('60-20', 'Thunder', 'Rafael Moncayo', 16),
('90-0', 'Maduritos', 'Carlos', 17),
('10-30', 'Trail Blazers', 'Mbappe', 18);

-- --------------------------------------------------------

--
-- Table structure for table `selecciones`
--

CREATE TABLE `selecciones` (
  `record` varchar(90) NOT NULL,
  `teamname` varchar(90) NOT NULL,
  `coach` varchar(90) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `selecciones`
--

INSERT INTO `selecciones` (`record`, `teamname`, `coach`, `id`) VALUES
('784.8', 'USA', 'Steve Kerr', 1),
('773.9', 'España', 'Sergio Scariolo', 2),
('759.0', 'Alemania', 'Andrea Trinchieri', 3),
('757.9', 'Serbia', 'Igor Kokoskov', 4),
('756.3', 'Australia', 'Brian Goorjian', 5),
('750.6', 'Letonia', 'Roberts Stelmahers', 6),
('746.2', 'Canadá', 'Nikola Djokic', 7),
('743.2', 'Argentina', 'Sergio Hernandez', 8),
('737.1', 'Francia', 'Vincent Collet', 9),
('713.1', 'Lituania', 'Dainius Adomaitis', 10),
('703.6', 'Eslovenia', 'Jurij Zdovc', 11),
('660.4', 'Brasil', 'Gustavo De Conti', 12),
('655.7', 'Italia', 'Romeo Sacchetti', 13),
('641.6', 'Grecia', 'Giorgos Vovoras', 14),
('611.7', 'Polonia', 'Mike Taylor', 15),
('608.4', 'Puerto Rico', 'Eddie Casiano', 16),
('607.7', 'Montenegro', 'Zvezdan Mitrovic', 17),
('560.5', 'República Checa', 'Ricky Rubio', 18),
('556.3', 'República Dominicana', 'Melvyn López', 19),
('537.4', 'Finlandia', 'Henrik Dettmann', 20);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `surname` varchar(90) NOT NULL,
  `email` varchar(90) NOT NULL,
  `name` varchar(90) NOT NULL,
  `password` varchar(90) NOT NULL,
  `username` varchar(90) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `surname`, `email`, `name`, `password`, `username`) VALUES
(11, 'caro romero', 'ivan@gmail.com', 'ivan', '123456', 'icaro'),
(12, 'ramirez', 'pablo@gmail.com', 'pablo', 'mbappe', 'mbappe'),
(13, 'Castro Robles', 'paquito@gmail.com', 'Francis', '3011', 'paquito');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `acb`
--
ALTER TABLE `acb`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `selecciones`
--
ALTER TABLE `selecciones`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `acb`
--
ALTER TABLE `acb`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `selecciones`
--
ALTER TABLE `selecciones`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
