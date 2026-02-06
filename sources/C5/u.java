package c5;

import T4.m;
import V4.v;
import W4.d;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.c;
import java.security.MessageDigest;

public class u implements m {

    /* renamed from: b  reason: collision with root package name */
    private final m f36498b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f36499c;

    public u(m mVar, boolean z10) {
        this.f36498b = mVar;
        this.f36499c = z10;
    }

    private v d(Context context, v vVar) {
        return C3169A.c(context.getResources(), vVar);
    }

    public v a(Context context, v vVar, int i10, int i11) {
        d h10 = c.e(context).h();
        Drawable drawable = (Drawable) vVar.get();
        v a10 = t.a(h10, drawable, i10, i11);
        if (a10 != null) {
            v a11 = this.f36498b.a(context, a10, i10, i11);
            if (!a11.equals(a10)) {
                return d(context, a11);
            }
            a11.recycle();
            return vVar;
        } else if (!this.f36499c) {
            return vVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    public void b(MessageDigest messageDigest) {
        this.f36498b.b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (obj instanceof u) {
            return this.f36498b.equals(((u) obj).f36498b);
        }
        return false;
    }

    public int hashCode() {
        return this.f36498b.hashCode();
    }

    public m c() {
        return this;
    }
}
