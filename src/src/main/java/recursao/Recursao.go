package main

import "fmt"

func main() {
	recursao(3)
}

func recursao(n int) {
	if n > 0 {
		recursao(n - 1)
		fmt.Println(n)
	}
}
