package ib;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: ib.b  reason: case insensitive filesystem */
public final class C5015b implements C5016c {

    /* renamed from: a  reason: collision with root package name */
    private final C5016c f60670a;

    /* renamed from: b  reason: collision with root package name */
    private final float f60671b;

    public C5015b(float f10, C5016c cVar) {
        while (cVar instanceof C5015b) {
            cVar = ((C5015b) cVar).f60670a;
            f10 += ((C5015b) cVar).f60671b;
        }
        this.f60670a = cVar;
        this.f60671b = f10;
    }

    public float a(RectF rectF) {
        return Math.max(0.0f, this.f60670a.a(rectF) + this.f60671b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5015b)) {
            return false;
        }
        C5015b bVar = (C5015b) obj;
        if (!this.f60670a.equals(bVar.f60670a) || this.f60671b != bVar.f60671b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f60670a, Float.valueOf(this.f60671b)});
    }
}
