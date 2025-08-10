DELETE FROM task;
DELETE FROM app_user;

ALTER TABLE task ALTER COLUMN id RESTART WITH 1;
ALTER TABLE app_user ALTER COLUMN id RESTART WITH 1;

INSERT INTO app_user (id, username) VALUES (1, 'John');
INSERT INTO app_user (id, username) VALUES (2, 'Bob');
INSERT INTO app_user (id, username) VALUES (3, 'Doe');
INSERT INTO app_user (id, username) VALUES (4, 'Moi');

INSERT INTO task (id, title, done, user_id) VALUES (1, 'Réviser le code', false, 1);
INSERT INTO task (id, title, done, user_id) VALUES (2, 'Implémenter les tests', true, 1);
INSERT INTO task (id, title, done, user_id) VALUES (3, 'Créer la documentation', false, 1);
INSERT INTO task (id, title, done, user_id) VALUES (4, 'Optimiser les requêtes SQL', true, 2);
INSERT INTO task (id, title, done, user_id) VALUES (5, 'Mettre à jour', false, 2);
INSERT INTO task (id, title, done, user_id) VALUES (6, 'Configurer', false, 3);
INSERT INTO task (id, title, done, user_id) VALUES (7, 'Réaliser la documentation', true, 3);
INSERT INTO task (id, title, done, user_id) VALUES (8, 'Préparer la présentation', false, 4);
INSERT INTO task (id, title, done, user_id) VALUES (9, 'Finaliser le projet', false, 4);
INSERT INTO task (id, title, done, user_id) VALUES (10, 'Déployer', false, 1);

