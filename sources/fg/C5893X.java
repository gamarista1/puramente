package fg;

import com.amazon.a.a.o.b;
import fg.C5907f0;
import gg.C5946F;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import wg.C6769e;

/* renamed from: fg.X  reason: case insensitive filesystem */
public abstract class C5893X {

    /* renamed from: a  reason: collision with root package name */
    private static final C5910h f67610a = new C5910h(C5916k.NULLABLE, (C5912i) null, false, false, 8, (DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private static final C5910h f67611b;

    /* renamed from: c  reason: collision with root package name */
    private static final C5910h f67612c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map f67613d;

    static {
        C5916k kVar = C5916k.NOT_NULL;
        f67611b = new C5910h(kVar, (C5912i) null, false, false, 8, (DefaultConstructorMarker) null);
        f67612c = new C5910h(kVar, (C5912i) null, true, false, 8, (DefaultConstructorMarker) null);
        C5946F f10 = C5946F.f67716a;
        String h10 = f10.h("Object");
        String g10 = f10.g("Predicate");
        String g11 = f10.g("Function");
        String g12 = f10.g("Consumer");
        String g13 = f10.g("BiFunction");
        String g14 = f10.g("BiConsumer");
        String g15 = f10.g("UnaryOperator");
        String i10 = f10.i("stream/Stream");
        String i11 = f10.i("Optional");
        C5907f0 f0Var = new C5907f0();
        C5907f0.a.b(new C5907f0.a(f0Var, f10.i("Iterator")), "forEachRemaining", (String) null, new C5920m(g12), 2, (Object) null);
        C5907f0.a.b(new C5907f0.a(f0Var, f10.h("Iterable")), "spliterator", (String) null, new C5931x(f10), 2, (Object) null);
        C5907f0.a aVar = new C5907f0.a(f0Var, f10.i("Collection"));
        C5907f0.a.b(aVar, "removeIf", (String) null, new C5879I(g10), 2, (Object) null);
        C5907f0.a aVar2 = aVar;
        C5907f0.a.b(aVar2, "stream", (String) null, new C5886P(i10), 2, (Object) null);
        C5907f0.a.b(aVar2, "parallelStream", (String) null, new C5887Q(i10), 2, (Object) null);
        C5907f0.a aVar3 = new C5907f0.a(f0Var, f10.i("List"));
        C5907f0.a aVar4 = aVar3;
        C5907f0.a.b(aVar3, "replaceAll", (String) null, new C5888S(g15), 2, (Object) null);
        aVar4.a("addFirst", "2.1", new C5889T(h10));
        aVar4.a("addLast", "2.1", new C5890U(h10));
        aVar4.a("removeFirst", "2.1", new C5891V(h10));
        aVar4.a("removeLast", "2.1", new C5892W(h10));
        C5907f0.a aVar5 = new C5907f0.a(f0Var, f10.i("LinkedList"));
        aVar5.a("addFirst", "2.1", new C5921n(h10));
        aVar5.a("addLast", "2.1", new C5922o(h10));
        aVar5.a("removeFirst", "2.1", new C5923p(h10));
        aVar5.a("removeLast", "2.1", new C5924q(h10));
        C5907f0.a aVar6 = new C5907f0.a(f0Var, f10.i("Map"));
        C5907f0.a.b(aVar6, "forEach", (String) null, new C5925r(g14), 2, (Object) null);
        C5907f0.a.b(aVar6, "putIfAbsent", (String) null, new C5926s(h10), 2, (Object) null);
        C5907f0.a.b(aVar6, "replace", (String) null, new C5927t(h10), 2, (Object) null);
        C5907f0.a.b(aVar6, "replace", (String) null, new C5928u(h10), 2, (Object) null);
        C5907f0.a.b(aVar6, "replaceAll", (String) null, new C5929v(g13), 2, (Object) null);
        C5907f0.a.b(aVar6, "compute", (String) null, new C5930w(h10, g13), 2, (Object) null);
        C5907f0.a.b(aVar6, "computeIfAbsent", (String) null, new C5932y(h10, g11), 2, (Object) null);
        C5907f0.a.b(aVar6, "computeIfPresent", (String) null, new C5933z(h10, g13), 2, (Object) null);
        C5907f0.a.b(aVar6, "merge", (String) null, new C5871A(h10, g13), 2, (Object) null);
        C5907f0.a aVar7 = new C5907f0.a(f0Var, i11);
        C5907f0.a.b(aVar7, "empty", (String) null, new C5872B(i11), 2, (Object) null);
        C5907f0.a.b(aVar7, "of", (String) null, new C5873C(h10, i11), 2, (Object) null);
        C5907f0.a.b(aVar7, "ofNullable", (String) null, new C5874D(h10, i11), 2, (Object) null);
        C5907f0.a.b(aVar7, b.au, (String) null, new C5875E(h10), 2, (Object) null);
        C5907f0.a.b(aVar7, "ifPresent", (String) null, new C5876F(g12), 2, (Object) null);
        C5907f0.a.b(new C5907f0.a(f0Var, f10.h("ref/Reference")), b.au, (String) null, new C5877G(h10), 2, (Object) null);
        C5907f0.a.b(new C5907f0.a(f0Var, g10), "test", (String) null, new C5878H(h10), 2, (Object) null);
        C5907f0.a.b(new C5907f0.a(f0Var, f10.g("BiPredicate")), "test", (String) null, new C5880J(h10), 2, (Object) null);
        C5907f0.a.b(new C5907f0.a(f0Var, g12), "accept", (String) null, new C5881K(h10), 2, (Object) null);
        C5907f0.a.b(new C5907f0.a(f0Var, g14), "accept", (String) null, new C5882L(h10), 2, (Object) null);
        C5907f0.a.b(new C5907f0.a(f0Var, g11), "apply", (String) null, new C5883M(h10), 2, (Object) null);
        C5907f0.a.b(new C5907f0.a(f0Var, g13), "apply", (String) null, new C5884N(h10), 2, (Object) null);
        C5907f0.a.b(new C5907f0.a(f0Var, f10.g("Supplier")), b.au, (String) null, new C5885O(h10), 2, (Object) null);
        f67613d = f0Var.b();
    }

    /* access modifiers changed from: private */
    public static final C6514M A(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        aVar.b(str, f67611b);
        aVar.d(C6769e.BOOLEAN);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M B(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        C5910h hVar = f67611b;
        aVar.b(str, hVar);
        aVar.b(str, hVar);
        aVar.d(C6769e.BOOLEAN);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M C(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        aVar.b(str, f67611b);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M D(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        C5910h hVar = f67611b;
        aVar.b(str, hVar);
        aVar.b(str, hVar);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M E(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        C5910h hVar = f67611b;
        aVar.b(str, hVar);
        aVar.c(str, hVar);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M F(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        C5910h hVar = f67611b;
        aVar.b(str, hVar);
        aVar.b(str, hVar);
        aVar.c(str, hVar);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M G(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        aVar.c(str, f67611b);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M H(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        C5910h hVar = f67611b;
        aVar.b(str, hVar, hVar);
        aVar.d(C6769e.BOOLEAN);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M I(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        C5910h hVar = f67611b;
        aVar.c(str, hVar, hVar);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M J(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        C5910h hVar = f67611b;
        aVar.c(str, hVar, hVar);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M a(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        C5910h hVar = f67611b;
        aVar.b(str, hVar, hVar);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M b(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        aVar.b(str, f67611b);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M c(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        aVar.c(str, f67611b);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M d(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        aVar.c(str, f67611b);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M e(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        C5910h hVar = f67611b;
        aVar.b(str, hVar, hVar);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M f(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        aVar.b(str, f67611b);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M g(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        aVar.b(str, f67611b);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M h(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        aVar.b(str, f67611b);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M i(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        aVar.c(str, f67611b);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M j(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        aVar.c(str, f67611b);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M k(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        C5910h hVar = f67611b;
        aVar.b(str, hVar, hVar, hVar);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M l(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        C5910h hVar = f67611b;
        aVar.b(str, hVar);
        aVar.b(str, hVar);
        aVar.c(str, f67610a);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M m(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        C5910h hVar = f67611b;
        aVar.b(str, hVar);
        aVar.b(str, hVar);
        aVar.c(str, f67610a);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M n(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        C5910h hVar = f67611b;
        aVar.b(str, hVar);
        aVar.b(str, hVar);
        aVar.b(str, hVar);
        aVar.d(C6769e.BOOLEAN);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M o(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        C5910h hVar = f67611b;
        aVar.b(str, hVar, hVar, hVar, hVar);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M p(String str, String str2, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        C5910h hVar = f67611b;
        aVar.b(str, hVar);
        C5910h hVar2 = f67610a;
        aVar.b(str2, hVar, hVar, hVar2, hVar2);
        aVar.c(str, hVar2);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M q(String str, String str2, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        C5910h hVar = f67611b;
        aVar.b(str, hVar);
        aVar.b(str2, hVar, hVar, hVar);
        aVar.c(str, hVar);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M r(String str, String str2, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        C5910h hVar = f67611b;
        aVar.b(str, hVar);
        C5910h hVar2 = f67612c;
        C5910h hVar3 = f67610a;
        aVar.b(str2, hVar, hVar, hVar2, hVar3);
        aVar.c(str, hVar3);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M s(String str, String str2, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        C5910h hVar = f67611b;
        aVar.b(str, hVar);
        C5910h hVar2 = f67612c;
        aVar.b(str, hVar2);
        C5910h hVar3 = f67610a;
        aVar.b(str2, hVar, hVar2, hVar2, hVar3);
        aVar.c(str, hVar3);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M t(C5946F f10, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        String i10 = f10.i("Spliterator");
        C5910h hVar = f67611b;
        aVar.c(i10, hVar, hVar);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M u(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        aVar.c(str, f67611b, f67612c);
        return C6514M.f71813a;
    }

    public static final Map u0() {
        return f67613d;
    }

    /* access modifiers changed from: private */
    public static final C6514M v(String str, String str2, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        C5910h hVar = f67612c;
        aVar.b(str, hVar);
        aVar.c(str2, f67611b, hVar);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M w(String str, String str2, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        aVar.b(str, f67610a);
        aVar.c(str2, f67611b, f67612c);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M x(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        aVar.c(str, f67612c);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M y(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        aVar.b(str, f67611b, f67612c);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M z(String str, C5907f0.a.C0995a aVar) {
        C6496s.h(aVar, "$this$function");
        aVar.c(str, f67610a);
        return C6514M.f71813a;
    }
}
