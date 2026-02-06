package kg;

import ig.o;
import ig.p;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;
import lf.z;
import mf.C6565s;
import yf.C6798l;

/* renamed from: kg.d  reason: case insensitive filesystem */
public final class C6437d implements C6436c {

    /* renamed from: a  reason: collision with root package name */
    private final p f71571a;

    /* renamed from: b  reason: collision with root package name */
    private final o f71572b;

    /* renamed from: kg.d$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f71573a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ig.o$c$c[] r0 = ig.o.c.C1018c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ig.o$c$c r1 = ig.o.c.C1018c.CLASS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ig.o$c$c r1 = ig.o.c.C1018c.f68265c     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ig.o$c$c r1 = ig.o.c.C1018c.LOCAL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f71573a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kg.C6437d.a.<clinit>():void");
        }
    }

    public C6437d(p pVar, o oVar) {
        C6496s.h(pVar, "strings");
        C6496s.h(oVar, "qualifiedNames");
        this.f71571a = pVar;
        this.f71572b = oVar;
    }

    private final z c(int i10) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z10 = false;
        while (i10 != -1) {
            o.c v10 = this.f71572b.v(i10);
            String v11 = this.f71571a.v(v10.z());
            o.c.C1018c x10 = v10.x();
            C6496s.e(x10);
            int i11 = a.f71573a[x10.ordinal()];
            if (i11 == 1) {
                linkedList2.addFirst(v11);
            } else if (i11 == 2) {
                linkedList.addFirst(v11);
            } else if (i11 == 3) {
                linkedList2.addFirst(v11);
                z10 = true;
            } else {
                throw new C6535s();
            }
            i10 = v10.y();
        }
        return new z(linkedList, linkedList2, Boolean.valueOf(z10));
    }

    public boolean a(int i10) {
        return ((Boolean) c(i10).f()).booleanValue();
    }

    public String b(int i10) {
        z c10 = c(i10);
        List list = (List) c10.a();
        String x02 = C6565s.x0((List) c10.b(), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null);
        if (list.isEmpty()) {
            return x02;
        }
        return C6565s.x0(list, "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null) + '/' + x02;
    }

    public String getString(int i10) {
        String v10 = this.f71571a.v(i10);
        C6496s.g(v10, "getString(...)");
        return v10;
    }
}
