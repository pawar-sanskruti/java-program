import scala.util.control.Breaks._
object breakEx{
    def main (args:Array[String])={
        for(i<- 1 to 10)
        {
            if(i<5){
                println(i)
            }else{
                println("no")
            }
        }
    }
}