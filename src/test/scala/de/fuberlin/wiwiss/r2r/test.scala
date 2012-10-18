package de.fuberlin.wiwiss.r2r


/**
 * Created by IntelliJ IDEA.
 * User: andreas
 * Date: 2/23/12
 * Time: 10:52 AM
 * To change this template use File | Settings | File Templates.
 */

import scala.collection.JavaConversions._

object test {
  def main(args: Array[String]) {
    val rep = Repository.createFileOrUriRepository("/home/andreas/Downloads/b.ttl")
    val mappings = rep.getMappings
    val source = new FileOrURISource("/home/andreas/Downloads/diseasome_sample.nt")
    val output = new NTriplesOutput("/home/andreas/Downloads/output.ttl")
    for((uri,mapping) <- mappings)
      mapping.executeMapping(source, output)
  }
}