open class Feline : Animal() {
    override fun roam(){
        println("The Feline is roaming")
    }
}

class Lynx : Feline() {
    override val image = "lynx.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Screech!")
    }

    override fun eat() {
        println("The Lynx is eating $food")
    }

}


class Cheetah : Feline() {
    override val image = "cheetah.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Purr!")
    }

    override fun eat() {
        println("The Cheetah is eating $food")
    }

}

class Lion : Feline() {
    override val image = "lion.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Roar!")
    }

    override fun eat() {
        println("The Lion is eating $food")
    }

}