package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import retrofit2.C6672e;

/* renamed from: retrofit2.g  reason: case insensitive filesystem */
final class C6674g extends C6672e.a {

    /* renamed from: retrofit2.g$a */
    private static final class a implements C6672e {

        /* renamed from: a  reason: collision with root package name */
        private final Type f72883a;

        /* renamed from: retrofit2.g$a$a  reason: collision with other inner class name */
        private class C1057a implements C6673f {

            /* renamed from: a  reason: collision with root package name */
            private final CompletableFuture f72884a;

            public C1057a(CompletableFuture completableFuture) {
                this.f72884a = completableFuture;
            }

            public void onFailure(C6671d dVar, Throwable th2) {
                this.f72884a.completeExceptionally(th2);
            }

            public void onResponse(C6671d dVar, F f10) {
                if (f10.e()) {
                    this.f72884a.complete(f10.a());
                } else {
                    this.f72884a.completeExceptionally(new r(f10));
                }
            }
        }

        a(Type type) {
            this.f72883a = type;
        }

        /* renamed from: a */
        public CompletableFuture adapt(C6671d dVar) {
            b bVar = new b(dVar);
            dVar.enqueue(new C1057a(bVar));
            return bVar;
        }

        public Type responseType() {
            return this.f72883a;
        }
    }

    /* renamed from: retrofit2.g$b */
    private static final class b extends CompletableFuture {

        /* renamed from: a  reason: collision with root package name */
        private final C6671d f72886a;

        b(C6671d dVar) {
            this.f72886a = dVar;
        }

        public boolean cancel(boolean z10) {
            if (z10) {
                this.f72886a.cancel();
            }
            return super.cancel(z10);
        }
    }

    /* renamed from: retrofit2.g$c */
    private static final class c implements C6672e {

        /* renamed from: a  reason: collision with root package name */
        private final Type f72887a;

        /* renamed from: retrofit2.g$c$a */
        private class a implements C6673f {

            /* renamed from: a  reason: collision with root package name */
            private final CompletableFuture f72888a;

            public a(CompletableFuture completableFuture) {
                this.f72888a = completableFuture;
            }

            public void onFailure(C6671d dVar, Throwable th2) {
                this.f72888a.completeExceptionally(th2);
            }

            public void onResponse(C6671d dVar, F f10) {
                this.f72888a.complete(f10);
            }
        }

        c(Type type) {
            this.f72887a = type;
        }

        /* renamed from: a */
        public CompletableFuture adapt(C6671d dVar) {
            b bVar = new b(dVar);
            dVar.enqueue(new a(bVar));
            return bVar;
        }

        public Type responseType() {
            return this.f72887a;
        }
    }

    C6674g() {
    }

    public C6672e get(Type type, Annotation[] annotationArr, G g10) {
        if (C6672e.a.getRawType(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type parameterUpperBound = C6672e.a.getParameterUpperBound(0, (ParameterizedType) type);
            if (C6672e.a.getRawType(parameterUpperBound) != F.class) {
                return new a(parameterUpperBound);
            }
            if (parameterUpperBound instanceof ParameterizedType) {
                return new c(C6672e.a.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
