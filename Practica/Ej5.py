#Dados dos nuemros enteros positivos, determinar si uno es multiplo del otro
n1=int(input("Ingrese numero 1: "))
n2=int(input("Ingrese numero 2: "))
if n1 % n2 == 0:
    print(n2,"es multiplo de",n1)
else:
    print(n2,"no es multiplo de",n1)
if n2 % n1 == 0:
    print(n1,"es multiplo de",n2)
else:
    print(n1,"no es multiplo de",n2)
