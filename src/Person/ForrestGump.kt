package Person

import Candy.*
import java.lang.Math.random
import java.util.Random
class ForrestGump<T>(
    val chocolatesPicked : BoxOfChocolate<T>
) {
    fun pickChocolate(): String{
        val chocolatePickced = chocolatesPicked.pickOne()
        if (chocolatePickced == null){
            return "Ya no hay chocolates! que mal!"
        }
        return "Genial, me encanta este chocolate \n${chocolatePickced}"
    }
}