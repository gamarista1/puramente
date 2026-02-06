package Y6;

import X5.a;
import android.graphics.Bitmap;
import c7.C3184d;
import d6.C3476b;
import d6.C3477c;

public abstract class b extends C3476b {
    public void f(C3477c cVar) {
        Bitmap bitmap;
        if (cVar.c()) {
            a aVar = (a) cVar.a();
            if (aVar == null || !(aVar.I() instanceof C3184d)) {
                bitmap = null;
            } else {
                bitmap = ((C3184d) aVar.I()).h1();
            }
            try {
                g(bitmap);
            } finally {
                a.E(aVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void g(Bitmap bitmap);
}
