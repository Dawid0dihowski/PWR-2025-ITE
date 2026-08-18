from math import sqrt

def palindrom(word):
    if word == word[::-1]:
        return True
    else:
        return False

a = float(input("podaj parametr a:"))
b = float(input("podaj parametr b:"))
c = float(input("podaj parametr c:"))
delta = b*b - (4*a*c)

if delta > 0:
    print(f"x1 ={(-b + sqrt(delta))/(2 *a )}, x2 = {(-b - sqrt(delta))/(2 *a )} ")
elif delta == 0:
    print(f"x0 = {-b/ (2*a)}")
else:
    print("nie ma miejsca zerowego")

print(palindrom("sdadsa"))

