package Fh;

import Gh.C5404e;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import kotlin.jvm.internal.C6496s;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f63143a = new f();

    private f() {
    }

    public final String a(int i10) {
        if (i10 < 1000 || i10 >= 5000) {
            return "Code must be in range [1000,5000): " + i10;
        } else if ((1004 > i10 || i10 >= 1007) && (1015 > i10 || i10 >= 3000)) {
            return null;
        } else {
            return "Code " + i10 + " is reserved and may not be used.";
        }
    }

    public final void b(C5404e.a aVar, byte[] bArr) {
        C6496s.h(aVar, b.f37479b);
        C6496s.h(bArr, SubscriberAttributeKt.JSON_NAME_KEY);
        int length = bArr.length;
        int i10 = 0;
        do {
            byte[] bArr2 = aVar.f63290e;
            int i11 = aVar.f63291f;
            int i12 = aVar.f63292g;
            if (bArr2 != null) {
                while (i11 < i12) {
                    int i13 = i10 % length;
                    bArr2[i11] = (byte) (bArr2[i11] ^ bArr[i13]);
                    i11++;
                    i10 = i13 + 1;
                }
            }
        } while (aVar.b() != -1);
    }

    public final void c(int i10) {
        String a10 = a(i10);
        if (a10 != null) {
            C6496s.e(a10);
            throw new IllegalArgumentException(a10.toString());
        }
    }
}
