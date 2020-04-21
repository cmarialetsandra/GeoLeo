package models

type Museo struct {
	Id_museo     int    `json:"id_museo,omitempty"`
	Nombre       string `json:"nombre_museo,omitempty"`
	Descripcion_museo string    `json:"descripcion_museo,omitempty"`
	Administrador string `json:"administrador,omitempty"`
	Horario string `json:"horario,omitempty"`
	Telefono string `json:"telefono,omitempty"`
	Id_ubicacion int `json:"id_ubicacion,omitempty"`
	Latitud      string `json:"latitud,omitempty"`
	Longitud     string `json:"longitud,omitempty"`
	Direccion     string `json:"direccion,omitempty"`
	Nombre_tipo_museo     string `json:"nombre_tipo_museo,omitempty"`
	Descripcion_tipo_museo     string `json:"descripcion_tipo_museo,omitempty"`
	Anio_fundacion     int `json:"anio_fundacion,omitempty"`
	Fundador     string `json:"fundador,omitempty"`
	Id_servicio     int `json:"id_servicio,omitempty"`
	Nombre_servicio     string `json:"nombre_servicio,omitempty"`
	Descripcion_servicio     string `json:"descripcion_servicio,omitempty"`
	Actividades     string `json:"actividades,omitempty"`
	Precio     string `json:"precio,omitempty"`
}