#Hallar el factorial de todos os numeros comprendidios en el rango (a...b)
#Donde a debe ser menor que b
#Para correr correctamente el programa a debe ser manor que b
a=int(input("Introduce el valir de a: "))
b=int(input("Introduce el valor de b: "))
fac=1; i=1
while i<=b:
    fac=fac*i; i=i+1
    if i>a:
        print(i-1,"! = ",fac)