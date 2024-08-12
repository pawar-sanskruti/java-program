object listcollection{
    def main(args:Array[String])={
        var lst=List(10,20,30,40)
        println(lst)
        var list=1::2::3::4::Nil
        println(list)
        var rangelist=List.range(1,10)
        println(rangelist)
        var countryList=List("india" ,"uk","us")
        println(countryList)
    }
}