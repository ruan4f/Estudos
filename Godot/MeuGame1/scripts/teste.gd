extends Node

# class member variables go here, for example:
# var a = 2
# var b = "textvar"

var pontos
var vida = 5
var nomeJogador
var jogadorPerdeu

func _ready():
	
	pontos = 10
	vida = 5.2
	nomeJogador = "Daniel"
	jogadorPerdeu = false
	
	print(pontos)
	print(vida)
	print(nomeJogador)
	
