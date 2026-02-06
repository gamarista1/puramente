package Z4;

import T4.i;
import Z4.n;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import n5.C3861d;

public class w implements n {

    /* renamed from: a  reason: collision with root package name */
    private static final w f35938a = new w();

    public static w c() {
        return f35938a;
    }

    public n.a a(Object obj, int i10, int i11, i iVar) {
        return new n.a(new C3861d(obj), new b(obj));
    }

    public boolean b(Object obj) {
        return true;
    }

    public static class a implements o {

        /* renamed from: a  reason: collision with root package name */
        private static final a f35939a = new a();

        public static a a() {
            return f35939a;
        }

        public n c(r rVar) {
            return w.c();
        }

        public void teardown() {
        }
    }

    private static class b implements d {

        /* renamed from: a  reason: collision with root package name */
        private final Object f35940a;

        b(Object obj) {
            this.f35940a = obj;
        }

        public Class a() {
            return this.f35940a.getClass();
        }

        public void d(h hVar, d.a aVar) {
            aVar.e(this.f35940a);
        }

        public T4.a getDataSource() {
            return T4.a.LOCAL;
        }

        public void b() {
        }

        public void cancel() {
        }
    }
}
