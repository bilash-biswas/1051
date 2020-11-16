object Main {
  def main(args:Array[String]){ 
    var a = scala.io.StdIn.readDouble()
    if(a >= 0.00 && a <= 2000.00)
    {
        println("Isento")
    }
    if(a >= 2000.01 && a <= 3000.00)
    {
        var b = a - 2000
        var c = b * 0.08
        println("R$ %.2f".format(c))
    }
    if(a >= 3000.01 && a <= 4500.00)
    {
        var b = a - 3000
        var c = b * 0.18 + 1000 * 0.08
        println("R$ %.2f".format(c))
    }
    if(a > 4500.00)
    {
        var b = a - 4500
        var c = b * 0.28 + 1500 * 0.18 + 1000 * 0.08
        println("R$ %.2f".format(c))
    }
  }
}
