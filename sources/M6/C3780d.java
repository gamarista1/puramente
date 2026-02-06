package m6;

/* renamed from: m6.d  reason: case insensitive filesystem */
public class C3780d {

    /* renamed from: a  reason: collision with root package name */
    private boolean f46502a;

    /* renamed from: b  reason: collision with root package name */
    private int f46503b;

    /* renamed from: c  reason: collision with root package name */
    private int f46504c;

    public C3780d() {
        a();
    }

    public void a() {
        this.f46502a = false;
        this.f46503b = 4;
        c();
    }

    public void b() {
        this.f46504c++;
    }

    public void c() {
        this.f46504c = 0;
    }

    public void d(boolean z10) {
        this.f46502a = z10;
    }

    public boolean e() {
        if (!this.f46502a || this.f46504c >= this.f46503b) {
            return false;
        }
        return true;
    }
}
