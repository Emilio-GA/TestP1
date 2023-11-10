#encoding:utf-8

# frozen_string_literal: tru
module TestP1_Ruby
  require_relative 'Dice'
  require_relative 'A'
  '''
  puts "numeros ramdon del 0 al 100"
  for i in 1..100
    puts( Dice.random_pos(100))
  end


  puts "jugador empieza"
  for i in 1..100
    puts( Dice.who_starts(2))
  end


  puts "inteligencia y fuerza"
  for i in 1..100
    puts( Dice.random_intelligence)
    puts( Dice.random_strength)
  end



  puts "Revive"
  for i in 1..100
    puts( Dice.resurrect_player)
  end



  puts "Premios"
  for i in 1..100
    puts( Dice.weapons_reward)
    puts( Dice.shields_reward)
    puts( Dice.health_reward)
  end

  puts "Poder"
  for i in 1..100
    puts( Dice.weapon_power)
    puts( Dice.shields_power)
  end


  puts "Usos"
  for i in 1..100
    puts( Dice.uses_left)
  end



  puts "Intensidad"
  for i in 1..100
    puts( Dice.uses_left)
  end


  puts "DESCARTES"
  for i in 1..100
    #  puts( Dice.discard_element(4))
  end
    '''
  hola = A.new
  puts A.ver_a2# no imprime
  #  puts A.ver_a2 # si imprime



end