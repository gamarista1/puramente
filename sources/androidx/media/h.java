package androidx.media;

import android.text.TextUtils;
import x1.c;

class h implements b {

    /* renamed from: a  reason: collision with root package name */
    private String f17308a;

    /* renamed from: b  reason: collision with root package name */
    private int f17309b;

    /* renamed from: c  reason: collision with root package name */
    private int f17310c;

    h(String str, int i10, int i11) {
        this.f17308a = str;
        this.f17309b = i10;
        this.f17310c = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f17309b < 0 || hVar.f17309b < 0) {
            if (!TextUtils.equals(this.f17308a, hVar.f17308a) || this.f17310c != hVar.f17310c) {
                return false;
            }
            return true;
        } else if (TextUtils.equals(this.f17308a, hVar.f17308a) && this.f17309b == hVar.f17309b && this.f17310c == hVar.f17310c) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return c.b(this.f17308a, Integer.valueOf(this.f17310c));
    }
}
