-- Crée la base de données
CREATE DATABASE "poc-git"
  WITH ENCODING='UTF8'
       LC_COLLATE='en_US.utf8'
       LC_CTYPE='en_US.utf8'
       TEMPLATE=template0;

-- Crée un utilisateur avec un mot de passe
CREATE USER poc WITH PASSWORD 'poc';

-- Donne tous les droits à l'utilisateur sur la base
GRANT ALL PRIVILEGES ON DATABASE "poc-git" TO poc;
