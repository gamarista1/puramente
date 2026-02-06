package Pf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import mf.C6565s;
import mf.O;
import sf.C6714a;

public enum r {
    CLASS("class", false, 2, (boolean) null),
    ANNOTATION_CLASS("annotation class", false, 2, (boolean) null),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2, (boolean) null),
    FIELD("field", false, 2, (boolean) null),
    LOCAL_VARIABLE("local variable", false, 2, (boolean) null),
    VALUE_PARAMETER("value parameter", false, 2, (boolean) null),
    CONSTRUCTOR("constructor", false, 2, (boolean) null),
    FUNCTION("function", false, 2, (boolean) null),
    PROPERTY_GETTER("getter", false, 2, (boolean) null),
    PROPERTY_SETTER("setter", false, 2, (boolean) null),
    TYPE("type usage", false),
    EXPRESSION("expression", false),
    FILE("file", false),
    TYPEALIAS("typealias", false),
    TYPE_PROJECTION("type projection", false),
    STAR_PROJECTION("star projection", false),
    PROPERTY_PARAMETER("property constructor parameter", false),
    CLASS_ONLY("class", false),
    OBJECT("object", false),
    STANDALONE_OBJECT("standalone object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false),
    LOCAL_FUNCTION("local function", false),
    MEMBER_FUNCTION("member function", false),
    TOP_LEVEL_FUNCTION("top level function", false),
    MEMBER_PROPERTY("member property", false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    TOP_LEVEL_PROPERTY("top level property", false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    BACKING_FIELD("backing field", false, 2, (boolean) null),
    INITIALIZER("initializer", false),
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    LAMBDA_EXPRESSION("lambda expression", false),
    ANONYMOUS_FUNCTION("anonymous function", false),
    OBJECT_LITERAL("object literal", false);
    

    /* renamed from: c  reason: collision with root package name */
    public static final a f64640c = null;

    /* renamed from: d  reason: collision with root package name */
    private static final HashMap f64641d = null;

    /* renamed from: e  reason: collision with root package name */
    private static final Set f64642e = null;

    /* renamed from: f  reason: collision with root package name */
    private static final Set f64643f = null;

    /* renamed from: g  reason: collision with root package name */
    private static final List f64645g = null;

    /* renamed from: h  reason: collision with root package name */
    private static final List f64647h = null;

    /* renamed from: i  reason: collision with root package name */
    private static final List f64649i = null;

    /* renamed from: j  reason: collision with root package name */
    private static final List f64651j = null;

    /* renamed from: k  reason: collision with root package name */
    private static final List f64653k = null;

    /* renamed from: l  reason: collision with root package name */
    private static final List f64655l = null;

    /* renamed from: m  reason: collision with root package name */
    private static final List f64657m = null;

    /* renamed from: n  reason: collision with root package name */
    private static final List f64659n = null;

    /* renamed from: o  reason: collision with root package name */
    private static final List f64661o = null;

    /* renamed from: p  reason: collision with root package name */
    private static final List f64663p = null;

    /* renamed from: q  reason: collision with root package name */
    private static final List f64665q = null;

    /* renamed from: r  reason: collision with root package name */
    private static final List f64667r = null;

    /* renamed from: s  reason: collision with root package name */
    private static final Map f64669s = null;

    /* renamed from: a  reason: collision with root package name */
    private final String f64685a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f64686b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        r[] a10;
        f64632E0 = C6714a.a(a10);
        f64640c = new a((DefaultConstructorMarker) null);
        f64641d = new HashMap();
        for (r rVar : b()) {
            f64641d.put(rVar.name(), rVar);
        }
        EnumEntries b10 = b();
        ArrayList arrayList = new ArrayList();
        for (Object next : b10) {
            if (((r) next).f64686b) {
                arrayList.add(next);
            }
        }
        f64642e = C6565s.j1(arrayList);
        f64643f = C6565s.j1(b());
        r rVar2 = ANNOTATION_CLASS;
        r rVar3 = CLASS;
        f64645g = C6565s.q(rVar2, rVar3);
        f64647h = C6565s.q(LOCAL_CLASS, rVar3);
        f64649i = C6565s.q(CLASS_ONLY, rVar3);
        r rVar4 = COMPANION_OBJECT;
        r rVar5 = OBJECT;
        f64651j = C6565s.q(rVar4, rVar5, rVar3);
        f64653k = C6565s.q(STANDALONE_OBJECT, rVar5, rVar3);
        f64655l = C6565s.q(INTERFACE, rVar3);
        f64657m = C6565s.q(ENUM_CLASS, rVar3);
        r rVar6 = ENUM_ENTRY;
        r rVar7 = PROPERTY;
        r rVar8 = FIELD;
        f64659n = C6565s.q(rVar6, rVar7, rVar8);
        r rVar9 = PROPERTY_SETTER;
        f64661o = C6565s.e(rVar9);
        r rVar10 = PROPERTY_GETTER;
        f64663p = C6565s.e(rVar10);
        f64665q = C6565s.e(FUNCTION);
        r rVar11 = FILE;
        f64667r = C6565s.e(rVar11);
        e eVar = e.CONSTRUCTOR_PARAMETER;
        r rVar12 = VALUE_PARAMETER;
        f64669s = O.l(C6502A.a(eVar, rVar12), C6502A.a(e.FIELD, rVar8), C6502A.a(e.PROPERTY, rVar7), C6502A.a(e.FILE, rVar11), C6502A.a(e.PROPERTY_GETTER, rVar10), C6502A.a(e.PROPERTY_SETTER, rVar9), C6502A.a(e.RECEIVER, rVar12), C6502A.a(e.SETTER_PARAMETER, rVar12), C6502A.a(e.PROPERTY_DELEGATE_FIELD, rVar8));
    }

    private r(String str, boolean z10) {
        this.f64685a = str;
        this.f64686b = z10;
    }

    public static EnumEntries b() {
        return f64632E0;
    }
}
