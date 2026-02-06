package Z4;

import T4.i;
import Z4.n;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import n5.C3861d;

public class g implements n {

    /* renamed from: a  reason: collision with root package name */
    private final d f35869a;

    public static class b extends a {

        class a implements d {
            a() {
            }

            public Class a() {
                return ParcelFileDescriptor.class;
            }

            /* renamed from: d */
            public void b(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }

            /* renamed from: e */
            public ParcelFileDescriptor c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    public interface d {
        Class a();

        void b(Object obj);

        Object c(File file);
    }

    public static class e extends a {

        class a implements d {
            a() {
            }

            public Class a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void b(InputStream inputStream) {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public g(d dVar) {
        this.f35869a = dVar;
    }

    /* renamed from: c */
    public n.a a(File file, int i10, int i11, i iVar) {
        return new n.a(new C3861d(file), new c(file, this.f35869a));
    }

    /* renamed from: d */
    public boolean b(File file) {
        return true;
    }

    public static class a implements o {

        /* renamed from: a  reason: collision with root package name */
        private final d f35870a;

        public a(d dVar) {
            this.f35870a = dVar;
        }

        public final n c(r rVar) {
            return new g(this.f35870a);
        }

        public final void teardown() {
        }
    }

    private static final class c implements com.bumptech.glide.load.data.d {

        /* renamed from: a  reason: collision with root package name */
        private final File f35871a;

        /* renamed from: b  reason: collision with root package name */
        private final d f35872b;

        /* renamed from: c  reason: collision with root package name */
        private Object f35873c;

        c(File file, d dVar) {
            this.f35871a = file;
            this.f35872b = dVar;
        }

        public Class a() {
            return this.f35872b.a();
        }

        public void b() {
            Object obj = this.f35873c;
            if (obj != null) {
                try {
                    this.f35872b.b(obj);
                } catch (IOException unused) {
                }
            }
        }

        public void d(h hVar, d.a aVar) {
            try {
                Object c10 = this.f35872b.c(this.f35871a);
                this.f35873c = c10;
                aVar.e(c10);
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e10);
                }
                aVar.c(e10);
            }
        }

        public T4.a getDataSource() {
            return T4.a.LOCAL;
        }

        public void cancel() {
        }
    }
}
