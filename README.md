# java-dolibarr-client
Java Client to integrate Dolibarr into any java project via REST API.
This is a really simple Java Proxy/Wrapper to connect to any Dolibarr instance with REST API enabled.
You just have to create a config.properties file in your working directory with these properties :
DOLIBARR_API_KEY = <your api key if known>
DOLIBARR_API_URL = https://<your-dolibarr-server>:443/api/index.php/
DOLIBARR_API_USER = <user name for dolibarr access>
DOLIBARR_API_PWD = <password for that user>

Getting Started :
Just instanciate DolibarrClient in your java code : DolibarrClient dc = new DolibarrClient();
Call dolibarr login to get token :

dc.login(); //will use the properties 
or 
dc.login(user,password); //will use other credentials

The first working method is :
dc.getMembers(); // return a list of Members

More will come...
If you want to help, please let me know.
Olivier Andrade Sanchez
OAS-SERVICES - Aplose
