package fd;

import ed.C4951a;
import ed.C4952b;
import ed.C4953c;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private C4952b f60542a;

    /* renamed from: b  reason: collision with root package name */
    private C4951a f60543b;

    /* renamed from: c  reason: collision with root package name */
    private C4953c f60544c;

    /* renamed from: d  reason: collision with root package name */
    private int f60545d = -1;

    /* renamed from: e  reason: collision with root package name */
    private C4990b f60546e;

    public static boolean b(int i10) {
        if (i10 < 0 || i10 >= 8) {
            return false;
        }
        return true;
    }

    public C4990b a() {
        return this.f60546e;
    }

    public void c(C4951a aVar) {
        this.f60543b = aVar;
    }

    public void d(int i10) {
        this.f60545d = i10;
    }

    public void e(C4990b bVar) {
        this.f60546e = bVar;
    }

    public void f(C4952b bVar) {
        this.f60542a = bVar;
    }

    public void g(C4953c cVar) {
        this.f60544c = cVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("<<\n");
        sb2.append(" mode: ");
        sb2.append(this.f60542a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.f60543b);
        sb2.append("\n version: ");
        sb2.append(this.f60544c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f60545d);
        if (this.f60546e == null) {
            sb2.append("\n matrix: null\n");
        } else {
            sb2.append("\n matrix:\n");
            sb2.append(this.f60546e);
        }
        sb2.append(">>\n");
        return sb2.toString();
    }
}
