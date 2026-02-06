package Y0;

import Q0.C1321d;
import Q0.C1326i;
import Q0.W;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import java.util.WeakHashMap;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final WeakHashMap f10257a = new WeakHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final WeakHashMap f10258b = new WeakHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final WeakHashMap f10259c = new WeakHashMap();

    public final ClickableSpan a(C1321d.c cVar) {
        WeakHashMap weakHashMap = this.f10259c;
        Object obj = weakHashMap.get(cVar);
        if (obj == null) {
            obj = new j((C1326i) cVar.g());
            weakHashMap.put(cVar, obj);
        }
        return (ClickableSpan) obj;
    }

    public final URLSpan b(C1321d.c cVar) {
        WeakHashMap weakHashMap = this.f10258b;
        Object obj = weakHashMap.get(cVar);
        if (obj == null) {
            obj = new URLSpan(((C1326i.b) cVar.g()).c());
            weakHashMap.put(cVar, obj);
        }
        return (URLSpan) obj;
    }

    public final URLSpan c(W w10) {
        WeakHashMap weakHashMap = this.f10257a;
        Object obj = weakHashMap.get(w10);
        if (obj == null) {
            obj = new URLSpan(w10.a());
            weakHashMap.put(w10, obj);
        }
        return (URLSpan) obj;
    }
}
