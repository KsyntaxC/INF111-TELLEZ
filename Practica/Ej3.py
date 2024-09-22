#Dado dos numeros enteros positivos entercambiar sus valores sin utilizar estructuras condicionales
num1=int(input("Introducir Numero 1: "))
num2=int(input("Introducir Numero 2: "))
z=num1+num2; num2=z-num2; num1=z-num2
print("El nuevo valor de Numero 1: ",num1)
print("El nuevo valor de Numero 2: ",num2)