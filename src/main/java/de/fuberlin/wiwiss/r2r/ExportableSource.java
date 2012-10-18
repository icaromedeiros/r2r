package de.fuberlin.wiwiss.r2r;

import java.io.OutputStream;
import java.io.Writer;

/**
 * Created by IntelliJ IDEA.
 * User: andreas
 * Date: 10/20/11
 * Time: 1:07 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ExportableSource extends Source {
    public void exportMappings(Writer out, String serializationFormat);

    public void exportMappings(OutputStream out, String serializationFormat);

    public void exportMappings(Writer out);

    public void exportMappings(OutputStream out);
}
