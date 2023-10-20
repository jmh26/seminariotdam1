package com.example.seminariotdam1


import kotlin.math.max


fun maxnum1(lista: List<Int>): Int{

    var max = lista[0]
    for (i in 1 until lista.size){
        if (lista[i] > max){
            max=lista[i]
        }
    }
    return max

}

fun suma2(vararg numeros: Int): Int {
    var sumaTotal = 0
    for (numero in numeros) {
        sumaTotal += numero
    }
    return sumaTotal
}

fun distancia3(millas:Double): Double {
    return millas*1.609
}

fun cadenatext4(texto: String): Boolean{

    return texto.equals(texto.reversed())


}


fun vecesLetra5(texto: String, letra: Char): String {
    var contador = 0

    for (caracter in texto) {
        if (caracter == letra) {
            contador++
        }
    }

    return "la letra $letra aparece $contador veces"
}

fun vecesSubcadena6(texto:String, subcadena:String){
    var textoSplit = texto.split(subcadena)



    println(textoSplit.size-1)

}

fun mayusPalabra7(texto:String): String{

    var palabras = texto.split(" ")

    var mayuscula = palabras.map { it.capitalize() }

    return mayuscula.joinToString( " ")


}

fun sumaNum8(numero:Int): Int{
    var numeros = numero
    var suma = 0

    while (numeros >0){
        var num = numeros % 10
        suma += num
        numeros /= 10
    }
    return suma
}

fun maxComDiv9(numero1: Int , numero2: Int): Int{
    var num1 = numero1
    var num2 = numero2

    while(num2!= 0){

        var holdear = num2

        num2 = num1 % num2
        num1 = holdear


    }

    return num1
}

fun suceFibonacci10(numero: Int): Int{
    if (numero<= 1){
        return numero
    }
    return suceFibonacci10(numero-1)+ suceFibonacci10(numero-2)
}


fun PrimosRelativos11(): Boolean {
    var numero1 = 33
    var numero2 = 20
    var mcd = maxComDiv9(numero1, numero2)
    return mcd == 1
}

fun esCapicua12(numero: Int): Boolean{
    var alreves = numero.toString().reversed().toInt()

    return numero == alreves
}


fun aHtml13(cosas: String): String {
    val partes = cosas.split(".")
    val etiqueta = partes[0]
    val atributos = StringBuilder()

    for (i in 1 until partes.size) {
        val parte = partes[i]
        if (parte.contains('#')) {
            val splitParte = parte.split("#")
            val clase = splitParte[0]
            val id = splitParte[1]
            atributos.append("class=\"$clase\" id=\"$id\" ")
        } else {
            atributos.append("class=\"$parte\" ")
        }
    }

    return "<$etiqueta $atributos></$etiqueta>"
}
fun Mosaico14(n: Int) {
    for (i in 1..n) {
        repeat(i) {
            print(i)
        }
        println()
    }
}


fun compararArrays15(array1: IntArray, array2: IntArray): BooleanArray {

    if (array1.size != array2.size) {
        throw IllegalArgumentException("Los tamaños de los arrays no son iguales")
    }


    val resultados = BooleanArray(array1.size)


    for (i in array1.indices) {
        resultados[i] = array1[i] == array2[i]
    }

    return resultados
}


fun hacerProducto16(lista: List<Int>): Int {

    var producto = 1
    for (elemento in lista) {
        producto *= elemento
    }

    return producto
}

fun numerosPares17(lista: List<Int>): List<Int>{
    val numerosPares = mutableListOf<Int>()

    for (numero in lista){
        if(numero % 2 == 0){
            numerosPares.add(numero)
        }
    }
    return numerosPares
}

fun esPrimo18(numero: Int): Boolean {
    if (numero <= 1) {
        return false
    }

    for (i in 2 until numero) {
        if (numero % i == 0) {
            return false
        }
    }

    return true
}

fun eliminaVocal19(texto: String): String {
    var resultado = ""

    for (letra in texto) {
        if (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u' &&
            letra != 'A' && letra != 'E' && letra != 'I' && letra != 'O' && letra != 'U') {
            resultado += letra
        }
    }

    return resultado
}
fun hacerFactorial20(numero: Int): Int {


    var factorial: Int = 1

    for (i in 1..numero) {
        factorial *= i
    }

    return factorial
}

fun textoInvertido21(texto: String): String{
    var invertido = texto.reversed()

    return invertido
}

fun esNumeroPerfecto22(numero: Int): Boolean {

    var sumaDivisores = 0

    for (i in 1 until numero) {
        if (numero % i == 0) {
            sumaDivisores += i
        }
    }

    return sumaDivisores == numero
}

fun esNumeroArmstrong23(numero: Int): Boolean {
    val numeroComoTexto = numero.toString()
    val potencia = numeroComoTexto.length
    var suma = 0

    for (digito in numeroComoTexto) {

        suma += Math.pow(digito.toString().toDouble(), potencia.toDouble()).toInt()
    }

    return suma == numero
}

fun bidimensionalNumeroGrande24(matriz: List<List<Int>>): Int {


    var numeroGrande = matriz[0][0]

    for (fila in matriz) {
        for (elemento in fila) {
            if (elemento > numeroGrande) {
                numeroGrande = elemento
            }
        }
    }

    return numeroGrande
}

fun bidimensionalNumeroPequeño25(matriz: List<List<Int>>): Int{


    var numeroPequeño = matriz[0][0]

    for (fila in matriz) {
        for (elemento in fila) {
            if (elemento < numeroPequeño) {
                numeroPequeño = elemento
            }
        }
    }

    return numeroPequeño
}

fun palabraMasLarga26(palabras:  List<String>): String {


    var palabraMasLarga = palabras[0]

    for (palabra in palabras) {
        if (palabra.length > palabraMasLarga.length) {
            palabraMasLarga = palabra
        }
    }

    return palabraMasLarga
}
fun palabraMasCorta27(palabras:  List<String>): String {


    var palabraMasCorta = palabras[0]

    for (palabra in palabras) {
        if (palabra.length < palabraMasCorta.length) {
            palabraMasCorta = palabra
        }
    }

    return palabraMasCorta
}


fun tieneLetrasyEspacios28(cadena: String): Boolean {
    for (caracter in cadena) {
        if (caracter != ' ' && (caracter < 'a' || caracter > 'z') && (caracter < 'A' || caracter > 'Z')) {
            return false
        }
    }
    return true
}

fun esAnagrama29(cadena1: String, cadena2: String): Boolean {

    val cadena1SinEspacios = cadena1.replace(" ", "").lowercase()
    val cadena2SinEspacios = cadena2.replace(" ", "").lowercase()

    return cadena1SinEspacios.toCharArray().sorted() == cadena2SinEspacios.toCharArray().sorted()
}

fun esTriangulo30(numero: Int): Boolean {
    var suma = 0
    var i = 1

    while (suma < numero) {
        suma += i
        i++
    }

    return suma == numero
}

fun duplicarNumeros31(lista: List<Int>): List<Int> {
    val listaDuplicada = mutableListOf<Int>()

    for (numero in lista) {
        listaDuplicada.add(numero * 2)
    }

    return listaDuplicada
}

fun hacerDiccionario32(claves: List<String>, valores: List<Int>): Map<String, Int> {


    val diccionario = mutableMapOf<String, Int>()

    for (i in claves.indices) {
        diccionario[claves[i]] = valores[i]
    }

    return diccionario
}

fun decimalABinario33(decimal:Int):String{

    var binario= ""
    var numeroDecimal = decimal
    while(numeroDecimal>0){
        var resto = decimal % 2
        binario = "$resto$binario"
        numeroDecimal /= 2
    }
    return binario
}
//IMPORTANTES


fun encriptarKaraca34(texto: String): String {
    val invertido = texto.reversed()
    val reemplazado = invertido.replace("a", "E")
        .replace("h", "U")
        .replace("q", "R")
        .replace("o", "Q")
        .replace("l", "X")
    return reemplazado
}




fun desencriptarKaraca34(textoCifrado: String): String {
    val reverso = textoCifrado.reversed()
    val original = reverso.replace("E", "a")
        .replace("U", "h")
        .replace("R", "q")
        .replace("Q", "o")
        .replace("X", "l")
    return original
}

fun ordenarMatriz35(matriz: MutableList<List<Int>>, orden: String): List<List<Int>> {
    val matrizOrdenada = mutableListOf<List<Int>>()

    for (fila in matriz) {
        val filaOrdenada = fila.toMutableList()

        val n = filaOrdenada.size

        for (i in 1 until n) {
            val valorActual = filaOrdenada[i]
            var j = i - 1

            if ((orden == "Asc" && filaOrdenada[j] > valorActual) ||
                (orden == "Desc" && filaOrdenada[j] < valorActual)) {
                while (j >= 0 &&
                    ((orden == "Asc" && filaOrdenada[j] > valorActual) ||
                            (orden == "Desc" && filaOrdenada[j] < valorActual))) {
                    filaOrdenada[j + 1] = filaOrdenada[j]
                    j--
                }
                filaOrdenada[j + 1] = valorActual
            }
        }

        matrizOrdenada.add(filaOrdenada)
    }

    return matrizOrdenada
}


fun main(){

    //ej1

    val lista = listOf(1, 5, 3, 9, 2, 8)
    val resultado = maxnum1(lista)
    println("El número máximo en la lista es: $resultado")


    //ej2

    val sumatoria = suma2(1, 2, 3, 4, 5)
    println("La suma de los números es: $sumatoria")



    //ej3

    println(distancia3(3.0))

    //ej 4

    println(cadenatext4("ama"))

    //ej 5


    println(vecesLetra5("hola que tal", 'a'))


    //ej 6

    println(vecesSubcadena6("mi perro llama pepe", "mi"))


    //ej 7
    println(mayusPalabra7("hola que tal"))

    //ej 8
    println(sumaNum8(92))


    //ej 9
    println(maxComDiv9(50 ,20))

    //ej 10
    println(suceFibonacci10(3))

    //ej 11

    if (PrimosRelativos11()) {
        println("Son primos relativos.")
    } else {
        println("No son primos relativos.")
    }

    //ej 12
    if(esCapicua12(313)){
        println("Es capicúa")
    }else{
        println("No es capicúa")
    }

    //ej 13

    println(aHtml13("div.coche#VWPolo"))
    println(aHtml13("a"))
    println(aHtml13("div.oferta"))

    //ej 14

    println(Mosaico14(6))

    //ej 15
    val array1 = intArrayOf(1, 2, 3, 4, 5)
    val array2 = intArrayOf(1, 2, 3, 6, 5)

    val resultados = compararArrays15(array1, array2)

    println("Resultados de la comparación:")
    for (i in resultados.indices) {
        println("Elemento $i: ${resultados[i]}")
    }

    //ej 16
    println(hacerProducto16(listOf(3,4,5,6)))

    //ej 17
    println(numerosPares17(listOf(1,2,3,4,5,6)))

    //ej 18
    println(esPrimo18(13))

    //ej 19

    println(eliminaVocal19("hola que tal"))

    //ej 20

    println(hacerFactorial20(5))

    //ej 21

    println(textoInvertido21("hola"))

    //ej 22

    println(esNumeroPerfecto22(6))

    //ej 23

    println(esNumeroArmstrong23(153))

    //ej 24
    val matrizgrande = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )

    val numeroGrande = bidimensionalNumeroGrande24(matrizgrande)

    if (numeroGrande != null) {
        println("El número más grande en la matriz es: $numeroGrande")
    } else {
        println("La matriz está vacía.")
    }

    //ej 25
    val matriz = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )

    val numeroPequeño = bidimensionalNumeroPequeño25(matriz)

    if (numeroPequeño != null) {
        println("El número más grande en la matriz es: $numeroPequeño")
    } else {
        println("La matriz está vacía.")
    }

    //ej 26
    println(palabraMasLarga26(listOf("hola", "saludos", "webos")))

    //ej 27
    println(palabraMasCorta27(listOf("hola", "saludos", "webos")))

    //ej 28

    println(tieneLetrasyEspacios28("Duerman al que ha creado kotlin"))

    //ej 29

    println(esAnagrama29("hola","alho"))

    //ej 30

    println(esTriangulo30(10))


    //ej 31

    println(duplicarNumeros31(listOf(2,3,4,5)))

    //ej 32
    val claves = listOf("a", "b", "c")
    val valores = listOf(1, 2, 3)

    val diccionario = hacerDiccionario32(claves, valores)

    println("Diccionario: $diccionario")


    //ej 33

    println(decimalABinario33(5))

//IMPORTANTES

    
    //ej 34

    println(encriptarKaraca34("hola"))
    println(desencriptarKaraca34("EXQU"))


    //ej 35


    println(ordenarMatriz35(mutableListOf(listOf(4,5,6),(listOf(7,8,9))),"Asc"))
    println(ordenarMatriz35(mutableListOf(listOf(4,5,6),(listOf(7,8,9))),"Desc"))

}