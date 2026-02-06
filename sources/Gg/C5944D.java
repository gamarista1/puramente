package gg;

import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

/* renamed from: gg.D  reason: case insensitive filesystem */
public interface C5944D {

    /* renamed from: gg.D$a */
    public static final class a implements C5944D {

        /* renamed from: a  reason: collision with root package name */
        public static final a f67714a = new a();

        private a() {
        }

        public List a(String str) {
            C6496s.h(str, "packageFqName");
            return C6565s.n();
        }
    }

    List a(String str);
}
