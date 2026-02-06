package cc;

import Zb.b;
import Zb.d;
import Zb.e;
import ac.C4458a;
import ac.C4459b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cc.h  reason: case insensitive filesystem */
public class C4484h {

    /* renamed from: a  reason: collision with root package name */
    private final Map f53705a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f53706b;

    /* renamed from: c  reason: collision with root package name */
    private final d f53707c;

    /* renamed from: cc.h$a */
    public static final class a implements C4459b {

        /* renamed from: d  reason: collision with root package name */
        private static final d f53708d = new C4483g();

        /* renamed from: a  reason: collision with root package name */
        private final Map f53709a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private final Map f53710b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        private d f53711c = f53708d;

        /* access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, e eVar) {
            throw new b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public C4484h c() {
            return new C4484h(new HashMap(this.f53709a), new HashMap(this.f53710b), this.f53711c);
        }

        public a d(C4458a aVar) {
            aVar.a(this);
            return this;
        }

        /* renamed from: f */
        public a a(Class cls, d dVar) {
            this.f53709a.put(cls, dVar);
            this.f53710b.remove(cls);
            return this;
        }
    }

    C4484h(Map map, Map map2, d dVar) {
        this.f53705a = map;
        this.f53706b = map2;
        this.f53707c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new C4482f(outputStream, this.f53705a, this.f53706b, this.f53707c).t(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
