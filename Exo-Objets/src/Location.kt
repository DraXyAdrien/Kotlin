
class Location {

    var loueur:String = ""
    var categorie:String = "p"
    var km:Int = 0
    var jours:Int = 0

    constructor(){}

    constructor(loueur:String, categorie:String, km:Int, jours:Int){
        this.loueur = loueur
        this.categorie = categorie
        this.km = km
        this.jours = jours
    }

    override fun toString(): String {
        return "Location(loueur='$loueur', categorie='$categorie', km=$km, jours=$jours)"
    }

    fun montantJour():Int{
        val prix:Int = when(this.categorie){
            "E" -> 30
            "C" -> 50
            "L" -> 75
            else -> 0
        }
        return prix
    }

    fun montantLocation():Int{
        val prix_montant_location:Int = montantJour() * this.jours
        return prix_montant_location
    }

    fun kmSupplementaire():Double{
        val prix_km_sup:Double = this.km * 0.5
        return prix_km_sup
    }

    fun montantTotal():Double{
        val Total:Double =  kmSupplementaire() + montantLocation()
        return Total
    }

}