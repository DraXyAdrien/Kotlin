class Compte {

    var Nom:String = ""
    var Solde:Double = 0.0

    constructor(){

    }

    constructor(Nom:String, Solde:Double){
        this.Nom = Nom
        this.Solde = Solde
    }

    override fun toString(): String {
        return "Compte(Nom='$Nom', Solde=$Solde)"
    }

    fun getBalance():Double{
        var balance:Double = this.Solde
        return balance
    }

    fun retirer(montant:Double):Double{
        var montant:Double = this.Solde - montant
        return montant
    }

    fun deposer(montant:Double):Double{
        var montant:Double = this.Solde + montant
        return montant
    }

}