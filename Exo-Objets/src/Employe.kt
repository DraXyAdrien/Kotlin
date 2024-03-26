import java.time.LocalDate

class Employe {
    var Matricule:Int = 0
    var Nom:String = ""
    var Prénom:String = ""
    var anneeEmbauche:Int = 0
    var Salaire:Double = 0.0

    constructor(){

    }

    constructor(Matricule:Int = readln().toInt(), Nom:String, Prénom:String, anneEmbauche:Int, Salaire:Double){
        this.Matricule = Matricule
        this.Nom = Nom
        this.Prénom = Prénom
        this.anneeEmbauche = anneEmbauche
        this.Salaire = Salaire
    }

    override fun toString(): String {
        return "Employe(Matricule=$Matricule, Nom='$Nom', Prénom='$Prénom', anneeEmbauche='$anneeEmbauche', Salaire=$Salaire)"
    }

    fun anciennete():Int{ 
        var ancien:Int = LocalDate.now().year - anneeEmbauche
        return ancien
    }

    fun AugmentationDuSalaire():Int{
        var res: Int =
    }

}