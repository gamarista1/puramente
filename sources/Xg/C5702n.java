package Xg;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import yf.C6798l;
import yf.p;

/* renamed from: Xg.n  reason: case insensitive filesystem */
abstract /* synthetic */ class C5702n {

    /* renamed from: a  reason: collision with root package name */
    private static final C6798l f66573a = b.f66576a;

    /* renamed from: b  reason: collision with root package name */
    private static final p f66574b = a.f66575a;

    /* renamed from: Xg.n$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f66575a = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(C6496s.c(obj, obj2));
        }
    }

    public static final C5694f a(C5694f fVar) {
        if (fVar instanceof L) {
            return fVar;
        }
        return b(fVar, f66573a, f66574b);
    }

    private static final C5694f b(C5694f fVar, C6798l lVar, p pVar) {
        if (fVar instanceof C5693e) {
            C5693e eVar = (C5693e) fVar;
            if (eVar.f66503b == lVar && eVar.f66504c == pVar) {
                return fVar;
            }
        }
        return new C5693e(fVar, lVar, pVar);
    }

    /* renamed from: Xg.n$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f66576a = new b();

        b() {
            super(1);
        }

        public final Object invoke(Object obj) {
            return obj;
        }
    }
}
