package driver

import "sync"

const (
	host     = "localhost"
	port     = "5432"
	user     = "postgres"
	password = "Usuario123#."
	dbname   = "Geoleo"
)

var connection *PostgresDB
var sincro sync.Once

func Instance() *PostgresDB {
	sincro.Do(func() {
		connection = NewDbManage()
	})

	return connection
}

func NewDbManage() *PostgresDB {
	db := Connect(host, port, user, password, dbname)

	return db
}
