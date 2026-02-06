package h0;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import yf.C6798l;
import yf.p;

/* renamed from: h0.k  reason: case insensitive filesystem */
public abstract class C2027k {

    /* renamed from: a  reason: collision with root package name */
    private static final C2026j f21145a = a(a.f21146a, b.f21147a);

    /* renamed from: h0.k$c */
    public static final class c implements C2026j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f21148a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f21149b;

        c(p pVar, C6798l lVar) {
            this.f21148a = pVar;
            this.f21149b = lVar;
        }

        public Object a(C2028l lVar, Object obj) {
            return this.f21148a.invoke(lVar, obj);
        }

        public Object b(Object obj) {
            return this.f21149b.invoke(obj);
        }
    }

    public static final C2026j a(p pVar, C6798l lVar) {
        return new c(pVar, lVar);
    }

    public static final C2026j b() {
        C2026j jVar = f21145a;
        C6496s.f(jVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return jVar;
    }

    /* renamed from: h0.k$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f21147a = new b();

        b() {
            super(1);
        }

        public final Object invoke(Object obj) {
            return obj;
        }
    }

    /* renamed from: h0.k$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f21146a = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(C2028l lVar, Object obj) {
            return obj;
        }
    }
}
