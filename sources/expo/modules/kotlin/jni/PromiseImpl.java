package expo.modules.kotlin.jni;

import ae.C4464a;
import ae.p;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.u;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010!\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R$\u0010)\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00118\u0000@BX\u000e¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010.¨\u00060"}, d2 = {"Lexpo/modules/kotlin/jni/PromiseImpl;", "Lae/p;", "Lexpo/modules/kotlin/jni/JavaCallback;", "callback", "<init>", "(Lexpo/modules/kotlin/jni/JavaCallback;)V", "", "value", "Llf/M;", "resolve", "(Ljava/lang/Object;)V", "a", "()V", "", "result", "c", "(I)V", "", "b", "(Z)V", "", "d", "(D)V", "", "e", "(F)V", "", "f", "(Ljava/lang/String;)V", "code", "message", "", "cause", "reject", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Lexpo/modules/kotlin/jni/JavaCallback;", "h", "()Lexpo/modules/kotlin/jni/JavaCallback;", "Z", "i", "()Z", "wasSettled", "Ljava/lang/ref/WeakReference;", "Lae/a;", "Ljava/lang/ref/WeakReference;", "appContextHolder", "Ljava/lang/String;", "fullFunctionName", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PromiseImpl implements p {

    /* renamed from: a  reason: collision with root package name */
    private boolean f60447a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference f60448b;

    /* renamed from: c  reason: collision with root package name */
    private String f60449c;
    private final JavaCallback callback;

    public PromiseImpl(JavaCallback javaCallback) {
        C6496s.h(javaCallback, "callback");
        this.callback = javaCallback;
    }

    public void a() {
        C4464a aVar;
        if (this.f60447a) {
            String str = this.f60449c;
            if (str == null) {
                str = "unknown";
            }
            u uVar = new u(str);
            WeakReference weakReference = this.f60448b;
            if (!(weakReference == null || (aVar = (C4464a) weakReference.get()) == null)) {
                aVar.m();
            }
            throw uVar;
        }
        this.callback.a();
        this.f60447a = true;
    }

    public void b(boolean z10) {
        C4464a aVar;
        if (this.f60447a) {
            String str = this.f60449c;
            if (str == null) {
                str = "unknown";
            }
            u uVar = new u(str);
            WeakReference weakReference = this.f60448b;
            if (!(weakReference == null || (aVar = (C4464a) weakReference.get()) == null)) {
                aVar.m();
            }
            throw uVar;
        }
        this.callback.i(z10);
        this.f60447a = true;
    }

    public void c(int i10) {
        C4464a aVar;
        if (this.f60447a) {
            String str = this.f60449c;
            if (str == null) {
                str = "unknown";
            }
            u uVar = new u(str);
            WeakReference weakReference = this.f60448b;
            if (!(weakReference == null || (aVar = (C4464a) weakReference.get()) == null)) {
                aVar.m();
            }
            throw uVar;
        }
        this.callback.e(i10);
        this.f60447a = true;
    }

    public void d(double d10) {
        C4464a aVar;
        if (this.f60447a) {
            String str = this.f60449c;
            if (str == null) {
                str = "unknown";
            }
            u uVar = new u(str);
            WeakReference weakReference = this.f60448b;
            if (!(weakReference == null || (aVar = (C4464a) weakReference.get()) == null)) {
                aVar.m();
            }
            throw uVar;
        }
        this.callback.c(d10);
        this.f60447a = true;
    }

    public void e(float f10) {
        C4464a aVar;
        if (this.f60447a) {
            String str = this.f60449c;
            if (str == null) {
                str = "unknown";
            }
            u uVar = new u(str);
            WeakReference weakReference = this.f60448b;
            if (!(weakReference == null || (aVar = (C4464a) weakReference.get()) == null)) {
                aVar.m();
            }
            throw uVar;
        }
        this.callback.d(f10);
        this.f60447a = true;
    }

    public void f(String str) {
        C4464a aVar;
        C6496s.h(str, "result");
        if (this.f60447a) {
            String str2 = this.f60449c;
            if (str2 == null) {
                str2 = "unknown";
            }
            u uVar = new u(str2);
            WeakReference weakReference = this.f60448b;
            if (!(weakReference == null || (aVar = (C4464a) weakReference.get()) == null)) {
                aVar.m();
            }
            throw uVar;
        }
        this.callback.g(str);
        this.f60447a = true;
    }

    public void g(CodedException codedException) {
        p.a.a(this, codedException);
    }

    public final JavaCallback h() {
        return this.callback;
    }

    public final boolean i() {
        return this.f60447a;
    }

    public void reject(String str, String str2, Throwable th2) {
        C4464a aVar;
        C6496s.h(str, "code");
        String str3 = "unknown";
        if (this.f60447a) {
            String str4 = this.f60449c;
            if (str4 != null) {
                str3 = str4;
            }
            u uVar = new u(str3);
            WeakReference weakReference = this.f60448b;
            if (!(weakReference == null || (aVar = (C4464a) weakReference.get()) == null)) {
                aVar.m();
            }
            throw uVar;
        }
        JavaCallback javaCallback = this.callback;
        if (str2 == null) {
            if (th2 != null) {
                str2 = th2.getMessage();
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = str3;
            }
        }
        javaCallback.h(str, str2);
        this.f60447a = true;
    }

    public void resolve(Object obj) {
        C4464a aVar;
        if (this.f60447a) {
            String str = this.f60449c;
            if (str == null) {
                str = "unknown";
            }
            u uVar = new u(str);
            WeakReference weakReference = this.f60448b;
            if (!(weakReference == null || (aVar = (C4464a) weakReference.get()) == null)) {
                aVar.m();
            }
            throw uVar;
        }
        this.callback.f(obj);
        this.f60447a = true;
    }
}
