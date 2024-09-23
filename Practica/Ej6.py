#Determinar si un numero es primo
n=int(input("Introduce el numero: "))
c=0; i=1
while i <=n:
    if n%i==0:
        c=c+1
    i=i+1
if c==2:
    print (n,"es primo")
else:
    print (n,"no es primo")