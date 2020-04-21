package interfaces

import (
	"GeoLeo/api/models"
)

type VistaCoordenadaInterface interface {
	SelectCoordenadasMuseos() ([]models.VistaCoordenada, error)
	SelectCoordenadasMuseosFiltrado(coord *models.VistaCoordenada) ([]models.VistaCoordenada, error)
}
