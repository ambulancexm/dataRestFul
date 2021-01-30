# Création d'une base de données avec SpringBootTools

## Utiliser SpringBootTools
Il y a de nombreux tutoriels pour installer [SpringBootTools](https://spring.io/tools)

L'application est basée sur Eclipse elle permet de bien démarrer un projet

On peut aussi utiliser [Spring Initilizr](https://start.spring.io/)


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
## L'api Rest
On peut aller chercher les valeurs inserées dans la base de données avec le lien
[http://localhost:8080/](http://localhost:8080/)

```json
_links	
    projet	
      href	"http://localhost:8080/projet"
    iot	
      href	"http://localhost:8080/iot"
    sonde	
      href	"http://localhost:8080/sonde"
    position	
      href	"http://localhost:8080/position"
    mesure	
      href	"http://localhost:8080/mesure"
    sensor	
      href	"http://localhost:8080/sensor"
    employee	
      href	"http://localhost:8080/employee"
    profile	
      href	"http://localhost:8080/profile"
```



