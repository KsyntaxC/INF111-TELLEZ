#Verificar si a es divisible por b o b es divisible por a
#5 25 → 25 es divisible por 5
#52 2 → 52 es divisible por 2
#5 13 → ninguno
A=int(input("Ingrese numero 1: "))
B=int(input("Ingrese numero 2: "))
if A % B == 0:
    print(A,"es divisible por",B)
else:
    if B % A == 0:
        print(B,"es divisible por",A)
    else:
        print("Ninguno es divisible por el otro")