fun main() {
    run()
}

fun run() {
    val sdms = StudentDMS()

    while (true) {
        println("____________________________________")
        println("Student DMS")
        println("[a] Add \n[b] Edit \n[c] Delete \n[d] Display List \n[e] Exit app")
        print("Choose a letter: ")

        when (readLine()) {
            "a", "A" -> sdms.addStudent()
            "b", "B" -> sdms.editStudent()
            "c", "C" -> sdms.deleteStudent()
            "d", "D" -> sdms.displayStudent()
            "e", "E" -> break
            else -> println("Invalid Input")
        }

    }
}

