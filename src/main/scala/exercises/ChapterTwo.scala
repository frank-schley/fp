package exercises

/**
  * Created by frank on 3/4/17.
  */
object ChapterTwo {
  def abs(n: Int): Int = {
    if(n > 0) n
    else -1 * n
  }

  def fib(n: Int): Int = {
    def go(n: Int, a: Int, b: Int): Int = {
      if(n <= 0) a
      else go(n - 1, b, a + b)
    }
    go(n, 0, 1)
  }

  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    def go(n:Int): Boolean = {
     if(n >= as.size) true
     else if(ordered(as(n-1), as(n))) go(n + 1)
     else false
    }
    go(1)
  }

  def curry[A,B,C](f: (A, B) => C): A => (B => C) = {
    (a:A) => (b: B) => f(a, b)
  }

  def uncurry[A,B,C](f: A => B => C): (A, B) => C = {
    (a: A, b: B) => f(a)(b)
  }

  def compose[A,B,C](f: B => C, g: A => B): A => C = {
    a:A =>f(g(a))
  }

}
