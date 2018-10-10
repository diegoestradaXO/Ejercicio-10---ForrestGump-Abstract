import Candy.BoxOfChocolate
import Candy.Chocolate
import Person.ForrestGump

fun main(args: Array<String>){
    //CREAR LA CAJA DE CHOCOLATES
    var myBoxOfChocolate= BoxOfChocolate<Chocolate>(arrayListOf(
            Chocolate("KitKat",4000),
            Chocolate("Hershey",3500),
            Chocolate("Snickers",5000),
            Chocolate("MilkyWay",3600),
            Chocolate("Toblerone",1000),
            Chocolate("Musketeer",5040),
            Chocolate("Reese's",7000),
            Chocolate("YorkMint",100),
            Chocolate("Cadbury",1000),
            Chocolate("Ghirardelli",400)
    ))
    //CREO A FORREST Y SE LE ASIGNA LA CAJA DE CHOCOLATES QUE CREE ANTERIORMENTE
    val forrestGump = ForrestGump<Chocolate>(myBoxOfChocolate)
    println(forrestGump.pickChocolate())
    println(forrestGump.pickChocolate())
    println(forrestGump.pickChocolate())
    println(forrestGump.pickChocolate())
    println(forrestGump.pickChocolate())
    println(forrestGump.pickChocolate())
    println(forrestGump.pickChocolate())//FORREST TOMA LOS CHOCOLATES, INDICANDO SU MARCA Y CALORIAS
    println(forrestGump.pickChocolate())
    println(forrestGump.pickChocolate())
    println(forrestGump.pickChocolate())
    println(forrestGump.pickChocolate())

}