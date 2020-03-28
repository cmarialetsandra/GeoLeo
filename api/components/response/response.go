package response

import (
	"net/http"

	"github.com/labstack/echo"
)

func Success(c echo.Context, payload interface{}) error {
	return SuccessWithCode(c, 200, payload)
}

func SuccessWithCode(c echo.Context, statusCode int, payload interface{}) error {
	//finalPayload := map[string]interface{}{payload}
	return c.JSON(statusCode, payload)
}

func Error(c echo.Context, statusCode int, message string) error {
	errorPlayload := map[string]interface{}{"code": statusCode, "Message": message}
	//finalPayload := map[string]interface{}{"Error": errorPlayload}
	return c.JSON(statusCode, errorPlayload)
}

func ErrorKeys(c echo.Context, message string) error {
	return Error(c, http.StatusBadRequest, message)
}
