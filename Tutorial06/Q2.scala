import scala.io.StdIn.readLine
import scala.util.Try

object StudentRecordManager {

    def validateInput(name: String, marks: String, totalMarks: String): (Boolean, Option[String]) = {
    if (name.trim.isEmpty) {
        (false, Some("Name cannot be empty."))
    } else {
        (Try(marks.toInt).toOption, Try(totalMarks.toInt).toOption) match {
        case (Some(m), Some(t)) if m >= 0 && m <= t => (true, None)
        case (Some(_), Some(t)) => (false, Some(s"Marks must be a positive integer not exceeding the total possible marks ($t)."))
        case _ => (false, Some("Marks and total possible marks must be valid integers."))
        }
    }
    }

    def getStudentInfo: (String, Int, Int, Double, Char) = {
    val name = readLine("Enter student's name: ")
    val marks = readLine("Enter student's marks: ")
    val totalMarks = readLine("Enter total possible marks: ")

    val (isValid, errorMessage) = validateInput(name, marks, totalMarks)
    if (!isValid) {
        throw new IllegalArgumentException(errorMessage.getOrElse("Invalid input."))
    }

    val marksInt = marks.toInt
    val totalMarksInt = totalMarks.toInt
    val percentage = (marksInt.toDouble / totalMarksInt) * 100
    val grade = percentage match {
        case p if p >= 90 => 'A'
        case p if p >= 75 => 'B'
        case p if p >= 50 => 'C'
        case _ => 'D'
    }

    (name, marksInt, totalMarksInt, percentage, grade)
    }

    def printStudentRecord(studentRecord: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = studentRecord
    println(s"Name: $name")
    println(s"Marks: $marks")
    println(s"Total Marks: $totalMarks")
    println(s"Percentage: %.2f%%".format(percentage))
    println(s"Grade: $grade")
    }

    def getStudentInfoWithRetry: (String, Int, Int, Double, Char) = {
    var studentRecord: Option[(String, Int, Int, Double, Char)] = None
    while (studentRecord.isEmpty) {
        try {
        studentRecord = Some(getStudentInfo)
        } catch {
        case e: IllegalArgumentException =>
            println(e.getMessage)
        }
    }
    studentRecord.get
    }

    def main(args: Array[String]): Unit = {
    val studentRecord = getStudentInfoWithRetry
    printStudentRecord(studentRecord)
    }
}
