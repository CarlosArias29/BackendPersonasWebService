# BackendPersonasWebService
Requerimientos técnicos mínimos:
- JDK 8
- MariaDB
- Payara Server

# Configuraciones del proyecto.

Este proyecto hace uso de pool de conexiones, por lo que necesita que los siguientes campos esten configurados:
```
Nombre del pool: PersonaDb
Resource Type: DataSource
datasourceName:	org.mariadb.jdbc.MySQLDataSource
```
_Propiedades adicionales:_
```
  URL: jdbc:mariadb://localhost:3306/test?connectTimeout=0
  serverName:	localhost
  databaseName:	test
  user:	usertest
  password:	passtest
  portNumber:	3306
  useSSL:	false
```
