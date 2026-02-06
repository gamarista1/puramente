package Rf;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C6496s;

public final class C implements B {

    /* renamed from: a  reason: collision with root package name */
    private final List f64725a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f64726b;

    /* renamed from: c  reason: collision with root package name */
    private final List f64727c;

    /* renamed from: d  reason: collision with root package name */
    private final Set f64728d;

    public C(List list, Set set, List list2, Set set2) {
        C6496s.h(list, "allDependencies");
        C6496s.h(set, "modulesWhoseInternalsAreVisible");
        C6496s.h(list2, "directExpectedByDependencies");
        C6496s.h(set2, "allExpectedByDependencies");
        this.f64725a = list;
        this.f64726b = set;
        this.f64727c = list2;
        this.f64728d = set2;
    }

    public List a() {
        return this.f64725a;
    }

    public List b() {
        return this.f64727c;
    }

    public Set c() {
        return this.f64726b;
    }
}
