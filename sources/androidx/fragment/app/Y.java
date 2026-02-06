package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

final class Y extends Writer {

    /* renamed from: a  reason: collision with root package name */
    private final String f16872a;

    /* renamed from: b  reason: collision with root package name */
    private StringBuilder f16873b = new StringBuilder(128);

    Y(String str) {
        this.f16872a = str;
    }

    private void a() {
        if (this.f16873b.length() > 0) {
            Log.d(this.f16872a, this.f16873b.toString());
            StringBuilder sb2 = this.f16873b;
            sb2.delete(0, sb2.length());
        }
    }

    public void close() {
        a();
    }

    public void flush() {
        a();
    }

    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == 10) {
                a();
            } else {
                this.f16873b.append(c10);
            }
        }
    }
}
