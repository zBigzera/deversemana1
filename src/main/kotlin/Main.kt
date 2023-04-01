/* Este é o Kotlin, uma linguagem de programação extremamente simples e eficaz, e estas são as
atividades desenvolvidas por mim, Otávio Bigogno, referentes a semana 1. Algumas atividades
também podem ser encontradas no arquivo outrasatividades.txt.  Elas estão divididas em tópicos,
 onde as funções (fun) possui como nome o exercício que faz referência (a, b, c, 1, 2, 3) e também
 a palavra do tópico resumida, exemplo, Variaveis e Constantes será VC. */
fun main() {
    println("Oi, eu sou o Otávio, e este é o meu documento para a semana 1 de atividades em Kotlin.")
    // aOP()
    // bOP()
    // cOP()

    // EPS1()
    // EPS2()
    // EPS3()


    // else1()
    // else2()
    // else3()
    // else4()

    // when1()
    // when2()
    // when3()
    // when4()

    desafio()
}
// Exercício referente ao tópico "Variáveis e Constantes", consultar outrasatividades.txt para as
// demais definições e atividades.
fun aVC() {
    var vl: Int = 10
    val value: Int = 5
}

// Exercício referente ao tópico "Tipos de Dados", consultar outrasatividades.txt para as demais
// definições e atividades.
fun aTP() {
    var dec: Double = 20.05
    var dec2: Float = 12.1251F
}

fun bTP() {
    var text: String = "Olá, tudo bem?"
    var dec: Float = 3.14159265359F
}

fun cTP() {
    var inte: Int = 17
    var dec: Float = 7.7777F
}

// Exercício referente ao tópico "Operações", consultar outrasatividades.txt para as demais
// definições e atividades.
fun aOP() {
    val mais1 = 512
    val mais2 = 1271
    println("O resultado da equação de $mais1 + $mais2 é de: ${mais1 + mais2}")
}

fun bOP() {
    val bool: Boolean = 5 > 3 && 2 < 4
    println("")
    println("A boolean possui o resultado $bool")
}

fun cOP() {
    val bool: Boolean = !(10 > 5 || 3 < 1)
    println("")
    println(
        "A boolean, baseada no princípio do ou, e invertida pela exclamação, retornará o resultado de $bool "
    )
}

// Exercício referente ao tópico "Entrada, processamento e saída", consultar outrasatividades.txt
// para as demais definições e atividades.
fun EPS1() {
    println("Digite um número: ")

    var num1 = readLine()!!.toInt()
    println("Digite um outro número: ")
    var num2 = readLine()!!.toInt()
    println("O resultado da soma $num1 + $num2 é de:  ${num1+num2}")
}

fun EPS2() {
    println("Digite um número: ")
    var num = readLine()!!.toInt()
    var quadrado = num * num
    println("O número $num elevado ao seu quadrado é igual a: $quadrado")
}

fun EPS3() {
    println("Digite seu nome: ")
    var nome = readLine()!!
    println("Digite sua idade")
    var idade = readLine()!!.toInt()

    println(
        "Olá $nome, vejo que possui apenas $idade anos, ainda há muito pela frente! Desejo-lhe as boas vindas ao meu sistema, e tome cuidado por onde pisa haha :)"
    )
}
// Exercício referente ao tópico "Questões práticas sobre if/else:", consultar outrasatividades.txt
// para as demais definições e atividades.
fun else1(){
    println ("Digite a nota da 1º prova do aluno: ")
    var nota1 = readLine()!!.toDouble()
    println ("Digite a nota da 2º prova do aluno: ")
    var nota2 = readLine()!!.toDouble()
    val med = (nota1+nota2)/2
    if (med >= 7){ println ("Sua média foi de $med pontos, você foi Aprovado")} else {println("Sua média foi de $med pontos, você foi Reprovado")}
}

fun else2(){
    var num : Int
    num = 3
    if(num%2==0){println ("O número $num é par")}
    else{println("O numéro $num é ímpar")}
}
fun else3(){
    var num : Int
    num = -2
    if(num>0){println("O número $num é positivo")}
    else if(num<0){println("O número $num é negativo")}
    else{println("O número $num é igual a zero")}
}

fun else4(){
    var id = println("Qual sua idade?: ")
    var idade = readLine()!!.toInt()
    if (idade>18){println("Possui mais de 18 anos, pode passar.")}
    else if(idade==18){println("Pode passar")}
    else if(idade<18){println("Negado, Entrada permitida apenas para maiores de 18!")}
    else{println("Idade inválida.")}

}

// Exercício referente ao tópico "Questões práticas sobre when", consultar outrasatividades.txt
// para as demais definições e atividades.
fun when1(){
    println("Digite um número: ")
    var x = readLine()!!.toInt()
    val y = when(x){
        1 -> "Segunda-feira"
        2 -> "Terça-feira"
        3 -> "Quarta-feira"
        4 -> "Quinta-feira"
        5 -> "Sexta-feira"
        6 -> "Sábado"
        7 -> "Domingo"
        else -> "Dia inválido"
    }
    println(y)
}

fun when2(){
    println("Digite o nome de um animal: ")
    var x  = readLine()
    var y = when(x){
        "vaca","gato","cachorro","Vaca", "Gato", "Cachorro", "VACA", "GATO", "CACHORRO" -> "O animal é um mamífero."
        "Galinha","Pato", "Pinguim", "galinha","pato","pinguim", "GALINHA", "PATO", "PINGUIM" -> "O animal é uma ave."
        "Lagarto", "Jacaré", "Cobra", "lagarto", "jacaré", "cobra", "LAGARTO", "JACARÉ", "COBRA" -> "O animal é um réptil"
        else -> "Desconheço a que grupo o animal pertence."
    }
    println(y)
}

fun when3(){

    var x : Char = 'A'
    if (x in 'a'..'z' || x in 'A'..'Z'){
        var y = when (x){
            'A', 'a' -> "É uma vogal"
            'E', 'e' -> "É uma vogal"
            'I', 'i' -> "É uma vogal"
            'O', 'o' -> "É uma vogal"
            'U', 'u' -> "É uma vogal"
            else -> "É uma consoante"
        }
        println(y)
    }
    else{println("Isto não é uma letra.")}
}

fun when4(){
    println("Digite um número de 1 a 12: ")
    var x = readLine()!!.toInt()
    var y = when (x){
        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Março"
        4 -> "Abril"
        5 -> "Maio"
        6 -> "Junho"
        7 -> "Julho"
        8 ->  "Agosto"
        9 ->  "Setembro"
        10 -> "Outubro"
        11 -> "Novembro"
        12 -> "Dezembro"
        else -> "Não existe um mês com esse número."
    }
    println(y)
}

// Exercício referente ao tópico "Desafio Semanal", consultar outrasatividades.txt
// para as demais definições e atividades.
fun desafio(){println("Você deseja converter uma temperatura (T), distância (D) ou tempo?")

    val x = readLine()

    val y = if(x=="T" || x=="t"|| x=="Temperatura" || x=="temperatura"){
        println("Você deseja converter Celsius para Fahrenheit (Digite 1) ou Fahrenheit para Celsius (Digite 2)?" )

        val cf = readLine()!!.toInt()
        var fah : Double
        var cel : Double
        when (cf) {
            1 -> {println("Qual é a temperatura em graus Celsius?: ")
                var cel = readLine()!!.toDouble()
                println("A temperatura $cel ºC convertida para Fahrenhait é igual a: "+ cel * 9/5 + 32)};
            2 -> {println("Qual é a temperatura em Fahrenheit?: ")}
                var fah = readLine()!!.toDouble()
            println("A temperatura $fah convertida para Celsius é igual a: "+(fah-32)* 5/9)}}

    else if(x=="D"|| x=="d" || x=="Distância"|| x=="Distancia"|| x=="distancia"|| x=="distância"){
        println("O que você deseja converter? (MM, CM, M, KM)")
        var cf = readLine()
        println("Qual é o valor da médida a ser convertida?")
        var valor = readLine()!!.toFloat()
        println("Para que você deseja converter?")
        var pf = readLine()

        when(cf){
            "MM", "mm" -> if(pf=="CM" || pf=="cm"){println("$valor mm são ${valor/10} centímetros.")}
            if(pf=="M" || pf=="m"){println("$valor mm são ${valor/1000} metros.")}
                if(pf=="KM" || pf=="km"){println("$valor mm são ${valor/1000000} quilômetros.")}

            "CM", "cm" -> if(pf=="MM" || pf=="mm"){println("$valor cm são ${valor*10} milímetros.")}
            if(pf=="M" || pf=="m"){println("$valor cm são ${valor/100} metros.")}
                if(pf=="KM" || pf=="km"){println("$valor cm são ${valor/100000} quilômetros.")}

            "M", "m" ->   if(pf=="MM" || pf=="mm"){println("$valor m são ${valor*1000} milímetros.")}
            if(pf=="CM" || pf=="cm"){println("$valor m são ${valor*100} centímetros.")}
                if(pf=="KM" || pf=="km"){println("$valor m são ${valor/1000} quilômetros.")}

            "KM", "km" -> if(pf=="MM" || pf=="mm"){println("$valor km são ${valor*1000000} milímetros.")}
            if(pf=="CM" || pf=="cm"){println("$valor km são ${valor*100000} centímetros.")}
                if(pf=="M" || pf=="m"){println("$valor km são ${valor*1000} metros.")}

            else -> println("Entrada inválida")
        }
    }
    else{println("Opção inválida")}
}
