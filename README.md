# Application TODO List

### Prérequis :

- Java 17+ installé
- Maven installé

### Accéder à l'application
- Application : http://localhost:8080
- Console H2 : http://localhost:8080/h2-console

  - JDBC URL: `jdbc:h2:mem:testdb`
  - Username: `sa`
  - Password: (vide)

### Urls :

  - `/` - Page d'accueil avec vue d'ensemble
  - `/tasks` - Liste de toutes les tâches
  - `/users` - Liste de tous les utilisateurs
  - `/tasks/{id}` - Détail d'une tâche spécifique
  - `/users/{id}` - Détail d'un utilisateur spécifique

### Lancer l'application
```bash
./mvnw spring-boot:run
```





