package de.fuberlin.wiwiss.r2r.utils

/**
 * Created by IntelliJ IDEA.
 * User: andreas
 * Date: 2/23/12
 * Time: 11:36 AM
 * To change this template use File | Settings | File Templates.
 */

object StringUtils {
  val escapeMappings = Map('\\' -> '\\',
                           't' -> '\t',
                           'b' -> '\b',
                           'n' -> '\n',
                           'r' -> '\r',
                           'f' -> '\f',
                           '"' -> '"',
                           '\'' -> '\''
                          )

  def unescapeString(s: String): String = {
    val sb = new StringBuilder
    var unescapeNext = false
    for(c <- s) {
      if(unescapeNext) {
        sb.append(escapeMappings.get(c).get)
        unescapeNext = false
      }
      else {
        if(c=='\\')
          unescapeNext = true
        else
          sb.append(c)
      }
    }
    sb.toString
  }

  def main(args: Array[String]) {
    println(unescapeString("\\o"))
  }
}