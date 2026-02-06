package l5;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.d;
import o5.l;

public abstract class c implements j {

    /* renamed from: a  reason: collision with root package name */
    private final int f46103a;

    /* renamed from: b  reason: collision with root package name */
    private final int f46104b;

    /* renamed from: c  reason: collision with root package name */
    private d f46105c;

    public c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public final d a() {
        return this.f46105c;
    }

    public final void f(d dVar) {
        this.f46105c = dVar;
    }

    public final void i(i iVar) {
        iVar.d(this.f46103a, this.f46104b);
    }

    public c(int i10, int i11) {
        if (l.u(i10, i11)) {
            this.f46103a = i10;
            this.f46104b = i11;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11);
    }

    public void onDestroy() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public final void b(i iVar) {
    }

    public void c(Drawable drawable) {
    }

    public void g(Drawable drawable) {
    }
}
