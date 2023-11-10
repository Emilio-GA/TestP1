# frozen_string_literal: true
class A
  @@a1=20
  @a2=7

  def initialize
    @a3=40
  end
  def ver_a2aa
    @a2
  end

  def self.ver_a2

    puts "valor del atributo a2 #{ver_a2aa}"
  end

  end