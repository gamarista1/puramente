package y8;

import com.facebook.soloader.p;
import java.io.File;

/* renamed from: y8.a  reason: case insensitive filesystem */
public class C4215a {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f49870a;

    /* renamed from: b  reason: collision with root package name */
    private int f49871b;

    public C4215a(int i10) {
        if (i10 > 0) {
            this.f49870a = new String[i10];
            this.f49871b = 0;
            return;
        }
        throw new IllegalArgumentException();
    }

    public synchronized boolean a(String str) {
        for (String equals : this.f49870a) {
            if (str.equals(equals)) {
                return false;
            }
        }
        StringBuilder sb2 = new StringBuilder("Recording new base apk path: ");
        sb2.append(str);
        sb2.append("\n");
        b(sb2);
        p.g("SoLoader", sb2.toString());
        String[] strArr = this.f49870a;
        int i10 = this.f49871b;
        strArr[i10 % strArr.length] = str;
        this.f49871b = i10 + 1;
        return true;
    }

    public synchronized void b(StringBuilder sb2) {
        String str;
        try {
            sb2.append("Previously recorded ");
            sb2.append(this.f49871b);
            sb2.append(" base apk paths.");
            if (this.f49871b > 0) {
                sb2.append(" Most recent ones:");
            }
            int i10 = 0;
            while (true) {
                String[] strArr = this.f49870a;
                if (i10 < strArr.length) {
                    int i11 = (this.f49871b - i10) - 1;
                    if (i11 >= 0) {
                        String str2 = strArr[i11 % strArr.length];
                        sb2.append("\n");
                        sb2.append(str2);
                        sb2.append(" (");
                        if (new File(str2).exists()) {
                            str = "exists";
                        } else {
                            str = "does not exist";
                        }
                        sb2.append(str);
                        sb2.append(")");
                    }
                    i10++;
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized int c() {
        return this.f49871b;
    }
}
