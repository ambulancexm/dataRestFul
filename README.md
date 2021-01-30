# Création d'une base de données avec springBootTools

## Dans un Environement debian 10

* Installer mysql 
``` terminal
sudo apt install mariadb
```

* créer et donner les droit à un utilisateur et créer la base de données 
`` use terminal
mysql -u root
mysql> CREATE USER 'user1'@localhost IDENTIFIED BY 'password1';
mysql> GRANT ALL PRIVILEGES ON *.* TO 'user1'@localhost IDENTIFIED BY 'password1';
mysql> FLUSH PRIVILEGES;
mysql> exit
mysql -u user1 -p
mysql> CREATE DATABASE baseTest;
``
* install java
``` terminal
sudo apt install default-jdk
```

* install maven
``` terminal
sudo apt install default-jdk
```

* installer les sources
``` terminal
git clone https://github.com/ambulancexm/dataRestFul.git
```

* compiler avec maven  
``` terminal
mvn install
```

** lancer le fichier compilé
``` terminal
java -jar target/<fichier-compilé>
```

maintenant on peut verifier si la base de données a bien été remplie par hibernate 
``` terminal
mysql -u user1 -p
mysql> use baseTest;
mysql> show tables;

```

