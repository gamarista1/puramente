package N9;

import N9.C3070t;
import android.content.Context;
import ia.C3612j;
import ia.r;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import q9.p;

/* renamed from: N9.j  reason: case insensitive filesystem */
public final class C3061j implements C3070t.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f33232a;

    /* renamed from: b  reason: collision with root package name */
    private C3612j.a f33233b;

    /* renamed from: c  reason: collision with root package name */
    private long f33234c;

    /* renamed from: d  reason: collision with root package name */
    private long f33235d;

    /* renamed from: e  reason: collision with root package name */
    private long f33236e;

    /* renamed from: f  reason: collision with root package name */
    private float f33237f;

    /* renamed from: g  reason: collision with root package name */
    private float f33238g;

    /* renamed from: N9.j$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final p f33239a;

        /* renamed from: b  reason: collision with root package name */
        private final Map f33240b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        private final Set f33241c = new HashSet();

        /* renamed from: d  reason: collision with root package name */
        private final Map f33242d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        private C3612j.a f33243e;

        public a(p pVar) {
            this.f33239a = pVar;
        }

        public void a(C3612j.a aVar) {
            if (aVar != this.f33243e) {
                this.f33243e = aVar;
                this.f33240b.clear();
                this.f33242d.clear();
            }
        }
    }

    public C3061j(Context context, p pVar) {
        this((C3612j.a) new r.a(context), pVar);
    }

    public C3061j(C3612j.a aVar, p pVar) {
        this.f33233b = aVar;
        a aVar2 = new a(pVar);
        this.f33232a = aVar2;
        aVar2.a(aVar);
        this.f33234c = -9223372036854775807L;
        this.f33235d = -9223372036854775807L;
        this.f33236e = -9223372036854775807L;
        this.f33237f = -3.4028235E38f;
        this.f33238g = -3.4028235E38f;
    }
}
