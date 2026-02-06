package nc;

import com.google.android.gms.common.internal.C4535q;

/* renamed from: nc.b  reason: case insensitive filesystem */
public class C5116b {

    /* renamed from: a  reason: collision with root package name */
    private String f61123a;

    public C5116b(String str) {
        this.f61123a = str;
    }

    public String a() {
        return this.f61123a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5116b)) {
            return false;
        }
        return C4535q.b(this.f61123a, ((C5116b) obj).f61123a);
    }

    public int hashCode() {
        return C4535q.c(this.f61123a);
    }

    public String toString() {
        return C4535q.d(this).a("token", this.f61123a).toString();
    }
}
