package henriquebank

class Pessoa {
    var nome : String="Henrique"
    var cpf : String = "123.456.789.12"

}

fun main(){
    val henrique=Pessoa()
    println(henrique.nome)

    println(henrique.cpf)
}