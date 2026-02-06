package W0;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class J {

    /* renamed from: e  reason: collision with root package name */
    public static final a f8485e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f8486f = 8;

    /* renamed from: a  reason: collision with root package name */
    private String f8487a;

    /* renamed from: b  reason: collision with root package name */
    private C1447o f8488b;

    /* renamed from: c  reason: collision with root package name */
    private int f8489c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f8490d = -1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public J(String str) {
        this.f8487a = str;
    }

    public final char a(int i10) {
        C1447o oVar = this.f8488b;
        if (oVar == null) {
            return this.f8487a.charAt(i10);
        }
        if (i10 < this.f8489c) {
            return this.f8487a.charAt(i10);
        }
        int e10 = oVar.e();
        int i11 = this.f8489c;
        if (i10 < e10 + i11) {
            return oVar.d(i10 - i11);
        }
        return this.f8487a.charAt(i10 - ((e10 - this.f8490d) + i11));
    }

    public final int b() {
        C1447o oVar = this.f8488b;
        if (oVar == null) {
            return this.f8487a.length();
        }
        return (this.f8487a.length() - (this.f8490d - this.f8489c)) + oVar.e();
    }

    public final void c(int i10, int i11, String str) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("start index must be less than or equal to end index: " + i10 + " > " + i11).toString());
        } else if (i10 >= 0) {
            C1447o oVar = this.f8488b;
            if (oVar == null) {
                int max = Math.max(255, str.length() + 128);
                char[] cArr = new char[max];
                int min = Math.min(i10, 64);
                int min2 = Math.min(this.f8487a.length() - i11, 64);
                int i12 = i10 - min;
                C1449q.a(this.f8487a, cArr, 0, i12, i10);
                int i13 = max - min2;
                int i14 = min2 + i11;
                C1449q.a(this.f8487a, cArr, i13, i11, i14);
                C1448p.b(str, cArr, min);
                this.f8488b = new C1447o(cArr, min + str.length(), i13);
                this.f8489c = i12;
                this.f8490d = i14;
                return;
            }
            int i15 = this.f8489c;
            int i16 = i10 - i15;
            int i17 = i11 - i15;
            if (i16 < 0 || i17 > oVar.e()) {
                this.f8487a = toString();
                this.f8488b = null;
                this.f8489c = -1;
                this.f8490d = -1;
                c(i10, i11, str);
                return;
            }
            oVar.g(i16, i17, str);
        } else {
            throw new IllegalArgumentException(("start must be non-negative, but was " + i10).toString());
        }
    }

    public String toString() {
        C1447o oVar = this.f8488b;
        if (oVar == null) {
            return this.f8487a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f8487a, 0, this.f8489c);
        oVar.a(sb2);
        String str = this.f8487a;
        sb2.append(str, this.f8490d, str.length());
        return sb2.toString();
    }
}
