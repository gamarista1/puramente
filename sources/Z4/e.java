package Z4;

import T4.i;
import Z4.n;
import android.util.Base64;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import n5.C3861d;

public final class e implements n {

    /* renamed from: a  reason: collision with root package name */
    private final a f35853a;

    public interface a {
        Class a();

        void b(Object obj);

        Object decode(String str);
    }

    public e(a aVar) {
        this.f35853a = aVar;
    }

    public n.a a(Object obj, int i10, int i11, i iVar) {
        return new n.a(new C3861d(obj), new b(obj.toString(), this.f35853a));
    }

    public boolean b(Object obj) {
        return obj.toString().startsWith("data:image");
    }

    private static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        private final String f35854a;

        /* renamed from: b  reason: collision with root package name */
        private final a f35855b;

        /* renamed from: c  reason: collision with root package name */
        private Object f35856c;

        b(String str, a aVar) {
            this.f35854a = str;
            this.f35855b = aVar;
        }

        public Class a() {
            return this.f35855b.a();
        }

        public void b() {
            try {
                this.f35855b.b(this.f35856c);
            } catch (IOException unused) {
            }
        }

        public void d(h hVar, d.a aVar) {
            try {
                Object decode = this.f35855b.decode(this.f35854a);
                this.f35856c = decode;
                aVar.e(decode);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }

        public T4.a getDataSource() {
            return T4.a.LOCAL;
        }

        public void cancel() {
        }
    }

    public static final class c implements o {

        /* renamed from: a  reason: collision with root package name */
        private final a f35857a = new a();

        class a implements a {
            a() {
            }

            public Class a() {
                return InputStream.class;
            }

            /* renamed from: c */
            public void b(InputStream inputStream) {
                inputStream.close();
            }

            /* renamed from: d */
            public InputStream decode(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        public n c(r rVar) {
            return new e(this.f35857a);
        }

        public void teardown() {
        }
    }
}
