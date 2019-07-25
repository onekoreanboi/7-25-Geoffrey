open class Canine : Animal() {
    override fun roam(){
        println("The Canine is roaming")
    }
}

class Fox : Canine() {
    override val image = "fox.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Yelp!")
    }

    override fun eat() {
        println("The Fox is eating $food")
    }

}

class Wolf : Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hooooowl!")
    }

    override fun eat() {
        println("The Wolf is eating $food")
    }

}