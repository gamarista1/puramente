package Uf;

import eg.C5824a;
import eg.C5826c;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.f;

public final class i extends C5555h implements C5826c {

    /* renamed from: c  reason: collision with root package name */
    private final Annotation f65249c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(f fVar, Annotation annotation) {
        super(fVar, (DefaultConstructorMarker) null);
        C6496s.h(annotation, "annotation");
        this.f65249c = annotation;
    }

    public C5824a a() {
        return new C5554g(this.f65249c);
    }
}
