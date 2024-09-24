#En un restaurante se consumieron 3 platos del menu (cada plato tiene su descuento)
#Si el precio del plato es mayo a 300 Bs, se hace un descuento del 20%
#Si es mayor a 200 y menor a 300, se hace un descuento del 15%
#Si es mayor a 100 y menor a 200, se hacer un descuento del 7%
#Si es menor a 100 no hay descuento
#Imprima el monto total del cobro
PT=0
for i in range(1,4):
    p=int(input(f"Introduce el costo de el plato {i}: "))
    if p < 300:
        if p < 200:
            if p < 100:
                dp = 1
            else:
                dp = 0.93
        else:
            dp = 0.85
    else:
        dp = 0.80
    c=p*dp; PT=PT+c
print("El precio total a pagar es de ",PT)