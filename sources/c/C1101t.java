package C;

import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6798l;

/* renamed from: C.t  reason: case insensitive filesystem */
public abstract class C1101t {

    /* renamed from: a  reason: collision with root package name */
    private final a f1042a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1043b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1044c;

    /* renamed from: d  reason: collision with root package name */
    private final C6798l f1045d;

    /* renamed from: e  reason: collision with root package name */
    private final C6798l f1046e;

    /* renamed from: C.t$a */
    public enum a {
        Visible,
        Clip,
        ExpandIndicator,
        ExpandOrCollapseIndicator
    }

    /* renamed from: C.t$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1052a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                C.t$a[] r0 = C.C1101t.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                C.t$a r1 = C.C1101t.a.ExpandIndicator     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                C.t$a r1 = C.C1101t.a.ExpandOrCollapseIndicator     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f1052a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: C.C1101t.b.<clinit>():void");
        }
    }

    public /* synthetic */ C1101t(a aVar, int i10, int i11, C6798l lVar, C6798l lVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, i10, i11, lVar, lVar2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: yf.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(C.C1102u r4, java.util.List r5) {
        /*
            r3 = this;
            yf.l r0 = r3.f1045d
            r1 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r0.invoke(r4)
            yf.p r0 = (yf.p) r0
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            yf.l r2 = r3.f1046e
            if (r2 == 0) goto L_0x0018
            java.lang.Object r4 = r2.invoke(r4)
            r1 = r4
            yf.p r1 = (yf.p) r1
        L_0x0018:
            C.t$a r4 = r3.f1042a
            int[] r2 = C.C1101t.b.f1052a
            int r4 = r4.ordinal()
            r4 = r2[r4]
            r2 = 1
            if (r4 == r2) goto L_0x0034
            r2 = 2
            if (r4 == r2) goto L_0x0029
            goto L_0x0039
        L_0x0029:
            if (r0 == 0) goto L_0x002e
            r5.add(r0)
        L_0x002e:
            if (r1 == 0) goto L_0x0039
            r5.add(r1)
            goto L_0x0039
        L_0x0034:
            if (r0 == 0) goto L_0x0039
            r5.add(r0)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C.C1101t.a(C.u, java.util.List):void");
    }

    public final C1102u b() {
        return new C1102u(this.f1042a, this.f1043b, this.f1044c);
    }

    private C1101t(a aVar, int i10, int i11, C6798l lVar, C6798l lVar2) {
        this.f1042a = aVar;
        this.f1043b = i10;
        this.f1044c = i11;
        this.f1045d = lVar;
        this.f1046e = lVar2;
    }
}
