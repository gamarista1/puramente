package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.amazon.a.a.o.b.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.q  reason: case insensitive filesystem */
public abstract class C4535q {

    /* renamed from: com.google.android.gms.common.internal.q$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List f54220a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final Object f54221b;

        /* synthetic */ a(Object obj, i0 i0Var) {
            C4536s.l(obj);
            this.f54221b = obj;
        }

        public a a(String str, Object obj) {
            C4536s.l(str);
            String valueOf = String.valueOf(obj);
            this.f54220a.add(str + f.f37530b + valueOf);
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f54221b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f54220a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) this.f54220a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            if (bundle == bundle2) {
                return true;
            }
            return false;
        } else if (bundle.size() != bundle2.size()) {
            return false;
        } else {
            Set<String> keySet = bundle.keySet();
            if (!keySet.containsAll(bundle2.keySet())) {
                return false;
            }
            for (String next : keySet) {
                if (!b(bundle.get(next), bundle2.get(next))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int c(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a d(Object obj) {
        return new a(obj, (i0) null);
    }
}
