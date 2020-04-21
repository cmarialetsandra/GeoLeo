package controller

import (
	"GeoLeo/api/components/response"
	"GeoLeo/api/database/driver"
	"GeoLeo/api/models"
	dbImplement "GeoLeo/api/repository/implementation"
	"net/http"

	"github.com/labstack/echo"
)

func ObtenerInformacionMuseos(c echo.Context) error {
	vMusRepository := dbImplement.NewVMuseoRepo(driver.Instance().SQL)
	listaMuseos, err := vMusRepository.SelectInformacionMuseos()
	if err != nil {
		return response.Error(c, http.StatusInternalServerError, "Hubo un error en el Repositorio de Museos")
	}

	return response.Success(c, listaMuseos)
}

func ObtenerInformacionMuseosFiltrado(c echo.Context) error {
	data := new(models.Museo)

	if err := c.Bind(data); err != nil {
		return err
	}

	vMusRepository := dbImplement.NewVMuseoRepo(driver.Instance().SQL)
	listaMuseos, err := vMusRepository.SelectInformacionMuseosFiltrado(data)
	if err != nil {
		return response.Error(c, http.StatusInternalServerError, "Hubo un error en el Repositorio de Museos Filtrados")
	}

	return response.Success(c, listaMuseos)
}