package com.bugsnag.android;

import K4.q;
import com.bugsnag.android.K0;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class s1 implements K0.a {

    /* renamed from: a  reason: collision with root package name */
    private String f38870a;

    /* renamed from: b  reason: collision with root package name */
    private String f38871b;

    /* renamed from: c  reason: collision with root package name */
    private Number f38872c;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f38873d;

    /* renamed from: e  reason: collision with root package name */
    private Map f38874e;

    /* renamed from: f  reason: collision with root package name */
    private Number f38875f;

    /* renamed from: g  reason: collision with root package name */
    private Long f38876g;

    /* renamed from: h  reason: collision with root package name */
    private Long f38877h;

    /* renamed from: i  reason: collision with root package name */
    private Long f38878i;

    /* renamed from: j  reason: collision with root package name */
    private String f38879j;

    /* renamed from: k  reason: collision with root package name */
    private Boolean f38880k;

    /* renamed from: l  reason: collision with root package name */
    private ErrorType f38881l;

    public s1(String str, String str2, Number number, Boolean bool) {
        this(str, str2, number, bool, (Map) null, (Number) null, 48, (DefaultConstructorMarker) null);
    }

    public final String a() {
        return this.f38871b;
    }

    public final Long b() {
        return this.f38876g;
    }

    public final Boolean c() {
        return this.f38873d;
    }

    public final Number d() {
        return this.f38872c;
    }

    public final Long e() {
        return this.f38878i;
    }

    public final String f() {
        return this.f38870a;
    }

    public final Long g() {
        return this.f38877h;
    }

    public final ErrorType h() {
        return this.f38881l;
    }

    public final void i(ErrorType errorType) {
        this.f38881l = errorType;
    }

    public void toStream(K0 k02) {
        k02.n();
        k02.y("method").j0(this.f38870a);
        k02.y("file").j0(this.f38871b);
        k02.y("lineNumber").h0(this.f38872c);
        Boolean bool = this.f38873d;
        if (bool != null) {
            k02.y("inProject").o0(bool.booleanValue());
        }
        k02.y("columnNumber").h0(this.f38875f);
        if (this.f38876g != null) {
            k02.y("frameAddress").j0(q.f32402a.h(b()));
        }
        if (this.f38877h != null) {
            k02.y("symbolAddress").j0(q.f32402a.h(g()));
        }
        if (this.f38878i != null) {
            k02.y("loadAddress").j0(q.f32402a.h(e()));
        }
        String str = this.f38879j;
        if (str != null) {
            k02.y("codeIdentifier").j0(str);
        }
        Boolean bool2 = this.f38880k;
        if (bool2 != null) {
            k02.y("isPC").o0(bool2.booleanValue());
        }
        ErrorType errorType = this.f38881l;
        if (errorType != null) {
            k02.y("type").j0(errorType.getDesc$bugsnag_android_core_release());
        }
        Map map = this.f38874e;
        if (map != null) {
            k02.y("code");
            for (Map.Entry entry : map.entrySet()) {
                k02.n();
                k02.y((String) entry.getKey());
                k02.j0((String) entry.getValue());
                k02.t();
            }
        }
        k02.t();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(String str, String str2, Number number, Boolean bool, Map map, Number number2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, number, bool, (i10 & 16) != 0 ? null : map, (i10 & 32) != 0 ? null : number2);
    }

    public s1(String str, String str2, Number number, Boolean bool, Map map, Number number2) {
        this.f38870a = str;
        this.f38871b = str2;
        this.f38872c = number;
        this.f38873d = bool;
        this.f38874e = map;
        this.f38875f = number2;
    }

    public s1(NativeStackframe nativeStackframe) {
        this(nativeStackframe.getMethod(), nativeStackframe.getFile(), nativeStackframe.getLineNumber(), (Boolean) null, (Map) null, (Number) null, 32, (DefaultConstructorMarker) null);
        this.f38876g = nativeStackframe.getFrameAddress();
        this.f38877h = nativeStackframe.getSymbolAddress();
        this.f38878i = nativeStackframe.getLoadAddress();
        this.f38879j = nativeStackframe.getCodeIdentifier();
        this.f38880k = nativeStackframe.isPC();
        this.f38881l = nativeStackframe.getType();
    }

    public s1(Map map) {
        Object obj = map.get("method");
        ErrorType errorType = null;
        this.f38870a = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("file");
        this.f38871b = obj2 instanceof String ? (String) obj2 : null;
        q qVar = q.f32402a;
        this.f38872c = qVar.e(map.get("lineNumber"));
        Object obj3 = map.get("inProject");
        this.f38873d = obj3 instanceof Boolean ? (Boolean) obj3 : null;
        Object obj4 = map.get("columnNumber");
        this.f38875f = obj4 instanceof Number ? (Number) obj4 : null;
        this.f38876g = qVar.e(map.get("frameAddress"));
        this.f38877h = qVar.e(map.get("symbolAddress"));
        this.f38878i = qVar.e(map.get("loadAddress"));
        Object obj5 = map.get("codeIdentifier");
        this.f38879j = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = map.get("isPC");
        this.f38880k = obj6 instanceof Boolean ? (Boolean) obj6 : null;
        Object obj7 = map.get("code");
        this.f38874e = obj7 instanceof Map ? (Map) obj7 : null;
        Object obj8 = map.get("type");
        String str = obj8 instanceof String ? (String) obj8 : null;
        this.f38881l = str != null ? ErrorType.Companion.a(str) : errorType;
    }
}
