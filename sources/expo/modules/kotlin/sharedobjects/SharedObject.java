package expo.modules.kotlin.sharedobjects;

import ae.C4464a;
import ae.C4466c;
import ae.u;
import ae.w;
import expo.modules.kotlin.jni.JNIUtils;
import expo.modules.kotlin.jni.JSIContext;
import expo.modules.kotlin.jni.JavaScriptWeakObject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.c;
import qe.L;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0011\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u000bR\"\u0010!\u001a\u00020\u001d8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b\u001e\u0010 R(\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lexpo/modules/kotlin/sharedobjects/SharedObject;", "", "Lae/u;", "runtimeContext", "<init>", "(Lae/u;)V", "Lae/a;", "appContext", "(Lae/a;)V", "", "getSharedObjectId", "()I", "Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "o", "()Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "", "eventName", "", "args", "Llf/M;", "b", "(Ljava/lang/String;[Ljava/lang/Object;)V", "y", "(Ljava/lang/String;)V", "E", "M", "()V", "a", "f", "Loe/c;", "I", "v", "(I)V", "sharedObjectId", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "t", "()Ljava/lang/ref/WeakReference;", "F", "(Ljava/lang/ref/WeakReference;)V", "runtimeContextHolder", "q", "()Lae/u;", "n", "()Lae/a;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class SharedObject {

    /* renamed from: a  reason: collision with root package name */
    private int f60453a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference f60454b;

    public SharedObject() {
        this((u) null, 1, (DefaultConstructorMarker) null);
    }

    private final int getSharedObjectId() {
        return this.f60453a;
    }

    private final JavaScriptWeakObject o() {
        int b10 = c.b(this.f60453a);
        u q10 = q();
        if (q10 == null) {
            return null;
        }
        return c.i(b10, q10);
    }

    private final u q() {
        return (u) this.f60454b.get();
    }

    public void E(String str) {
        C6496s.h(str, "eventName");
    }

    public final void F(WeakReference weakReference) {
        C6496s.h(weakReference, "<set-?>");
        this.f60454b = weakReference;
    }

    public final void I(int i10) {
        this.f60453a = i10;
    }

    public void M() {
        a();
    }

    public void a() {
    }

    public final void b(String str, Object... objArr) {
        u q10;
        JSIContext f10;
        C6496s.h(str, "eventName");
        C6496s.h(objArr, "args");
        JavaScriptWeakObject o10 = o();
        if (o10 != null && (q10 = q()) != null && (f10 = q10.f()) != null) {
            try {
                JNIUtils.a aVar = JNIUtils.f60431a;
                ArrayList arrayList = new ArrayList(objArr.length);
                for (Object b10 : objArr) {
                    arrayList.add(L.b(L.f61392a, b10, (L.a) null, false, 6, (Object) null));
                }
                aVar.b(o10, f10, str, arrayList.toArray(new Object[0]));
            } catch (Throwable th2) {
                C4466c.a().a("Unable to send event '" + str + "' by shared object of type " + getClass().getSimpleName(), th2);
            }
        }
    }

    public int f() {
        return 0;
    }

    public final C4464a n() {
        u q10 = q();
        if (q10 != null) {
            return q10.b();
        }
        return null;
    }

    public final WeakReference t() {
        return this.f60454b;
    }

    public final int v() {
        return this.f60453a;
    }

    public void y(String str) {
        C6496s.h(str, "eventName");
    }

    public SharedObject(u uVar) {
        this.f60453a = c.b(0);
        this.f60454b = w.a(uVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SharedObject(u uVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : uVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SharedObject(C4464a aVar) {
        this(aVar.o());
        C6496s.h(aVar, "appContext");
    }
}
