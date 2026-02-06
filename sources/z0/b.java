package Z0;

import Q0.C1321d;
import Q0.C1340x;
import android.support.v4.media.session.c;
import android.text.Spannable;
import androidx.emoji2.text.j;
import c1.d;
import java.util.List;

public abstract class b {
    private static final void a(Spannable spannable, C1340x xVar, int i10, int i11, d dVar) {
        for (Object obj : spannable.getSpans(i10, i11, j.class)) {
            spannable.removeSpan((j) obj);
        }
        throw null;
    }

    public static final void b(Spannable spannable, List list, d dVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1321d.c cVar = (C1321d.c) list.get(i10);
            c.a(cVar.a());
            a(spannable, (C1340x) null, cVar.b(), cVar.c(), dVar);
        }
    }
}
