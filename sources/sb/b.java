package Sb;

import Sb.d;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Set f52371a;

    /* renamed from: b  reason: collision with root package name */
    private final d.a f52372b;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f52373a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                Sb.d$a[] r0 = Sb.d.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f52373a = r0
                Sb.d$a r1 = Sb.d.a.ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f52373a     // Catch:{ NoSuchFieldError -> 0x001d }
                Sb.d$a r1 = Sb.d.a.WARN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f52373a     // Catch:{ NoSuchFieldError -> 0x0028 }
                Sb.d$a r1 = Sb.d.a.INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f52373a     // Catch:{ NoSuchFieldError -> 0x0033 }
                Sb.d$a r1 = Sb.d.a.DEBUG     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Sb.b.a.<clinit>():void");
        }
    }

    public b(d.a aVar, List list) {
        if (list != null) {
            this.f52371a = new HashSet(list);
        } else {
            this.f52371a = null;
        }
        this.f52372b = aVar;
    }

    public d.a a() {
        return this.f52372b;
    }

    public void b(d.a aVar, String str, String str2, long j10) {
        if (g(aVar, str)) {
            String c10 = c(aVar, str, str2, j10);
            int i10 = a.f52373a[aVar.ordinal()];
            if (i10 == 1) {
                e(str, c10);
            } else if (i10 == 2) {
                h(str, c10);
            } else if (i10 == 3) {
                f(str, c10);
            } else if (i10 == 4) {
                d(str, c10);
            } else {
                throw new RuntimeException("Should not reach here!");
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract String c(d.a aVar, String str, String str2, long j10);

    /* access modifiers changed from: protected */
    public abstract void d(String str, String str2);

    /* access modifiers changed from: protected */
    public abstract void e(String str, String str2);

    /* access modifiers changed from: protected */
    public abstract void f(String str, String str2);

    /* access modifiers changed from: protected */
    public boolean g(d.a aVar, String str) {
        if (aVar.ordinal() < this.f52372b.ordinal() || (this.f52371a != null && aVar.ordinal() <= d.a.DEBUG.ordinal() && !this.f52371a.contains(str))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract void h(String str, String str2);
}
