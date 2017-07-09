# spring-kotlin-samples

This project is using spring reactive, kotlin and cassandra.

Pre requisits create keyspace and table on cassandra (e.i: with cqlsh)

```
CREATE KEYSPACE demo WITH REPLICATION = {'class': 'SimpleStrategy', 'replication_factor':1 };
CREATE TABLE users( id text PRIMARY KEY, name text);
```
