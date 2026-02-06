package Ze;

import We.C5625f;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import p003if.f;

/* renamed from: Ze.b  reason: case insensitive filesystem */
final class C5710b implements h {

    /* renamed from: a  reason: collision with root package name */
    private final f f66911a = new f(new C5709a());

    /* access modifiers changed from: private */
    public static /* synthetic */ Map b() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (f fVar : f.values()) {
            for (C5625f b10 : C5625f.values()) {
                concurrentHashMap.put(new d(fVar.b(), b10.b()), new AtomicLong(0));
            }
        }
        return Collections.unmodifiableMap(concurrentHashMap);
    }
}
