/** String search
  * 
  * problem: https://leetcode.com/problems/jewels-and-stones/description/
  *
  * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
  *
  * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
  *
  * Example 1:
  *
  * Input: J = "aA", S = "aAAbbbb"
  * Output: 3
  * Example 2:
  *
  * Input: J = "z", S = "ZZ"
  * Output: 0
  * Note:
  *
  * S and J will consist of letters and have length at most 50.
  * The characters in J are distinct.
  */
object JewelsAndStones {

  /** Approach: Add all Jewels into a Set and iterate through stones and check if it is present int the Set
    *
    * Runtime: O(m+n)
    * Space: O(m)
    */
  def numJewelsInStones(J: String, S: String): Int = {

    val jewelsSet:Set[Char] = J.toSet
    S.toStream.count(c=> jewelsSet.contains(c))
  }

  def main(args: Array[String]): Unit = {
    val J = "aA"
    val S = "aAAbbbb"

    val J1 = "z"
    val S2 = "ZZ"

    println(s"Number of jewels present =  ${numJewelsInStones(J, S)}")
    println(s"Number of jewels present =  ${numJewelsInStones(J1, S2)}")
  }
}
