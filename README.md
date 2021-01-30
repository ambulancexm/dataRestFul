# Création d'une base de données avec springBootTools

## Dans un Environement debian 10

* Installer mysql 
```bash
sudo apt install mariadb
```

* créer et donner les droit à un utilisateur et créer la base de données 
```bash
mysql -u root
mysql> CREATE USER 'user1'@localhost IDENTIFIED BY 'password1';
mysql> GRANT ALL PRIVILEGES ON *.* TO 'user1'@localhost IDENTIFIED BY 'password1';
mysql> FLUSH PRIVILEGES;
mysql> exit
mysql -u user1 -p
mysql> CREATE DATABASE baseTest;
```
* install java
```bash
sudo apt install default-jdk
```

* install maven
```bash
sudo apt install default-jdk
```

* installer les sources
```bash
git clone https://github.com/ambulancexm/dataRestFul.git
```

* compiler avec maven  
```bash
mvn install
```

** lancer le fichier compilé
``` terminal
java -jar target/<fichier-compilé>
```

maintenant on peut verifier si la base de données a bien été remplie par hibernate 
```bash
mysql -u user1 -p
mysql> use baseTest;
mysql> show tables;

```

