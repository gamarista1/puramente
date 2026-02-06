package l3;

import gh.C5978b;
import j3.C2126C;
import j3.C2132c;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

/* renamed from: l3.a  reason: case insensitive filesystem */
public final class C2171a {

    /* renamed from: a  reason: collision with root package name */
    private final C5978b f23546a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23547b;

    /* renamed from: c  reason: collision with root package name */
    private String f23548c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f23549d = "";

    /* renamed from: l3.a$a  reason: collision with other inner class name */
    private enum C0378a {
        PATH,
        QUERY
    }

    /* renamed from: l3.a$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23553a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                l3.a$a[] r0 = l3.C2171a.C0378a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                l3.a$a r1 = l3.C2171a.C0378a.PATH     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                l3.a$a r1 = l3.C2171a.C0378a.QUERY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f23553a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l3.C2171a.b.<clinit>():void");
        }
    }

    public C2171a(C5978b bVar) {
        C6496s.h(bVar, "serializer");
        this.f23546a = bVar;
        this.f23547b = bVar.getDescriptor().i();
    }

    private final void a(String str) {
        this.f23548c += '/' + str;
    }

    private final void b(String str, String str2) {
        String str3;
        if (this.f23549d.length() == 0) {
            str3 = "?";
        } else {
            str3 = "&";
        }
        this.f23549d += str3 + str + '=' + str2;
    }

    private final C0378a e(int i10, C2126C c10) {
        if ((c10 instanceof C2132c) || this.f23546a.getDescriptor().j(i10)) {
            return C0378a.QUERY;
        }
        return C0378a.PATH;
    }

    public final void c(int i10, String str, C2126C c10, List list) {
        C6496s.h(str, "name");
        C6496s.h(c10, "type");
        C6496s.h(list, "value");
        int i11 = b.f23553a[e(i10, c10).ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    b(str, (String) it.next());
                }
            }
        } else if (list.size() == 1) {
            a((String) C6565s.o0(list));
        } else {
            throw new IllegalArgumentException(("Expected one value for argument " + str + ", found " + list.size() + "values instead.").toString());
        }
    }

    public final String d() {
        return this.f23547b + this.f23548c + this.f23549d;
    }
}
