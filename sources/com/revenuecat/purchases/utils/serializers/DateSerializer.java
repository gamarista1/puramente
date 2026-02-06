package com.revenuecat.purchases.utils.serializers;

import gh.C5978b;
import ih.e;
import ih.f;
import ih.i;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/utils/serializers/DateSerializer;", "Lgh/b;", "Ljava/util/Date;", "<init>", "()V", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Ljava/util/Date;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Ljava/util/Date;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DateSerializer implements C5978b {
    public static final DateSerializer INSTANCE = new DateSerializer();

    private DateSerializer() {
    }

    public f getDescriptor() {
        return i.a("Date", e.g.f68480a);
    }

    public Date deserialize(jh.e eVar) {
        C6496s.h(eVar, "decoder");
        return new Date(eVar.m());
    }

    public void serialize(jh.f fVar, Date date) {
        C6496s.h(fVar, "encoder");
        C6496s.h(date, "value");
        fVar.n(date.getTime());
    }
}
