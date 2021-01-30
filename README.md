# Création d'une base de données avec springBootTools

## Dans un Environement debian 10

* Installer mysql 
```bash
sudo apt install mariadb
```

* Créer et donner les droit à un utilisateur et créer la base de données 
```bash
mysql -u root
mysql> CREATE USER 'user1'@localhost IDENTIFIED BY 'password1';
mysql> GRANT ALL PRIVILEGES ON *.* TO 'user1'@localhost IDENTIFIED BY 'password1';
mysql> FLUSH PRIVILEGES;
mysql> exit
mysql -u user1 -p
mysql> CREATE DATABASE baseTest;
```
* Install java
```bash
sudo apt install default-jdk
```

* Install maven
```bash
sudo apt install default-jdk
```

* Installer les sources
```bash
git clone https://github.com/ambulancexm/dataRestFul.git
```

* Compiler avec maven  
```bash
mvn install
```

* Lancer le fichier compilé
``` terminal
java -jar target/<fichier-compilé>
```

Maintenant on peut verifier si la base de données a bien été remplie par hibernate. 
```bash
mysql -u user1 -p
mysql> use baseTest;
mysql> show tables;

```

