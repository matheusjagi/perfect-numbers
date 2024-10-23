def findDividers(value: Int): List[Int] =
    (1 to value).filter(i => value % i == 0).toList
            
def perfectNumber(value: Int): Boolean = 
    findDividers(value).dropRight(1).sum.equals(value)