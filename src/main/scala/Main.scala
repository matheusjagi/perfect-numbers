import scala.io.StdIn
@main 
def run(): Unit =
    println("Informe o numero positivo que deseja verificar sua perfeicao: ")
    val value = StdIn.readInt()

    if perfectNumber(value) then
        println("Seu numero e perfeito!")
    else
        println("Seu numero NAO e perfeito.")