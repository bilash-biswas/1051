a = float(input())
if a >= 0.00 and a <= 2000.00 :
    print("Isento")
elif a >= 2000.01 and a <= 3000.00 :
    b = a - 2000
    c = b * 0.08
    print("R$ {0:.2f}".format(c))
elif a >= 3000.01 and a <= 4500.00 :
    b = a - 3000
    c = b * 0.18 + 1000 * 0.08
    print("R$ {0:.2f}".format(c))
if a > 4500.00 :
    b = a - 4500
    c = b * 0.28 + 1500 * 0.18 + 1000 * 0.08
    print("R$ {0:.2f}".format(c))
