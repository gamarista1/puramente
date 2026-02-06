package f8;

import android.view.View;
import kotlin.jvm.internal.C6496s;

/* renamed from: f8.a  reason: case insensitive filesystem */
public final class C3519a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3519a f43474a = new C3519a();

    private C3519a() {
    }

    public static final int a(int i10) {
        if (i10 % 2 == 0) {
            return 2;
        }
        return 1;
    }

    public static final int b(int i10, int i11) {
        int i12;
        if (i11 == -1) {
            i12 = 1;
        } else {
            i12 = 2;
        }
        if (i12 == 1 && !d(i10) && i10 % 2 == 0) {
            return 2;
        }
        return i12;
    }

    public static final int c(View view) {
        C6496s.h(view, "view");
        return a(view.getId());
    }

    public static final boolean d(int i10) {
        if (i10 % 10 == 1) {
            return true;
        }
        return false;
    }
}
