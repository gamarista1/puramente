package D8;

import E8.a;
import android.text.TextUtils;
import java.io.IOException;

class e {

    /* renamed from: a  reason: collision with root package name */
    int f30591a;

    /* renamed from: b  reason: collision with root package name */
    int f30592b;

    /* renamed from: c  reason: collision with root package name */
    int f30593c;

    /* renamed from: d  reason: collision with root package name */
    int f30594d;

    e() {
    }

    static int a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            return -1159790593;
        }
        return ((str.charAt(3) & 255) << 24) | (str.charAt(0) & 255) | ((str.charAt(1) & 255) << 8) | ((str.charAt(2) & 255) << 16);
    }

    /* access modifiers changed from: package-private */
    public void c(a aVar) {
        int available = aVar.available();
        b(aVar);
        int available2 = available - aVar.available();
        int i10 = this.f30591a;
        if (available2 > i10) {
            throw new IOException("Out of chunk area");
        } else if (available2 < i10) {
            aVar.skip((long) (i10 - available2));
        }
    }

    /* access modifiers changed from: package-private */
    public void b(a aVar) {
    }
}
