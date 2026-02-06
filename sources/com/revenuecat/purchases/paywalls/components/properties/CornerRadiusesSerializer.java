package com.revenuecat.purchases.paywalls.components.properties;

import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import gh.C5978b;
import ih.f;
import jh.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiusesSerializer;", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "<init>", "()V", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;)V", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;", "serializer", "Lgh/b;", "Lih/f;", "descriptor", "Lih/f;", "getDescriptor", "()Lih/f;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CornerRadiusesSerializer implements C5978b {
    public static final CornerRadiusesSerializer INSTANCE = new CornerRadiusesSerializer();
    private static final f descriptor;
    private static final C5978b serializer;

    static {
        C5978b serializer2 = CornerRadiuses.Dp.Companion.serializer();
        serializer = serializer2;
        descriptor = serializer2.getDescriptor();
    }

    private CornerRadiusesSerializer() {
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, CornerRadiuses cornerRadiuses) {
        C6496s.h(fVar, "encoder");
        C6496s.h(cornerRadiuses, "value");
    }

    public CornerRadiuses deserialize(e eVar) {
        C6496s.h(eVar, "decoder");
        return (CornerRadiuses) eVar.n(serializer);
    }
}
