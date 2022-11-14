def bisiesto():
    year = int(input("Ingrese año: "))

    if(year % 4 == 0 and (year % 400 == 0 or year % 100 != 0)):
        print(f"El año {year} es bisiesto")
    else:
        print(f"El año {year} no es bisiesto")


bisiesto()
