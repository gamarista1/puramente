package Z4;

import T4.i;
import Z4.n;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import n5.C3861d;

public class b implements n {

    /* renamed from: a  reason: collision with root package name */
    private final C0585b f35847a;

    /* renamed from: Z4.b$b  reason: collision with other inner class name */
    public interface C0585b {
        Class a();

        Object b(byte[] bArr);
    }

    public b(C0585b bVar) {
        this.f35847a = bVar;
    }

    /* renamed from: c */
    public n.a a(byte[] bArr, int i10, int i11, i iVar) {
        return new n.a(new C3861d(bArr), new c(bArr, this.f35847a));
    }

    /* renamed from: d */
    public boolean b(byte[] bArr) {
        return true;
    }

    public static class a implements o {

        /* renamed from: Z4.b$a$a  reason: collision with other inner class name */
        class C0584a implements C0585b {
            C0584a() {
            }

            public Class a() {
                return ByteBuffer.class;
            }

            /* renamed from: c */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        public n c(r rVar) {
            return new b(new C0584a());
        }

        public void teardown() {
        }
    }

    private static class c implements com.bumptech.glide.load.data.d {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f35849a;

        /* renamed from: b  reason: collision with root package name */
        private final C0585b f35850b;

        c(byte[] bArr, C0585b bVar) {
            this.f35849a = bArr;
            this.f35850b = bVar;
        }

        public Class a() {
            return this.f35850b.a();
        }

        public void d(h hVar, d.a aVar) {
            aVar.e(this.f35850b.b(this.f35849a));
        }

        public T4.a getDataSource() {
            return T4.a.LOCAL;
        }

        public void b() {
        }

        public void cancel() {
        }
    }

    public static class d implements o {

        class a implements C0585b {
            a() {
            }

            public Class a() {
                return InputStream.class;
            }

            /* renamed from: c */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        public n c(r rVar) {
            return new b(new a());
        }

        public void teardown() {
        }
    }
}
