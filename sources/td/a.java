package Td;

import Pd.c;
import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public class a implements Xd.a, c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f52596a;

    public a(Context context) {
        C6496s.h(context, "context");
        this.f52596a = context;
    }

    public File a() {
        File cacheDir = this.f52596a.getCacheDir();
        C6496s.g(cacheDir, "getCacheDir(...)");
        return cacheDir;
    }

    public List o() {
        return C6565s.e(Xd.a.class);
    }
}
