package de.fuberlin.wiwiss.r2r;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: andreas
 * Date: 11/21/11
 * Time: 4:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) throws Exception{
        Repository rep = new Repository(new FileOrURISource("mappings.ttl"));
        Map<String, Mapping> mappings = rep.getMappings();
        File tempFile = File.createTempFile("ldif_hadoop_", "bla");
        tempFile.deleteOnExit();
        ObjectOutputStream objectWriter = new ObjectOutputStream(new FileOutputStream(tempFile));
        objectWriter.writeObject(mappings);
    }
}
