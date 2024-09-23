#En un restaurante se consumieron 3 platos del menu (cada plato tiene su descuento)
#Si el precio del plato es mayo a 300 Bs, se hace un descuento del 20%
#Si es mayor a 200 y menor a 300, se hace un descuento del 15%
#Si es mayor a 100 y menor a 200, se hacer un descuento del 7%
#Si es menor a 100 no hay descuento
#Imprima el monto total del cobro
p1=int(input("Ingrese el costo el plato 1: "))
p2=int(input("Ingrese el costo el plato 2: "))
p3=int(input("Ingrese el costo el plato 3: "))
if p1 > 300:
    dp1 = p1 * 0.80
elif 200 < p1 <= 300:
    dp1 = p1 * 0.85
elif 100 < p1 <= 200:
    dp1 = p1 * 0.93
elif p1 <= 100:
    dp1 = p1
if p2 > 300:
    dp2 = p2 * 0.80
elif 200 < p2 <= 300:
    dp2 = p2 * 0.85
elif 100 < p2 <= 200:
    dp2 = p2 * 0.93
elif p1 <= 100:
    dp2 = p2
if p3 > 300:
    dp3 = p3 * 0.80
elif 200 < p3 <= 300:
    dp3 = p3 * 0.85
elif 100 < p3 <= 200:
    dp3 = p3 * 0.93
elif p1 <= 100:
    dp3 = p3
MT= dp1+dp2+dp3
print("El monto final a cobrar es de ",MT,"bs")