package j6;

import G6.g;
import T5.f;
import T5.n;
import T5.o;
import b7.C3158a;
import java.util.ArrayList;
import java.util.List;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final f f44802a;

    /* renamed from: b  reason: collision with root package name */
    private final h f44803b;

    /* renamed from: c  reason: collision with root package name */
    private final n f44804c;

    public static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public List f44805a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public n f44806b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public h f44807c;

        public a e(C3158a aVar) {
            if (this.f44805a == null) {
                this.f44805a = new ArrayList();
            }
            this.f44805a.add(aVar);
            return this;
        }

        public b f() {
            return new b(this);
        }
    }

    public static a e() {
        return new a();
    }

    public f a() {
        return this.f44802a;
    }

    public n b() {
        return this.f44804c;
    }

    public g c() {
        return null;
    }

    public h d() {
        return this.f44803b;
    }

    private b(a aVar) {
        n nVar;
        this.f44802a = aVar.f44805a != null ? f.a(aVar.f44805a) : null;
        if (aVar.f44806b != null) {
            nVar = aVar.f44806b;
        } else {
            nVar = o.a(Boolean.FALSE);
        }
        this.f44804c = nVar;
        this.f44803b = aVar.f44807c;
        g unused = aVar.getClass();
    }
}
