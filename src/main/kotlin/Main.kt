import kotlin.random.Random

fun main() {
    var target: Int = (1..100).random()
    var lineIn: Int = 0
    var tries: Int = 1

    println("Welcome to the random Number Generator!!")
    print("Please enter your guess: ")
    lineIn = readLine()!!.toInt()

    while (lineIn != target){
        if (lineIn > target){
            println("Your guess is too high. Try again")
        } else if (lineIn < target){
            println("Your guess is too low. Try again")
        }
        tries++
        lineIn = readLine()!!.toInt()
    }

    println("Congratulations! After $tries tries, you correctly guessed $target!")
}