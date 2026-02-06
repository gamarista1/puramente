package ib;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: ib.i  reason: case insensitive filesystem */
public final class C5022i implements C5016c {

    /* renamed from: a  reason: collision with root package name */
    private final float f60723a;

    public C5022i(float f10) {
        this.f60723a = f10;
    }

    public float a(RectF rectF) {
        return this.f60723a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5022i)) {
            return false;
        }
        if (this.f60723a == ((C5022i) obj).f60723a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f60723a)});
    }
}
