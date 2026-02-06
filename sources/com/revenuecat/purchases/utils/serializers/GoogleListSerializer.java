package com.revenuecat.purchases.utils.serializers;

import com.adjust.sdk.Constants;
import gh.C5978b;
import ih.e;
import ih.f;
import ih.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lh.C6539c;
import lh.h;
import lh.j;
import mf.C6565s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/utils/serializers/GoogleListSerializer;", "Lgh/b;", "", "", "<init>", "()V", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Ljava/util/List;)V", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Ljava/util/List;", "Lih/f;", "descriptor", "Lih/f;", "getDescriptor", "()Lih/f;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GoogleListSerializer implements C5978b {
    public static final GoogleListSerializer INSTANCE = new GoogleListSerializer();
    private static final f descriptor = i.a("GoogleList", e.i.f68482a);

    private GoogleListSerializer() {
    }

    public f getDescriptor() {
        return descriptor;
    }

    public List<String> deserialize(jh.e eVar) {
        C6496s.h(eVar, "decoder");
        C6539c<lh.i> cVar = null;
        h hVar = eVar instanceof h ? (h) eVar : null;
        if (hVar != null) {
            lh.i iVar = (lh.i) j.n(hVar.g()).get(Constants.REFERRER_API_GOOGLE);
            if (iVar != null) {
                cVar = j.m(iVar);
            }
            if (cVar == null) {
                return C6565s.n();
            }
            ArrayList arrayList = new ArrayList(C6565s.y(cVar, 10));
            for (lh.i o10 : cVar) {
                arrayList.add(j.o(o10).a());
            }
            return arrayList;
        }
        throw new IllegalStateException("This serializer can be used only with JSON format");
    }

    public void serialize(jh.f fVar, List<String> list) {
        C6496s.h(fVar, "encoder");
        C6496s.h(list, "value");
        throw new UnsupportedOperationException("Serialization is not supported");
    }
}
