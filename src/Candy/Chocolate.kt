package Candy

data class Chocolate(
    var name : String,
    var calories: Int
){
    override fun toString(): String {
        return """
            Nombre: ${name}
            calorias: ${calories}
            """.trimIndent()
    }
}