# Pràctica final Entorns: Say Big Numbers

## Configuración de webapp
### Configurar Tomcat local:

### Configurar archivo WAR en Tomcat Servidor

Mover archivo .war de local al servidor con scp:
![Tomcat1](docsImages/warTomcat1.PNG)

Conexión ssh al servidor:
![Tomcat2](docsImages/warTomcat2.PNG)

Mover a la ruta webapps de tomcat:
![Tomcat3](docsImages/warTomcat3.PNG)

Entrar vía web al tomcat del servidor:
http://tomcat224.cfgs.esliceu.net:8080/manager/html

Otra opción para subir y desplegar el archivo .war manualmente, es en el apartado “manager” de tomcat:
![Tomcat4](docsImages/warTomcat4.PNG)

Una vez desplegado, lo encontraremos en la lista de Rutas de aplicaciones.
Al subir un nuevo archivo de proyecto .war se genera automáticamente un directorio con el mismo nombre, en él podemos encontrar todo lo necesario para ejecutar la aplicación web.
![Tomcat5](docsImages/warTomcat5.PNG)

Al Ejecutar la aplicación encontramos nuestro proyecto:
![Tomcat6](docsImages/warTomcat6.PNG)
