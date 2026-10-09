package main

import (
	"testing"
	"github.com/stretchr/testify/assert"
)

func Test_6_takes_8_steps(t *testing.T){
	actualTrue:=checknum(6)
	assert.Equal(t,8,actualTrue)
}

func Test_for_1_it_is_0(t *testing.T){
	actualTrue:=checknum(1)
	assert.Equal(t,0,actualTrue)
}

func Test_16_takes_4_steps(t *testing.T){
 	actualTrue:=checknum(16)
 	assert.Equal(t,4,actualTrue)
}


func Test_11_takes_14_steps(t *testing.T){
	actualTrue:=checknum(11)
 	assert.Equal(t,14,actualTrue)
}

