package q3;

import Ug.K;
import Ug.L;
import Ug.M;
import Ug.Z;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import com.google.common.util.concurrent.g;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import p3.C2413b;
import qf.C6658d;
import r3.C2570a;
import r3.n;
import r3.o;
import rf.C6680b;
import yf.p;

/* renamed from: q3.a  reason: case insensitive filesystem */
public abstract class C2432a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f25375a = new b((DefaultConstructorMarker) null);

    /* renamed from: q3.a$a  reason: collision with other inner class name */
    private static final class C0428a extends C2432a {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final n f25376b;

        /* renamed from: q3.a$a$a  reason: collision with other inner class name */
        static final class C0429a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f25377a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C0428a f25378b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0429a(C0428a aVar, C2570a aVar2, C6658d dVar) {
                super(2, dVar);
                this.f25378b = aVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new C0429a(this.f25378b, (C2570a) null, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((C0429a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f25377a;
                if (i10 == 0) {
                    w.b(obj);
                    n d10 = this.f25378b.f25376b;
                    this.f25377a = 1;
                    if (d10.a((C2570a) null, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    w.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C6514M.f71813a;
            }
        }

        /* renamed from: q3.a$a$b */
        static final class b extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f25379a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C0428a f25380b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C0428a aVar, C6658d dVar) {
                super(2, dVar);
                this.f25380b = aVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new b(this.f25380b, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f25379a;
                if (i10 == 0) {
                    w.b(obj);
                    n d10 = this.f25380b.f25376b;
                    this.f25379a = 1;
                    obj = d10.b(this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    w.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* renamed from: q3.a$a$c */
        static final class c extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f25381a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C0428a f25382b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Uri f25383c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ InputEvent f25384d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(C0428a aVar, Uri uri, InputEvent inputEvent, C6658d dVar) {
                super(2, dVar);
                this.f25382b = aVar;
                this.f25383c = uri;
                this.f25384d = inputEvent;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new c(this.f25382b, this.f25383c, this.f25384d, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f25381a;
                if (i10 == 0) {
                    w.b(obj);
                    n d10 = this.f25382b.f25376b;
                    Uri uri = this.f25383c;
                    InputEvent inputEvent = this.f25384d;
                    this.f25381a = 1;
                    if (d10.c(uri, inputEvent, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    w.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C6514M.f71813a;
            }
        }

        /* renamed from: q3.a$a$d */
        static final class d extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f25385a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C0428a f25386b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Uri f25387c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(C0428a aVar, Uri uri, C6658d dVar) {
                super(2, dVar);
                this.f25386b = aVar;
                this.f25387c = uri;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new d(this.f25386b, this.f25387c, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((d) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f25385a;
                if (i10 == 0) {
                    w.b(obj);
                    n d10 = this.f25386b.f25376b;
                    Uri uri = this.f25387c;
                    this.f25385a = 1;
                    if (d10.d(uri, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    w.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C6514M.f71813a;
            }
        }

        /* renamed from: q3.a$a$e */
        static final class e extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f25388a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C0428a f25389b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(C0428a aVar, o oVar, C6658d dVar) {
                super(2, dVar);
                this.f25389b = aVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new e(this.f25389b, (o) null, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((e) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f25388a;
                if (i10 == 0) {
                    w.b(obj);
                    n d10 = this.f25389b.f25376b;
                    this.f25388a = 1;
                    if (d10.e((o) null, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    w.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C6514M.f71813a;
            }
        }

        /* renamed from: q3.a$a$f */
        static final class f extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f25390a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C0428a f25391b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            f(C0428a aVar, r3.p pVar, C6658d dVar) {
                super(2, dVar);
                this.f25391b = aVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new f(this.f25391b, (r3.p) null, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((f) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f25390a;
                if (i10 == 0) {
                    w.b(obj);
                    n d10 = this.f25391b.f25376b;
                    this.f25390a = 1;
                    if (d10.f((r3.p) null, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    w.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C6514M.f71813a;
            }
        }

        public C0428a(n nVar) {
            C6496s.h(nVar, "mMeasurementManager");
            this.f25376b = nVar;
        }

        public g b() {
            return C2413b.c(C5576k.b(L.a(Z.a()), (qf.g) null, (M) null, new b(this, (C6658d) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public g c(Uri uri) {
            C6496s.h(uri, "trigger");
            return C2413b.c(C5576k.b(L.a(Z.a()), (qf.g) null, (M) null, new d(this, uri, (C6658d) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public g e(C2570a aVar) {
            C6496s.h(aVar, "deletionRequest");
            return C2413b.c(C5576k.b(L.a(Z.a()), (qf.g) null, (M) null, new C0429a(this, aVar, (C6658d) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public g f(Uri uri, InputEvent inputEvent) {
            C6496s.h(uri, "attributionSource");
            return C2413b.c(C5576k.b(L.a(Z.a()), (qf.g) null, (M) null, new c(this, uri, inputEvent, (C6658d) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public g g(o oVar) {
            C6496s.h(oVar, "request");
            return C2413b.c(C5576k.b(L.a(Z.a()), (qf.g) null, (M) null, new e(this, oVar, (C6658d) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public g h(r3.p pVar) {
            C6496s.h(pVar, "request");
            return C2413b.c(C5576k.b(L.a(Z.a()), (qf.g) null, (M) null, new f(this, pVar, (C6658d) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }
    }

    /* renamed from: q3.a$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2432a a(Context context) {
            C6496s.h(context, "context");
            n a10 = n.f25746a.a(context);
            if (a10 != null) {
                return new C0428a(a10);
            }
            return null;
        }

        private b() {
        }
    }

    public static final C2432a a(Context context) {
        return f25375a.a(context);
    }

    public abstract g b();

    public abstract g c(Uri uri);
}
