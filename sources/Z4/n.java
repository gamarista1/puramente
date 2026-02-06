package Z4;

import T4.f;
import T4.i;
import com.bumptech.glide.load.data.d;
import java.util.Collections;
import java.util.List;
import o5.k;

public interface n {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final f f35902a;

        /* renamed from: b  reason: collision with root package name */
        public final List f35903b;

        /* renamed from: c  reason: collision with root package name */
        public final d f35904c;

        public a(f fVar, d dVar) {
            this(fVar, Collections.emptyList(), dVar);
        }

        public a(f fVar, List list, d dVar) {
            this.f35902a = (f) k.d(fVar);
            this.f35903b = (List) k.d(list);
            this.f35904c = (d) k.d(dVar);
        }
    }

    a a(Object obj, int i10, int i11, i iVar);

    boolean b(Object obj);
}
