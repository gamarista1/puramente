package gg;

import Lf.l;
import Sg.p;
import gg.C5969s;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;
import wg.C6768d;
import wg.C6769e;

/* renamed from: gg.u  reason: case insensitive filesystem */
final class C5971u implements C5970t {

    /* renamed from: a  reason: collision with root package name */
    public static final C5971u f67823a = new C5971u();

    /* renamed from: gg.u$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f67824a;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                Lf.l[] r0 = Lf.l.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Lf.l r1 = Lf.l.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Lf.l r1 = Lf.l.CHAR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Lf.l r1 = Lf.l.BYTE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                Lf.l r1 = Lf.l.SHORT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                Lf.l r1 = Lf.l.INT     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                Lf.l r1 = Lf.l.FLOAT     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                Lf.l r1 = Lf.l.LONG     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                Lf.l r1 = Lf.l.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                f67824a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gg.C5971u.a.<clinit>():void");
        }
    }

    private C5971u() {
    }

    /* renamed from: g */
    public C5969s c(C5969s sVar) {
        C6496s.h(sVar, "possiblyPrimitiveType");
        if (!(sVar instanceof C5969s.d)) {
            return sVar;
        }
        C5969s.d dVar = (C5969s.d) sVar;
        if (dVar.i() == null) {
            return sVar;
        }
        String f10 = C6768d.c(dVar.i().j()).f();
        C6496s.g(f10, "getInternalName(...)");
        return e(f10);
    }

    /* renamed from: h */
    public C5969s a(String str) {
        C6769e eVar;
        C6496s.h(str, "representation");
        str.length();
        char charAt = str.charAt(0);
        C6769e[] values = C6769e.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                eVar = null;
                break;
            }
            eVar = values[i10];
            if (eVar.e().charAt(0) == charAt) {
                break;
            }
            i10++;
        }
        if (eVar != null) {
            return new C5969s.d(eVar);
        }
        if (charAt == 'V') {
            return new C5969s.d((C6769e) null);
        }
        if (charAt != '[') {
            if (charAt == 'L') {
                boolean R10 = p.R(str, ';', false, 2, (Object) null);
            }
            String substring = str.substring(1, str.length() - 1);
            C6496s.g(substring, "substring(...)");
            return new C5969s.c(substring);
        }
        String substring2 = str.substring(1);
        C6496s.g(substring2, "substring(...)");
        return new C5969s.a(a(substring2));
    }

    /* renamed from: i */
    public C5969s.c e(String str) {
        C6496s.h(str, "internalName");
        return new C5969s.c(str);
    }

    /* renamed from: j */
    public C5969s b(l lVar) {
        C6496s.h(lVar, "primitiveType");
        switch (a.f67824a[lVar.ordinal()]) {
            case 1:
                return C5969s.f67811a.a();
            case 2:
                return C5969s.f67811a.c();
            case 3:
                return C5969s.f67811a.b();
            case 4:
                return C5969s.f67811a.h();
            case 5:
                return C5969s.f67811a.f();
            case 6:
                return C5969s.f67811a.e();
            case 7:
                return C5969s.f67811a.g();
            case 8:
                return C5969s.f67811a.d();
            default:
                throw new C6535s();
        }
    }

    /* renamed from: k */
    public C5969s f() {
        return e("java/lang/Class");
    }

    /* renamed from: l */
    public String d(C5969s sVar) {
        String e10;
        C6496s.h(sVar, "type");
        if (sVar instanceof C5969s.a) {
            return '[' + d(((C5969s.a) sVar).i());
        } else if (sVar instanceof C5969s.d) {
            C6769e i10 = ((C5969s.d) sVar).i();
            if (i10 == null || (e10 = i10.e()) == null) {
                return "V";
            }
            return e10;
        } else if (sVar instanceof C5969s.c) {
            return 'L' + ((C5969s.c) sVar).i() + ';';
        } else {
            throw new C6535s();
        }
    }
}
