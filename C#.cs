using System.IO;
using System;

class Program
{
    static void Main()
    {
    double c,b,a;
    a = Convert.ToDouble(Console.ReadLine());
    if(a >= 0.00 && a <= 2000.00)
    {
        Console.WriteLine("Isento");
    }
    if(a >= 2000.01 && a <= 3000.00)
    {
        b = a - 2000;
        c = b * 0.08;
        Console.WriteLine("R$ " + string.Format("{0:0.00}", c));
    }
    if(a >= 3000.01 && a <= 4500.00)
    {
        b = a - 3000;
        c = b * 0.18 + 1000 * 0.08;
        Console.WriteLine("R$ " + string.Format("{0:0.00}", c));
    }
    if(a > 4500.00)
    {
        b = a - 4500;
        c = b * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        Console.WriteLine("R$ " + string.Format("{0:0.00}", c));
    }
    Console.ReadLine();
  }
}
