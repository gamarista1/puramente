package w4;

import C4.j;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: w4.l  reason: case insensitive filesystem */
public class C4127l implements C4128m, C4125j {

    /* renamed from: a  reason: collision with root package name */
    private final Path f49075a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final Path f49076b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final Path f49077c = new Path();

    /* renamed from: d  reason: collision with root package name */
    private final String f49078d;

    /* renamed from: e  reason: collision with root package name */
    private final List f49079e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final j f49080f;

    /* renamed from: w4.l$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f49081a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                C4.j$a[] r0 = C4.j.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f49081a = r0
                C4.j$a r1 = C4.j.a.MERGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f49081a     // Catch:{ NoSuchFieldError -> 0x001d }
                C4.j$a r1 = C4.j.a.ADD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f49081a     // Catch:{ NoSuchFieldError -> 0x0028 }
                C4.j$a r1 = C4.j.a.SUBTRACT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f49081a     // Catch:{ NoSuchFieldError -> 0x0033 }
                C4.j$a r1 = C4.j.a.INTERSECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f49081a     // Catch:{ NoSuchFieldError -> 0x003e }
                C4.j$a r1 = C4.j.a.EXCLUDE_INTERSECTIONS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w4.C4127l.a.<clinit>():void");
        }
    }

    public C4127l(j jVar) {
        this.f49078d = jVar.c();
        this.f49080f = jVar;
    }

    private void b() {
        for (int i10 = 0; i10 < this.f49079e.size(); i10++) {
            this.f49077c.addPath(((C4128m) this.f49079e.get(i10)).m());
        }
    }

    private void d(Path.Op op) {
        this.f49076b.reset();
        this.f49075a.reset();
        for (int size = this.f49079e.size() - 1; size >= 1; size--) {
            C4128m mVar = (C4128m) this.f49079e.get(size);
            if (mVar instanceof C4119d) {
                C4119d dVar = (C4119d) mVar;
                List k10 = dVar.k();
                for (int size2 = k10.size() - 1; size2 >= 0; size2--) {
                    Path m10 = ((C4128m) k10.get(size2)).m();
                    m10.transform(dVar.l());
                    this.f49076b.addPath(m10);
                }
            } else {
                this.f49076b.addPath(mVar.m());
            }
        }
        C4128m mVar2 = (C4128m) this.f49079e.get(0);
        if (mVar2 instanceof C4119d) {
            C4119d dVar2 = (C4119d) mVar2;
            List k11 = dVar2.k();
            for (int i10 = 0; i10 < k11.size(); i10++) {
                Path m11 = ((C4128m) k11.get(i10)).m();
                m11.transform(dVar2.l());
                this.f49075a.addPath(m11);
            }
        } else {
            this.f49075a.set(mVar2.m());
        }
        this.f49077c.op(this.f49075a, this.f49076b, op);
    }

    public void c(List list, List list2) {
        for (int i10 = 0; i10 < this.f49079e.size(); i10++) {
            ((C4128m) this.f49079e.get(i10)).c(list, list2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(java.util.ListIterator r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r3.previous()
            w4.c r0 = (w4.C4118c) r0
            boolean r1 = r0 instanceof w4.C4128m
            if (r1 == 0) goto L_0x000d
            java.util.List r1 = r2.f49079e
            w4.m r0 = (w4.C4128m) r0
            r1.add(r0)
            r3.remove()
            goto L_0x000d
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.C4127l.g(java.util.ListIterator):void");
    }

    public Path m() {
        this.f49077c.reset();
        if (this.f49080f.d()) {
            return this.f49077c;
        }
        int i10 = a.f49081a[this.f49080f.b().ordinal()];
        if (i10 == 1) {
            b();
        } else if (i10 == 2) {
            d(Path.Op.UNION);
        } else if (i10 == 3) {
            d(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            d(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            d(Path.Op.XOR);
        }
        return this.f49077c;
    }
}
