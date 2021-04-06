fun main(){
    val prevPaySum = 0.00
    val cardType = "MasterCard"
    val currentAmmount = 11350.00

    println("тест")

    when(cardType){
        "Vk Pay"-> {
            when {
                ((currentAmmount <= 15000.00) && (currentAmmount + prevPaySum <= 40000.00)) -> {
                    println("comissiya $cardType ($currentAmmount): " + calculatePay(prevPaySum,cardType,currentAmmount))
                }
                else -> println("$cardType maksimalnaya summa perevoda VK Pay 15000 za raz i 40000 za mesyac")
            }
        }
        else -> {
            when {
                ((currentAmmount <= 150000.00) && (currentAmmount + prevPaySum <= 600000.00)) -> {
                    println("comissiya $cardType ($currentAmmount): " + calculatePay(prevPaySum,cardType,currentAmmount))
                }
            }
        }
    }
    //println("тест");
}




fun calculatePay(prevPay:Double=0.00,cardT:String,currAmount:Double):Double{
    val commision:Double = when(cardT){
        "Vk Pay" -> 0.00
        "MasterCard","Maestro" -> {
            when {
                (currAmount + prevPay) < 75000 -> 0.0
                else -> 0.06
            }
        }
        "Visa","Mir" -> 0.075
        else -> 0.00
    }
    if(commision>0.0)
        return commision*currAmount
    else
        return 0.0
}