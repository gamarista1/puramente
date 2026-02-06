package ib;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: ib.a  reason: case insensitive filesystem */
public final class C5014a implements C5016c {

    /* renamed from: a  reason: collision with root package name */
    private final float f60669a;

    public C5014a(float f10) {
        this.f60669a = f10;
    }

    public float a(RectF rectF) {
        return this.f60669a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5014a)) {
            return false;
        }
        if (this.f60669a == ((C5014a) obj).f60669a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f60669a)});
    }
}
