package M5;

import T5.k;
import android.net.Uri;

public class i implements d {

    /* renamed from: a  reason: collision with root package name */
    final String f32603a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f32604b;

    public i(String str) {
        this(str, false);
    }

    public String a() {
        return this.f32603a;
    }

    public boolean b(Uri uri) {
        return this.f32603a.contains(uri.toString());
    }

    public boolean c() {
        return this.f32604b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.f32603a.equals(((i) obj).f32603a);
        }
        return false;
    }

    public int hashCode() {
        return this.f32603a.hashCode();
    }

    public String toString() {
        return this.f32603a;
    }

    public i(String str, boolean z10) {
        this.f32603a = (String) k.g(str);
        this.f32604b = z10;
    }
}
