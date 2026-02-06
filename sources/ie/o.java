package ie;

import ae.C4464a;
import expo.modules.kotlin.jni.JNIAsyncFunctionBody;
import expo.modules.kotlin.jni.PromiseImpl;
import java.lang.ref.WeakReference;

public final /* synthetic */ class o implements JNIAsyncFunctionBody {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WeakReference f60825a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f60826b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p f60827c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C4464a f60828d;

    public /* synthetic */ o(WeakReference weakReference, String str, p pVar, C4464a aVar) {
        this.f60825a = weakReference;
        this.f60826b = str;
        this.f60827c = pVar;
        this.f60828d = aVar;
    }

    public final void invoke(Object[] objArr, PromiseImpl promiseImpl) {
        p.p(this.f60825a, this.f60826b, this.f60827c, this.f60828d, objArr, promiseImpl);
    }
}
