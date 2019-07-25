class Vet {
    fun giveShot(animal: Animal) {
        //Code to do something meidcal
        animal.makeNoise()
    }
}

fun main(){
    val animals = arrayOf(Hippo(), Wolf(), Lynx(), Lion(), Fox(), Cheetah())
    for (item in animals) {
        item.roam()
        item.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    val lynx = Lynx()
    val lion = Lion()
    val fox = Fox()
    val cheetah = Cheetah()
    vet.giveShot(wolf)
    vet.giveShot(hippo)
    vet.giveShot(lynx)
    vet.giveShot(lion)
    vet.giveShot(fox)
    vet.giveShot(cheetah)

}