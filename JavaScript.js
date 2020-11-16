var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
input = input.replace('\n',' ');
var lines = input.split(' ');
var a = parseFloat(lines.shift());

    var c,b;
    if(a >= 0.00 && a <= 2000.00)
    {
        console.log("Isento");
    }
    if(a >= 2000.01 && a <= 3000.00)
    {
        b = a - 2000;
        c = b * 0.08;
        console.log("R$ " + c.toFixed(2));
    }
    if(a >= 3000.01 && a <= 4500.00)
    {
        b = a - 3000;
        c = b * 0.18 + 1000 * 0.08;
        console.log("R$ " + c.toFixed(2));
    }
    if(a > 4500.00)
    {
        b = a - 4500;
        c = b * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        console.log("R$ " + c.toFixed(2));
    }


