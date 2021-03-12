package tictactoe

fun main() {

    var input: CharArray = "         ".toCharArray() //пустые значения на поле
    val lineOfDashes = "---------" //просто линия
    var xCount = 0 //счетчик Х
    var oCount = 0 //счетчик Y
    var spaceCount = 9 //счетчик пустых полей
    var win = 0 //состояние победы (потом лучше исправить на бул
    var resultMessage = "" //сообщение о результате набора символов

    printCells(lineOfDashes, input) //выводим поле в первый раз

    var wrongNumber = true

    moveLoop@ while (spaceCount > 0 && win == 0) {

        print("Enter the coordinates: ")
        var coordinatesInput = readLine()!!.toCharArray()
        var xCoordinate = coordinatesInput[0]
        var yCoordinate = coordinatesInput[2]

        if ((xCoordinate == '1' || xCoordinate == '2' || xCoordinate == '3') && (yCoordinate == '1' || yCoordinate == '2' || yCoordinate == '3')) {
            wrongNumber = false
        }

        if (xCoordinate == '1' && !wrongNumber) {
            if (yCoordinate == '1' && input[0] == ' ') {
                if (oCount < xCount) {
                    input[0] = 'O'
                    oCount++
                } else {
                    input[0] = 'X'
                    xCount++
                }
                printCells(lineOfDashes, input)
                spaceCount--
            } else if (yCoordinate == '2' && input[1] == ' ') {
                if (oCount < xCount) {
                    input[1] = 'O'
                    oCount++
                } else {
                    input[1] = 'X'
                    xCount++
                }
                printCells(lineOfDashes, input)
                spaceCount--
            } else if (yCoordinate == '3' && input[2] == ' ') {
                if (oCount < xCount) {
                    input[2] = 'O'
                    oCount++
                } else {
                    input[2] = 'X'
                    xCount++
                }
                printCells(lineOfDashes, input)
                spaceCount--
            } else if ((input[0] != ' ' && yCoordinate == '1') || (input[1] != ' ' && yCoordinate == '2') || (input[2] != ' ' && yCoordinate == '3')) {
                println("This cell is occupied! Choose another one!")
            } else {
                println("You should enter numbers!")
            }
        } else if (xCoordinate == '2' && !wrongNumber) {
            if (yCoordinate == '1' && input[3] == ' ') {
                if (oCount < xCount) {
                    input[3] = 'O'
                    oCount++
                } else {
                    input[3] = 'X'
                    xCount++
                }
                printCells(lineOfDashes, input)
                spaceCount--
            } else if (yCoordinate == '2' && input[4] == ' ') {
                if (oCount < xCount) {
                    input[4] = 'O'
                    oCount++
                } else {
                    input[4] = 'X'
                    xCount++
                }
                spaceCount--
                printCells(lineOfDashes, input)
            } else if (yCoordinate == '3' && input[5] == ' ') {
                if (oCount < xCount) {
                    input[5] = 'O'
                    oCount++
                } else {
                    input[5] = 'X'
                    xCount++
                }
                spaceCount--
                printCells(lineOfDashes, input)
            } else if ((input[3] != ' ' && yCoordinate == '1') || (input[4] != ' ' && yCoordinate == '2') || (input[5] != ' ' && yCoordinate == '3')) {
                println("This cell is occupied! Choose another one!")
            } else {
                println("You should enter numbers!")
            }

        } else if (xCoordinate == '3' && !wrongNumber) {
            if (yCoordinate == '1' && input[6] == ' ') {
                if (oCount < xCount) {
                    input[6] = 'O'
                    oCount++
                } else {
                    input[6] = 'X'
                    xCount++
                }
                spaceCount--
                printCells(lineOfDashes, input)
            } else if (yCoordinate == '2' && input[7] == ' ') {
                if (oCount < xCount) {
                    input[7] = 'O'
                    oCount++
                } else {
                    input[7] = 'X'
                    xCount++
                }
                spaceCount--
                printCells(lineOfDashes, input)
            } else if (yCoordinate == '3' && input[8] == ' ') {
                if (oCount < xCount) {
                    input[8] = 'O'
                    oCount++
                } else {
                    input[8] = 'X'
                    xCount++
                }
                spaceCount--
                printCells(lineOfDashes, input)
            } else if ((input[6] != ' ' && yCoordinate == '1') || (input[7] != ' ' && yCoordinate == '2') || (input[8] != ' ' && yCoordinate == '3')) {
                println("This cell is occupied! Choose another one!")
            } else {
                println("You should enter numbers!")
            }

        } else if (xCoordinate in 'A'..'Z' || yCoordinate in 'A'..'Z' || xCoordinate in 'a'..'z' || yCoordinate in 'a'..'z') {
            print("You should enter numbers!")
        } else {
            println("Coordinates should be from 1 to 3!")
        }

        if (input[0] == input[1] && input[0] == input[2] && input[1] != ' ') {   //победа в первой линии
            resultMessage = "${input[0]} wins"
            win = 1
        }
        if (input[3] == input[4] && input[3] == input[5] && input[3] != ' ') {   //победа во второй линии
            resultMessage = "${input[3]} wins"
            win = 1
        }
        if (input[6] == input[7] && input[6] == input[8] && input[6] != ' ') {   //победа в третьей линии
            resultMessage = "${input[6]} wins"
            win = 1
        }
        if (input[0] == input[4] && input[0] == input[8] && input[0] != ' ') {   //победа в первой диагонали
            resultMessage = "${input[0]} wins"
            win = 1
        }
        if (input[6] == input[4] && input[6] == input[2] && input[4] != ' ') {   //победа во второй диагонали
            resultMessage = "${input[6]} wins"
            win = 1
        }
        if (input[0] == input[3] && input[0] == input[6] && input[0] != ' ') {   //победа в первом столбике
            resultMessage = "${input[0]} wins"
            win = 1
        }
        if (input[1] == input[4] && input[1] == input[7] && input[4] != ' ') {   //победа во втором столбике
            resultMessage = "${input[1]} wins"
            win = 1
        }
        if (input[2] == input[5] && input[2] == input[8] && input[2] != ' ') {   //победа во третьем столбике
            resultMessage = "${input[2]} wins"
            win = 1
        }
    }

    if (win == 1) {
        println(resultMessage)
    } else println("Draw")

}

fun printCells(lineOfDashes: String, input: CharArray) {
    println(lineOfDashes)
    println("| ${input[0]} ${input[1]} ${input[2]} |")
    println("| ${input[3]} ${input[4]} ${input[5]} |")
    println("| ${input[6]} ${input[7]} ${input[8]} |")
    println(lineOfDashes)
}