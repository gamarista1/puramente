package ie;

import ae.C4464a;
import expo.modules.kotlin.jni.JNIAsyncFunctionBody;
import expo.modules.kotlin.jni.PromiseImpl;
import java.lang.ref.WeakReference;

/* renamed from: ie.b  reason: case insensitive filesystem */
public final /* synthetic */ class C5032b implements JNIAsyncFunctionBody {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WeakReference f60802a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f60803b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C5034d f60804c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C4464a f60805d;

    public /* synthetic */ C5032b(WeakReference weakReference, String str, C5034d dVar, C4464a aVar) {
        this.f60802a = weakReference;
        this.f60803b = str;
        this.f60804c = dVar;
        this.f60805d = aVar;
    }

    public final void invoke(Object[] objArr, PromiseImpl promiseImpl) {
        C5034d.p(this.f60802a, this.f60803b, this.f60804c, this.f60805d, objArr, promiseImpl);
    }
}
