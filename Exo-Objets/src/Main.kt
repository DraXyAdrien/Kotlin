

import java.time.LocalTime


fun main() {

    //val personne = Personne()
    //println(nimp)

    //val location = Location("Janvier", "E", 756, 23)
    //print(location.montantTotal())


    //val compte = Compte("Mickaël", 154.0)
    //println(compte.Solde)

    print("Numéro de matricule : ")
    var Matricule:Int = readln().toInt()
    print("Nom : ")
    var Nom:String = readln().toString()
    print("Prénom : ")
    var Prénom:String = readln().toString()
    print("Année d'embauche : ")
    var anneeEmbauche:Int = readln().toInt()
    print("Salaire : ")
    var Salaire:Double = readln().toDouble()
    val Employe = Employe(Matricule,Nom,Prénom,anneeEmbauche,Salaire)
    print(Employe.anciennete())

}
