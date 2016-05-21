# E-PhD

./asadmin delete-jdbc-connection-pool connectionPoolPhd

./asadmin create-jdbc-connection-pool --datasourceclassname com.mysql.jdbc.jdbc2.optional.MysqlDataSource --restype javax.sql.DataSource --property user=a:password=a:url="jdbc\:mysql\://localhost\:3306/sdmProject" connectionPoolPhd

./asadmin ping-connection-pool connectionPoolPhd

./asadmin create-jdbc-resource --connectionpoolid connectionPoolPhd myDatasourcePhd