package Candy
import java.util.*
 open class BoxOfChocolate<T>(
     val chocolates : ArrayList<T>
 )
 {
    fun pickOne(): T?{
        if(chocolates.size >0){
            return chocolates.removeAt(Random().nextInt(chocolates.size))
        }
        return null
    }
 }