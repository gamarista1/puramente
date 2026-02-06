package kh;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import gh.C5978b;
import ih.C6000a;
import ih.f;
import ih.i;
import ih.k;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.C6798l;
import zf.C6828a;

public final class U extends K {

    /* renamed from: c  reason: collision with root package name */
    private final f f71629c;

    private static final class a implements Map.Entry, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f71630a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f71631b;

        public a(Object obj, Object obj2) {
            this.f71630a = obj;
            this.f71631b = obj2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (C6496s.c(this.f71630a, aVar.f71630a) && C6496s.c(this.f71631b, aVar.f71631b)) {
                return true;
            }
            return false;
        }

        public Object getKey() {
            return this.f71630a;
        }

        public Object getValue() {
            return this.f71631b;
        }

        public int hashCode() {
            int i10;
            Object obj = this.f71630a;
            int i11 = 0;
            if (obj == null) {
                i10 = 0;
            } else {
                i10 = obj.hashCode();
            }
            int i12 = i10 * 31;
            Object obj2 = this.f71631b;
            if (obj2 != null) {
                i11 = obj2.hashCode();
            }
            return i12 + i11;
        }

        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.f71630a + ", value=" + this.f71631b + ')';
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5978b f71632a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5978b f71633b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C5978b bVar, C5978b bVar2) {
            super(1);
            this.f71632a = bVar;
            this.f71633b = bVar2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C6000a) obj);
            return C6514M.f71813a;
        }

        public final void invoke(C6000a aVar) {
            C6496s.h(aVar, "$this$buildSerialDescriptor");
            C6000a aVar2 = aVar;
            C6000a.b(aVar2, SubscriberAttributeKt.JSON_NAME_KEY, this.f71632a.getDescriptor(), (List) null, false, 12, (Object) null);
            C6000a.b(aVar2, "value", this.f71633b.getDescriptor(), (List) null, false, 12, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U(C5978b bVar, C5978b bVar2) {
        super(bVar, bVar2, (DefaultConstructorMarker) null);
        C6496s.h(bVar, "keySerializer");
        C6496s.h(bVar2, "valueSerializer");
        this.f71629c = i.c("kotlin.collections.Map.Entry", k.c.f68508a, new f[0], new b(bVar, bVar2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Object a(Map.Entry entry) {
        C6496s.h(entry, "<this>");
        return entry.getKey();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Object c(Map.Entry entry) {
        C6496s.h(entry, "<this>");
        return entry.getValue();
    }

    public f getDescriptor() {
        return this.f71629c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public Map.Entry e(Object obj, Object obj2) {
        return new a(obj, obj2);
    }
}
