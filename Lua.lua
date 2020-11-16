a = io.read("*n")
if(a >= 0.00 and a <= 2000.00)then
    print("Isento")
end
if(a >= 2000.01 and a <= 3000.00)then
    b = a - 2000
    c = b * 0.08
    print("R$ "..string.format( "%.2f", c ))
end
if(a >= 3000.01 and a <= 4500.00)then
    b = a - 3000
    c = b * 0.18 + 1000 * 0.08
    print("R$ "..string.format( "%.2f", c ))
end
if(a > 4500.00)then
    b = a - 4500
    c = b * 0.28 + 1500 * 0.18 + 1000 * 0.08
    print("R$ "..string.format( "%.2f", c ))
end
