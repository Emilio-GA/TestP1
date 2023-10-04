#encoding:utf-8
# frozen_string_literal: true
module TestP1_Ruby

  /
 * @author Alberto Rodriguez Fernandez
 * @author Emilio Guillen Alvarez
 */

   class Dice
     / VARIABLE QUE REPRESENTA EL NÚMERO MAXIMO DE USOS DE ARMAS Y ESCUDOS/
     @@max_uses = 5


     / VARIABLE QUE REPRESENTA EL VALOR MAXIMO PARA LA INTELIGENCIA DE JUGADORES Y MOSNTRUOS/
     @@max_intelligence = 10.0


     / VARIABLE QUE REPRESENTA EL VALOR MAXIMO PARA LA FUERZA DE JUGADORES Y MOSNTRUOS/
     @@max_strength = 10.0


     /VARIABLE QUE REPRESENTA LA PROBABILIDAD DE QUE UN JUGADOR SEA RESUCITADO EN CADA TURNO/
     @@resurrect_prob = 0.3


     / VARIABLE QUE REPRESENTA EL NUMERO MAXIMO DE ARMAS RECIBIDAS AL GANAR UN COMBATE/
     @@weapons_reward = 2


     / VARIABLE QUE REPRESENTA EL NUMERO MAXIMO DE ESCUDOS RECIBIDOS AL GANAR UN COMBATE/
     @@shields_reward = 3


     / VARIABLE QUE REPRESENTA EL NUMERO MAXIMO DE UNIDADES DE SALUD RECIBIDAS AL GANAR UN COMBATE/
     @@health_reward = 5


     / VARIABLE QUE REPRESENTA LA MAXIMA POTENCIA DE LAS ARMAS/
     @@max_attack = 3


     / VARIABLE QUE REPRESENTA LA MAXIMA POTENCIA DE LOS ESCUDOS/
     @@max_shield = 2


     /Random /
     @@generator = Random


     def self.random_pos(max)
       @@generator.rand(max)
     end

     def self.who_starts(nplayers)
       @@generator.rand(nplayers)
     end

     def self.random_intelligence()
       @@generator.rand(@@max_intelligence)
     end

     def self.random_strength()
       @@generator.rand(@@max_strength)
     end

     def self.resurrect_player()
       if(@@generator.rand < @@resurrect_prob)
         return true
       else
         return false
       end
     end

     def self.weapons_reward()
       @@generator.rand(@@weapons_reward)
     end

     def self.shields_reward()
       @@generator.rand(@@shields_reward)
     end

     def self.health_reward()
       @@generator.rand(@@health_reward)
     end

     def self.weapon_power()
       @@generator.rand(@@max_attack)
     end

     def self.shields_power()
       @@generator.rand(@@max_shield)
     end
     def self.uses_left()
       @@generator.rand(@@max_uses)
     end

     def self.discard_element(uses_left)
       if(@@generator.rand < 1.0*(@@MAX_USES-uses_left)/@@MAX_USES)
         return true
       else
         return false
       end
     end


   end



  end
