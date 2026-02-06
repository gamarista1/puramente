package Lb;

import Gb.a;
import Gb.b;
import Qb.c;
import Qb.d;
import Qb.e;
import Qb.i;
import com.google.firebase.database.e;

/* renamed from: Lb.a  reason: case insensitive filesystem */
public class C4367a extends C4375i {

    /* renamed from: d  reason: collision with root package name */
    private final n f51714d;

    /* renamed from: e  reason: collision with root package name */
    private final a f51715e;

    /* renamed from: f  reason: collision with root package name */
    private final i f51716f;

    /* renamed from: Lb.a$a  reason: collision with other inner class name */
    static /* synthetic */ class C0792a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f51717a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                Qb.e$a[] r0 = Qb.e.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f51717a = r0
                Qb.e$a r1 = Qb.e.a.CHILD_ADDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f51717a     // Catch:{ NoSuchFieldError -> 0x001d }
                Qb.e$a r1 = Qb.e.a.CHILD_CHANGED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f51717a     // Catch:{ NoSuchFieldError -> 0x0028 }
                Qb.e$a r1 = Qb.e.a.CHILD_MOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f51717a     // Catch:{ NoSuchFieldError -> 0x0033 }
                Qb.e$a r1 = Qb.e.a.CHILD_REMOVED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Lb.C4367a.C0792a.<clinit>():void");
        }
    }

    public C4367a(n nVar, a aVar, i iVar) {
        this.f51714d = nVar;
        this.f51715e = aVar;
        this.f51716f = iVar;
    }

    public C4375i a(i iVar) {
        return new C4367a(this.f51714d, this.f51715e, iVar);
    }

    public d b(c cVar, i iVar) {
        String str;
        com.google.firebase.database.a a10 = e.a(e.c(this.f51714d, iVar.e().x(cVar.i())), cVar.k());
        if (cVar.m() != null) {
            str = cVar.m().b();
        } else {
            str = null;
        }
        return new d(cVar.j(), this, a10, str);
    }

    public void c(b bVar) {
        this.f51715e.a(bVar);
    }

    public void d(d dVar) {
        if (!h()) {
            int i10 = C0792a.f51717a[dVar.b().ordinal()];
            if (i10 == 1) {
                this.f51715e.c(dVar.e(), dVar.d());
            } else if (i10 == 2) {
                this.f51715e.b(dVar.e(), dVar.d());
            } else if (i10 == 3) {
                this.f51715e.d(dVar.e(), dVar.d());
            } else if (i10 == 4) {
                this.f51715e.e(dVar.e());
            }
        }
    }

    public i e() {
        return this.f51716f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4367a) {
            C4367a aVar = (C4367a) obj;
            if (!aVar.f51715e.equals(this.f51715e) || !aVar.f51714d.equals(this.f51714d) || !aVar.f51716f.equals(this.f51716f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean f(C4375i iVar) {
        if (!(iVar instanceof C4367a) || !((C4367a) iVar).f51715e.equals(this.f51715e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.f51715e.hashCode() * 31) + this.f51714d.hashCode()) * 31) + this.f51716f.hashCode();
    }

    public boolean i(e.a aVar) {
        if (aVar != e.a.VALUE) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "ChildEventRegistration";
    }
}
