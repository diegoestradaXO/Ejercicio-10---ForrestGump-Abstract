package Candy
import java.util.*
 open class BoxOfChocolate<T>(
     val chocolates : ArrayList<T>
 )
 {
    fun pickOne(): T?{//Si la caja de chocolates tiene mas de 0 chocolates
        if(chocolates.size >0){
            return chocolates.removeAt(Random().nextInt(chocolates.size))//elimina el chocolate seleccionado de la caja
        }
        return null//en caso de que no hayan mas chocolates se retorna null
    }
 }