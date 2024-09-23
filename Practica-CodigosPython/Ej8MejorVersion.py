a=int(input("Intro a: "))
b=int(input("Intro b: "))
for i in range(a,b+1):
    factorial=1
    for j in range(1,i+1):
        factorial*=j
    print(i,"! = ",factorial)