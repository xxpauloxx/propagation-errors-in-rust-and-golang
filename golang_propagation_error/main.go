package main

import (
	"errors"
	"fmt"
)

// Função que realiza uma operação e retorna um erro, se ocorrer algum.
func divide(a, b float64) (float64, error) {
	if b == 0 {
		return 0, errors.New("Divisão por zero não é permitida")
	}
	return a / b, nil
}

func main() {
	// Chamada da função divide com tratamento de erro.
	resultado, err := divide(10, 0)
	if err != nil {
		fmt.Println("Erro:", err)
	} else {
		fmt.Println("Resultado:", resultado)
	}

	// Chamada bem-sucedida.
	resultado, err = divide(10, 2)
	if err != nil {
		fmt.Println("Erro:", err)
	} else {
		fmt.Println("Resultado:", resultado)
	}
}

