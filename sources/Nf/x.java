package Nf;

import Lf.o;
import gg.C5946F;
import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.Y;
import ng.b;
import ng.d;
import wg.C6769e;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f64337a;

    /* renamed from: b  reason: collision with root package name */
    private static final Set f64338b;

    /* renamed from: c  reason: collision with root package name */
    private static final Set f64339c;

    /* renamed from: d  reason: collision with root package name */
    private static final Set f64340d;

    /* renamed from: e  reason: collision with root package name */
    private static final Set f64341e;

    /* renamed from: f  reason: collision with root package name */
    private static final Set f64342f;

    /* renamed from: g  reason: collision with root package name */
    private static final Set f64343g;

    /* renamed from: h  reason: collision with root package name */
    private static final Set f64344h;

    static {
        x xVar = new x();
        f64337a = xVar;
        C5946F f10 = C5946F.f67716a;
        f64338b = Y.o(f10.f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f64339c = Y.n(Y.n(Y.n(Y.n(Y.n(Y.n(xVar.b(), f10.f("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), f10.e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), f10.e("Double", "isInfinite()Z", "isNaN()Z")), f10.e("Float", "isInfinite()Z", "isNaN()Z")), f10.e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), f10.e("CharSequence", "isEmpty()Z"));
        f64340d = f10.f("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f64341e = Y.n(Y.n(Y.n(Y.n(Y.n(Y.n(f10.e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), f10.f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), f10.e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), f10.e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), f10.f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), f10.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), f10.f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f64342f = Y.n(Y.n(f10.f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), f10.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), f10.f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        Set a10 = xVar.a();
        String[] b10 = f10.b("D");
        Set n10 = Y.n(a10, f10.e("Float", (String[]) Arrays.copyOf(b10, b10.length)));
        String[] b11 = f10.b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f64343g = Y.n(n10, f10.e("String", (String[]) Arrays.copyOf(b11, b11.length)));
        String[] b12 = f10.b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f64344h = f10.e("Throwable", (String[]) Arrays.copyOf(b12, b12.length));
    }

    private x() {
    }

    private final Set a() {
        C5946F f10 = C5946F.f67716a;
        C6769e eVar = C6769e.BOOLEAN;
        C6769e eVar2 = C6769e.BYTE;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C6769e j10 : C6565s.q(eVar, eVar2, C6769e.DOUBLE, C6769e.FLOAT, eVar2, C6769e.INT, C6769e.LONG, C6769e.SHORT)) {
            String b10 = j10.j().g().b();
            C6496s.g(b10, "asString(...)");
            String[] b11 = f10.b("Ljava/lang/String;");
            C6565s.D(linkedHashSet, f10.e(b10, (String[]) Arrays.copyOf(b11, b11.length)));
        }
        return linkedHashSet;
    }

    private final Set b() {
        C5946F f10 = C5946F.f67716a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C6769e eVar : C6565s.q(C6769e.BOOLEAN, C6769e.CHAR)) {
            String b10 = eVar.j().g().b();
            C6496s.g(b10, "asString(...)");
            C6565s.D(linkedHashSet, f10.e(b10, eVar.f() + "Value()" + eVar.e()));
        }
        return linkedHashSet;
    }

    public final Set c() {
        return f64340d;
    }

    public final Set d() {
        return f64338b;
    }

    public final Set e() {
        return f64343g;
    }

    public final Set f() {
        return f64339c;
    }

    public final Set g() {
        return f64342f;
    }

    public final Set h() {
        return f64344h;
    }

    public final Set i() {
        return f64341e;
    }

    public final boolean j(d dVar) {
        C6496s.h(dVar, "fqName");
        if (C6496s.c(dVar, o.a.f64011i) || o.e(dVar)) {
            return true;
        }
        return false;
    }

    public final boolean k(d dVar) {
        C6496s.h(dVar, "fqName");
        if (j(dVar)) {
            return true;
        }
        b n10 = c.f64255a.n(dVar);
        if (n10 == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(n10.a().b()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
