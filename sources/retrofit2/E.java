package retrofit2;

import gi.b;
import gi.c;
import gi.d;
import gi.e;
import gi.f;
import gi.g;
import gi.h;
import gi.i;
import gi.j;
import gi.k;
import gi.l;
import gi.m;
import gi.n;
import gi.o;
import gi.p;
import gi.q;
import gi.r;
import gi.s;
import gi.t;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import qf.C6658d;
import retrofit2.x;
import rh.C;
import rh.u;
import rh.v;
import rh.y;
import rh.z;

final class E {

    /* renamed from: a  reason: collision with root package name */
    private final Class f72808a;

    /* renamed from: b  reason: collision with root package name */
    private final Method f72809b;

    /* renamed from: c  reason: collision with root package name */
    private final v f72810c;

    /* renamed from: d  reason: collision with root package name */
    final String f72811d;

    /* renamed from: e  reason: collision with root package name */
    private final String f72812e;

    /* renamed from: f  reason: collision with root package name */
    private final u f72813f;

    /* renamed from: g  reason: collision with root package name */
    private final y f72814g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f72815h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f72816i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f72817j;

    /* renamed from: k  reason: collision with root package name */
    private final x[] f72818k;

    /* renamed from: l  reason: collision with root package name */
    final boolean f72819l;

    static final class a {

        /* renamed from: y  reason: collision with root package name */
        private static final Pattern f72820y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: z  reason: collision with root package name */
        private static final Pattern f72821z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a  reason: collision with root package name */
        final G f72822a;

        /* renamed from: b  reason: collision with root package name */
        final Class f72823b;

        /* renamed from: c  reason: collision with root package name */
        final Method f72824c;

        /* renamed from: d  reason: collision with root package name */
        final Annotation[] f72825d;

        /* renamed from: e  reason: collision with root package name */
        final Annotation[][] f72826e;

        /* renamed from: f  reason: collision with root package name */
        final Type[] f72827f;

        /* renamed from: g  reason: collision with root package name */
        boolean f72828g;

        /* renamed from: h  reason: collision with root package name */
        boolean f72829h;

        /* renamed from: i  reason: collision with root package name */
        boolean f72830i;

        /* renamed from: j  reason: collision with root package name */
        boolean f72831j;

        /* renamed from: k  reason: collision with root package name */
        boolean f72832k;

        /* renamed from: l  reason: collision with root package name */
        boolean f72833l;

        /* renamed from: m  reason: collision with root package name */
        boolean f72834m;

        /* renamed from: n  reason: collision with root package name */
        boolean f72835n;

        /* renamed from: o  reason: collision with root package name */
        String f72836o;

        /* renamed from: p  reason: collision with root package name */
        boolean f72837p;

        /* renamed from: q  reason: collision with root package name */
        boolean f72838q;

        /* renamed from: r  reason: collision with root package name */
        boolean f72839r;

        /* renamed from: s  reason: collision with root package name */
        String f72840s;

        /* renamed from: t  reason: collision with root package name */
        u f72841t;

        /* renamed from: u  reason: collision with root package name */
        y f72842u;

        /* renamed from: v  reason: collision with root package name */
        Set f72843v;

        /* renamed from: w  reason: collision with root package name */
        x[] f72844w;

        /* renamed from: x  reason: collision with root package name */
        boolean f72845x;

        a(G g10, Class cls, Method method) {
            this.f72822a = g10;
            this.f72823b = cls;
            this.f72824c = method;
            this.f72825d = method.getAnnotations();
            this.f72827f = method.getGenericParameterTypes();
            this.f72826e = method.getParameterAnnotations();
        }

        private static Class a(Class cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            if (Short.TYPE == cls) {
                return Short.class;
            }
            return cls;
        }

        private u c(String[] strArr, boolean z10) {
            u.a aVar = new u.a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw K.n(this.f72824c, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.f72842u = y.e(trim);
                    } catch (IllegalArgumentException e10) {
                        throw K.o(this.f72824c, e10, "Malformed content type: %s", trim);
                    }
                } else if (z10) {
                    aVar.e(substring, trim);
                } else {
                    aVar.a(substring, trim);
                }
            }
            return aVar.f();
        }

        private void d(String str, String str2, boolean z10) {
            String str3 = this.f72836o;
            if (str3 == null) {
                this.f72836o = str;
                this.f72837p = z10;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (f72820y.matcher(substring).find()) {
                            throw K.n(this.f72824c, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f72840s = str2;
                    this.f72843v = h(str2);
                    return;
                }
                return;
            }
            throw K.n(this.f72824c, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        private void e(Annotation annotation) {
            if (annotation instanceof b) {
                d("DELETE", ((b) annotation).value(), false);
            } else if (annotation instanceof f) {
                d("GET", ((f) annotation).value(), false);
            } else if (annotation instanceof g) {
                d("HEAD", ((g) annotation).value(), false);
            } else if (annotation instanceof n) {
                d("PATCH", ((n) annotation).value(), true);
            } else if (annotation instanceof o) {
                d("POST", ((o) annotation).value(), true);
            } else if (annotation instanceof p) {
                d("PUT", ((p) annotation).value(), true);
            } else if (annotation instanceof m) {
                d("OPTIONS", ((m) annotation).value(), false);
            } else if (annotation instanceof h) {
                h hVar = (h) annotation;
                d(hVar.method(), hVar.path(), hVar.hasBody());
            } else if (annotation instanceof k) {
                k kVar = (k) annotation;
                String[] value = kVar.value();
                if (value.length != 0) {
                    this.f72841t = c(value, kVar.allowUnsafeNonAsciiValues());
                    return;
                }
                throw K.n(this.f72824c, "@Headers annotation is empty.", new Object[0]);
            } else if (annotation instanceof l) {
                if (!this.f72838q) {
                    this.f72839r = true;
                    return;
                }
                throw K.n(this.f72824c, "Only one encoding annotation is allowed.", new Object[0]);
            } else if (!(annotation instanceof e)) {
            } else {
                if (!this.f72839r) {
                    this.f72838q = true;
                    return;
                }
                throw K.n(this.f72824c, "Only one encoding annotation is allowed.", new Object[0]);
            }
        }

        private x f(int i10, Type type, Annotation[] annotationArr, boolean z10) {
            x xVar;
            if (annotationArr != null) {
                xVar = null;
                for (Annotation g10 : annotationArr) {
                    x g11 = g(i10, type, annotationArr, g10);
                    if (g11 != null) {
                        if (xVar == null) {
                            xVar = g11;
                        } else {
                            throw K.p(this.f72824c, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                    }
                }
            } else {
                xVar = null;
            }
            if (xVar != null) {
                return xVar;
            }
            if (z10) {
                try {
                    if (K.h(type) == C6658d.class) {
                        this.f72845x = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw K.p(this.f72824c, i10, "No Retrofit annotation found.", new Object[0]);
        }

        private x g(int i10, Type type, Annotation[] annotationArr, Annotation annotation) {
            Class<String> cls = String.class;
            if (annotation instanceof gi.y) {
                j(i10, type);
                if (this.f72835n) {
                    throw K.p(this.f72824c, i10, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f72831j) {
                    throw K.p(this.f72824c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f72832k) {
                    throw K.p(this.f72824c, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                } else if (this.f72833l) {
                    throw K.p(this.f72824c, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f72834m) {
                    throw K.p(this.f72824c, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f72840s == null) {
                    this.f72835n = true;
                    if (type == v.class || type == cls || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new x.p(this.f72824c, i10);
                    }
                    throw K.p(this.f72824c, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw K.p(this.f72824c, i10, "@Url cannot be used with @%s URL", this.f72836o);
                }
            } else if (annotation instanceof s) {
                j(i10, type);
                if (this.f72832k) {
                    throw K.p(this.f72824c, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f72833l) {
                    throw K.p(this.f72824c, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f72834m) {
                    throw K.p(this.f72824c, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f72835n) {
                    throw K.p(this.f72824c, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f72840s != null) {
                    this.f72831j = true;
                    s sVar = (s) annotation;
                    String value = sVar.value();
                    i(i10, value);
                    return new x.k(this.f72824c, i10, value, this.f72822a.i(type, annotationArr), sVar.encoded());
                } else {
                    throw K.p(this.f72824c, i10, "@Path can only be used with relative url on @%s", this.f72836o);
                }
            } else {
                Class<Iterable> cls2 = Iterable.class;
                if (annotation instanceof t) {
                    j(i10, type);
                    t tVar = (t) annotation;
                    String value2 = tVar.value();
                    boolean encoded = tVar.encoded();
                    Class h10 = K.h(type);
                    this.f72832k = true;
                    if (cls2.isAssignableFrom(h10)) {
                        if (type instanceof ParameterizedType) {
                            return new x.l(value2, this.f72822a.i(K.g(0, (ParameterizedType) type), annotationArr), encoded).c();
                        }
                        throw K.p(this.f72824c, i10, h10.getSimpleName() + " must include generic type (e.g., " + h10.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!h10.isArray()) {
                        return new x.l(value2, this.f72822a.i(type, annotationArr), encoded);
                    } else {
                        return new x.l(value2, this.f72822a.i(a(h10.getComponentType()), annotationArr), encoded).b();
                    }
                } else if (annotation instanceof gi.v) {
                    j(i10, type);
                    boolean encoded2 = ((gi.v) annotation).encoded();
                    Class h11 = K.h(type);
                    this.f72833l = true;
                    if (cls2.isAssignableFrom(h11)) {
                        if (type instanceof ParameterizedType) {
                            return new x.n(this.f72822a.i(K.g(0, (ParameterizedType) type), annotationArr), encoded2).c();
                        }
                        throw K.p(this.f72824c, i10, h11.getSimpleName() + " must include generic type (e.g., " + h11.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!h11.isArray()) {
                        return new x.n(this.f72822a.i(type, annotationArr), encoded2);
                    } else {
                        return new x.n(this.f72822a.i(a(h11.getComponentType()), annotationArr), encoded2).b();
                    }
                } else {
                    Class<Map> cls3 = Map.class;
                    if (annotation instanceof gi.u) {
                        j(i10, type);
                        Class h12 = K.h(type);
                        this.f72834m = true;
                        if (cls3.isAssignableFrom(h12)) {
                            Type i11 = K.i(type, h12, cls3);
                            if (i11 instanceof ParameterizedType) {
                                ParameterizedType parameterizedType = (ParameterizedType) i11;
                                Type g10 = K.g(0, parameterizedType);
                                if (cls == g10) {
                                    return new x.m(this.f72824c, i10, this.f72822a.i(K.g(1, parameterizedType), annotationArr), ((gi.u) annotation).encoded());
                                }
                                throw K.p(this.f72824c, i10, "@QueryMap keys must be of type String: " + g10, new Object[0]);
                            }
                            throw K.p(this.f72824c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                        throw K.p(this.f72824c, i10, "@QueryMap parameter type must be Map.", new Object[0]);
                    } else if (annotation instanceof i) {
                        j(i10, type);
                        i iVar = (i) annotation;
                        String value3 = iVar.value();
                        Class h13 = K.h(type);
                        if (cls2.isAssignableFrom(h13)) {
                            if (type instanceof ParameterizedType) {
                                return new x.f(value3, this.f72822a.i(K.g(0, (ParameterizedType) type), annotationArr), iVar.allowUnsafeNonAsciiValues()).c();
                            }
                            throw K.p(this.f72824c, i10, h13.getSimpleName() + " must include generic type (e.g., " + h13.getSimpleName() + "<String>)", new Object[0]);
                        } else if (!h13.isArray()) {
                            return new x.f(value3, this.f72822a.i(type, annotationArr), iVar.allowUnsafeNonAsciiValues());
                        } else {
                            return new x.f(value3, this.f72822a.i(a(h13.getComponentType()), annotationArr), iVar.allowUnsafeNonAsciiValues()).b();
                        }
                    } else if (annotation instanceof j) {
                        if (type == u.class) {
                            return new x.h(this.f72824c, i10);
                        }
                        j(i10, type);
                        Class h14 = K.h(type);
                        if (cls3.isAssignableFrom(h14)) {
                            Type i12 = K.i(type, h14, cls3);
                            if (i12 instanceof ParameterizedType) {
                                ParameterizedType parameterizedType2 = (ParameterizedType) i12;
                                Type g11 = K.g(0, parameterizedType2);
                                if (cls == g11) {
                                    return new x.g(this.f72824c, i10, this.f72822a.i(K.g(1, parameterizedType2), annotationArr), ((j) annotation).allowUnsafeNonAsciiValues());
                                }
                                throw K.p(this.f72824c, i10, "@HeaderMap keys must be of type String: " + g11, new Object[0]);
                            }
                            throw K.p(this.f72824c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                        throw K.p(this.f72824c, i10, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                    } else if (annotation instanceof c) {
                        j(i10, type);
                        if (this.f72838q) {
                            c cVar = (c) annotation;
                            String value4 = cVar.value();
                            boolean encoded3 = cVar.encoded();
                            this.f72828g = true;
                            Class h15 = K.h(type);
                            if (cls2.isAssignableFrom(h15)) {
                                if (type instanceof ParameterizedType) {
                                    return new x.d(value4, this.f72822a.i(K.g(0, (ParameterizedType) type), annotationArr), encoded3).c();
                                }
                                throw K.p(this.f72824c, i10, h15.getSimpleName() + " must include generic type (e.g., " + h15.getSimpleName() + "<String>)", new Object[0]);
                            } else if (!h15.isArray()) {
                                return new x.d(value4, this.f72822a.i(type, annotationArr), encoded3);
                            } else {
                                return new x.d(value4, this.f72822a.i(a(h15.getComponentType()), annotationArr), encoded3).b();
                            }
                        } else {
                            throw K.p(this.f72824c, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
                        }
                    } else if (annotation instanceof d) {
                        j(i10, type);
                        if (this.f72838q) {
                            Class h16 = K.h(type);
                            if (cls3.isAssignableFrom(h16)) {
                                Type i13 = K.i(type, h16, cls3);
                                if (i13 instanceof ParameterizedType) {
                                    ParameterizedType parameterizedType3 = (ParameterizedType) i13;
                                    Type g12 = K.g(0, parameterizedType3);
                                    if (cls == g12) {
                                        C6675h i14 = this.f72822a.i(K.g(1, parameterizedType3), annotationArr);
                                        this.f72828g = true;
                                        return new x.e(this.f72824c, i10, i14, ((d) annotation).encoded());
                                    }
                                    throw K.p(this.f72824c, i10, "@FieldMap keys must be of type String: " + g12, new Object[0]);
                                }
                                throw K.p(this.f72824c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                            }
                            throw K.p(this.f72824c, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                        }
                        throw K.p(this.f72824c, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                    } else {
                        Class<z.c> cls4 = z.c.class;
                        if (annotation instanceof q) {
                            j(i10, type);
                            if (this.f72839r) {
                                q qVar = (q) annotation;
                                this.f72829h = true;
                                String value5 = qVar.value();
                                Class h17 = K.h(type);
                                if (!value5.isEmpty()) {
                                    u t10 = u.t("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
                                    if (cls2.isAssignableFrom(h17)) {
                                        if (type instanceof ParameterizedType) {
                                            Type g13 = K.g(0, (ParameterizedType) type);
                                            if (!cls4.isAssignableFrom(K.h(g13))) {
                                                return new x.i(this.f72824c, i10, t10, this.f72822a.g(g13, annotationArr, this.f72825d)).c();
                                            }
                                            throw K.p(this.f72824c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                        }
                                        throw K.p(this.f72824c, i10, h17.getSimpleName() + " must include generic type (e.g., " + h17.getSimpleName() + "<String>)", new Object[0]);
                                    } else if (h17.isArray()) {
                                        Class a10 = a(h17.getComponentType());
                                        if (!cls4.isAssignableFrom(a10)) {
                                            return new x.i(this.f72824c, i10, t10, this.f72822a.g(a10, annotationArr, this.f72825d)).b();
                                        }
                                        throw K.p(this.f72824c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                    } else if (!cls4.isAssignableFrom(h17)) {
                                        return new x.i(this.f72824c, i10, t10, this.f72822a.g(type, annotationArr, this.f72825d));
                                    } else {
                                        throw K.p(this.f72824c, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                    }
                                } else if (cls2.isAssignableFrom(h17)) {
                                    if (!(type instanceof ParameterizedType)) {
                                        throw K.p(this.f72824c, i10, h17.getSimpleName() + " must include generic type (e.g., " + h17.getSimpleName() + "<String>)", new Object[0]);
                                    } else if (cls4.isAssignableFrom(K.h(K.g(0, (ParameterizedType) type)))) {
                                        return x.o.f72992a.c();
                                    } else {
                                        throw K.p(this.f72824c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                    }
                                } else if (h17.isArray()) {
                                    if (cls4.isAssignableFrom(h17.getComponentType())) {
                                        return x.o.f72992a.b();
                                    }
                                    throw K.p(this.f72824c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                } else if (cls4.isAssignableFrom(h17)) {
                                    return x.o.f72992a;
                                } else {
                                    throw K.p(this.f72824c, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                }
                            } else {
                                throw K.p(this.f72824c, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                            }
                        } else if (annotation instanceof r) {
                            j(i10, type);
                            if (this.f72839r) {
                                this.f72829h = true;
                                Class h18 = K.h(type);
                                if (cls3.isAssignableFrom(h18)) {
                                    Type i15 = K.i(type, h18, cls3);
                                    if (i15 instanceof ParameterizedType) {
                                        ParameterizedType parameterizedType4 = (ParameterizedType) i15;
                                        Type g14 = K.g(0, parameterizedType4);
                                        if (cls == g14) {
                                            Type g15 = K.g(1, parameterizedType4);
                                            if (!cls4.isAssignableFrom(K.h(g15))) {
                                                return new x.j(this.f72824c, i10, this.f72822a.g(g15, annotationArr, this.f72825d), ((r) annotation).encoding());
                                            }
                                            throw K.p(this.f72824c, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                        }
                                        throw K.p(this.f72824c, i10, "@PartMap keys must be of type String: " + g14, new Object[0]);
                                    }
                                    throw K.p(this.f72824c, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                }
                                throw K.p(this.f72824c, i10, "@PartMap parameter type must be Map.", new Object[0]);
                            }
                            throw K.p(this.f72824c, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                        } else if (annotation instanceof gi.a) {
                            j(i10, type);
                            if (this.f72838q || this.f72839r) {
                                throw K.p(this.f72824c, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                            } else if (!this.f72830i) {
                                try {
                                    C6675h g16 = this.f72822a.g(type, annotationArr, this.f72825d);
                                    this.f72830i = true;
                                    return new x.c(this.f72824c, i10, g16);
                                } catch (RuntimeException e10) {
                                    throw K.q(this.f72824c, e10, i10, "Unable to create @Body converter for %s", type);
                                }
                            } else {
                                throw K.p(this.f72824c, i10, "Multiple @Body method annotations found.", new Object[0]);
                            }
                        } else if (!(annotation instanceof gi.x)) {
                            return null;
                        } else {
                            j(i10, type);
                            Class h19 = K.h(type);
                            int i16 = i10 - 1;
                            while (i16 >= 0) {
                                x xVar = this.f72844w[i16];
                                if (!(xVar instanceof x.q) || !((x.q) xVar).f72995a.equals(h19)) {
                                    i16--;
                                } else {
                                    throw K.p(this.f72824c, i10, "@Tag type " + h19.getName() + " is duplicate of " + y.f72997b.a(this.f72824c, i16) + " and would always overwrite its value.", new Object[0]);
                                }
                            }
                            return new x.q(h19);
                        }
                    }
                }
            }
        }

        static Set h(String str) {
            Matcher matcher = f72820y.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void i(int i10, String str) {
            if (!f72821z.matcher(str).matches()) {
                throw K.p(this.f72824c, i10, "@Path parameter name must match %s. Found: %s", f72820y.pattern(), str);
            } else if (!this.f72843v.contains(str)) {
                throw K.p(this.f72824c, i10, "URL \"%s\" does not contain \"{%s}\".", this.f72840s, str);
            }
        }

        private void j(int i10, Type type) {
            if (K.j(type)) {
                throw K.p(this.f72824c, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        /* access modifiers changed from: package-private */
        public E b() {
            boolean z10;
            for (Annotation e10 : this.f72825d) {
                e(e10);
            }
            if (this.f72836o != null) {
                if (!this.f72837p) {
                    if (this.f72839r) {
                        throw K.n(this.f72824c, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (this.f72838q) {
                        throw K.n(this.f72824c, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f72826e.length;
                this.f72844w = new x[length];
                int i10 = length - 1;
                for (int i11 = 0; i11 < length; i11++) {
                    x[] xVarArr = this.f72844w;
                    Type type = this.f72827f[i11];
                    Annotation[] annotationArr = this.f72826e[i11];
                    if (i11 == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    xVarArr[i11] = f(i11, type, annotationArr, z10);
                }
                if (this.f72840s != null || this.f72835n) {
                    boolean z11 = this.f72838q;
                    if (!z11 && !this.f72839r && !this.f72837p && this.f72830i) {
                        throw K.n(this.f72824c, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                    } else if (z11 && !this.f72828g) {
                        throw K.n(this.f72824c, "Form-encoded method must contain at least one @Field.", new Object[0]);
                    } else if (!this.f72839r || this.f72829h) {
                        return new E(this);
                    } else {
                        throw K.n(this.f72824c, "Multipart method must contain at least one @Part.", new Object[0]);
                    }
                } else {
                    throw K.n(this.f72824c, "Missing either @%s URL or @Url parameter.", this.f72836o);
                }
            } else {
                throw K.n(this.f72824c, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }
    }

    E(a aVar) {
        this.f72808a = aVar.f72823b;
        this.f72809b = aVar.f72824c;
        this.f72810c = aVar.f72822a.f72851c;
        this.f72811d = aVar.f72836o;
        this.f72812e = aVar.f72840s;
        this.f72813f = aVar.f72841t;
        this.f72814g = aVar.f72842u;
        this.f72815h = aVar.f72837p;
        this.f72816i = aVar.f72838q;
        this.f72817j = aVar.f72839r;
        this.f72818k = aVar.f72844w;
        this.f72819l = aVar.f72845x;
    }

    static E b(G g10, Class cls, Method method) {
        return new a(g10, cls, method).b();
    }

    /* access modifiers changed from: package-private */
    public C a(Object obj, Object[] objArr) {
        x[] xVarArr = this.f72818k;
        int length = objArr.length;
        if (length == xVarArr.length) {
            D d10 = new D(this.f72811d, this.f72810c, this.f72812e, this.f72813f, this.f72814g, this.f72815h, this.f72816i, this.f72817j);
            if (this.f72819l) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(objArr[i10]);
                xVarArr[i10].a(d10, objArr[i10]);
            }
            return d10.k().j(t.class, new t(this.f72808a, obj, this.f72809b, arrayList)).b();
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + xVarArr.length + ")");
    }
}
