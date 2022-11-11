peso = input("Ingrese su peso en kg: ")
estatura = input("Ingrese su estatura en metros: ")
masaCorporal = round(float(peso)/float(estatura)**2,2)
print("Tu índice de masa corporal es: " + str(masaCorporal))
