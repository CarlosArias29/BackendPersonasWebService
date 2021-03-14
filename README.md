# Backend Personas Web Service (JPA)
Proyecto ejercicio de la creación de un rest service, haciendo uso de un pool de conexión.

## Requerimientos técnicos mínimos.
- JDK 8
- MariaDB
- Payara Server

## Configuraciones del proyecto.

Este proyecto hace uso de pool de conexiones, por lo que necesita que los siguientes campos esten configurados.
### Datos principales

```
Nombre del pool: PersonaDb
Resource Type: DataSource
datasourceName:	org.mariadb.jdbc.MySQLDataSource
```
### Propiedades adicionales:
```
  URL: jdbc:mariadb://localhost:3306/test?connectTimeout=0
  serverName:	localhost
  databaseName:	test
  user:	usertest
  password:	passtest
  portNumber:	3306
  useSSL:	false
```
### Información adicional
En payara server primero se crea el JDBC Connection Pools y luego se crea el JDBC Resources.

## Autor 
Ejercicio de un curso de udemy sobre java: [Ir al curso](https://www.udemy.com/share/101WlwA0YaeFtUTX4=/)
