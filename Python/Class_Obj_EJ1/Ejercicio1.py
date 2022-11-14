class Vehiculo():
    def __init__(self, color, ruedas, puertas):
        self.color = color
        self.ruedas = ruedas
        self.puertas = puertas

    def datos(self):
        return f"Color: {self.color}\nruedas {self.ruedas}\npuertas {self.puertas}\n"


class Coche(Vehiculo):

    def __init__(self, color, ruedas, puertas, velocidad, cilindrada):
        self.color = color
        self.ruedas = ruedas
        self.puertas = puertas
        self.velocidad = velocidad
        self.cilindrada = cilindrada

    def datos(self):
        return f"Color: {self.color}\nRuedas {self.ruedas}\nPuertas {self.puertas}\nVelocidad {self.velocidad}\nCilindrada {self.cilindrada}\n"


coche = Coche("Rojo", 4, 5, 120, 1.5)
print(coche.datos())
