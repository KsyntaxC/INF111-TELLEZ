#Hallar la división entera de 2 números, sin utilizar el operador “división”, 
#Sugerencia: Restas sucesivas
n1=int(input("Introducir el dividendo: "))
n2=int(input("Introducir el divisor:"))
c=0
while n1 >= n2:
    n1=n1-n2;c=c+1
print(c)