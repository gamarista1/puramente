package wf;

import Rg.h;
import Rg.k;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.jvm.internal.C6496s;

public abstract class t {
    public static final long a(Reader reader, Writer writer, int i10) {
        C6496s.h(reader, "<this>");
        C6496s.h(writer, "out");
        char[] cArr = new char[i10];
        int read = reader.read(cArr);
        long j10 = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j10 += (long) read;
            read = reader.read(cArr);
        }
        return j10;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return a(reader, writer, i10);
    }

    public static final h c(BufferedReader bufferedReader) {
        C6496s.h(bufferedReader, "<this>");
        return k.d(new p(bufferedReader));
    }

    public static final String d(Reader reader) {
        C6496s.h(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, (Object) null);
        String stringWriter2 = stringWriter.toString();
        C6496s.g(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
