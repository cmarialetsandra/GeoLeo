package route

import (
	"GeoLeo/api/controller"

	"github.com/labstack/echo"
)

func Init() *echo.Echo {
	e := echo.New()

	e.GET("obtenerCoordenadas", controller.ObtenerCoordenadasMuseos)
	e.GET("obtenerCoordenadasFiltradas", controller.ObtenerCoordenadasMuseosFiltrado)

	return e
}
