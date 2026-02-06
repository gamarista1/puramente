package com.amazon.a.a.m;

import com.amazon.a.a.k.a;
import com.amazon.a.a.o.c;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class b implements com.amazon.a.a.e.b<a> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final c f37292a = new c("ExpirableValueDataStore");
    @a

    /* renamed from: b  reason: collision with root package name */
    private com.amazon.a.a.k.b f37293b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, a> f37294c = new HashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T> T b(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = com.amazon.a.a.o.c.f37534a     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x001e
            com.amazon.a.a.o.c r0 = f37292a     // Catch:{ all -> 0x001c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x001c }
            r1.<init>()     // Catch:{ all -> 0x001c }
            java.lang.String r2 = "Fetching value: "
            r1.append(r2)     // Catch:{ all -> 0x001c }
            r1.append(r4)     // Catch:{ all -> 0x001c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x001c }
            r0.a(r1)     // Catch:{ all -> 0x001c }
            goto L_0x001e
        L_0x001c:
            r4 = move-exception
            goto L_0x003c
        L_0x001e:
            java.util.Map<java.lang.String, com.amazon.a.a.m.a> r0 = r3.f37294c     // Catch:{ all -> 0x001c }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x001c }
            com.amazon.a.a.m.a r4 = (com.amazon.a.a.m.a) r4     // Catch:{ all -> 0x001c }
            if (r4 != 0) goto L_0x0036
            boolean r4 = com.amazon.a.a.o.c.f37534a     // Catch:{ all -> 0x001c }
            if (r4 == 0) goto L_0x0033
            com.amazon.a.a.o.c r4 = f37292a     // Catch:{ all -> 0x001c }
            java.lang.String r0 = "Value not present in store, returning null"
            r4.a(r0)     // Catch:{ all -> 0x001c }
        L_0x0033:
            monitor-exit(r3)
            r4 = 0
            return r4
        L_0x0036:
            java.lang.Object r4 = r4.h()     // Catch:{ all -> 0x001c }
            monitor-exit(r3)
            return r4
        L_0x003c:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.a.a.m.b.b(java.lang.String):java.lang.Object");
    }

    public synchronized void c(String str) {
        try {
            a aVar = this.f37294c.get(str);
            if (aVar != null) {
                if (c.f37534a) {
                    c cVar = f37292a;
                    cVar.a("Removing value associated with key: " + str + ", value: " + aVar);
                }
                this.f37294c.remove(str);
                aVar.f();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public String toString() {
        return this.f37294c.toString();
    }

    public synchronized boolean a(String str) {
        return b(str) != null;
    }

    public synchronized void a(String str, a aVar) {
        try {
            com.amazon.a.a.o.a.a.a((Object) str, SubscriberAttributeKt.JSON_NAME_KEY);
            com.amazon.a.a.o.a.a.a((Object) aVar, "value");
            if (c.f37534a) {
                c cVar = f37292a;
                cVar.a("Placing value into store with key: " + str + ", expiration: " + aVar.a());
            }
            this.f37293b.b(aVar);
            aVar.a(this);
            this.f37294c.put(str, aVar);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized <T> void a(String str, T t10) {
        try {
            if (c.f37534a) {
                c cVar = f37292a;
                cVar.a("Placing non-expiring value into store with key: " + str);
            }
            this.f37294c.put(str, new a(t10, new Date()) {
                /* access modifiers changed from: protected */
                public void d() {
                    if (c.f37535b) {
                        b.f37292a.b("Woah, non-expirable value was expired!!!!");
                    }
                }
            });
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void a(a aVar) {
        try {
            if (c.f37534a) {
                c cVar = f37292a;
                cVar.a("Observed expiration: " + aVar + " removing from store!");
            }
            Iterator<Map.Entry<String, a>> it = this.f37294c.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue() == aVar) {
                    if (c.f37534a) {
                        c cVar2 = f37292a;
                        cVar2.a("Removing entry from store: " + aVar);
                    }
                    it.remove();
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }
}
