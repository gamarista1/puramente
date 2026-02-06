package androidx.compose.ui.input.key;

import B0.e;
import android.view.KeyEvent;
import k0.i;
import yf.C6798l;

final class b extends i.c implements e {

    /* renamed from: n  reason: collision with root package name */
    private C6798l f13436n;

    /* renamed from: o  reason: collision with root package name */
    private C6798l f13437o;

    public b(C6798l lVar, C6798l lVar2) {
        this.f13436n = lVar;
        this.f13437o = lVar2;
    }

    public boolean T0(KeyEvent keyEvent) {
        C6798l lVar = this.f13437o;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(B0.b.a(keyEvent))).booleanValue();
        }
        return false;
    }

    public boolean e1(KeyEvent keyEvent) {
        C6798l lVar = this.f13436n;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(B0.b.a(keyEvent))).booleanValue();
        }
        return false;
    }

    public final void l2(C6798l lVar) {
        this.f13436n = lVar;
    }

    public final void m2(C6798l lVar) {
        this.f13437o = lVar;
    }
}
