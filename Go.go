package main

import (
	"fmt"
)

func main() {
	var a, b, c float64
	fmt.Scan(&a)
	if a >= 0.00 && a <= 2000.00 {
		fmt.Printf("Isento\n")
	}
	if a >= 2000.01 && a <= 3000.00 {
		b = a - 2000
		c = b * 0.08
		fmt.Printf("R$ %.2f\n", c)
	}
	if a >= 3000.01 && a <= 4500.00 {
		b = a - 3000
		c = b*0.18 + 1000*0.08
		fmt.Printf("R$ %.2f\n", c)
	}
	if a > 4500.00 {
		b = a - 4500
		c = b*0.28 + 1500*0.18 + 1000*0.08
		fmt.Printf("R$ %.2f\n", c)
	}
}
