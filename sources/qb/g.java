package Qb;

import Lb.C4373g;
import Lb.k;
import Sb.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private final k f52268a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final c f52269b;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f52270a;

        a(ArrayList arrayList) {
            this.f52270a = arrayList;
        }

        public void run() {
            Iterator it = this.f52270a.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                if (g.this.f52269b.f()) {
                    c a10 = g.this.f52269b;
                    a10.b("Raising " + eVar.toString(), new Object[0]);
                }
                eVar.a();
            }
        }
    }

    public g(C4373g gVar) {
        this.f52268a = gVar.o();
        this.f52269b = gVar.q("EventRaiser");
    }

    public void b(List list) {
        if (this.f52269b.f()) {
            c cVar = this.f52269b;
            cVar.b("Raising " + list.size() + " event(s)", new Object[0]);
        }
        this.f52268a.b(new a(new ArrayList(list)));
    }
}
