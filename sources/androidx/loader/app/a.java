package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.C1798v;
import androidx.lifecycle.e0;
import c2.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class a {

    /* renamed from: androidx.loader.app.a$a  reason: collision with other inner class name */
    public interface C0307a {
        void a(c cVar, Object obj);

        void b(c cVar);

        c onCreateLoader(int i10, Bundle bundle);
    }

    public static a b(C1798v vVar) {
        return new b(vVar, ((e0) vVar).getViewModelStore());
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract c c(int i10, Bundle bundle, C0307a aVar);

    public abstract void d();
}
