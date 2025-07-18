APPEXO - Application de Gestion des Utilisateurs

Une application web complète développée avec Spring Boot pour la gestion des utilisateurs et des rôles.

Fonctionnalités

Authentification et Autorisation
- Connexion sécurisée avec JWT
- Gestion des sessions utilisateur
- Déconnexion avec invalidation de session
- Rôles utilisateur (ADMIN, USER, MODERATOR)

Gestion des Utilisateurs
- Création d'utilisateurs avec validation
- Affichage de la liste des utilisateurs
- Consultation des détails d'un utilisateur
- Suppression d'utilisateurs
- Mise à jour des informations utilisateur

Gestion des Rôles
- Création de rôles (réservé aux ADMIN)
- Consultation des rôles disponibles
- Attribution automatique du rôle USER aux nouveaux utilisateurs
- Relation utilisateur-rôle

Interface Utilisateur
- Design moderne et responsive
- Navbar avec informations utilisateur
- Pages stylisées avec CSS moderne
- Validation des formulaires
- Gestion d'erreurs utilisateur

Technologies Utilisées

- Spring Boot 3.5.3
- Spring Security avec JWT
- Spring Data JPA
- Thymeleaf pour les templates
- H2 Database (base de données en mémoire)
- Maven pour la gestion des dépendances
- Java 21

Installation et Démarrage

Prérequis
- Java 21 ou supérieur
- Maven 3.6 ou supérieur

Instructions
1. Cloner le repository
   ```bash
   git clone <repository-url>
   cd demo
   ```

2. Compiler et démarrer l'application
   ```bash
   ./mvnw spring-boot:run
   ```
   ou sur Windows :
   ```bash
   mvnw.cmd spring-boot:run
   ```

3. Accéder à l'application
   - Application web : http://localhost:9000/front
   - Console H2 : http://localhost:9000/h2-console

Configuration

Base de données
- URL : `jdbc:h2:mem:db`
- Driver : H2 Database (en mémoire)
- Initialisation : Automatique avec les rôles par défaut

Sécurité
- Clé JWT : Configurée dans `application.properties`
- Algorithme : HS256
- Durée : 1 jour

Rôles par défaut
Au démarrage, les rôles suivants sont créés automatiquement :
- ADMIN : Accès complet à l'application
- USER : Accès standard
- MODERATOR : Accès intermédiaire

API Endpoints

Authentification
- `POST /api/login` - Connexion utilisateur
- `POST /api/user` - Création d'utilisateur

Utilisateurs
- `GET /api/user` - Liste des utilisateurs
- `GET /api/user/{username}` - Détails d'un utilisateur
- `PUT /api/user` - Mise à jour utilisateur
- `DELETE /api/user/{username}` - Suppression utilisateur

Rôles (ADMIN uniquement)
- `GET /api/role` - Liste des rôles
- `POST /api/role` - Création de rôle
- `GET /api/role/{id}` - Détails d'un rôle
- `GET /api/role/name/{name}` - Rôle par nom

Interface Web

Pages disponibles
- `/front/login` - Page de connexion
- `/front` - Page d'accueil avec liste des utilisateurs
- `/front/user` - Formulaire de création d'utilisateur
- `/front/user/{username}` - Détails d'un utilisateur
- `/front/login/logout` - Déconnexion

Fonctionnalités UI
- Navbar responsive avec informations utilisateur
  Design moderne avec dégradés et animations
- Validation en temps réel des formulaires
- Messages d'erreur contextuels
- Badges pour les rôles utilisateur

Sécurité

Authentification
- JWT pour l'authentification stateless
- Hachage BCrypt pour les mots de passe
- Session management pour le frontend

Autorisation
- Endpoints protégés par rôle
- Gestion des permissions granulaire
- Validation des tokens JWT

Structure du Projet

```
demo/
├── src/main/java/fr/m2i/demo/
│   ├── api/
│   │   ├── configurations/    # Configuration Spring Security
│   │   ├── controllers/       # Controllers REST API
│   │   ├── entities/         # Entités JPA
│   │   ├── repositories/     # Repositories JPA
│   │   └── services/         # Services métier
│   ├── front/
│   │   ├── controllers/      # Controllers web
│   │   ├── model/           # Modèles pour le frontend
│   │   └── repositories/    # Proxies pour l'API
│   └── DemoApplication.java  # Classe principale
├── src/main/resources/
│   ├── templates/           # Templates Thymeleaf
│   └── application.properties
└── pom.xml                 # Configuration Maven
```

Tests

Pour exécuter les tests :
```bash
./mvnw test
```

Améliorations Possibles

- [ ] Ajout de la pagination pour les listes
- [ ] Gestion des avatars utilisateur
- [ ] Historique des connexions
- [ ] Gestion des permissions granulaires
- [ ] Tests d'intégration complets
- [ ] Déploiement avec base de données persistante
- [ ] API REST documentation avec OpenAPI/Swagger

Contribution

Les contributions sont les bienvenues ! Merci de créer une issue ou une pull request.

