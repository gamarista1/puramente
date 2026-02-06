package n4;

import a4.C3114g;
import android.graphics.drawable.Drawable;
import c4.C3166b;
import j4.C3619f;
import j4.C3623j;
import j4.C3631r;
import k4.C3666h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import n4.C3856c;

/* renamed from: n4.a  reason: case insensitive filesystem */
public final class C3854a implements C3856c {

    /* renamed from: a  reason: collision with root package name */
    private final C3857d f46848a;

    /* renamed from: b  reason: collision with root package name */
    private final C3623j f46849b;

    /* renamed from: c  reason: collision with root package name */
    private final int f46850c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f46851d;

    public C3854a(C3857d dVar, C3623j jVar, int i10, boolean z10) {
        this.f46848a = dVar;
        this.f46849b = jVar;
        this.f46850c = i10;
        this.f46851d = z10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    public void a() {
        boolean z10;
        Drawable b10 = this.f46848a.b();
        Drawable a10 = this.f46849b.a();
        C3666h J10 = this.f46849b.b().J();
        int i10 = this.f46850c;
        C3623j jVar = this.f46849b;
        if (!(jVar instanceof C3631r) || !((C3631r) jVar).d()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3166b bVar = new C3166b(b10, a10, J10, i10, z10, this.f46851d);
        C3623j jVar2 = this.f46849b;
        if (jVar2 instanceof C3631r) {
            this.f46848a.onSuccess(bVar);
        } else if (jVar2 instanceof C3619f) {
            this.f46848a.onError(bVar);
        } else {
            throw new C6535s();
        }
    }

    public final int b() {
        return this.f46850c;
    }

    public final boolean c() {
        return this.f46851d;
    }

    /* renamed from: n4.a$a  reason: collision with other inner class name */
    public static final class C0702a implements C3856c.a {

        /* renamed from: c  reason: collision with root package name */
        private final int f46852c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f46853d;

        public C0702a(int i10, boolean z10) {
            this.f46852c = i10;
            this.f46853d = z10;
            if (i10 <= 0) {
                throw new IllegalArgumentException("durationMillis must be > 0.");
            }
        }

        public C3856c a(C3857d dVar, C3623j jVar) {
            if (!(jVar instanceof C3631r)) {
                return C3856c.a.f46857b.a(dVar, jVar);
            }
            if (((C3631r) jVar).c() == C3114g.MEMORY_CACHE) {
                return C3856c.a.f46857b.a(dVar, jVar);
            }
            return new C3854a(dVar, jVar, this.f46852c, this.f46853d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0702a) {
                C0702a aVar = (C0702a) obj;
                if (this.f46852c == aVar.f46852c && this.f46853d == aVar.f46853d) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (this.f46852c * 31) + Boolean.hashCode(this.f46853d);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0702a(int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 100 : i10, (i11 & 2) != 0 ? false : z10);
        }
    }
}
