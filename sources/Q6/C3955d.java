package q6;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: q6.d  reason: case insensitive filesystem */
public class C3955d {

    /* renamed from: a  reason: collision with root package name */
    private int f47623a = -1;

    /* renamed from: b  reason: collision with root package name */
    private boolean f47624b = false;

    /* renamed from: c  reason: collision with root package name */
    private ColorFilter f47625c = null;

    /* renamed from: d  reason: collision with root package name */
    private int f47626d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f47627e = -1;

    public void a(Drawable drawable) {
        boolean z10;
        if (drawable != null) {
            int i10 = this.f47623a;
            if (i10 != -1) {
                drawable.setAlpha(i10);
            }
            if (this.f47624b) {
                drawable.setColorFilter(this.f47625c);
            }
            int i11 = this.f47626d;
            boolean z11 = false;
            if (i11 != -1) {
                if (i11 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable.setDither(z10);
            }
            int i12 = this.f47627e;
            if (i12 != -1) {
                if (i12 != 0) {
                    z11 = true;
                }
                drawable.setFilterBitmap(z11);
            }
        }
    }

    public void b(int i10) {
        this.f47623a = i10;
    }

    public void c(ColorFilter colorFilter) {
        boolean z10;
        this.f47625c = colorFilter;
        if (colorFilter != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47624b = z10;
    }

    public void d(boolean z10) {
        this.f47626d = z10 ? 1 : 0;
    }

    public void e(boolean z10) {
        this.f47627e = z10 ? 1 : 0;
    }
}
