#Hallar el factorial de todos os numeros comprendidios en el rango (a...b)
#Donde a debe ser menor que b
#Este esta hecho con el contador automatico, en lo general imprime mas limpiamente el i
#Para correr correctamente el programa a debe ser manor que b
a=int(input("Intro a: "))
b=int(input("Intro b: "))
for i in range(a,b+1):
    factorial=1
    for j in range(1,i+1):
        factorial*=j
    print(i,"! = ",factorial)