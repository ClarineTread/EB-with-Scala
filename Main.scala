import scala.io.StdIn.{readDouble, readLine}
class Ebill{
    var name = ""
    var no :Double = 0
    var bill: Double = 0
    def getdata(gname: String, gno: Double):Unit={
        name = gname
        no = gno
    }
    def calc(ctype: Double, ctot: Double):Unit={
        if(ctype==1){
            if(ctot<=100){
                bill = ctot * 1
            }
            else if(ctot>100 && ctot<=200){
                bill = ctot * 2.5
            }
            else if(ctot>200 && ctot<=500){
                bill = ctot * 4
            }
            else if(ctot>500){
                bill = ctot * 6
            }
            else{
                println("Enter a valid number!")
            }
        }
        else if(ctype==2){
            if(ctot<=100){
                bill = ctot * 2
            }
            else if(ctot>100 && ctot<=200){
                bill = ctot * 4.5
            }
            else if(ctot>200 && ctot<=500){
                bill = ctot * 6
            }
            else if(ctot>500){
                bill = ctot * 7
            }
            else{
                println("Enter a valid number!")
            }
        }
        else{
            println("Enter a valid choice")
        }
    }
    def display(dtot: Double):Unit={
        println(+bill)

    }
}
object eb{
def main(args:Array[String]):Unit={
    println("Enter customer's name")
    var a = readLine()
    println("Enter customer's number")
    var b = readDouble()
    println("Enter previous month usage (in units)")
    var c = readDouble()
    println("Enter current month usage (in units)")
    var d = readDouble()
    println("Enter your type of connection [1-> Domestic 2->Commercial]")
    var e = readDouble()
    var t: Double = d - c
    val x = new Ebill
    x.getdata(a,b)
    x.calc(e,t)
    println("------------Bill------------")
        println("Customer name: "+a)
        println("Customer number: "+b)
        println("Previous month usage: "+c)
        println("Current month usage: "+d)
        println("----------------------------")
        println("Bill total:")
    x.display(t)

}
}
