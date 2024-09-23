#Determinar si un año es bisiesto. Para que un año sea bisiesto debe ser
#Divisible por 4 y no debe ser divisible por 100, excepto que tambien sea divisible por 400
#Esta version es mejor por ser mas entendible y mas corta
a = int(input("Introduzca el año: "))
if a % 400 == 0:
    print("Es bisiesto")
elif a % 100 == 0:
    print("No es bisiesto")
elif a % 4 == 0:
    print("Es bisiesto")
else:
    print("No es bisiesto")