package H4;

import u1.o;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f31664a = new String[5];

    /* renamed from: b  reason: collision with root package name */
    private final long[] f31665b = new long[5];

    /* renamed from: c  reason: collision with root package name */
    private int f31666c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f31667d = 0;

    public void a(String str) {
        int i10 = this.f31666c;
        if (i10 == 5) {
            this.f31667d++;
            return;
        }
        this.f31664a[i10] = str;
        this.f31665b[i10] = System.nanoTime();
        o.a(str);
        this.f31666c++;
    }

    public float b(String str) {
        int i10 = this.f31667d;
        if (i10 > 0) {
            this.f31667d = i10 - 1;
            return 0.0f;
        }
        int i11 = this.f31666c - 1;
        this.f31666c = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        } else if (str.equals(this.f31664a[i11])) {
            o.b();
            return ((float) (System.nanoTime() - this.f31665b[this.f31666c])) / 1000000.0f;
        } else {
            throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.f31664a[this.f31666c] + ".");
        }
    }
}
