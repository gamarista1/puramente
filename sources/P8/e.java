package P8;

import Q8.a;
import android.text.TextUtils;
import java.io.IOException;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public int f33553a;

    /* renamed from: b  reason: collision with root package name */
    public int f33554b;

    /* renamed from: c  reason: collision with root package name */
    public int f33555c;

    public static int a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            return -1159790593;
        }
        return ((str.charAt(3) & 255) << 24) | (str.charAt(0) & 255) | ((str.charAt(1) & 255) << 8) | ((str.charAt(2) & 255) << 16);
    }

    /* access modifiers changed from: package-private */
    public final void c(a aVar) {
        int available = aVar.available();
        b(aVar);
        int available2 = available - aVar.available();
        int i10 = this.f33554b;
        int i11 = i10 + (i10 & 1);
        if (available2 > i11) {
            throw new IOException("Out of chunk area");
        } else if (available2 < i11) {
            aVar.skip((long) (i11 - available2));
        }
    }

    /* access modifiers changed from: package-private */
    public void b(a aVar) {
    }
}
