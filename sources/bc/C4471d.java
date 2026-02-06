package bc;

import Zb.d;
import Zb.e;
import Zb.f;
import Zb.g;
import ac.C4458a;
import ac.C4459b;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: bc.d  reason: case insensitive filesystem */
public final class C4471d implements C4459b {

    /* renamed from: e  reason: collision with root package name */
    private static final d f53663e = new C4468a();

    /* renamed from: f  reason: collision with root package name */
    private static final f f53664f = new C4469b();

    /* renamed from: g  reason: collision with root package name */
    private static final f f53665g = new C4470c();

    /* renamed from: h  reason: collision with root package name */
    private static final b f53666h = new b((a) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map f53667a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map f53668b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public d f53669c = f53663e;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f53670d = false;

    /* renamed from: bc.d$a */
    class a implements Zb.a {
        a() {
        }

        public void a(Object obj, Writer writer) {
            C4472e eVar = new C4472e(writer, C4471d.this.f53667a, C4471d.this.f53668b, C4471d.this.f53669c, C4471d.this.f53670d);
            eVar.k(obj, false);
            eVar.u();
        }

        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* renamed from: bc.d$b */
    private static final class b implements f {

        /* renamed from: a  reason: collision with root package name */
        private static final DateFormat f53672a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f53672a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* renamed from: b */
        public void a(Date date, g gVar) {
            gVar.e(f53672a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public C4471d() {
        p(String.class, f53664f);
        p(Boolean.class, f53665g);
        p(Date.class, f53666h);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void l(Object obj, e eVar) {
        throw new Zb.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public Zb.a i() {
        return new a();
    }

    public C4471d j(C4458a aVar) {
        aVar.a(this);
        return this;
    }

    public C4471d k(boolean z10) {
        this.f53670d = z10;
        return this;
    }

    /* renamed from: o */
    public C4471d a(Class cls, d dVar) {
        this.f53667a.put(cls, dVar);
        this.f53668b.remove(cls);
        return this;
    }

    public C4471d p(Class cls, f fVar) {
        this.f53668b.put(cls, fVar);
        this.f53667a.remove(cls);
        return this;
    }
}
