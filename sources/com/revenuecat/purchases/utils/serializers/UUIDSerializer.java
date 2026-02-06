package com.revenuecat.purchases.utils.serializers;

import gh.C5978b;
import ih.e;
import ih.f;
import ih.i;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/utils/serializers/UUIDSerializer;", "Lgh/b;", "Ljava/util/UUID;", "<init>", "()V", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Ljava/util/UUID;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Ljava/util/UUID;)V", "Lih/f;", "descriptor", "Lih/f;", "getDescriptor", "()Lih/f;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UUIDSerializer implements C5978b {
    public static final UUIDSerializer INSTANCE = new UUIDSerializer();
    private static final f descriptor = i.a("UUID", e.i.f68482a);

    private UUIDSerializer() {
    }

    public f getDescriptor() {
        return descriptor;
    }

    public UUID deserialize(jh.e eVar) {
        C6496s.h(eVar, "decoder");
        UUID fromString = UUID.fromString(eVar.B());
        C6496s.g(fromString, "fromString(decoder.decodeString())");
        return fromString;
    }

    public void serialize(jh.f fVar, UUID uuid) {
        C6496s.h(fVar, "encoder");
        C6496s.h(uuid, "value");
        String uuid2 = uuid.toString();
        C6496s.g(uuid2, "value.toString()");
        fVar.F(uuid2);
    }
}
