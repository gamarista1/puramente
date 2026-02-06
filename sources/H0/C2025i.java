package h0;

import Sg.C5538a;
import Y.C1521x;
import Y.I0;
import java.util.Map;
import kotlin.jvm.internal.C6498u;
import yf.C6787a;
import yf.C6798l;

/* renamed from: h0.i  reason: case insensitive filesystem */
public abstract class C2025i {

    /* renamed from: a  reason: collision with root package name */
    private static final I0 f21143a = C1521x.f(a.f21144a);

    /* renamed from: h0.i$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f21144a = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final C2023g invoke() {
            return null;
        }
    }

    public static final C2023g a(Map map, C6798l lVar) {
        return new C2024h(map, lVar);
    }

    /* access modifiers changed from: private */
    public static final boolean c(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!C5538a.c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final I0 d() {
        return f21143a;
    }
}
