package com.revenuecat.purchases.paywalls.components.properties;

import com.revenuecat.purchases.paywalls.ColorUtilsKt;
import gh.C5978b;
import hh.C5998a;
import ih.f;
import jh.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.r;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/RgbaStringArgbColorIntDeserializer;", "Lgh/b;", "", "<init>", "()V", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;I)V", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Ljava/lang/Integer;", "Lih/f;", "descriptor", "Lih/f;", "getDescriptor", "()Lih/f;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class RgbaStringArgbColorIntDeserializer implements C5978b {
    public static final RgbaStringArgbColorIntDeserializer INSTANCE = new RgbaStringArgbColorIntDeserializer();
    private static final f descriptor = C5998a.B(r.f71790a).getDescriptor();

    private RgbaStringArgbColorIntDeserializer() {
    }

    public f getDescriptor() {
        return descriptor;
    }

    public /* bridge */ /* synthetic */ void serialize(jh.f fVar, Object obj) {
        serialize(fVar, ((Number) obj).intValue());
    }

    public Integer deserialize(e eVar) {
        C6496s.h(eVar, "decoder");
        return Integer.valueOf(ColorUtilsKt.parseRGBAColor(eVar.B()));
    }

    public void serialize(jh.f fVar, int i10) {
        C6496s.h(fVar, "encoder");
        throw new IllegalStateException("Serialization is not implemented as it is not (yet) needed.");
    }
}
