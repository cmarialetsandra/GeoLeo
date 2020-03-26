package implementation

import (
	"GeoLeo/api/models"
	repo "GeoLeo/api/repository/interfaces"
	"database/sql"
)

type VCoordRepoImpl struct {
	Db *sql.DB
}

func NewVCoordRepo(db *sql.DB) repo.VistaCoordenadaInterface {
	return &VCoordRepoImpl{
		Db: db,
	}
}

func (u VCoordRepoImpl) SelectCoordenadasMuseos() ([]models.VistaCoordenada, error) {
	coordenadas_list := make([]models.VistaCoordenada, 0)
	rows, err := u.Db.Query("SELECT * FROM v_museo_ubicacion")
	if err != nil {
		return coordenadas_list, err
	}
	for rows.Next() {
		coord := models.VistaCoordenada{}
		err := rows.Scan(&coord.Id_museo, &coord.Nombre, &coord.Id_ubicacion, &coord.Latitud, &coord.Longitud)
		if err != nil {
			break
		}
		coordenadas_list = append(coordenadas_list, coord)
	}
	err = rows.Err()
	if err != nil {
		return coordenadas_list, err
	}

	return coordenadas_list, nil
}

func (u VCoordRepoImpl) SelectCoordenadasMuseosFiltrado(coordenada *models.VistaCoordenada) ([]models.VistaCoordenada, error) {
	coordenadas_list := make([]models.VistaCoordenada, 0)
	rows, err := u.Db.Query("SELECT * FROM v_museo_ubicacion WHERE id_museo = $1", coordenada.Id_museo)
	if err != nil {
		return coordenadas_list, err
	}
	for rows.Next() {
		coord := models.VistaCoordenada{}
		err := rows.Scan(&coord.Id_museo, &coord.Nombre, &coord.Id_ubicacion, &coord.Latitud, &coord.Longitud)
		if err != nil {
			break
		}
		coordenadas_list = append(coordenadas_list, coord)
	}
	err = rows.Err()
	if err != nil {
		return coordenadas_list, err
	}

	return coordenadas_list, nil
}
