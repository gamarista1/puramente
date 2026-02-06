package m7;

import android.graphics.ColorSpace;
import kotlin.Pair;

/* renamed from: m7.e  reason: case insensitive filesystem */
public final class C3785e {

    /* renamed from: a  reason: collision with root package name */
    private final ColorSpace f46511a;

    /* renamed from: b  reason: collision with root package name */
    private final Pair f46512b;

    public C3785e(int i10, int i11, ColorSpace colorSpace) {
        Pair pair;
        this.f46511a = colorSpace;
        if (i10 == -1 || i11 == -1) {
            pair = null;
        } else {
            pair = new Pair(Integer.valueOf(i10), Integer.valueOf(i11));
        }
        this.f46512b = pair;
    }

    public final ColorSpace a() {
        return this.f46511a;
    }

    public final Pair b() {
        return this.f46512b;
    }
}
