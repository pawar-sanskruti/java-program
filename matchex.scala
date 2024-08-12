object matchex{
    def main(args:Array[String])={
        var month=10
        month match{
            
            case 1=>println("jan")
            case 2=>println("feb")
            case 3=>println("march")
            case 4=>println("april")
            case 5=>println("may")
            case 6=>println("june")
            case 7=>println("july")
            case 8=>println("oug")
            case 9=>println("sept")
            case 10=>println("oct")
            case 11=>println("nov")
            case 12=>println("dec")
            case 13=>println("incorrect month")
        }
    }
}