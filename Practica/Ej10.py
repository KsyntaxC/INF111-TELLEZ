#Dado un numero entero positivo, si el numero es par dividir entre 2
#De lo contrario multiplicar por tres y sumar 1, mostrar cada numero generado hasta que el numero sea 1
#Ejemplo: 3,10,5,16,8,4,2,1
n=int(input("Introduce un numero entero positivo: "))
while n!=1:
    print(n,end=", ")
    if n%2==0:
        n=n//2
    else:
        n=n*3+1
print(n)
