package ge;

import android.content.Intent;
import kotlin.jvm.internal.C6496s;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final int f60652a;

    /* renamed from: b  reason: collision with root package name */
    private final int f60653b;

    /* renamed from: c  reason: collision with root package name */
    private final Intent f60654c;

    public j(int i10, int i11, Intent intent) {
        this.f60652a = i10;
        this.f60653b = i11;
        this.f60654c = intent;
    }

    public final int a() {
        return this.f60652a;
    }

    public final int b() {
        return this.f60653b;
    }

    public final Intent c() {
        return this.f60654c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f60652a == jVar.f60652a && this.f60653b == jVar.f60653b && C6496s.c(this.f60654c, jVar.f60654c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = ((Integer.hashCode(this.f60652a) * 31) + Integer.hashCode(this.f60653b)) * 31;
        Intent intent = this.f60654c;
        if (intent == null) {
            i10 = 0;
        } else {
            i10 = intent.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        int i10 = this.f60652a;
        int i11 = this.f60653b;
        Intent intent = this.f60654c;
        return "OnActivityResultPayload(requestCode=" + i10 + ", resultCode=" + i11 + ", data=" + intent + ")";
    }
}
