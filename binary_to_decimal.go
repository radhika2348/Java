package main

import "math"



func binary(num int) int {
	var i int=0

    var sum int=0

	if num>0{
		for num>=1{
			ans:=num%10
			sum+=ans*power(i)
			num=num/10
			i++;

		}
	}
	return sum
}


func power(i int) int{
	if i==0{
		return 1
	}
	anss := math.Pow(float64(2),float64(i))
	return int(anss)
}