package implementation

import (
	"GeoLeo/api/models"
	repo "GeoLeo/api/repository/interfaces"
	"database/sql"
)

type VMuseoRepoImpl struct {
	Db *sql.DB
}

func NewVMuseoRepo(db *sql.DB) repo.MuseoInterface {
	return &VMuseoRepoImpl{
		Db: db,
	}
}

func (u VMuseoRepoImpl) SelectInformacionMuseos() ([]models.Museo, error) {
	museos_list := make([]models.Museo, 0)
	rows, err := u.Db.Query("SELECT * FROM v_museo_info")
	if err != nil {
		return museos_list, err
	}
	for rows.Next() {
		museo := models.Museo{}
		err := rows.Scan(&museo.Id_museo, &museo.Nombre, &museo.Descripcion_museo, &museo.Administrador, &museo.Horario, &museo.Telefono, &museo.Id_ubicacion, &museo.Latitud, &museo.Longitud, &museo.Direccion, &museo.Nombre_tipo_museo, &museo.Descripcion_tipo_museo, &museo.Anio_fundacion, &museo.Fundador, &museo.Id_servicio, &museo.Nombre_servicio, &museo.Descripcion_servicio, &museo.Actividades, &museo.Precio)

		if err != nil {
			break
		}
		museos_list = append(museos_list, museo)
	}
	err = rows.Err()
	if err != nil {
		return museos_list, err
	}

	return museos_list, nil
}

func (u VMuseoRepoImpl) SelectInformacionMuseosFiltrado(museo *models.Museo) ([]models.Museo, error) {
	museos_list := make([]models.Museo, 0)
	rows, err := u.Db.Query("SELECT * FROM v_museo_info WHERE id_museo = $1", museo.Id_museo)
	if err != nil {
		return museos_list, err
	}
	for rows.Next() {
		museo := models.Museo{}
		err := rows.Scan(&museo.Id_museo, &museo.Nombre, &museo.Descripcion_museo, &museo.Administrador, &museo.Horario, &museo.Telefono, &museo.Id_ubicacion, &museo.Latitud, &museo.Longitud, &museo.Direccion, &museo.Nombre_tipo_museo, &museo.Descripcion_tipo_museo, &museo.Anio_fundacion, &museo.Fundador, &museo.Id_servicio, &museo.Nombre_servicio, &museo.Descripcion_servicio, &museo.Actividades, &museo.Precio)

		if err != nil {
			break
		}
		museos_list = append(museos_list, museo)
	}
	err = rows.Err()
	if err != nil {
		return museos_list, err
	}

	return museos_list, nil
}