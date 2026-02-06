package fe;

import Ff.p;
import ae.q;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.adapters.react.NativeModulesProxy;
import expo.modules.kotlin.exception.UnexpectedException;
import ie.C5037g;
import java.lang.ref.WeakReference;
import java.util.Map;
import ke.c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.O;
import qe.C5155b;
import qe.C5157d;
import yf.C6787a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfe/c;", "Lke/b;", "<init>", "()V", "Lke/d;", "b", "()Lke/d;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: fe.c  reason: case insensitive filesystem */
public final class C4993c extends ke.b {

    /* renamed from: fe.c$a */
    static final class a implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4993c f60554a;

        a(C4993c cVar) {
            this.f60554a = cVar;
        }

        /* renamed from: a */
        public final Map invoke() {
            NativeModulesProxy nativeModulesProxy;
            Map<String, Object> constants;
            WeakReference q10 = this.f60554a.c().q();
            if (q10 == null || (nativeModulesProxy = (NativeModulesProxy) q10.get()) == null || (constants = nativeModulesProxy.getConstants()) == null) {
                return O.i();
            }
            return constants;
        }
    }

    /* renamed from: fe.c$b */
    public static final class b implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f60555a = new b();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    /* renamed from: fe.c$c  reason: collision with other inner class name */
    public static final class C0889c implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0889c f60556a = new C0889c();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    /* renamed from: fe.c$d */
    public static final class d implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f60557a = new d();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(ReadableArray.class);
        }
    }

    /* renamed from: fe.c$e */
    public static final class e implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4993c f60558a;

        public e(C4993c cVar) {
            this.f60558a = cVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            NativeModulesProxy nativeModulesProxy;
            C6496s.h(objArr, "<destruct>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            String str = objArr[0];
            String str2 = objArr[1];
            ReadableArray readableArray = objArr[2];
            String str3 = str2;
            String str4 = str;
            Promise a10 = q.a(pVar);
            WeakReference q10 = this.f60558a.c().q();
            if (q10 == null || (nativeModulesProxy = (NativeModulesProxy) q10.get()) == null) {
                throw new UnexpectedException("The legacy modules proxy holder has been lost");
            }
            nativeModulesProxy.callMethod(str4, str3, readableArray, a10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    public ke.d b() {
        Class<ReadableArray> cls = ReadableArray.class;
        Class<String> cls2 = String.class;
        D3.a.c("[" + "ExpoModulesCore" + "] " + (getClass() + ".ModuleDefinition"));
        try {
            c cVar = new c(this);
            cVar.o("NativeModulesProxy");
            cVar.d(new a(this));
            C5157d dVar = C5157d.f61437a;
            Ff.d b10 = kotlin.jvm.internal.O.b(cls2);
            Boolean bool = Boolean.FALSE;
            C5155b bVar = (C5155b) dVar.a().get(new Pair(b10, bool));
            if (bVar == null) {
                bVar = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls2), false, b.f60555a));
            }
            C5155b bVar2 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls2), bool));
            if (bVar2 == null) {
                bVar2 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls2), false, C0889c.f60556a));
            }
            C5155b bVar3 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls), bool));
            if (bVar3 == null) {
                bVar3 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls), false, d.f60557a));
            }
            cVar.k().put("callMethod", new C5037g("callMethod", new C5155b[]{bVar, bVar2, bVar3}, new e(this)));
            ke.d p10 = cVar.p();
            D3.a.f();
            return p10;
        } catch (Throwable th2) {
            D3.a.f();
            throw th2;
        }
    }
}
