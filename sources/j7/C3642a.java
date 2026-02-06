package j7;

import android.os.Trace;
import j7.b;
import kotlin.jvm.internal.C6496s;

/* renamed from: j7.a  reason: case insensitive filesystem */
public final class C3642a implements b.c {
    public void a(String str) {
        C6496s.h(str, "name");
        if (isTracing()) {
            Trace.beginSection(str);
        }
    }

    public void b() {
        if (isTracing()) {
            Trace.endSection();
        }
    }

    public boolean isTracing() {
        return false;
    }
}
