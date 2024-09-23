#Hallar el mayor y el menor de 5 numeros ingresados desde teclado
#No utilizar estructuras repetitivas
a=int(input("Ingrese numero 1: "))
b=int(input("Ingrese numero 2: "))
c=int(input("Ingrese numero 3: "))
d=int(input("Ingrese numero 4: "))
e=int(input("Ingrese numero 5: "))
if a > b:
    M=a; m=b
else:
    M=b; m=a
if c>M:
    M=c
else:
    if c<m:
        m=c
if d>M:
    M=d
else:
    if d<m:
        m=d
if e>M:
    M=e
else:
    if e<m:
        m=e
print("El mayor es",M)
print("El menor es",m)
