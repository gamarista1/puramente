package retrofit2;

import Gh.X;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import retrofit2.C6672e;
import rh.C;

/* renamed from: retrofit2.i  reason: case insensitive filesystem */
final class C6676i extends C6672e.a {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f72890a;

    /* renamed from: retrofit2.i$a */
    class a implements C6672e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Type f72891a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Executor f72892b;

        a(Type type, Executor executor) {
            this.f72891a = type;
            this.f72892b = executor;
        }

        /* renamed from: a */
        public C6671d adapt(C6671d dVar) {
            Executor executor = this.f72892b;
            if (executor == null) {
                return dVar;
            }
            return new b(executor, dVar);
        }

        public Type responseType() {
            return this.f72891a;
        }
    }

    /* renamed from: retrofit2.i$b */
    static final class b implements C6671d {

        /* renamed from: a  reason: collision with root package name */
        final Executor f72894a;

        /* renamed from: b  reason: collision with root package name */
        final C6671d f72895b;

        /* renamed from: retrofit2.i$b$a */
        class a implements C6673f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C6673f f72896a;

            a(C6673f fVar) {
                this.f72896a = fVar;
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void c(C6673f fVar, Throwable th2) {
                fVar.onFailure(b.this, th2);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void d(C6673f fVar, F f10) {
                if (b.this.f72895b.isCanceled()) {
                    fVar.onFailure(b.this, new IOException("Canceled"));
                } else {
                    fVar.onResponse(b.this, f10);
                }
            }

            public void onFailure(C6671d dVar, Throwable th2) {
                b.this.f72894a.execute(new C6678k(this, this.f72896a, th2));
            }

            public void onResponse(C6671d dVar, F f10) {
                b.this.f72894a.execute(new C6677j(this, this.f72896a, f10));
            }
        }

        b(Executor executor, C6671d dVar) {
            this.f72894a = executor;
            this.f72895b = dVar;
        }

        public void cancel() {
            this.f72895b.cancel();
        }

        public void enqueue(C6673f fVar) {
            Objects.requireNonNull(fVar, "callback == null");
            this.f72895b.enqueue(new a(fVar));
        }

        public boolean isCanceled() {
            return this.f72895b.isCanceled();
        }

        public boolean isExecuted() {
            return this.f72895b.isExecuted();
        }

        public C request() {
            return this.f72895b.request();
        }

        public X timeout() {
            return this.f72895b.timeout();
        }

        public C6671d clone() {
            return new b(this.f72894a, this.f72895b.clone());
        }
    }

    C6676i(Executor executor) {
        this.f72890a = executor;
    }

    public C6672e get(Type type, Annotation[] annotationArr, G g10) {
        Executor executor = null;
        if (C6672e.a.getRawType(type) != C6671d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type g11 = K.g(0, (ParameterizedType) type);
            if (!K.l(annotationArr, I.class)) {
                executor = this.f72890a;
            }
            return new a(g11, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
