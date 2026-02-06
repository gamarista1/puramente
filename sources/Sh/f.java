package Sh;

import Ph.c;
import com.revenuecat.purchases.common.Constants;
import java.lang.ref.SoftReference;
import java.util.StringTokenizer;

abstract class f implements c {

    /* renamed from: h  reason: collision with root package name */
    private static boolean f65123h = true;

    /* renamed from: i  reason: collision with root package name */
    static String[] f65124i = new String[0];

    /* renamed from: j  reason: collision with root package name */
    static Class[] f65125j = new Class[0];

    /* renamed from: a  reason: collision with root package name */
    int f65126a;

    /* renamed from: b  reason: collision with root package name */
    String f65127b;

    /* renamed from: c  reason: collision with root package name */
    String f65128c;

    /* renamed from: d  reason: collision with root package name */
    Class f65129d;

    /* renamed from: e  reason: collision with root package name */
    a f65130e;

    /* renamed from: f  reason: collision with root package name */
    private String f65131f;

    /* renamed from: g  reason: collision with root package name */
    ClassLoader f65132g = null;

    private interface a {
        void a(int i10, String str);

        String get(int i10);
    }

    private static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private SoftReference f65133a;

        public b() {
            c();
        }

        private String[] b() {
            return (String[]) this.f65133a.get();
        }

        private String[] c() {
            String[] strArr = new String[3];
            this.f65133a = new SoftReference(strArr);
            return strArr;
        }

        public void a(int i10, String str) {
            String[] b10 = b();
            if (b10 == null) {
                b10 = c();
            }
            b10[i10] = str;
        }

        public String get(int i10) {
            String[] b10 = b();
            if (b10 == null) {
                return null;
            }
            return b10[i10];
        }
    }

    f(int i10, String str, Class cls) {
        this.f65126a = i10;
        this.f65127b = str;
        this.f65129d = cls;
    }

    private ClassLoader h() {
        if (this.f65132g == null) {
            this.f65132g = getClass().getClassLoader();
        }
        return this.f65132g;
    }

    /* access modifiers changed from: protected */
    public abstract String a(h hVar);

    /* access modifiers changed from: package-private */
    public int b(int i10) {
        return Integer.parseInt(c(i10), 16);
    }

    /* access modifiers changed from: package-private */
    public String c(int i10) {
        int indexOf = this.f65131f.indexOf(45);
        int i11 = 0;
        while (true) {
            int i12 = i10 - 1;
            if (i10 <= 0) {
                break;
            }
            i11 = indexOf + 1;
            indexOf = this.f65131f.indexOf(45, i11);
            i10 = i12;
        }
        if (indexOf == -1) {
            indexOf = this.f65131f.length();
        }
        return this.f65131f.substring(i11, indexOf);
    }

    /* access modifiers changed from: package-private */
    public Class d(int i10) {
        return b.a(c(i10), h());
    }

    /* access modifiers changed from: package-private */
    public Class[] e(int i10) {
        StringTokenizer stringTokenizer = new StringTokenizer(c(i10), Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i11 = 0; i11 < countTokens; i11++) {
            clsArr[i11] = b.a(stringTokenizer.nextToken(), h());
        }
        return clsArr;
    }

    public Class f() {
        if (this.f65129d == null) {
            this.f65129d = d(2);
        }
        return this.f65129d;
    }

    public String g() {
        if (this.f65128c == null) {
            this.f65128c = f().getName();
        }
        return this.f65128c;
    }

    public int i() {
        if (this.f65126a == -1) {
            this.f65126a = b(0);
        }
        return this.f65126a;
    }

    public String j() {
        if (this.f65127b == null) {
            this.f65127b = c(1);
        }
        return this.f65127b;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String k(Sh.h r3) {
        /*
            r2 = this;
            boolean r0 = f65123h
            if (r0 == 0) goto L_0x001b
            Sh.f$a r0 = r2.f65130e
            if (r0 != 0) goto L_0x0014
            Sh.f$b r0 = new Sh.f$b     // Catch:{ all -> 0x0010 }
            r0.<init>()     // Catch:{ all -> 0x0010 }
            r2.f65130e = r0     // Catch:{ all -> 0x0010 }
            goto L_0x001b
        L_0x0010:
            r0 = 0
            f65123h = r0
            goto L_0x001b
        L_0x0014:
            int r1 = r3.f65148i
            java.lang.String r0 = r0.get(r1)
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = r2.a(r3)
        L_0x0022:
            boolean r1 = f65123h
            if (r1 == 0) goto L_0x002d
            Sh.f$a r1 = r2.f65130e
            int r3 = r3.f65148i
            r1.a(r3, r0)
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Sh.f.k(Sh.h):java.lang.String");
    }

    public final String toString() {
        return k(h.f65138k);
    }
}
