package h0;

import Y.C1500m;
import Y.C1506p;
import java.util.Map;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6787a;

/* renamed from: h0.f  reason: case insensitive filesystem */
public abstract class C2022f {

    /* renamed from: h0.f$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f21136a = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final C2021e invoke() {
            return new C2021e((Map) null, 1, (DefaultConstructorMarker) null);
        }
    }

    public static final C2020d a(C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(15454635, i10, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:60)");
        }
        mVar.T(-796080049);
        C2021e eVar = (C2021e) C2018b.e(new Object[0], C2021e.f21114d.a(), (String) null, a.f21136a, mVar, 3072, 4);
        eVar.i((C2023g) mVar.m(C2025i.d()));
        mVar.M();
        if (C1506p.H()) {
            C1506p.P();
        }
        return eVar;
    }
}
