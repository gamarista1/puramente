package ve;

import Ff.l;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final C6798l f62046a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f62047b;

    public c(View view, C6798l lVar) {
        C6496s.h(view, "view");
        this.f62046a = lVar;
        this.f62047b = new WeakReference(view);
    }

    public final b a(View view, l lVar) {
        C6496s.h(view, "thisRef");
        C6496s.h(lVar, "property");
        View view2 = (View) this.f62047b.get();
        if (view2 != null) {
            return new a(lVar.getName(), view2, this.f62046a);
        }
        String name = lVar.getName();
        throw new IllegalStateException("Can't send the '" + name + "' event from the view that is deallocated");
    }
}
