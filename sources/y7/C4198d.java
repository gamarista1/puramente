package y7;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s.C2574b;
import s.C2575c;
import s.C2577e;
import s.f;

/* renamed from: y7.d  reason: case insensitive filesystem */
public final class C4198d extends C2577e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49727b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static C2575c f49728c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static f f49729d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final ReentrantLock f49730e = new ReentrantLock();

    /* renamed from: y7.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final void d() {
            C2575c c10;
            C4198d.f49730e.lock();
            if (C4198d.f49729d == null && (c10 = C4198d.f49728c) != null) {
                C4198d.f49729d = c10.d((C2574b) null);
            }
            C4198d.f49730e.unlock();
        }

        public final f b() {
            C4198d.f49730e.lock();
            f e10 = C4198d.f49729d;
            C4198d.f49729d = null;
            C4198d.f49730e.unlock();
            return e10;
        }

        public final void c(Uri uri) {
            C6496s.h(uri, "url");
            d();
            C4198d.f49730e.lock();
            f e10 = C4198d.f49729d;
            if (e10 != null) {
                e10.f(uri, (Bundle) null, (List) null);
            }
            C4198d.f49730e.unlock();
        }

        private a() {
        }
    }

    public void a(ComponentName componentName, C2575c cVar) {
        C6496s.h(componentName, "name");
        C6496s.h(cVar, "newClient");
        cVar.f(0);
        f49728c = cVar;
        f49727b.d();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C6496s.h(componentName, "componentName");
    }
}
