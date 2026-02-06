package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajq  reason: invalid package */
final class zzajq<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> zza;

    public zzajq(Iterator<Map.Entry<K, Object>> it) {
        this.zza = it;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.zza.next();
        if (next.getValue() instanceof zzajp) {
            return new zzajo(next);
        }
        return next;
    }

    public final void remove() {
        this.zza.remove();
    }
}
