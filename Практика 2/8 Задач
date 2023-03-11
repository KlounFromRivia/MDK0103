import java.lang.Exception
import java.lang.NumberFormatException
import java.util.*
import kotlin.math.log

fun main(args: Array<String>) {
    /*РАБОТУ ВЫПОЛНИЛ Меньшиков Данила Александрович ИП-20-3*/
    /*Задача 1.
Создать приложение, которое подсчитывает количество подряд идущих одинаковых символов во введенной строке.
На вход подается, например, строка AAADSSSRRTTHAAAA.
На выходе получаем A3DS3R2T2HA4.
То есть, если количество подряд идущих символов меньше двух, то мы не пишем единицу*/
var n = 0
    println("Задача 1.")
    println("Введите строку символов")
    var Str1:String = readln().toString()+" ";
    var Str2 = Str1[0]

    for(x in Str1){
        if(x == Str2)
        {
            n++
        }else if(n < 2){
            print("$Str2")
            Str2 = x
        }else{
            print("$Str2$n")
            Str2=x
            n=1
        }
    }
    println("\n")
    println("*******************************************************************\n")
    print("Задача 2.")
    pr2_2()

    println("*******************************************************************\n")
    print("Задача 3.")
    pr2_3()
    println()

    println("*******************************************************************\n")
    println("Задача 4.")
    pr2_4()
    println()

    println("*******************************************************************\n")
    println("Задача 5.")
    pr2_5()
    println()

    println("*******************************************************************\n")
    println("Задача 6.")
    pr2_6()
    println()

    println("*******************************************************************\n")
    println("Задача 7.")
    pr2_7()
    println("\n")

    println("*******************************************************************\n")
    println("Задача 8.")
    pr2_8()
}
fun pr2_2(){
    /*Задача 2.
Создать приложение, которое подсчитывает количество различных символов во введенной строке.
Символы в ответе расположить в алфавитном порядке.
Например, дана строка AASADDSS.
На выходе получаем:
A - 3
D - 2
S - 3*/
    println()
    println("Введите строку символов")
    var n = 0
    var Str1:String = readln();
    val char = Str1.toCharArray();
    Str1 = char.sorted().joinToString("")+" "
    var Str2 = Str1[0]

    for(x in Str1){
        if(x == Str2)
        {
            n++
        }else{
            println(Str2+" - "+n.toString())
            Str2=x
            n=1
        }
    }
    println()
}
fun pr2_3(){
    /*Задача 3.
Создать приложение, которое преобразует введенное пользователем натуральное
число из 10-ичной системы в двоичную.*/
    println()
    println("Введите натуральное число, которое будет преобразовано " +
            "\nиз 10-ичной системы в двоичную")
    try {
        var ch: Int = readln().toInt()
        var Str1 = ""
        var x = ch

        while (ch >= 1) {
            Str1 += (ch % 2).toString()
            ch = ch / 2
        }
        println(Str1.reversed().toString())
    }
    catch (e:Exception){
        println("ОШИБКА! НЕКОРРЕКТНЫЙ ВВОД!");
    }
}

fun pr2_4() {
    /*Задача 4.
Создать приложение, с помощью которого пользователь, введя два числа и символ операции,
узнает результат.
Символами операции могут быть: / — деление, * — умножение, + — сложение, - — вычитание.
Числа могут быть вещественными.
Числа и знак операции разделяются между собой одним пробелом.
Ввод производится в формате - ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ*/
    var vvod:Triple<Double,Double,String>
    var prov:Boolean = false
    vvod = Triple(0.0,0.0," ")
    while(prov == false)
    {
    println("Введите 2 числа и символ операции через пробел.\n" +
            "Ввод производится в формате - ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ")
    print("Ввод: ")
        try {
            val (a,b,c) = readln()!!.split(' ')
            vvod = vvod.copy(first = a.toDouble())
            vvod = vvod.copy(second = b.toDouble())
            vvod = vvod.copy(third = c)
            when(vvod.third){
                "+" -> {
                    println("Сумма = ${vvod.first + vvod.second}")
                    break
                }
                "-" -> {println("Разность = ${vvod.first - vvod.second}")
                    break
                }
                "*" -> {println("Произведение = ${vvod.first * vvod.second}")
                    break
                }
                "/" -> {println("Частное = ${vvod.first / vvod.second}")
                    break
                }
                else -> {println("ОШИБКА ВВОДА!\n" +
                        "ПОВТОРИТЕ ВВОД!")
                    println()
                }
            }
        }
        catch (e: NumberFormatException){
            println("ОШИБКА ВВОДА!\n" +
                    "ПОВТОРИТЕ ВВОД!")
                println()
        }
    }
}
fun pr2_5() {
    /*Задача 5.
Создать приложение, с помощью которого пользователь, введя число n и основание степени x узнает,
существует ли целочисленный показатель степени y для которого выполняется равенство xy = n.
В случае, если показатель существует – вычислить его и вывести.
В противном случае вывести текст – «Целочисленный показатель не существует».*/
    var prov:Boolean = false
    while(prov == false) {
        println("x^y = n")
        print("Введите число n: ")
        val n = readln()
        print("Введите основание x: ")
        val x = readln()
        try {
            val result = (log(n.toDouble(), 10.0) / log(x.toDouble(), 10.0)).toInt()
            if ((log(n.toDouble(), 10.0) / log(x.toDouble(), 10.0)) - result == 0.0) {
                println(log(n.toDouble(), 10.0) / log(x.toDouble(), 10.0))
                break
            } else {
                println("Целочисленный показатель не существует")
                break
            }
        } catch (e: NumberFormatException) {
            println("Некорректные данные!")
            println()
        }
    }
}
fun pr2_6() {
    /*Задача 6.
Создать приложение, в котором пользователь вводит две различных цифры.
На выходе приложение выдает, если это возможно, из введенных цифр, нечетное число.
Результат выводится в консоль.
При невозможности создать нечетное число выводится сообщение – «Создать нечетное число невозможно»*/
    var prov:Boolean = false
    while(prov == false) {
        print("Введите первую цифру: ")
        val X = readln()
        print("Введите вторую цифру: ")
        val Y = readln()
        try {
            if ((X + Y).toInt() % 2 != 0) {
                println("Нечетное число: ${(X + Y).toInt()}")
                return
            } else if ((Y + X).toInt() % 2 != 0) {
                println("Нечетное число: ${(Y + X).toInt()}")
                return
            } else println("Создать нечетное число невозможно!")
            break
        } catch (e: NumberFormatException) {
            println("Некорректные данные!")
            println()
        }
    }
}

fun pr2_7() {
    /*Задача 7.
Создать приложение, в котором пользователь дает на вход два числовых массива,
числа в массиве могут повторяться.
На выходе приложение выдает пересечение этих массивов.
Например, на входе [1, 2, 3, 2, 0] и [5, 1, 2, 7, 3, 2, 2].
На выходе должны получить [1, 2, 2, 3]  */
    var n1: Int?
    var n2: Int?
    do{
        print("Введите размер первого массива: ")
        n1 = readlnOrNull()?.toIntOrNull()
        print("Введите размер второго массива: ")
        n2 = readlnOrNull()?.toIntOrNull()
    } while (n1 == null && n2 == null)
    try {
        val mas1 = IntArray(n1!!)
        val mas2 = IntArray(n2!!)
        var output = emptyArray<Int>()
        var chet = 0
        for (i in mas1.indices){
            print("Введите mas1[$i] элемент: ")
            mas1[i] = readln().toInt()
        }
        for (i in mas2.indices){
            print("Введите mas2[$i] элемент: ")
            mas2[i] = readln().toInt()
        }
        println()
        for (i in mas1.indices){
            chet = i
            while (chet <= mas2.size-1){
                if (mas1[i] == mas2[chet]){
                    output += mas1[i]
                    break
                }
                chet++
            }
            if (chet > mas2.size) break
        }
        output.sort()
        print("Полученный массив: ")
        output.onEach { print(it) }

    } catch (e:NumberFormatException){
        println("Некорректные данные!")
    }
}
fun pr2_8() {
    /*Задача 8.
    Создать приложение, в котором пользователь вводит массив из различных слов.
    На выходе приложение должно показать слова сгруппированные по признаку "состоят из одинаковых букв".
    Например, на входе ["eat", "tea", "tan", "ate", "nat", "bat"].
    Получаем группы:
"ate", "eat", "tea"
"nat", "tan"
"bat" */
    try {
        val wordsmas = arrayListOf<String>()
        print("Введите количество слов: ")
        for (i in 0 until readln().toInt()){
            print("Введите слово: ")
            wordsmas.add(readln())
        }
        val result = wordsmas.sortedBy { it.toCharArray().sorted().joinToString("") }
        print("Полученный массив: ")
        result.onEach { print("$it ") }
    } catch (e:NumberFormatException) {
        println("Некорректные данные!")
    }
}
