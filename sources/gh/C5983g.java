package gh;

import Ff.d;
import hh.C5998a;
import ih.C6000a;
import ih.d;
import ih.f;
import ih.i;
import ih.j;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jh.c;
import kh.C6441b;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.U;
import lf.C6514M;
import lf.C6531o;
import lf.C6534r;
import mf.C6559l;
import mf.C6565s;
import mf.H;
import mf.O;
import yf.C6787a;
import yf.C6798l;

/* renamed from: gh.g  reason: case insensitive filesystem */
public final class C5983g extends C6441b {

    /* renamed from: a  reason: collision with root package name */
    private final d f67838a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public List f67839b;

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f67840c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f67841d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Map f67842e;

    /* renamed from: gh.g$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f67843a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5983g f67844b;

        /* renamed from: gh.g$a$a  reason: collision with other inner class name */
        static final class C1005a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5983g f67845a;

            /* renamed from: gh.g$a$a$a  reason: collision with other inner class name */
            static final class C1006a extends C6498u implements C6798l {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C5983g f67846a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C1006a(C5983g gVar) {
                    super(1);
                    this.f67846a = gVar;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((C6000a) obj);
                    return C6514M.f71813a;
                }

                public final void invoke(C6000a aVar) {
                    C6496s.h(aVar, "$this$buildSerialDescriptor");
                    for (Map.Entry entry : this.f67846a.f67842e.entrySet()) {
                        C6000a.b(aVar, (String) entry.getKey(), ((C5978b) entry.getValue()).getDescriptor(), (List) null, false, 12, (Object) null);
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1005a(C5983g gVar) {
                super(1);
                this.f67845a = gVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C6000a) obj);
                return C6514M.f71813a;
            }

            public final void invoke(C6000a aVar) {
                C6496s.h(aVar, "$this$buildSerialDescriptor");
                C6000a.b(aVar, "type", C5998a.E(U.f71764a).getDescriptor(), (List) null, false, 12, (Object) null);
                C6000a.b(aVar, "value", i.c("kotlinx.serialization.Sealed<" + this.f67845a.e().w() + '>', j.a.f68504a, new f[0], new C1006a(this.f67845a)), (List) null, false, 12, (Object) null);
                aVar.h(this.f67845a.f67839b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, C5983g gVar) {
            super(0);
            this.f67843a = str;
            this.f67844b = gVar;
        }

        /* renamed from: a */
        public final f invoke() {
            return i.c(this.f67843a, d.b.f68473a, new f[0], new C1005a(this.f67844b));
        }
    }

    /* renamed from: gh.g$b */
    public static final class b implements H {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterable f67847a;

        public b(Iterable iterable) {
            this.f67847a = iterable;
        }

        public Object a(Object obj) {
            return ((C5978b) ((Map.Entry) obj).getValue()).getDescriptor().i();
        }

        public Iterator b() {
            return this.f67847a.iterator();
        }
    }

    public C5983g(String str, Ff.d dVar, Ff.d[] dVarArr, C5978b[] bVarArr) {
        C6496s.h(str, "serialName");
        C6496s.h(dVar, "baseClass");
        C6496s.h(dVarArr, "subclasses");
        C6496s.h(bVarArr, "subclassSerializers");
        this.f67838a = dVar;
        this.f67839b = C6565s.n();
        this.f67840c = C6531o.a(C6534r.PUBLICATION, new a(str, this));
        if (dVarArr.length == bVarArr.length) {
            Map w10 = O.w(C6559l.D1(dVarArr, bVarArr));
            this.f67841d = w10;
            b bVar = new b(w10.entrySet());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator b10 = bVar.b();
            while (b10.hasNext()) {
                Object next = b10.next();
                Object a10 = bVar.a(next);
                Object obj = linkedHashMap.get(a10);
                if (obj == null) {
                    linkedHashMap.containsKey(a10);
                }
                Map.Entry entry = (Map.Entry) next;
                Map.Entry entry2 = (Map.Entry) obj;
                String str2 = (String) a10;
                if (entry2 == null) {
                    linkedHashMap.put(a10, entry);
                } else {
                    throw new IllegalStateException(("Multiple sealed subclasses of '" + e() + "' have the same serial name '" + str2 + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(O.e(linkedHashMap.size()));
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry3.getKey(), (C5978b) ((Map.Entry) entry3.getValue()).getValue());
            }
            this.f67842e = linkedHashMap2;
            return;
        }
        throw new IllegalArgumentException("All subclasses of sealed class " + e().w() + " should be marked @Serializable");
    }

    public C5977a c(c cVar, String str) {
        C6496s.h(cVar, "decoder");
        C5978b bVar = (C5978b) this.f67842e.get(str);
        if (bVar != null) {
            return bVar;
        }
        return super.c(cVar, str);
    }

    public C5987k d(jh.f fVar, Object obj) {
        C6496s.h(fVar, "encoder");
        C6496s.h(obj, "value");
        C5987k kVar = (C5978b) this.f67841d.get(kotlin.jvm.internal.O.b(obj.getClass()));
        if (kVar == null) {
            kVar = super.d(fVar, obj);
        }
        if (kVar != null) {
            return kVar;
        }
        return null;
    }

    public Ff.d e() {
        return this.f67838a;
    }

    public f getDescriptor() {
        return (f) this.f67840c.getValue();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C5983g(String str, Ff.d dVar, Ff.d[] dVarArr, C5978b[] bVarArr, Annotation[] annotationArr) {
        this(str, dVar, dVarArr, bVarArr);
        C6496s.h(str, "serialName");
        C6496s.h(dVar, "baseClass");
        C6496s.h(dVarArr, "subclasses");
        C6496s.h(bVarArr, "subclassSerializers");
        C6496s.h(annotationArr, "classAnnotations");
        this.f67839b = C6559l.e(annotationArr);
    }
}
