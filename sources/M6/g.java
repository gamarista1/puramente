package M6;

import android.icu.util.ULocale;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class g implements b {

    /* renamed from: a  reason: collision with root package name */
    private ULocale f32612a;

    /* renamed from: b  reason: collision with root package name */
    private ULocale.Builder f32613b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f32614c;

    private g(ULocale uLocale) {
        this.f32613b = null;
        this.f32614c = false;
        this.f32612a = uLocale;
    }

    public static b i() {
        return new g(ULocale.getDefault(ULocale.Category.FORMAT));
    }

    public static b j(String str) {
        return new g(str);
    }

    public static b k(ULocale uLocale) {
        return new g(uLocale);
    }

    private void l() {
        if (this.f32614c) {
            try {
                this.f32612a = this.f32613b.build();
                this.f32614c = false;
            } catch (RuntimeException e10) {
                throw new e(e10.getMessage());
            }
        }
    }

    public HashMap a() {
        l();
        HashMap hashMap = new HashMap();
        Iterator<String> keywords = this.f32612a.getKeywords();
        if (keywords != null) {
            while (keywords.hasNext()) {
                String next = keywords.next();
                hashMap.put(i.b(next), this.f32612a.getKeywordValue(next));
            }
        }
        return hashMap;
    }

    public ArrayList b(String str) {
        l();
        String a10 = i.a(str);
        ArrayList arrayList = new ArrayList();
        String keywordValue = this.f32612a.getKeywordValue(a10);
        if (keywordValue != null && !keywordValue.isEmpty()) {
            Collections.addAll(arrayList, keywordValue.split("-|_"));
        }
        return arrayList;
    }

    public b d() {
        l();
        return new g(this.f32612a);
    }

    public String e() {
        return c().toLanguageTag();
    }

    public void f(String str, ArrayList arrayList) {
        l();
        if (this.f32613b == null) {
            this.f32613b = new ULocale.Builder().setLocale(this.f32612a);
        }
        try {
            this.f32613b.setUnicodeLocaleKeyword(str, TextUtils.join("-", arrayList));
            this.f32614c = true;
        } catch (RuntimeException e10) {
            throw new e(e10.getMessage());
        }
    }

    public String g() {
        return h().toLanguageTag();
    }

    /* renamed from: m */
    public ULocale h() {
        l();
        return this.f32612a;
    }

    /* renamed from: n */
    public ULocale c() {
        l();
        ULocale.Builder builder = new ULocale.Builder();
        builder.setLocale(this.f32612a);
        builder.clearExtensions();
        return builder.build();
    }

    private g(String str) {
        this.f32612a = null;
        this.f32613b = null;
        this.f32614c = false;
        ULocale.Builder builder = new ULocale.Builder();
        this.f32613b = builder;
        try {
            builder.setLanguageTag(str);
            this.f32614c = true;
        } catch (RuntimeException e10) {
            throw new e(e10.getMessage());
        }
    }
}
