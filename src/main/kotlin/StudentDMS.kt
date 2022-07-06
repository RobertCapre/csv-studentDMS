
class StudentDMS: SDMSInterface {
    var studentList = mutableListOf(
        Student(id = 1, name = "robert", age = 24, gender = "f"),
        Student(id = 2, name = "josh", age = 23, gender = "m"),
        Student(id = 3, name = "josh", age = 24, gender = "m")
    )
    private val size = studentList.size
    var ctr = 0



    override fun addStudent(){
        print("Enter Name: ")
        val nameNew = readLine()
        print("Enter Age: ")
        val ageNew = Integer.valueOf(readLine())
        print("Enter Gender: ")
        val genderNew = readLine()

        val store = studentList.last()
        val idNew = store.id + 1

        val addNew = Student(id = idNew, name = "$nameNew", age = ageNew, gender = "$genderNew")
        studentList.add(index = size, addNew)
        println(studentList)
        println("Student $nameNew has been add to the list")
    }

    override fun editStudent() {

        print("Enter ID: ")
        val idNew = Integer.valueOf(readLine())

        for (index in studentList) {
            if (index.id == idNew) {
                println("This is the Student Info")
                println(index)
                print("Do you want to edit?(y/n)")
                val ans = readLine()
                if (ans == "y") {
                    print("Enter Name: ")
                    val nameNew = readLine()
                    print("Enter Age: ")
                    val ageNew = Integer.valueOf(readLine())
                    print("Enter Gender: ")
                    val genderNew = readLine()

                    index.name = nameNew.toString()
                    index.age = ageNew
                    index.gender = genderNew.toString()


                } else if (ans == "n") {

                    continue

                }

            }
        }

    }

    override fun deleteStudent() {

        print("Enter ID: ")
        val idNew = Integer.valueOf(readLine())

        while (ctr != size) {
            if (studentList[ctr].id == idNew) {
                println("This is the Student Info")
                println(studentList[ctr])
                print("Do you want to delete?(y/n)")
                val ans = readLine()
                if (ans == "y") {

                    studentList.removeAt(index = ctr)
                } else if (ans == "n") {
                    continue
                }
            }


            ctr++
        }

    }

    override fun displayStudent() {



        print("Enter Name, Age, or Gender: ")
        val idNew = readLine()

        while (ctr != size) {

            if (studentList[ctr].name == idNew) {
            println("Name: ${studentList[ctr].name}, Age: ${studentList[ctr].age}, Gender: ${studentList[ctr].gender}")
//                println(studentList)
            }
            else if (studentList[ctr].gender == idNew) {
                println("Name: ${studentList[ctr].name}, Age: ${studentList[ctr].age}, Gender: ${studentList[ctr].gender}")
//                println(studentList)
            }
            else if (studentList[ctr].age.toString() == idNew) {
                println("Name: ${studentList[ctr].name}, Age: ${studentList[ctr].age}, Gender: ${studentList[ctr].gender}")
//                println(studentList)
            }



//            println(store)

            ctr++
        }


//        while (ctr != size) {
//            if (studentList[ctr].id == idNew) {
//                println("__________________________________________")
//                println("Student DMS")
//                println("Name: ${studentList[ctr].name}, Age: ${studentList[ctr].age}, Gender: ${studentList[ctr].gender}")
//
//                println("__________________________________________")
//            }
//            ctr++
//        }


    }
}

