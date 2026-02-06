package io.intercom.android.sdk.helpcenter.utils.networking;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import retrofit2.C6671d;
import retrofit2.C6672e;
import retrofit2.G;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\f\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponseAdapterFactory;", "Lretrofit2/e$a;", "<init>", "()V", "Ljava/lang/reflect/Type;", "returnType", "", "", "annotations", "Lretrofit2/G;", "retrofit", "Lretrofit2/e;", "get", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/G;)Lretrofit2/e;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetworkResponseAdapterFactory extends C6672e.a {
    public static final int $stable = 0;

    public C6672e get(Type type, Annotation[] annotationArr, G g10) {
        C6496s.h(type, "returnType");
        C6496s.h(annotationArr, "annotations");
        C6496s.h(g10, "retrofit");
        if (!C6496s.c(C6671d.class, C6672e.a.getRawType(type))) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type parameterUpperBound = C6672e.a.getParameterUpperBound(0, (ParameterizedType) type);
            if (!C6496s.c(C6672e.a.getRawType(parameterUpperBound), NetworkResponse.class)) {
                return null;
            }
            if (parameterUpperBound instanceof ParameterizedType) {
                Type parameterUpperBound2 = C6672e.a.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
                C6496s.e(parameterUpperBound2);
                return new NetworkResponseAdapter(parameterUpperBound2);
            }
            throw new IllegalStateException("Response must be parameterized as NetworkResponse<Foo> or NetworkResponse<out Foo>");
        }
        throw new IllegalStateException("return type must be parameterized as Call<NetworkResponse<<Foo>>");
    }
}
