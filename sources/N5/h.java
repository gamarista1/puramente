package N5;

import M5.a;
import N5.f;
import S5.c;
import T5.k;
import T5.n;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class h implements f {

    /* renamed from: f  reason: collision with root package name */
    private static final Class f33004f = h.class;

    /* renamed from: a  reason: collision with root package name */
    private final int f33005a;

    /* renamed from: b  reason: collision with root package name */
    private final n f33006b;

    /* renamed from: c  reason: collision with root package name */
    private final String f33007c;

    /* renamed from: d  reason: collision with root package name */
    private final M5.a f33008d;

    /* renamed from: e  reason: collision with root package name */
    volatile a f33009e = new a((File) null, (f) null);

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public final f f33010a;

        /* renamed from: b  reason: collision with root package name */
        public final File f33011b;

        a(File file, f fVar) {
            this.f33010a = fVar;
            this.f33011b = file;
        }
    }

    public h(int i10, n nVar, String str, M5.a aVar) {
        this.f33005a = i10;
        this.f33008d = aVar;
        this.f33006b = nVar;
        this.f33007c = str;
    }

    private void k() {
        File file = new File((File) this.f33006b.get(), this.f33007c);
        j(file);
        this.f33009e = new a(file, new a(file, this.f33005a, this.f33008d));
    }

    private boolean n() {
        File file;
        a aVar = this.f33009e;
        if (aVar.f33010a == null || (file = aVar.f33011b) == null || !file.exists()) {
            return true;
        }
        return false;
    }

    public void a() {
        m().a();
    }

    public void b() {
        try {
            m().b();
        } catch (IOException e10) {
            U5.a.j(f33004f, "purgeUnexpectedResources", e10);
        }
    }

    public boolean c(String str, Object obj) {
        return m().c(str, obj);
    }

    public long d(f.a aVar) {
        return m().d(aVar);
    }

    public f.b e(String str, Object obj) {
        return m().e(str, obj);
    }

    public boolean f(String str, Object obj) {
        return m().f(str, obj);
    }

    public L5.a g(String str, Object obj) {
        return m().g(str, obj);
    }

    public Collection h() {
        return m().h();
    }

    public long i(String str) {
        return m().i(str);
    }

    public boolean isExternal() {
        try {
            return m().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void j(File file) {
        try {
            c.a(file);
            U5.a.a(f33004f, "Created cache directory %s", file.getAbsolutePath());
        } catch (c.a e10) {
            this.f33008d.a(a.C0534a.WRITE_CREATE_DIR, f33004f, "createRootDirectoryIfNecessary", e10);
            throw e10;
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        if (this.f33009e.f33010a != null && this.f33009e.f33011b != null) {
            S5.a.b(this.f33009e.f33011b);
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized f m() {
        try {
            if (n()) {
                l();
                k();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return (f) k.g(this.f33009e.f33010a);
    }
}
