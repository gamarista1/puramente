package androidx.work.impl;

import androidx.work.s;
import kotlin.jvm.internal.C6496s;

public abstract class G {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f18763a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f18764b = {"-journal", "-shm", "-wal"};

    static {
        String i10 = s.i("WrkDbPathHelper");
        C6496s.g(i10, "tagWithPrefix(\"WrkDbPathHelper\")");
        f18763a = i10;
    }
}
