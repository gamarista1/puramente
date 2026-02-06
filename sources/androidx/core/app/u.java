package androidx.core.app;

import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Objects;

public class u {

    /* renamed from: a  reason: collision with root package name */
    CharSequence f15933a;

    /* renamed from: b  reason: collision with root package name */
    IconCompat f15934b;

    /* renamed from: c  reason: collision with root package name */
    String f15935c;

    /* renamed from: d  reason: collision with root package name */
    String f15936d;

    /* renamed from: e  reason: collision with root package name */
    boolean f15937e;

    /* renamed from: f  reason: collision with root package name */
    boolean f15938f;

    static class a {
        static u a(PersistableBundle persistableBundle) {
            return new c().f(persistableBundle.getString("name")).g(persistableBundle.getString("uri")).e(persistableBundle.getString(SubscriberAttributeKt.JSON_NAME_KEY)).b(persistableBundle.getBoolean("isBot")).d(persistableBundle.getBoolean("isImportant")).a();
        }

        static PersistableBundle b(u uVar) {
            String str;
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = uVar.f15933a;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            persistableBundle.putString("name", str);
            persistableBundle.putString("uri", uVar.f15935c);
            persistableBundle.putString(SubscriberAttributeKt.JSON_NAME_KEY, uVar.f15936d);
            persistableBundle.putBoolean("isBot", uVar.f15937e);
            persistableBundle.putBoolean("isImportant", uVar.f15938f);
            return persistableBundle;
        }
    }

    static class b {
        static Person a(u uVar) {
            Icon icon;
            Person.Builder name = new Person.Builder().setName(uVar.d());
            if (uVar.b() != null) {
                icon = uVar.b().o();
            } else {
                icon = null;
            }
            return name.setIcon(icon).setUri(uVar.e()).setKey(uVar.c()).setBot(uVar.f()).setImportant(uVar.g()).build();
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        CharSequence f15939a;

        /* renamed from: b  reason: collision with root package name */
        IconCompat f15940b;

        /* renamed from: c  reason: collision with root package name */
        String f15941c;

        /* renamed from: d  reason: collision with root package name */
        String f15942d;

        /* renamed from: e  reason: collision with root package name */
        boolean f15943e;

        /* renamed from: f  reason: collision with root package name */
        boolean f15944f;

        public u a() {
            return new u(this);
        }

        public c b(boolean z10) {
            this.f15943e = z10;
            return this;
        }

        public c c(IconCompat iconCompat) {
            this.f15940b = iconCompat;
            return this;
        }

        public c d(boolean z10) {
            this.f15944f = z10;
            return this;
        }

        public c e(String str) {
            this.f15942d = str;
            return this;
        }

        public c f(CharSequence charSequence) {
            this.f15939a = charSequence;
            return this;
        }

        public c g(String str) {
            this.f15941c = str;
            return this;
        }
    }

    u(c cVar) {
        this.f15933a = cVar.f15939a;
        this.f15934b = cVar.f15940b;
        this.f15935c = cVar.f15941c;
        this.f15936d = cVar.f15942d;
        this.f15937e = cVar.f15943e;
        this.f15938f = cVar.f15944f;
    }

    public static u a(PersistableBundle persistableBundle) {
        return a.a(persistableBundle);
    }

    public IconCompat b() {
        return this.f15934b;
    }

    public String c() {
        return this.f15936d;
    }

    public CharSequence d() {
        return this.f15933a;
    }

    public String e() {
        return this.f15935c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        String c10 = c();
        String c11 = uVar.c();
        if (c10 != null || c11 != null) {
            return Objects.equals(c10, c11);
        }
        if (!Objects.equals(Objects.toString(d()), Objects.toString(uVar.d())) || !Objects.equals(e(), uVar.e()) || !Boolean.valueOf(f()).equals(Boolean.valueOf(uVar.f())) || !Boolean.valueOf(g()).equals(Boolean.valueOf(uVar.g()))) {
            return false;
        }
        return true;
    }

    public boolean f() {
        return this.f15937e;
    }

    public boolean g() {
        return this.f15938f;
    }

    public String h() {
        String str = this.f15935c;
        if (str != null) {
            return str;
        }
        if (this.f15933a == null) {
            return "";
        }
        return "name:" + this.f15933a;
    }

    public int hashCode() {
        String c10 = c();
        if (c10 != null) {
            return c10.hashCode();
        }
        return Objects.hash(new Object[]{d(), e(), Boolean.valueOf(f()), Boolean.valueOf(g())});
    }

    public Person i() {
        return b.a(this);
    }

    public Bundle j() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f15933a);
        IconCompat iconCompat = this.f15934b;
        if (iconCompat != null) {
            bundle = iconCompat.n();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f15935c);
        bundle2.putString(SubscriberAttributeKt.JSON_NAME_KEY, this.f15936d);
        bundle2.putBoolean("isBot", this.f15937e);
        bundle2.putBoolean("isImportant", this.f15938f);
        return bundle2;
    }

    public PersistableBundle k() {
        return a.b(this);
    }
}
