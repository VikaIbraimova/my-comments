Пробую добавить в базу postgres, в таблицу authors новую строку.
Выходит ошибка: 

C:\Java\jdk1.8.0_40\bin\java -Didea.launcher.port=7537 -Didea.launcher.bin.path=C:\Java\IDE\IntelliJ_IDEA_14.1\bin -Dfile.encoding=windows-1251 -classpath C:\Java\jdk1.8.0_40\jre\lib\resources.jar;C:\Java\jdk1.8.0_40\jre\lib\rt.jar;C:\Java\jdk1.8.0_40\jre\lib\ext\cldrdata.jar;C:\Java\jdk1.8.0_40\jre\lib\ext\localedata.jar;C:\Java\FirstDatabaseProject\out\production\FirstDatabaseProject;D:\Java\Урок_15\JDBC_for_PostgreSQL\postgresql-9.4.1207.jar;C:\Java\IDE\IntelliJ_IDEA_14.1\lib\idea_rt.jar com.intellij.rt.execution.application.AppMain ru.javacourse.FirstDB
Exception in thread "main" org.postgresql.util.PSQLException: Ошибка при попытке подсоединения.
	at org.postgresql.core.v3.ConnectionFactoryImpl.openConnectionImpl(ConnectionFactoryImpl.java:257)
	at org.postgresql.core.ConnectionFactory.openConnection(ConnectionFactory.java:65)
	at org.postgresql.jdbc.PgConnection.<init>(PgConnection.java:159)
	at org.postgresql.Driver.makeConnection(Driver.java:416)
	at org.postgresql.Driver.connect(Driver.java:283)
	at java.sql.DriverManager.getConnection(DriverManager.java:664)
	at java.sql.DriverManager.getConnection(DriverManager.java:247)
	at ru.javacourse.FirstDB.main(FirstDB.java:16)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:497)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:140)
Caused by: java.io.IOException: Illegal UTF-8 sequence: byte 2 of 2 byte sequence is not 10xxxxxx: -64
	at org.postgresql.core.UTF8Encoding.checkByte(UTF8Encoding.java:28)
	at org.postgresql.core.UTF8Encoding.decode(UTF8Encoding.java:103)
	at org.postgresql.core.PGStream.ReceiveString(PGStream.java:329)
	at org.postgresql.core.v3.ConnectionFactoryImpl.doAuthentication(ConnectionFactoryImpl.java:424)
	at org.postgresql.core.v3.ConnectionFactoryImpl.openConnectionImpl(ConnectionFactoryImpl.java:203)
	... 12 more
	
	Вот это скрипты из PostgresSQL:
	
	CREATE TABLE st_group3
(
	group_id serial NOT NULL,
	groupname character varying(255) NOT NULL,
	curator character varying(255) NOT NULL,
	speciality character varying(255) NOT NULL,
	CONSTRAINT st_group_key PRIMARY KEY (group_id)
)

INSERT INTO st_group3 (group_id, groupname, curator,speciality)
    VALUES (1, 'A1B1-C', 'Petrov','FIZIKA');

select * from st_group3;
