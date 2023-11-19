package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namaDepan = "Putu"
    val namaBelakang = "Ardika Wijaya"
    val umur="20"
    val status: Boolean = true

    println("Nama Depan: $namaDepan")
    println("Nama Belakang: $namaBelakang")
    println("Umur: $umur")
    println("Status: ${if (status) "Single" else "Tidak Single"}")
}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */


fun groupDetail(groupId: String, groupMembers: List<String>, session: String): String {
    val groupId = "5"
    val groupMembers  = listOf("Dicki","fathiya","Aziz","Putu","Marisa","Farida","Tengku","Hafidz","Malik","Fajar")
    val session = "Morning"
    println("group Id = $groupId")
    println("group member = $groupMembers")
    println("sesi = $session")
    return "groupDetail."
}
/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val teamMembers = listOf("Dicki","fathiya","Aziz","Putu","Marisa","Farida","Tengku","Hafidz","Malik","Fajar")
    return listOf(teamMembers)
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Kelvin","Shania","Ilham")
    val countOfGroup = arrayOf("Dicki","fathiya","Aziz","Putu","Marisa","Farida","Tengku","Hafidz","Malik","Fajar")

    return 0
}

fun main() {

    myProfile()

    val myTeam = "LogicLiberatos"
    println("My team is: $myTeam")

    val totalMember = "10"
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("5", listOf("Dicki","fathiya","Aziz","Putu","Marisa","Farida","Tengku","Hafidz","Malik","Fajar"), "morning")

}