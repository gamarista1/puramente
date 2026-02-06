package a2;

import Y.C1500m;
import Y.C1506p;
import Z1.a;
import androidx.lifecycle.C1788k;
import androidx.lifecycle.a0;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import kotlin.jvm.internal.C6496s;

abstract /* synthetic */ class d {
    public static final a0 a(e0 e0Var, Ff.d dVar, String str, c0.c cVar, a aVar) {
        c0 c0Var;
        C6496s.h(e0Var, "<this>");
        C6496s.h(dVar, "modelClass");
        C6496s.h(aVar, "extras");
        if (cVar != null) {
            c0Var = c0.f17199b.a(e0Var.getViewModelStore(), cVar, aVar);
        } else if (e0Var instanceof C1788k) {
            c0Var = c0.f17199b.a(e0Var.getViewModelStore(), ((C1788k) e0Var).getDefaultViewModelProviderFactory(), aVar);
        } else {
            c0Var = c0.b.c(c0.f17199b, e0Var, (c0.c) null, (a) null, 6, (Object) null);
        }
        if (str != null) {
            return c0Var.c(str, dVar);
        }
        return c0Var.a(dVar);
    }

    public static final a0 b(Ff.d dVar, e0 e0Var, String str, c0.c cVar, a aVar, C1500m mVar, int i10, int i11) {
        C6496s.h(dVar, "modelClass");
        mVar.z(1673618944);
        if ((i11 & 2) == 0 || (e0Var = C1542a.f10582a.a(mVar, 6)) != null) {
            if ((i11 & 4) != 0) {
                str = null;
            }
            if ((i11 & 8) != 0) {
                cVar = null;
            }
            if ((i11 & 16) != 0) {
                if (e0Var instanceof C1788k) {
                    aVar = ((C1788k) e0Var).getDefaultViewModelCreationExtras();
                } else {
                    aVar = a.C0192a.f10387b;
                }
            }
            if (C1506p.H()) {
                C1506p.Q(1673618944, i10, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.kt:102)");
            }
            a0 a10 = c.a(e0Var, dVar, str, cVar, aVar);
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.R();
            return a10;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
    }
}
