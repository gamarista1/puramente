package z;

import Y.A1;
import Y.C1500m;
import Y.C1506p;
import Y.p1;
import kotlin.jvm.internal.C6498u;
import yf.C6798l;

public abstract class z {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A1 f29065a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(A1 a12) {
            super(1);
            this.f29065a = a12;
        }

        public final Float a(float f10) {
            return (Float) ((C6798l) this.f29065a.getValue()).invoke(Float.valueOf(f10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    public static final y a(C6798l lVar) {
        return new i(lVar);
    }

    public static final y b(C6798l lVar, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-180460798, i10, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:161)");
        }
        A1 o10 = p1.o(lVar, mVar, i10 & 14);
        Object A10 = mVar.A();
        if (A10 == C1500m.f10026a.a()) {
            A10 = a(new a(o10));
            mVar.r(A10);
        }
        y yVar = (y) A10;
        if (C1506p.H()) {
            C1506p.P();
        }
        return yVar;
    }
}
