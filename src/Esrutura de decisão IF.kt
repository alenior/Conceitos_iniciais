fun main() {
    // Classifique as pessoas através da faixa etária.
    // Idoso: 60 anos ou mais; Adulto: 21 a 59 anos; Jovem: 13 a 20 anos; Criança: 12 anos ou menos.
    var idade:Int = 5
    if(idade >= 60){
        println("Essa pessoa é idosa.")
    }else if(idade <= 59 && idade >= 21){
        println("Essa pessoa é adulta.")
    }else if(idade <= 20 && idade >= 13){
        println("Essa pessoa é jovem.")
    }else{
        println("Essa pessoa é criança.")
    }
}