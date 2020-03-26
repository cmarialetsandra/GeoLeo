package interfaces

import (
	"GeoLeo/api/models"
)

type MuseoInterface interface {
	SelectInformacionMuseos() ([]models.Museo, error)
	SelectInformacionMuseosFiltrado(museo *models.Museo) ([]models.Museo, error)
}