package id.infinitelearning.KotlinSubmission.exercise4
import kotlin.ArithmeticException
fun main() {

}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

    fun main(args : Array<String>){
    try{
        var num = 2 / 0
    }
    catch(e: ArithmeticException){
        // caught and handles it
        println("Divide by zero not allowed")
    }
}
