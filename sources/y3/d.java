package y3;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.C6496s;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f28726a = new d();

    private d() {
    }

    public static final File a(Context context) {
        C6496s.h(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        C6496s.g(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
