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
        val inputUser = readLine()

        if (inputUser == "a") {
            sdms.addStudent()
        }
        else if (inputUser == "b") {
            sdms.editStudent()
        }
        else if (inputUser == "c") {
            sdms.deleteStudent()

        }
        else if (inputUser == "d") {
            sdms.displayStudent()
            print("Do you want to continue(y/n): ")
            val ans = readLine()
            if (ans == "y") {
                continue
            } else if (ans == "n") {
                break

            }

        }
        else if (inputUser == "e") {
            break
        }
    }
}

