#Dados 3 números: a, b y c, mostrar los múltiplos de a en el rango de b y c. 
#Ejm: a=3,b=5,c=11 → 6,9
a=int(input("Intro a: "))
b=int(input("Intro b: "))
c=int(input("Intro c: "))
v=(b // a) + 1
ma=a*v
while ma<=c:
    if ma>b:
        print(ma,end=", ")
    v=v+1
    ma=a*v
