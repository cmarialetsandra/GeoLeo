package main

import (
	"GeoLeo/api/route"
	"GeoLeo/api/utils"
)

func main() {
	e := route.Init()
	port := utils.GetPort()
	e.Logger.Fatal(e.Start(port))
}
