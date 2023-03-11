import java.math.RoundingMode
import kotlin.random.Random

fun main(args: Array<String>) {
    //Практическая работа №3 Меньшиков Данила ИП-20-3
    val KNB = arrayOf("Камень","Ножницы","Бумага")
    println("Сыграйте К-Н-Б с компьютором\n" +
            "1 - камень" +
            "\n2 - ножницы" +
            "\n3 - бумага")
    var player: String
    while(true)
    {
        while(true)
        {
            player = readln()
            if (player == "1" || player == "2"||player == "3")
            {
                break;
            }
            else println("Ошибка ввода")
        }
        val vibor = player.toInt()
        val comp = (Random.nextInt(0,3)+1).toBigDecimal().setScale(1,RoundingMode.DOWN).toInt()
        println("Вы выбрали "+KNB[vibor-1]+" - Компьютор выбрал "+KNB[comp-1])
        var result = proverka(vibor,comp)
        if (result != "Ничья!"){
            println(result)
            break;
        }
        else
        {
            println(result)
            println("\nПереигровка"+
                    "\n1 - камень" +
                    "\n2 - ножницы" +
                    "\n3 - бумага")
        }
        println()
    }
}
fun proverka(vibor: Int,comp: Int): String{
    when (vibor){
        1 -> when  (comp){
            2 -> return "Камень затупляет или ломает ножницы" +
                    "\nВы победили!"
            3 -> return "Бумага обёртывает камень" +
                    "\nВы проиграли!"
        }
        2 -> when  (comp){
            1 -> return "Камень затупляет или ломает ножницы" +
                    "\nВы проиграли!"
            3 -> return "Ножницы разрезают бумагу" +
                    "\nВы победили!"
        }
        3 -> when  (comp){
            1 -> return "Бумага обёртывает камень" +
                    "\nВы победили!"
            2 -> return "Ножницы разрезают бумагу" +
                    "\nВы проиграли!"
        }
    }
    return "Ничья!"
}

