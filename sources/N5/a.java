package N5;

import M5.a;
import M5.j;
import N5.f;
import S5.c;
import T5.k;
import a6.C3135a;
import a6.C3138d;
import android.os.Environment;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class a implements f {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final Class f32931f = a.class;

    /* renamed from: g  reason: collision with root package name */
    static final long f32932g = TimeUnit.MINUTES.toMillis(30);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final File f32933a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f32934b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final File f32935c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final M5.a f32936d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C3135a f32937e = C3138d.a();

    /* renamed from: N5.a$a  reason: collision with other inner class name */
    private class C0542a implements S5.b {

        /* renamed from: a  reason: collision with root package name */
        private final List f32938a;

        public void b(File file) {
            c n10 = a.this.v(file);
            if (n10 != null && n10.f32944a == ".cnt") {
                this.f32938a.add(new b(n10.f32945b, file));
            }
        }

        public List d() {
            return Collections.unmodifiableList(this.f32938a);
        }

        private C0542a() {
            this.f32938a = new ArrayList();
        }

        public void a(File file) {
        }

        public void c(File file) {
        }
    }

    static class b implements f.a {

        /* renamed from: a  reason: collision with root package name */
        private final String f32940a;

        /* renamed from: b  reason: collision with root package name */
        private final L5.b f32941b;

        /* renamed from: c  reason: collision with root package name */
        private long f32942c;

        /* renamed from: d  reason: collision with root package name */
        private long f32943d;

        public long a() {
            if (this.f32943d < 0) {
                this.f32943d = this.f32941b.d().lastModified();
            }
            return this.f32943d;
        }

        public L5.b b() {
            return this.f32941b;
        }

        public String getId() {
            return this.f32940a;
        }

        public long getSize() {
            if (this.f32942c < 0) {
                this.f32942c = this.f32941b.size();
            }
            return this.f32942c;
        }

        private b(String str, File file) {
            k.g(file);
            this.f32940a = (String) k.g(str);
            this.f32941b = L5.b.b(file);
            this.f32942c = -1;
            this.f32943d = -1;
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f32944a;

        /* renamed from: b  reason: collision with root package name */
        public final String f32945b;

        public static c b(File file) {
            String p10;
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf <= 0 || (p10 = a.t(name.substring(lastIndexOf))) == null) {
                return null;
            }
            String substring = name.substring(0, lastIndexOf);
            if (p10.equals(".tmp")) {
                int lastIndexOf2 = substring.lastIndexOf(46);
                if (lastIndexOf2 <= 0) {
                    return null;
                }
                substring = substring.substring(0, lastIndexOf2);
            }
            return new c(p10, substring);
        }

        public File a(File file) {
            return File.createTempFile(this.f32945b + ".", ".tmp", file);
        }

        public String c(String str) {
            return str + File.separator + this.f32945b + this.f32944a;
        }

        public String toString() {
            return this.f32944a + "(" + this.f32945b + ")";
        }

        private c(String str, String str2) {
            this.f32944a = str;
            this.f32945b = str2;
        }
    }

    private static class d extends IOException {
        public d(long j10, long j11) {
            super("File was not written completely. Expected: " + j10 + ", found: " + j11);
        }
    }

    class e implements f.b {

        /* renamed from: a  reason: collision with root package name */
        private final String f32946a;

        /* renamed from: b  reason: collision with root package name */
        final File f32947b;

        public e(String str, File file) {
            this.f32946a = str;
            this.f32947b = file;
        }

        public L5.a a(Object obj, long j10) {
            a.C0534a aVar;
            File r10 = a.this.r(this.f32946a);
            try {
                S5.c.b(this.f32947b, r10);
                if (r10.exists()) {
                    r10.setLastModified(j10);
                }
                return L5.b.b(r10);
            } catch (c.d e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    aVar = a.C0534a.WRITE_RENAME_FILE_OTHER;
                } else if (cause instanceof c.C0550c) {
                    aVar = a.C0534a.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                } else if (cause instanceof FileNotFoundException) {
                    aVar = a.C0534a.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND;
                } else {
                    aVar = a.C0534a.WRITE_RENAME_FILE_OTHER;
                }
                a.this.f32936d.a(aVar, a.f32931f, "commit", e10);
                throw e10;
            }
        }

        public boolean h() {
            if (!this.f32947b.exists() || this.f32947b.delete()) {
                return true;
            }
            return false;
        }

        public L5.a i(Object obj) {
            return a(obj, a.this.f32937e.now());
        }

        /* JADX INFO: finally extract failed */
        public void j(j jVar, Object obj) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f32947b);
                try {
                    T5.c cVar = new T5.c(fileOutputStream);
                    jVar.a(cVar);
                    cVar.flush();
                    long a10 = cVar.a();
                    fileOutputStream.close();
                    if (this.f32947b.length() != a10) {
                        throw new d(a10, this.f32947b.length());
                    }
                } catch (Throwable th2) {
                    fileOutputStream.close();
                    throw th2;
                }
            } catch (FileNotFoundException e10) {
                a.this.f32936d.a(a.C0534a.WRITE_UPDATE_FILE_NOT_FOUND, a.f32931f, "updateResource", e10);
                throw e10;
            }
        }
    }

    private class f implements S5.b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f32949a;

        private boolean d(File file) {
            c n10 = a.this.v(file);
            boolean z10 = false;
            if (n10 == null) {
                return false;
            }
            String str = n10.f32944a;
            if (str == ".tmp") {
                return e(file);
            }
            if (str == ".cnt") {
                z10 = true;
            }
            k.i(z10);
            return true;
        }

        private boolean e(File file) {
            if (file.lastModified() > a.this.f32937e.now() - a.f32932g) {
                return true;
            }
            return false;
        }

        public void a(File file) {
            if (!a.this.f32933a.equals(file) && !this.f32949a) {
                file.delete();
            }
            if (this.f32949a && file.equals(a.this.f32935c)) {
                this.f32949a = false;
            }
        }

        public void b(File file) {
            if (!this.f32949a || !d(file)) {
                file.delete();
            }
        }

        public void c(File file) {
            if (!this.f32949a && file.equals(a.this.f32935c)) {
                this.f32949a = true;
            }
        }

        private f() {
        }
    }

    public a(File file, int i10, M5.a aVar) {
        k.g(file);
        this.f32933a = file;
        this.f32934b = z(file, aVar);
        this.f32935c = new File(file, y(i10));
        this.f32936d = aVar;
        C();
    }

    private void A(File file, String str) {
        try {
            S5.c.a(file);
        } catch (c.a e10) {
            this.f32936d.a(a.C0534a.WRITE_CREATE_DIR, f32931f, str, e10);
            throw e10;
        }
    }

    private boolean B(String str, boolean z10) {
        File r10 = r(str);
        boolean exists = r10.exists();
        if (z10 && exists) {
            r10.setLastModified(this.f32937e.now());
        }
        return exists;
    }

    private void C() {
        if (this.f32933a.exists()) {
            if (!this.f32935c.exists()) {
                S5.a.b(this.f32933a);
            } else {
                return;
            }
        }
        try {
            S5.c.a(this.f32935c);
        } catch (c.a unused) {
            M5.a aVar = this.f32936d;
            a.C0534a aVar2 = a.C0534a.WRITE_CREATE_DIR;
            Class cls = f32931f;
            aVar.a(aVar2, cls, "version directory could not be created: " + this.f32935c, (Throwable) null);
        }
    }

    private long q(File file) {
        if (!file.exists()) {
            return 0;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public static String t(String str) {
        if (".cnt".equals(str)) {
            return ".cnt";
        }
        if (".tmp".equals(str)) {
            return ".tmp";
        }
        return null;
    }

    private String u(String str) {
        c cVar = new c(".cnt", str);
        return cVar.c(x(cVar.f32945b));
    }

    /* access modifiers changed from: private */
    public c v(File file) {
        c b10 = c.b(file);
        if (b10 == null) {
            return null;
        }
        if (w(b10.f32945b).equals(file.getParentFile())) {
            return b10;
        }
        return null;
    }

    private File w(String str) {
        return new File(x(str));
    }

    private String x(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        return this.f32935c + File.separator + valueOf;
    }

    static String y(int i10) {
        return String.format((Locale) null, "%s.ols%d.%d", new Object[]{"v2", 100, Integer.valueOf(i10)});
    }

    private static boolean z(File file, M5.a aVar) {
        String str;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            String file2 = externalStorageDirectory.toString();
            try {
                str = file.getCanonicalPath();
                try {
                    return str.contains(file2);
                } catch (IOException e10) {
                    e = e10;
                    a.C0534a aVar2 = a.C0534a.OTHER;
                    Class cls = f32931f;
                    aVar.a(aVar2, cls, "failed to read folder to check if external: " + str, e);
                    return false;
                }
            } catch (IOException e11) {
                e = e11;
                str = null;
                a.C0534a aVar22 = a.C0534a.OTHER;
                Class cls2 = f32931f;
                aVar.a(aVar22, cls2, "failed to read folder to check if external: " + str, e);
                return false;
            }
        } catch (Exception e12) {
            aVar.a(a.C0534a.OTHER, f32931f, "failed to get the external storage directory!", e12);
            return false;
        }
    }

    public void a() {
        S5.a.a(this.f32933a);
    }

    public void b() {
        S5.a.c(this.f32933a, new f());
    }

    public boolean c(String str, Object obj) {
        return B(str, true);
    }

    public long d(f.a aVar) {
        return q(((b) aVar).b().d());
    }

    public f.b e(String str, Object obj) {
        c cVar = new c(".tmp", str);
        File w10 = w(cVar.f32945b);
        if (!w10.exists()) {
            A(w10, "insert");
        }
        try {
            return new e(str, cVar.a(w10));
        } catch (IOException e10) {
            this.f32936d.a(a.C0534a.WRITE_CREATE_TEMPFILE, f32931f, "insert", e10);
            throw e10;
        }
    }

    public boolean f(String str, Object obj) {
        return B(str, false);
    }

    public L5.a g(String str, Object obj) {
        File r10 = r(str);
        if (!r10.exists()) {
            return null;
        }
        r10.setLastModified(this.f32937e.now());
        return L5.b.c(r10);
    }

    public long i(String str) {
        return q(r(str));
    }

    public boolean isExternal() {
        return this.f32934b;
    }

    /* access modifiers changed from: package-private */
    public File r(String str) {
        return new File(u(str));
    }

    /* renamed from: s */
    public List h() {
        C0542a aVar = new C0542a();
        S5.a.c(this.f32935c, aVar);
        return aVar.d();
    }
}
