package lf;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.C6496s;
import tf.C6728b;

/* renamed from: lf.h  reason: case insensitive filesystem */
abstract class C6524h {
    public static void a(Throwable th2, Throwable th3) {
        C6496s.h(th2, "<this>");
        C6496s.h(th3, "exception");
        if (th2 != th3) {
            C6728b.f73552a.a(th2, th3);
        }
    }

    public static String b(Throwable th2) {
        C6496s.h(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        C6496s.g(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
