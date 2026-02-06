package b4;

import Ef.m;
import Gh.C5411l;
import Gh.M;
import Ug.G;
import Ug.Z;
import android.os.StatFs;
import java.io.Closeable;
import java.io.File;

/* renamed from: b4.a  reason: case insensitive filesystem */
public interface C3145a {

    /* renamed from: b4.a$a  reason: collision with other inner class name */
    public static final class C0592a {

        /* renamed from: a  reason: collision with root package name */
        private M f36185a;

        /* renamed from: b  reason: collision with root package name */
        private C5411l f36186b = C5411l.f63319b;

        /* renamed from: c  reason: collision with root package name */
        private double f36187c = 0.02d;

        /* renamed from: d  reason: collision with root package name */
        private long f36188d = 10485760;

        /* renamed from: e  reason: collision with root package name */
        private long f36189e = 262144000;

        /* renamed from: f  reason: collision with root package name */
        private long f36190f;

        /* renamed from: g  reason: collision with root package name */
        private G f36191g = Z.b();

        public final C3145a a() {
            long j10;
            M m10 = this.f36185a;
            if (m10 != null) {
                if (this.f36187c > 0.0d) {
                    try {
                        File s10 = m10.s();
                        s10.mkdir();
                        StatFs statFs = new StatFs(s10.getAbsolutePath());
                        j10 = m.m((long) (this.f36187c * ((double) statFs.getBlockCountLong()) * ((double) statFs.getBlockSizeLong())), this.f36188d, this.f36189e);
                    } catch (Exception unused) {
                        j10 = this.f36188d;
                    }
                } else {
                    j10 = this.f36190f;
                }
                return new C3149e(j10, m10, this.f36186b, this.f36191g);
            }
            throw new IllegalStateException("directory == null");
        }

        public final C0592a b(M m10) {
            this.f36185a = m10;
            return this;
        }

        public final C0592a c(File file) {
            return b(M.a.d(M.f63223b, file, false, 1, (Object) null));
        }

        public final C0592a d(long j10) {
            if (j10 > 0) {
                this.f36187c = 0.0d;
                this.f36190f = j10;
                return this;
            }
            throw new IllegalArgumentException("size must be > 0.");
        }
    }

    /* renamed from: b4.a$b */
    public interface b {
        void a();

        c b();

        M getData();

        M getMetadata();
    }

    /* renamed from: b4.a$c */
    public interface c extends Closeable {
        b T0();

        M getData();

        M getMetadata();
    }

    b a(String str);

    c b(String str);

    C5411l c();
}
