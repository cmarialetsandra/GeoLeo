package models

type VistaCoordenada struct {
	Id_museo     int    `json:"id_museo,omitempty"`
	Nombre       string `json:"nombre,omitempty"`
	Id_ubicacion int    `json:"id_ubicacion,omitempty"`
	Latitud      string `json:"latitud,omitempty"`
	Longitud     string `json:"longitud,omitempty"`
}
