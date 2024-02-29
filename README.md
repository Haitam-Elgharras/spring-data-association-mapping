# Rapport - Gestion des Patients avec Spring Boot et JPA

Ce rapport documente les étapes et les fonctionnalités implémentées dans le projet de gestion des patients en utilisant Spring Boot et JPA. La vidéo principale utilisée comme ressource est [ceci](https://www.youtube.com/watch?v=cz3p4y7tUEs).

## Étapes de Développement

### 1. Installation d'IntelliJ Ultimate
- Télécharger et installer IntelliJ Ultimate pour le développement de l'application.

### 2. Création du Projet Spring Initializer
- Utiliser Spring Initializer pour créer un projet Spring Boot avec les dépendances suivantes : JPA, H2, Spring Web, et Lombok.

### 3. Création de l'Entité JPA Patient
- Définir l'entité JPA Patient avec les attributs suivants :
  - id: Long
  - nom: String
  - dateNaissance: Date
  - malade: boolean
  - score: int

### 4. Configuration de l'Unité de Persistance
- Configurer l'unité de persistance dans le fichier `application.properties`.

### 5. Création de l'Interface Repository JPA
- Créer l'interface JPA Repository basée sur Spring Data pour gérer les opérations CRUD sur l'entité Patient.

### 6. Test des Opérations de Gestion de Patients
- Tester les opérations de gestion de patients, y compris :
  - Ajouter des patients
  - Consulter tous les patients
  - Consulter un patient spécifique
  - Rechercher des patients par différents critères
  - Mettre à jour les détails d'un patient
  - Supprimer un patient

### 7. Migration vers MySQL
- Effectuer la migration de la base de données H2 vers MySQL pour une persistance des données plus robuste.

### 8. Implémentation des Exemples Additionnels
- Reprendre les exemples de gestion de patients, médecins, rendez-vous, consultations, utilisateurs et rôles à partir des vidéos fournies pour une application plus complète.

## Ressources Supplémentaires
- [Gestion des Patients (Vidéo 1)](https://www.youtube.com/watch?v=Kfv_7m8INlU)
- [Gestion des Patients (Vidéo 2)](https://www.youtube.com/watch?v=s6p2dE3qrsU)

Ce rapport résume les étapes de développement et les fonctionnalités implémentées dans le projet de gestion des patients avec Spring Boot et JPA, basé sur les ressources fournies dans les vidéos mentionnées.

Pour plus de détails sur l'implémentation spécifique, veuillez consulter le code source du projet.
