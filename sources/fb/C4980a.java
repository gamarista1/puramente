package fb;

import android.graphics.Typeface;

/* renamed from: fb.a  reason: case insensitive filesystem */
public final class C4980a extends C4985f {

    /* renamed from: a  reason: collision with root package name */
    private final Typeface f60499a;

    /* renamed from: b  reason: collision with root package name */
    private final C0887a f60500b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f60501c;

    /* renamed from: fb.a$a  reason: collision with other inner class name */
    public interface C0887a {
        void a(Typeface typeface);
    }

    public C4980a(C0887a aVar, Typeface typeface) {
        this.f60499a = typeface;
        this.f60500b = aVar;
    }

    private void d(Typeface typeface) {
        if (!this.f60501c) {
            this.f60500b.a(typeface);
        }
    }

    public void a(int i10) {
        d(this.f60499a);
    }

    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f60501c = true;
    }
}
