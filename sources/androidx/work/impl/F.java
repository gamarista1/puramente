package androidx.work.impl;

import Ef.m;
import android.content.Context;
import androidx.work.s;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.O;

public final class F {

    /* renamed from: a  reason: collision with root package name */
    public static final F f18762a = new F();

    private F() {
    }

    private final File c(Context context) {
        return new File(C1841a.f18828a.a(context), "androidx.work.workdb");
    }

    public static final void d(Context context) {
        String str;
        C6496s.h(context, "context");
        F f10 = f18762a;
        if (f10.b(context).exists()) {
            s.e().a(G.f18763a, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry entry : f10.e(context).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        s.e().k(G.f18763a, "Over-writing contents of " + file2);
                    }
                    if (file.renameTo(file2)) {
                        str = "Migrated " + file + "to " + file2;
                    } else {
                        str = "Renaming " + file + " to " + file2 + " failed";
                    }
                    s.e().a(G.f18763a, str);
                }
            }
        }
    }

    public final File a(Context context) {
        C6496s.h(context, "context");
        return c(context);
    }

    public final File b(Context context) {
        C6496s.h(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        C6496s.g(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    public final Map e(Context context) {
        C6496s.h(context, "context");
        File b10 = b(context);
        File a10 = a(context);
        String[] a11 = G.f18764b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(O.e(a11.length), 16));
        for (String str : a11) {
            Pair a12 = C6502A.a(new File(b10.getPath() + str), new File(a10.getPath() + str));
            linkedHashMap.put(a12.c(), a12.d());
        }
        return O.q(linkedHashMap, C6502A.a(b10, a10));
    }
}
