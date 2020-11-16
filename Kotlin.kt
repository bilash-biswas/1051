import java.util.Scanner

fun main(args: Array<String>){
    val read = Scanner(System.`in`);
    var b:Double
    var c:Double
    var a = read.nextDouble()
    if(a >= 0.00 && a <= 2000.00)
    {
        println("Isento");
    }
    if(a >= 2000.01 && a <= 3000.00)
    {
        b = a - 2000;
        c = b * 0.08;
        println("R$ %.2f".format(c));
    }
    if(a >= 3000.01 && a <= 4500.00)
    {
        b = a - 3000;
        c = b * 0.18 + 1000 * 0.08;
        println("R$ %.2f".format(c));
    }
    if(a > 4500.00)
    {
        b = a - 4500;
        c = b * 0.28 + 1500 * 0.18 + 1000*0.08;
        println("R$ %.2f".format(c));
    }
}

    
