package Uf;

import eg.C5825b;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.f;

/* renamed from: Uf.h  reason: case insensitive filesystem */
public abstract class C5555h implements C5825b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f65247b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final f f65248a;

    /* renamed from: Uf.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5555h a(Object obj, f fVar) {
            C6496s.h(obj, "value");
            if (C5553f.l(obj.getClass())) {
                return new v(fVar, (Enum) obj);
            }
            if (obj instanceof Annotation) {
                return new i(fVar, (Annotation) obj);
            }
            if (obj instanceof Object[]) {
                return new l(fVar, (Object[]) obj);
            }
            if (obj instanceof Class) {
                return new r(fVar, (Class) obj);
            }
            return new x(fVar, obj);
        }

        private a() {
        }
    }

    public /* synthetic */ C5555h(f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    public f getName() {
        return this.f65248a;
    }

    private C5555h(f fVar) {
        this.f65248a = fVar;
    }
}
