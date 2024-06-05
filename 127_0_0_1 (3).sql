-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mar. 04 juin 2024 à 03:04
-- Version du serveur : 10.4.27-MariaDB
-- Version de PHP : 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `stock`
--
CREATE DATABASE IF NOT EXISTS `stock` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `stock`;

-- --------------------------------------------------------

--
-- Structure de la table `commande`
--

CREATE TABLE `commande` (
  `id` int(11) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `telephone` varchar(20) NOT NULL,
  `refference` varchar(20) NOT NULL,
  `article` varchar(20) DEFAULT NULL,
  `description` varchar(20) NOT NULL,
  `pu` varchar(20) NOT NULL,
  `qte` varchar(20) NOT NULL,
  `pt` varchar(20) NOT NULL,
  `nature` varchar(20) NOT NULL,
  `date_com` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `commande`
--

INSERT INTO `commande` (`id`, `nom`, `telephone`, `refference`, `article`, `description`, `pu`, `qte`, `pt`, `nature`, `date_com`) VALUES
(1, 'andela', '678945123', 'OXD3TO7Y0Z4', 'riz ', 'meme casse 50 kg', '28500', '24', '250000', 'Credit', '2024-05-08 19:31:43'),
(2, 'ben', '654789542', '1D26YVNAPAV', 'yaourt', 'dolait 500g', '400', '100', '40000', 'Cheque Bancaire', '2024-05-08 19:51:12'),
(3, 'andela', '673429591', 'QIM0IY60FW1', 'yaourt', ' yaourt 1kg', '900', '50', '45000', 'Espece', '2024-05-19 13:44:17'),
(4, 'andela', '673429591', 'E55OFSG7YS1', 'yaourt', ' yaourt 5kg', '900', '50', '45000', 'Espece', '2024-05-19 13:56:58');

-- --------------------------------------------------------

--
-- Structure de la table `oublie`
--

CREATE TABLE `oublie` (
  `id` int(11) NOT NULL,
  `motif` varchar(20) NOT NULL,
  `nomu` varchar(20) NOT NULL,
  `date_c` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `oublie`
--

INSERT INTO `oublie` (`id`, `motif`, `nomu`, `date_c`) VALUES
(1, 'mot de passe oublier', 'andela', '2024-05-01 04:29:42'),
(2, 'mot de passe oublier', 'gael', '2024-05-01 05:01:47'),
(3, 'mot de passe oublier', 'mikel', '2024-05-01 05:19:40'),
(4, 'mot de passe oublier', 'andela', '2024-05-06 08:09:47');

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `mdp` varchar(20) NOT NULL,
  `role` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `users`
--

INSERT INTO `users` (`id`, `nom`, `mdp`, `role`) VALUES
(1, 'andela', 'patou2004', 'Admin'),
(2, 'mikel', 'mikel', 'Gestionnaire');

-- --------------------------------------------------------

--
-- Structure de la table `vente`
--

CREATE TABLE `vente` (
  `id` int(11) NOT NULL,
  `nomclt` varchar(20) NOT NULL,
  `telct` varchar(20) NOT NULL,
  `numf` varchar(20) NOT NULL,
  `article` varchar(20) NOT NULL,
  `description` varchar(20) NOT NULL,
  `pu` varchar(20) NOT NULL,
  `qte` varchar(20) NOT NULL,
  `pt` varchar(20) NOT NULL,
  `nature_op` varchar(20) NOT NULL,
  `stock` varchar(20) NOT NULL,
  `paiement` varchar(20) NOT NULL,
  `date_vente` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `vente`
--

INSERT INTO `vente` (`id`, `nomclt`, `telct`, `numf`, `article`, `description`, `pu`, `qte`, `pt`, `nature_op`, `stock`, `paiement`, `date_vente`) VALUES
(1, 'ben', '698759431', 'SJ5QPD3C851', 'riz', 'meme casse 25kg', '15500', '100', '1550000', 'achat', '100', '', '2024-05-08 11:21:49'),
(2, 'ben', '698759431', '85IFDHV8HZR', 'riz', 'meme casse 25kg', '15500', '100', '1550000', 'achat', '200', '', '2024-05-08 11:22:17'),
(3, 'ben', '698759431', 'RA745Z980FJ', 'riz', 'meme casse 50kg', '15500', '100', '1550000', 'achat', '100', '', '2024-05-08 11:23:15'),
(4, 'andela', 'vladimir', 'V6GAJQD2KY3', 'riz ', 'meme casse 25kg', '16500', '2', '33000', 'vente', '198', 'Espece', '2024-05-21 17:52:58'),
(5, 'razel', '678954120', '9VVIWQFH1LV', 'yaourt ', 'doalit 5kg', '2500', '2', '5000', 'achat', '2', 'Espece', '2024-05-21 18:14:39'),
(6, 'razel', '678954120', 'J0WBSHQU80G', 'yaourt ', 'dolait 5kg', '2500', '125', '312500', 'achat', '125', 'Espece', '2024-05-21 18:15:45'),
(7, 'mikel', '6179845210', 'IMUYXBKRYC3', 'riz', 'meme casse 25kg', '16500', '10', '165000', 'vente', '188', 'Espece', '2024-05-22 17:36:19'),
(10, 'mikel', '6179845210', 'ZVF0QD9Z783', 'riz', 'meme casse 50kg', '33000', '11', '363000', 'vente', '89', 'Espece', '2024-05-22 17:37:40');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `commande`
--
ALTER TABLE `commande`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `oublie`
--
ALTER TABLE `oublie`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `nom` (`nom`);

--
-- Index pour la table `vente`
--
ALTER TABLE `vente`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `commande`
--
ALTER TABLE `commande`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `oublie`
--
ALTER TABLE `oublie`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `vente`
--
ALTER TABLE `vente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
