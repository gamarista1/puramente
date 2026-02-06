package u1;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

/* renamed from: u1.a  reason: case insensitive filesystem */
final class C2696a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2696a f26540a = new C2696a();

    private C2696a() {
    }

    public static final void a(Bundle bundle, String str, Size size) {
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
