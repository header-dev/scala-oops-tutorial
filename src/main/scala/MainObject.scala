
class Student(id:Int, name: String) {
    def show(): Unit = {
      println(id +" "+name)
    }
    def getRecord(): Unit = {
      println(id + " "+ name)
    }
}

class Arithmetic {
  def add(a:Int, b:Int): Unit = {
    var add = a+b
    println("Sum = "+add)
  }
}

object MainObject {

  def main(args: Array[String]): Unit = {
    var s = new Student(100, "Wiz")
    s.show()

    //    Scala Example of class that maintains the records of students
    var s1 = new Student(110, "Mod")
    var s2 = new Student(123, "Daisy")
    s1.getRecord()
    s2.getRecord()

    //    Scala Anonymous object Example
    new Arithmetic().add(10,10);
  }

}
