package com.revenuecat.purchases.paywalls.components.properties;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import gh.C5978b;
import gh.C5985i;
import ih.f;
import java.net.URL;
import jh.d;
import kh.C6456i0;
import kh.H0;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6506E;
import lf.C6521e;

@C5985i
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002&%B2\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nBV\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\rø\u0001\u0000¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0018\u0012\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001f\u0010\u001aR \u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R \u0010\b\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b$\u0010#\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;", "", "Ljava/net/URL;", "original", "webp", "webpLowRes", "Llf/E;", "width", "height", "<init>", "(Ljava/net/URL;Ljava/net/URL;Ljava/net/URL;IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/net/URL;Ljava/net/URL;Ljava/net/URL;Llf/E;Llf/E;Lkh/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;Ljh/d;Lih/f;)V", "Ljava/net/URL;", "getOriginal", "()Ljava/net/URL;", "getOriginal$annotations", "()V", "getWebp", "getWebp$annotations", "getWebpLowRes", "getWebpLowRes$annotations", "I", "getWidth-pVg5ArA", "()I", "getHeight-pVg5ArA", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class ImageUrls {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final int height;
    private final URL original;
    private final URL webp;
    private final URL webpLowRes;
    private final int width;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return ImageUrls$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C6521e
    public /* synthetic */ ImageUrls(int i10, @C5985i(with = URLSerializer.class) URL url, @C5985i(with = URLSerializer.class) URL url2, @C5985i(with = URLSerializer.class) URL url3, C6506E e10, C6506E e11, t0 t0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, url, url2, url3, e10, e11, t0Var);
    }

    @C5985i(with = URLSerializer.class)
    public static /* synthetic */ void getOriginal$annotations() {
    }

    @C5985i(with = URLSerializer.class)
    public static /* synthetic */ void getWebp$annotations() {
    }

    @C5985i(with = URLSerializer.class)
    public static /* synthetic */ void getWebpLowRes$annotations() {
    }

    public static final /* synthetic */ void write$Self(ImageUrls imageUrls, d dVar, f fVar) {
        URLSerializer uRLSerializer = URLSerializer.INSTANCE;
        dVar.B(fVar, 0, uRLSerializer, imageUrls.original);
        dVar.B(fVar, 1, uRLSerializer, imageUrls.webp);
        dVar.B(fVar, 2, uRLSerializer, imageUrls.webpLowRes);
        H0 h02 = H0.f71602a;
        dVar.B(fVar, 3, h02, C6506E.a(imageUrls.width));
        dVar.B(fVar, 4, h02, C6506E.a(imageUrls.height));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageUrls)) {
            return false;
        }
        ImageUrls imageUrls = (ImageUrls) obj;
        return C6496s.c(this.original, imageUrls.original) && C6496s.c(this.webp, imageUrls.webp) && C6496s.c(this.webpLowRes, imageUrls.webpLowRes) && this.width == imageUrls.width && this.height == imageUrls.height;
    }

    /* renamed from: getHeight-pVg5ArA  reason: not valid java name */
    public final /* synthetic */ int m124getHeightpVg5ArA() {
        return this.height;
    }

    public final /* synthetic */ URL getOriginal() {
        return this.original;
    }

    public final /* synthetic */ URL getWebp() {
        return this.webp;
    }

    public final /* synthetic */ URL getWebpLowRes() {
        return this.webpLowRes;
    }

    /* renamed from: getWidth-pVg5ArA  reason: not valid java name */
    public final /* synthetic */ int m125getWidthpVg5ArA() {
        return this.width;
    }

    public int hashCode() {
        return (((((((this.original.hashCode() * 31) + this.webp.hashCode()) * 31) + this.webpLowRes.hashCode()) * 31) + C6506E.e(this.width)) * 31) + C6506E.e(this.height);
    }

    public String toString() {
        return "ImageUrls(original=" + this.original + ", webp=" + this.webp + ", webpLowRes=" + this.webpLowRes + ", width=" + C6506E.f(this.width) + ", height=" + C6506E.f(this.height) + ')';
    }

    public /* synthetic */ ImageUrls(URL url, URL url2, URL url3, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(url, url2, url3, i10, i11);
    }

    private ImageUrls(int i10, URL url, URL url2, URL url3, C6506E e10, C6506E e11, t0 t0Var) {
        if (31 != (i10 & 31)) {
            C6456i0.a(i10, 31, ImageUrls$$serializer.INSTANCE.getDescriptor());
        }
        this.original = url;
        this.webp = url2;
        this.webpLowRes = url3;
        this.width = e10.i();
        this.height = e11.i();
    }

    private ImageUrls(URL url, URL url2, URL url3, int i10, int i11) {
        C6496s.h(url, "original");
        C6496s.h(url2, "webp");
        C6496s.h(url3, "webpLowRes");
        this.original = url;
        this.webp = url2;
        this.webpLowRes = url3;
        this.width = i10;
        this.height = i11;
    }
}
