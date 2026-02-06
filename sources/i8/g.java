package i8;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import sf.C6714a;

public enum g {
    CREATE,
    UPDATE,
    DELETE;
    

    /* renamed from: a  reason: collision with root package name */
    public static final a f44326a = null;

    public static final class a {

        /* renamed from: i8.g$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C0682a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f44332a = null;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    i8.g[] r0 = i8.g.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    i8.g r1 = i8.g.CREATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    i8.g r1 = i8.g.UPDATE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    i8.g r1 = i8.g.DELETE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f44332a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: i8.g.a.C0682a.<clinit>():void");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(g gVar) {
            C6496s.h(gVar, "type");
            int i10 = C0682a.f44332a[gVar.ordinal()];
            if (i10 == 1) {
                return "create";
            }
            if (i10 == 2) {
                return "update";
            }
            if (i10 == 3) {
                return "delete";
            }
            throw new C6535s();
        }

        private a() {
        }
    }

    static {
        g[] a10;
        f44331f = C6714a.a(a10);
        f44326a = new a((DefaultConstructorMarker) null);
    }

    public static final String b(g gVar) {
        return f44326a.a(gVar);
    }
}
