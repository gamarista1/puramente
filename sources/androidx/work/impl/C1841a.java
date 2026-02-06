package androidx.work.impl;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.C6496s;

/* renamed from: androidx.work.impl.a  reason: case insensitive filesystem */
public final class C1841a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1841a f18828a = new C1841a();

    private C1841a() {
    }

    public final File a(Context context) {
        C6496s.h(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        C6496s.g(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
