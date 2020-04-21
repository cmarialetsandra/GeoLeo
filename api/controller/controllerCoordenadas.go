package controller

import (
	"GeoLeo/api/components/response"
	"GeoLeo/api/database/driver"
	"GeoLeo/api/models"
	dbImplement "GeoLeo/api/repository/implementation"
	"net/http"

	"github.com/labstack/echo"
)

func ObtenerCoordenadasMuseos(c echo.Context) error {
	vCoordRepository := dbImplement.NewVCoordRepo(driver.Instance().SQL)
	listaCoordenadas, err := vCoordRepository.SelectCoordenadasMuseos()
	if err != nil {
		return response.Error(c, http.StatusInternalServerError, "Hubo un error en el Repositorio de Coordenadas")
	}

	return response.Success(c, listaCoordenadas)
}

func ObtenerCoordenadasMuseosFiltrado(c echo.Context) error {
	data := new(models.VistaCoordenada)

	if err := c.Bind(data); err != nil {
		return err
	}

	vCoordRepository := dbImplement.NewVCoordRepo(driver.Instance().SQL)
	listaCoordenadas, err := vCoordRepository.SelectCoordenadasMuseosFiltrado(data)
	if err != nil {
		return response.Error(c, http.StatusInternalServerError, "Hubo un error en el Repositorio de Coordenadas Filtradas")
	}

	return response.Success(c, listaCoordenadas)
}
