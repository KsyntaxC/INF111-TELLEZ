#Dados dos numeros positivos mostrar todos los numeros primos en ese rango de numeros
#Ejemplo: A=2 B=10 2,3,4,7
A=int(input("Intro A: "))
B=int(input("Intro B: "))
for i in range(A,B+1):
    c1=1; c2=0
    while c1<=i:
        if i%c1==0:
            c2=c2+1
        c1=c1+1
    if c2==2:
        print(i,end=", ")