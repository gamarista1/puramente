package l7;

import X5.a;
import android.graphics.Bitmap;
import kotlin.jvm.internal.C6496s;

/* renamed from: l7.b  reason: case insensitive filesystem */
public final class C3744b {

    /* renamed from: a  reason: collision with root package name */
    public static final C3744b f46141a = new C3744b();

    private C3744b() {
    }

    public static final boolean a(C3743a aVar, a aVar2) {
        if (aVar == null || aVar2 == null) {
            return false;
        }
        Object I10 = aVar2.I();
        C6496s.g(I10, "get(...)");
        Bitmap bitmap = (Bitmap) I10;
        if (aVar.a()) {
            bitmap.setHasAlpha(true);
        }
        aVar.b(bitmap);
        return true;
    }
}
