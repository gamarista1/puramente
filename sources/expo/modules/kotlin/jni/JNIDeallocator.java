package expo.modules.kotlin.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;

@Metadata(d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0001\u001a\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R,\u0010\u0019\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00160\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lexpo/modules/kotlin/jni/JNIDeallocator;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "", "shouldCreateDestructorThread", "<init>", "(Z)V", "Lexpo/modules/kotlin/jni/Destructible;", "destructible", "Llf/M;", "addReference", "(Lexpo/modules/kotlin/jni/Destructible;)V", "f", "()Llf/M;", "close", "()V", "Ljava/lang/ref/ReferenceQueue;", "a", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "", "Ljava/lang/ref/PhantomReference;", "Ljava/lang/ref/WeakReference;", "b", "Ljava/util/Map;", "destructorMap", "expo/modules/kotlin/jni/JNIDeallocator$a", "c", "Lexpo/modules/kotlin/jni/JNIDeallocator$a;", "destructorThread", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JNIDeallocator implements AutoCloseable {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final ReferenceQueue f60427a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map f60428b;

    /* renamed from: c  reason: collision with root package name */
    private final a f60429c;

    public static final class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JNIDeallocator f60430a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(JNIDeallocator jNIDeallocator) {
            super("Expo JNI deallocator");
            this.f60430a = jNIDeallocator;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r2 = this;
            L_0x0000:
                boolean r0 = r2.isInterrupted()
                if (r0 != 0) goto L_0x0026
                expo.modules.kotlin.jni.JNIDeallocator r0 = r2.f60430a     // Catch:{ InterruptedException -> 0x0026 }
                java.lang.ref.ReferenceQueue r0 = r0.f60427a     // Catch:{ InterruptedException -> 0x0026 }
                java.lang.ref.Reference r0 = r0.remove()     // Catch:{ InterruptedException -> 0x0026 }
                expo.modules.kotlin.jni.JNIDeallocator r1 = r2.f60430a     // Catch:{ InterruptedException -> 0x0026 }
                monitor-enter(r2)     // Catch:{ InterruptedException -> 0x0026 }
                java.util.Map r1 = r1.f60428b     // Catch:{ all -> 0x0023 }
                java.util.Map r1 = kotlin.jvm.internal.V.d(r1)     // Catch:{ all -> 0x0023 }
                java.lang.Object r0 = r1.remove(r0)     // Catch:{ all -> 0x0023 }
                java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x0023 }
                monitor-exit(r2)     // Catch:{ InterruptedException -> 0x0026 }
                goto L_0x0000
            L_0x0023:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ InterruptedException -> 0x0026 }
                throw r0     // Catch:{ InterruptedException -> 0x0026 }
            L_0x0026:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.jni.JNIDeallocator.a.run():void");
        }
    }

    public JNIDeallocator() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    public final void addReference(Destructible destructible) {
        C6496s.h(destructible, "destructible");
        synchronized (this) {
            WeakReference weakReference = new WeakReference(destructible);
            this.f60428b.put(new PhantomReference(destructible, this.f60427a), weakReference);
            C6514M m10 = C6514M.f71813a;
        }
    }

    public void close() {
        f();
    }

    public final C6514M f() {
        C6514M m10;
        synchronized (this) {
            try {
                for (WeakReference weakReference : this.f60428b.values()) {
                    Destructible destructible = (Destructible) weakReference.get();
                    if (destructible != null) {
                        destructible.b();
                    }
                }
                this.f60428b.clear();
                a aVar = this.f60429c;
                if (aVar != null) {
                    aVar.interrupt();
                    m10 = C6514M.f71813a;
                } else {
                    m10 = null;
                }
            } finally {
            }
        }
        return m10;
    }

    public JNIDeallocator(boolean z10) {
        a aVar;
        this.f60427a = new ReferenceQueue();
        this.f60428b = new LinkedHashMap();
        if (z10) {
            aVar = new a(this);
            aVar.start();
        } else {
            aVar = null;
        }
        this.f60429c = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JNIDeallocator(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
