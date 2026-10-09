package main

import (
	"testing"
	
	"github.com/stretchr/testify/assert"
)

func Test_decimal_of_1101_is_13(t *testing.T){

	actualTrue:=binary(1101)
	assert.Equal(t,13,actualTrue)
}



func Test_decimal_0f_1000_is_10000(t *testing.T){

	actualTrue:=binary(10000)
	assert.Equal(t,16,actualTrue)
}

func Test_decimal_of_101_is_5(t *testing.T){

	actualTrue:=binary(101)
	assert.Equal(t,5,actualTrue)
}

func Test_decimal_of_1_is_1(t *testing.T){
	actualTrue:=binary("1")
	assert.Equal(t,1,actualTrue)
}

func Test_decimal_of_0_is01(t *testing.T){
	actualTrue:=binary(0)
	assert.Equal(t,0,actualTrue)
}
