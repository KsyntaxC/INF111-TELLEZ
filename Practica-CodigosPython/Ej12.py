#Los números feos son aquellos cuyos factores primos son 2,3,5. Escribir un programa que determine si un número es feo o no. 
#Ejemplo: 6 es un numero feo
n=int(input("Introduce el numero: "))
if n==1:
    print("Es feo")
else:
    while n % 2==0:
        n//=2
    while n % 3==0:
        n//=3
    while n % 5==0:
        n//=5
    if n==1:
        print("Es un numero feo")
    else:
        print("No es un numero feo")