#Determinar si un año es bisiesto. Para que un año sea bisiesto debe ser
#Divisible por 4 y no debe ser divisible por 100, excepto que tambien sea divisible por 400
a=int(input("Introduzca el año: "))
if a%4==0:
    if a%100==0:
        if a%400==0:
            print("Es bisiesto")
        else:
            print("No es bisiesto")
    else:
        print("Es bisiesto")
else:
    print("No es bisiesto")