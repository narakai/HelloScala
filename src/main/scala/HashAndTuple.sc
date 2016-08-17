val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 5)
val mutable = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 5)
var empty = new scala.collection.mutable.HashMap[String, Int]
var bobScore = scores("Bob")
var bobScore1 = scores.getOrElse("Bob", 0)
mutable("Alice") = 0
mutable += ("Alice" -> 4, "Jim" -> 4)
mutable -= "Alice"
scores.keySet