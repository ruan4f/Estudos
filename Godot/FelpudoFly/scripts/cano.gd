extends Node2D

export var velocidade = -150

func _ready():
	set_process(true)
	
func _process(delta):
	set_pos(get_pos() + Vector2(velocidade * delta, 0))
	
	if get_pos().x < -100:
		queue_free()
