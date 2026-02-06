package com.revenuecat.purchases.paywalls.components.properties;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import gh.C5978b;
import gh.C5985i;
import ih.f;
import jh.d;
import kh.C6456i0;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;

@C5985i
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0018B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "", "Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;", "light", "dark", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljh/d;Lih/f;)V", "Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;", "getLight", "()Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;", "getDark", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class ThemeImageUrls {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final ImageUrls dark;
    private final ImageUrls light;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return ThemeImageUrls$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C6521e
    public /* synthetic */ ThemeImageUrls(int i10, ImageUrls imageUrls, ImageUrls imageUrls2, t0 t0Var) {
        if (1 != (i10 & 1)) {
            C6456i0.a(i10, 1, ThemeImageUrls$$serializer.INSTANCE.getDescriptor());
        }
        this.light = imageUrls;
        if ((i10 & 2) == 0) {
            this.dark = null;
        } else {
            this.dark = imageUrls2;
        }
    }

    public static final /* synthetic */ void write$Self(ThemeImageUrls themeImageUrls, d dVar, f fVar) {
        ImageUrls$$serializer imageUrls$$serializer = ImageUrls$$serializer.INSTANCE;
        dVar.B(fVar, 0, imageUrls$$serializer, themeImageUrls.light);
        if (dVar.q(fVar, 1) || themeImageUrls.dark != null) {
            dVar.p(fVar, 1, imageUrls$$serializer, themeImageUrls.dark);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemeImageUrls)) {
            return false;
        }
        ThemeImageUrls themeImageUrls = (ThemeImageUrls) obj;
        return C6496s.c(this.light, themeImageUrls.light) && C6496s.c(this.dark, themeImageUrls.dark);
    }

    public final /* synthetic */ ImageUrls getDark() {
        return this.dark;
    }

    public final /* synthetic */ ImageUrls getLight() {
        return this.light;
    }

    public int hashCode() {
        int hashCode = this.light.hashCode() * 31;
        ImageUrls imageUrls = this.dark;
        return hashCode + (imageUrls == null ? 0 : imageUrls.hashCode());
    }

    public String toString() {
        return "ThemeImageUrls(light=" + this.light + ", dark=" + this.dark + ')';
    }

    public ThemeImageUrls(ImageUrls imageUrls, ImageUrls imageUrls2) {
        C6496s.h(imageUrls, "light");
        this.light = imageUrls;
        this.dark = imageUrls2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThemeImageUrls(ImageUrls imageUrls, ImageUrls imageUrls2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageUrls, (i10 & 2) != 0 ? null : imageUrls2);
    }
}
