package com.revenuecat.purchases.utils.serializers;

import gh.C5978b;
import hh.C5998a;
import ih.e;
import ih.f;
import ih.i;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/utils/serializers/OptionalURLSerializer;", "Lgh/b;", "Ljava/net/URL;", "<init>", "()V", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Ljava/net/URL;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Ljava/net/URL;)V", "delegate", "Lgh/b;", "Lih/f;", "descriptor", "Lih/f;", "getDescriptor", "()Lih/f;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OptionalURLSerializer implements C5978b {
    public static final OptionalURLSerializer INSTANCE = new OptionalURLSerializer();
    private static final C5978b delegate = C5998a.u(URLSerializer.INSTANCE);
    private static final f descriptor = i.a("URL?", e.i.f68482a);

    private OptionalURLSerializer() {
    }

    public f getDescriptor() {
        return descriptor;
    }

    public URL deserialize(jh.e eVar) {
        C6496s.h(eVar, "decoder");
        try {
            return (URL) delegate.deserialize(eVar);
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public void serialize(jh.f fVar, URL url) {
        C6496s.h(fVar, "encoder");
        if (url == null) {
            fVar.F("");
        } else {
            delegate.serialize(fVar, url);
        }
    }
}
