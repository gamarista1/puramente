package com.amazon.a.a.i;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f37205a;

    /* renamed from: b  reason: collision with root package name */
    private final String f37206b;

    /* renamed from: c  reason: collision with root package name */
    private final String f37207c;

    /* renamed from: d  reason: collision with root package name */
    private final String[] f37208d;

    /* renamed from: e  reason: collision with root package name */
    private final a[] f37209e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f37210f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f37211g;

    /* renamed from: h  reason: collision with root package name */
    private final int f37212h;

    /* renamed from: i  reason: collision with root package name */
    private final int f37213i;

    public enum a {
        DEFAULT,
        HELP,
        DEEPLINK
    }

    public c(String str, String str2, String str3, boolean z10) {
        this(str, str2, str3, z10, false);
    }

    public String a() {
        return this.f37208d[this.f37212h];
    }

    public String[] b() {
        return this.f37208d;
    }

    public a[] c() {
        return this.f37209e;
    }

    public String d() {
        return this.f37207c;
    }

    public String e() {
        return this.f37206b;
    }

    public String f() {
        return this.f37205a;
    }

    public int g() {
        return this.f37213i;
    }

    public boolean h() {
        return this.f37210f;
    }

    public boolean i() {
        return this.f37211g;
    }

    public String toString() {
        return "PromptContent: [ title:" + this.f37205a + ", message: " + this.f37207c + ", label: " + this.f37208d[0] + ", visible: " + this.f37210f + ", shouldShowFixup: " + this.f37211g + "]";
    }

    public c(String str, String str2, String str3, boolean z10, boolean z11) {
        this(str, str2, new String[]{str3}, new a[]{a.DEFAULT}, z10, z11, 0);
    }

    public c(String str, String str2, String[] strArr, a[] aVarArr, boolean z10, boolean z11, int i10) {
        this(new String[]{str}, str2, strArr, aVarArr, z10, z11, i10);
    }

    public c(String[] strArr, String str, String[] strArr2, a[] aVarArr, boolean z10, boolean z11, int i10) {
        this(strArr, str, strArr2, aVarArr, z10, z11, i10, -1);
    }

    public c(String[] strArr, String str, String[] strArr2, a[] aVarArr, boolean z10, boolean z11, int i10, int i11) {
        String str2 = strArr[0];
        this.f37205a = str2;
        if (strArr.length > 1) {
            this.f37206b = strArr[1];
        } else {
            this.f37206b = str2;
        }
        this.f37207c = str;
        this.f37208d = strArr2;
        this.f37209e = aVarArr;
        this.f37210f = z10;
        this.f37211g = z11;
        this.f37212h = i10;
        this.f37213i = i11;
    }
}
