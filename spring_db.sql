-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : lun. 01 juil. 2024 à 04:22
-- Version du serveur : 8.0.31
-- Version de PHP : 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `spring_db`
--

-- --------------------------------------------------------

--
-- Structure de la table `categorie`
--

DROP TABLE IF EXISTS `categorie`;
CREATE TABLE IF NOT EXISTS `categorie` (
  `id_cat` bigint NOT NULL AUTO_INCREMENT,
  `description_cat` varchar(255) DEFAULT NULL,
  `nom_cat` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_cat`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;

--
-- Déchargement des données de la table `categorie`
--

INSERT INTO `categorie` (`id_cat`, `description_cat`, `nom_cat`) VALUES
(1, 'test', 'cat1'),
(2, 'test', 'cat1'),
(3, 'test', 'cat2'),
(4, 'test', 'cat2'),
(5, 'test', 'cat2'),
(6, 'Phone', 'cat');

-- --------------------------------------------------------

--
-- Structure de la table `produit`
--

DROP TABLE IF EXISTS `produit`;
CREATE TABLE IF NOT EXISTS `produit` (
  `id_produit` bigint NOT NULL AUTO_INCREMENT,
  `date_creation` datetime(6) DEFAULT NULL,
  `nom_produit` varchar(255) DEFAULT NULL,
  `prix_produit` double DEFAULT NULL,
  `categorie_id_cat` bigint DEFAULT NULL,
  PRIMARY KEY (`id_produit`),
  KEY `FKsu6ikhfh3e1shoow8pb5v2yie` (`categorie_id_cat`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb3;

--
-- Déchargement des données de la table `produit`
--

INSERT INTO `produit` (`id_produit`, `date_creation`, `nom_produit`, `prix_produit`, `categorie_id_cat`) VALUES
(2, '2023-12-11 09:16:32.504000', 'PC Dell', 1000, NULL),
(3, '2023-12-11 09:17:36.755000', 'PC Dell', 2200.5, NULL),
(4, '2023-12-11 09:18:05.675000', 'PC Dell', 2200.5, NULL),
(6, '2023-12-11 09:37:01.071000', 'PC Dell', 2200.5, NULL),
(7, '2023-12-11 09:41:53.918000', 'PC Dell', 2200.5, NULL),
(8, '2023-12-11 09:50:02.666000', 'PC Dell', 2200.5, NULL),
(9, '2023-12-11 10:45:41.100000', 'PC Dell', 2200.5, NULL),
(10, '2023-12-11 10:48:17.654000', 'PC Dell', 2200.5, NULL),
(11, NULL, 'tablette Samsung Notes', 1980, NULL),
(12, '2024-03-11 10:09:14.015000', 'PC Dell', 2200.5, 1),
(13, '2024-03-11 10:09:39.715000', 'PC Dell', 2200.5, 2),
(14, '2024-03-11 10:12:36.436000', 'PC Dell', 2200.5, 3),
(15, '2024-03-11 10:24:29.475000', 'Matelas', 3500.2, 4),
(16, '2024-03-11 14:08:26.864000', 'Matelas', 3500.2, 5),
(17, '2024-03-11 14:10:48.130000', 'Apple', 3500.2, 6),
(18, '2024-03-11 10:24:29.475000', 'Matelas', NULL, 4),
(19, '2024-03-04 00:00:00.000000', 'Tableau', NULL, NULL);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `produit`
--
ALTER TABLE `produit`
  ADD CONSTRAINT `FKsu6ikhfh3e1shoow8pb5v2yie` FOREIGN KEY (`categorie_id_cat`) REFERENCES `categorie` (`id_cat`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
