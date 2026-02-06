package com.amazon.a.a.j;

import java.util.HashMap;
import java.util.Map;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f37260a = "RESPONSE";

    /* renamed from: b  reason: collision with root package name */
    public static final String f37261b = "RESET_OFFSET";

    /* renamed from: d  reason: collision with root package name */
    public static final String f37262d = "RECEIPT_STRING";

    /* renamed from: e  reason: collision with root package name */
    public static final String f37263e = "KIWI_EXECUTION_RESULT_CODE";

    /* renamed from: f  reason: collision with root package name */
    public static final String f37264f = "RECEIPT_DELIVERED";

    /* renamed from: g  reason: collision with root package name */
    public static final String f37265g = "PURCHASE_REQUEST_ID";

    /* renamed from: h  reason: collision with root package name */
    public static final String f37266h = "userId";

    /* renamed from: i  reason: collision with root package name */
    static final /* synthetic */ boolean f37267i = true;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Object> f37268c = new HashMap();

    public Object a(String str) {
        return this.f37268c.get(str);
    }

    public boolean b(String str) {
        return this.f37268c.containsKey(str);
    }

    public Object c(String str) {
        return this.f37268c.remove(str);
    }

    public void a(String str, Object obj) {
        this.f37268c.put(str, obj);
    }

    public Object b() {
        return this.f37268c.get(f37260a);
    }

    public void c() {
        this.f37268c.remove(f37260a);
    }

    public boolean a(Class cls) {
        return b(f37260a) && a(f37260a).getClass().equals(cls);
    }

    public void a() {
        this.f37268c.clear();
    }

    public void a(Object obj) {
        if (f37267i || obj != null) {
            this.f37268c.put(f37260a, obj);
            return;
        }
        throw new AssertionError();
    }
}
