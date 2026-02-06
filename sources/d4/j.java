package d4;

import Gh.C5411l;
import Gh.M;
import X3.g;
import a4.C3114g;
import a4.V;
import android.webkit.MimeTypeMap;
import d4.C3472i;
import j4.C3627n;
import java.io.Closeable;
import java.io.File;
import qf.C6658d;
import wf.k;

public final class j implements C3472i {

    /* renamed from: a  reason: collision with root package name */
    private final File f43109a;

    public static final class a implements C3472i.a {
        /* renamed from: b */
        public C3472i a(File file, C3627n nVar, g gVar) {
            return new j(file);
        }
    }

    public j(File file) {
        this.f43109a = file;
    }

    public Object a(C6658d dVar) {
        return new m(V.h(M.a.d(M.f63223b, this.f43109a, false, 1, (Object) null), (C5411l) null, (String) null, (Closeable) null, 14, (Object) null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(k.u(this.f43109a)), C3114g.DISK);
    }
}
