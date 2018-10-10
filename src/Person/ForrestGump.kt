package Person

import Candy.*
import java.lang.Math.random
import java.util.Random
class ForrestGump<T>(
    val chocolatesPicked : BoxOfChocolate<T>
) {
    fun pickChocolate(): String{//FORREST TOMA CHOCOLATES
        val chocolatePickced = chocolatesPicked.pickOne()//SELECCIONA EL CHOCOLATE
        if (chocolatePickced == null){
            return "Ya no hay chocolates! que mal!"// EN CASO DE QUE EL TAMANIO DE LA LISTA CHOCOLATES SE A 0 (NULL)
        }
        return "Genial, me encanta este chocolate \n${chocolatePickced}"//MUESTRA EL CHOCOLATE SELECCIONADO Y CALORIAS
    }
}