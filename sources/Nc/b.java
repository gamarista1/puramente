package Nc;

import Eb.C4282c;
import Eb.C4283d;
import Eb.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

public class b implements i {
    /* access modifiers changed from: private */
    public static /* synthetic */ Object c(String str, C4282c cVar, C4283d dVar) {
        try {
            c.b(str);
            return cVar.h().a(dVar);
        } finally {
            c.a();
        }
    }

    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C4282c cVar : componentRegistrar.getComponents()) {
            String i10 = cVar.i();
            if (i10 != null) {
                cVar = cVar.t(new a(i10, cVar));
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }
}
