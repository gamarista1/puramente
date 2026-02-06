package T4;

import V4.v;
import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;

public class g implements m {

    /* renamed from: b  reason: collision with root package name */
    private final Collection f34159b;

    public g(m... mVarArr) {
        if (mVarArr.length != 0) {
            this.f34159b = Arrays.asList(mVarArr);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    public v a(Context context, v vVar, int i10, int i11) {
        v vVar2 = vVar;
        for (m a10 : this.f34159b) {
            v a11 = a10.a(context, vVar2, i10, i11);
            if (vVar2 != null && !vVar2.equals(vVar) && !vVar2.equals(a11)) {
                vVar2.recycle();
            }
            vVar2 = a11;
        }
        return vVar2;
    }

    public void b(MessageDigest messageDigest) {
        for (m b10 : this.f34159b) {
            b10.b(messageDigest);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f34159b.equals(((g) obj).f34159b);
        }
        return false;
    }

    public int hashCode() {
        return this.f34159b.hashCode();
    }
}
