class Alumno ():
    def __init__(self, nombre, nota):
        self.nombre = nombre
        self.nota = nota

    def datos(self):
        return f"El alumno {self.nombre} tiene la nota {self.nota} "

    def check(self):
        if self.nota >= 7:
            return f"El alumno {self.nombre} aprobo con {self.nota} "
        else:
            return f"El alumno {self.nombre} desaprobo con {self.nota}"


alumno = Alumno("Dario", 5)
print(alumno.datos())
print(alumno.check())
