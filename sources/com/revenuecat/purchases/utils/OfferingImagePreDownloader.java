package com.revenuecat.purchases.utils;

import android.net.Uri;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.paywalls.components.IconComponent;
import com.revenuecat.purchases.paywalls.components.ImageComponent;
import com.revenuecat.purchases.paywalls.components.PackageComponent;
import com.revenuecat.purchases.paywalls.components.PartialCarouselComponent;
import com.revenuecat.purchases.paywalls.components.PartialImageComponent;
import com.revenuecat.purchases.paywalls.components.PartialStackComponent;
import com.revenuecat.purchases.paywalls.components.PartialTabsComponent;
import com.revenuecat.purchases.paywalls.components.PaywallComponent;
import com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent;
import com.revenuecat.purchases.paywalls.components.TabControlButtonComponent;
import com.revenuecat.purchases.paywalls.components.TabControlComponent;
import com.revenuecat.purchases.paywalls.components.TabControlToggleComponent;
import com.revenuecat.purchases.paywalls.components.TabsComponent;
import com.revenuecat.purchases.paywalls.components.TextComponent;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6558k;
import mf.C6565s;
import mf.Y;
import yf.C6798l;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u0014H\u0002¢\u0006\u0004\b\u0012\u0010\u0015J\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0012\u0010\u0017J\u0019\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u0018H\u0002¢\u0006\u0004\b\u0012\u0010\u0019J-\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d*\u00020\u001a2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b \u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006#"}, d2 = {"Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;", "", "", "shouldPredownloadImages", "Lcom/revenuecat/purchases/utils/CoilImageDownloader;", "coilImageDownloader", "<init>", "(ZLcom/revenuecat/purchases/utils/CoilImageDownloader;)V", "Lcom/revenuecat/purchases/Offering;", "offering", "Llf/M;", "downloadV1Images", "(Lcom/revenuecat/purchases/Offering;)V", "downloadV2Images", "Lcom/revenuecat/purchases/Offering$PaywallComponents;", "paywallComponents", "", "Landroid/net/Uri;", "findImageUrisToDownload", "(Lcom/revenuecat/purchases/Offering$PaywallComponents;)Ljava/util/Set;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "(Lcom/revenuecat/purchases/paywalls/components/StackComponent;)Ljava/util/Set;", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "(Lcom/revenuecat/purchases/paywalls/components/common/Background;)Ljava/util/Set;", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;)Ljava/util/Set;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "Lkotlin/Function1;", "predicate", "", "filter", "(Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;Lyf/l;)Ljava/util/List;", "preDownloadOfferingImages", "Z", "Lcom/revenuecat/purchases/utils/CoilImageDownloader;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OfferingImagePreDownloader {
    private final CoilImageDownloader coilImageDownloader;
    private final boolean shouldPredownloadImages;

    public OfferingImagePreDownloader(boolean z10, CoilImageDownloader coilImageDownloader2) {
        C6496s.h(coilImageDownloader2, "coilImageDownloader");
        this.shouldPredownloadImages = z10;
        this.coilImageDownloader = coilImageDownloader2;
    }

    private final void downloadV1Images(Offering offering) {
        PaywallData paywall = offering.getPaywall();
        if (paywall != null) {
            Iterable<String> all$purchases_defaultsRelease = paywall.getConfig().getImages().getAll$purchases_defaultsRelease();
            ArrayList<Uri> arrayList = new ArrayList<>(C6565s.y(all$purchases_defaultsRelease, 10));
            for (String path : all$purchases_defaultsRelease) {
                arrayList.add(Uri.parse(paywall.getAssetBaseURL().toString()).buildUpon().path(path).build());
            }
            for (Uri uri : arrayList) {
                LogUtilsKt.debugLog("Pre-downloading Paywall V1 image: " + uri);
                CoilImageDownloader coilImageDownloader2 = this.coilImageDownloader;
                C6496s.g(uri, "it");
                coilImageDownloader2.downloadImage(uri);
            }
        }
    }

    private final void downloadV2Images(Offering offering) {
        Offering.PaywallComponents paywallComponents = offering.getPaywallComponents();
        if (paywallComponents != null) {
            for (Uri uri : findImageUrisToDownload(paywallComponents)) {
                LogUtilsKt.debugLog("Pre-downloading Paywall V2 image: " + uri);
                this.coilImageDownloader.downloadImage(uri);
            }
        }
    }

    private final List<PaywallComponent> filter(PaywallComponent paywallComponent, C6798l lVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList = new ArrayList();
        C6558k kVar = new C6558k();
        kVar.add(paywallComponent);
        while (!kVar.isEmpty()) {
            PaywallComponent paywallComponent2 = (PaywallComponent) kVar.removeFirst();
            if (((Boolean) lVar.invoke(paywallComponent2)).booleanValue()) {
                arrayList.add(paywallComponent2);
            }
            if (paywallComponent2 instanceof StackComponent) {
                kVar.addAll(((StackComponent) paywallComponent2).getComponents());
            } else if (paywallComponent2 instanceof PurchaseButtonComponent) {
                kVar.add(((PurchaseButtonComponent) paywallComponent2).getStack());
            } else if (paywallComponent2 instanceof ButtonComponent) {
                kVar.add(((ButtonComponent) paywallComponent2).getStack());
            } else if (paywallComponent2 instanceof PackageComponent) {
                kVar.add(((PackageComponent) paywallComponent2).getStack());
            } else if (paywallComponent2 instanceof StickyFooterComponent) {
                kVar.add(((StickyFooterComponent) paywallComponent2).getStack());
            } else if (paywallComponent2 instanceof CarouselComponent) {
                kVar.addAll(((CarouselComponent) paywallComponent2).getPages());
            } else if (paywallComponent2 instanceof TabControlButtonComponent) {
                kVar.add(((TabControlButtonComponent) paywallComponent2).getStack());
            } else if (paywallComponent2 instanceof TabsComponent) {
                TabsComponent tabsComponent = (TabsComponent) paywallComponent2;
                TabsComponent.TabControl control = tabsComponent.getControl();
                if (control instanceof TabsComponent.TabControl.Buttons) {
                    kVar.add(((TabsComponent.TabControl.Buttons) control).getStack());
                } else if (control instanceof TabsComponent.TabControl.Toggle) {
                    kVar.add(((TabsComponent.TabControl.Toggle) control).getStack());
                }
                Iterable<TabsComponent.Tab> tabs = tabsComponent.getTabs();
                ArrayList arrayList2 = new ArrayList(C6565s.y(tabs, 10));
                for (TabsComponent.Tab stack : tabs) {
                    arrayList2.add(stack.getStack());
                }
                kVar.addAll(arrayList2);
            } else if (paywallComponent2 instanceof TimelineComponent) {
                ArrayList arrayList3 = new ArrayList();
                for (TimelineComponent.Item item : ((TimelineComponent) paywallComponent2).getItems()) {
                    C6565s.D(arrayList3, C6565s.s(item.getTitle(), item.getDescription(), item.getIcon()));
                }
                kVar.addAll(arrayList3);
            } else {
                if (paywallComponent2 instanceof TabControlToggleComponent) {
                    z10 = true;
                } else {
                    z10 = paywallComponent2 instanceof TabControlComponent;
                }
                if (z10) {
                    z11 = true;
                } else {
                    z11 = paywallComponent2 instanceof ImageComponent;
                }
                if (z11) {
                    z12 = true;
                } else {
                    z12 = paywallComponent2 instanceof IconComponent;
                }
                if (!z12) {
                    boolean z13 = paywallComponent2 instanceof TextComponent;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001a, code lost:
        r1 = r1.getStack();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Set<android.net.Uri> findImageUrisToDownload(com.revenuecat.purchases.Offering.PaywallComponents r3) {
        /*
            r2 = this;
            com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData r3 = r3.getData()
            com.revenuecat.purchases.paywalls.components.common.ComponentsConfig r3 = r3.getComponentsConfig()
            com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig r3 = r3.getBase()
            com.revenuecat.purchases.paywalls.components.StackComponent r0 = r3.getStack()
            java.util.Set r0 = r2.findImageUrisToDownload((com.revenuecat.purchases.paywalls.components.StackComponent) r0)
            com.revenuecat.purchases.paywalls.components.StickyFooterComponent r1 = r3.getStickyFooter()
            if (r1 == 0) goto L_0x0025
            com.revenuecat.purchases.paywalls.components.StackComponent r1 = r1.getStack()
            if (r1 == 0) goto L_0x0025
            java.util.Set r1 = r2.findImageUrisToDownload((com.revenuecat.purchases.paywalls.components.StackComponent) r1)
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            if (r1 != 0) goto L_0x002c
            java.util.Set r1 = mf.Y.e()
        L_0x002c:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Set r0 = mf.Y.n(r0, r1)
            com.revenuecat.purchases.paywalls.components.common.Background r3 = r3.getBackground()
            java.util.Set r3 = r2.findImageUrisToDownload((com.revenuecat.purchases.paywalls.components.common.Background) r3)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Set r3 = mf.Y.n(r0, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.utils.OfferingImagePreDownloader.findImageUrisToDownload(com.revenuecat.purchases.Offering$PaywallComponents):java.util.Set");
    }

    public final void preDownloadOfferingImages(Offering offering) {
        C6496s.h(offering, "offering");
        if (!this.shouldPredownloadImages) {
            LogUtilsKt.verboseLog("OfferingImagePreDownloader won't pre-download images");
            return;
        }
        LogUtilsKt.debugLog("OfferingImagePreDownloader: starting image download");
        downloadV1Images(offering);
        downloadV2Images(offering);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OfferingImagePreDownloader(boolean r1, com.revenuecat.purchases.utils.CoilImageDownloader r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L_0x000c
            java.lang.String r1 = "com.revenuecat.purchases.ui.revenuecatui.PaywallKt"
            java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x000b }
            r1 = r4
            goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.utils.OfferingImagePreDownloader.<init>(boolean, com.revenuecat.purchases.utils.CoilImageDownloader, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final Set<Uri> findImageUrisToDownload(StackComponent stackComponent) {
        Set set;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (PaywallComponent paywallComponent : filter(stackComponent, OfferingImagePreDownloader$findImageUrisToDownload$1.INSTANCE)) {
            if (paywallComponent instanceof StackComponent) {
                StackComponent stackComponent2 = (StackComponent) paywallComponent;
                Set<Uri> findImageUrisToDownload = findImageUrisToDownload(stackComponent2.getBackground());
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                for (ComponentOverride properties : stackComponent2.getOverrides()) {
                    C6565s.D(linkedHashSet2, findImageUrisToDownload(((PartialStackComponent) properties.getProperties()).getBackground()));
                }
                set = Y.n(findImageUrisToDownload, linkedHashSet2);
            } else if (paywallComponent instanceof IconComponent) {
                IconComponent iconComponent = (IconComponent) paywallComponent;
                set = Y.d(Uri.parse(iconComponent.getBaseUrl()).buildUpon().path(iconComponent.getFormats().getWebp()).build());
            } else if (paywallComponent instanceof CarouselComponent) {
                CarouselComponent carouselComponent = (CarouselComponent) paywallComponent;
                Set<Uri> findImageUrisToDownload2 = findImageUrisToDownload(carouselComponent.getBackground());
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                for (ComponentOverride properties2 : carouselComponent.getOverrides()) {
                    C6565s.D(linkedHashSet3, findImageUrisToDownload(((PartialCarouselComponent) properties2.getProperties()).getBackground()));
                }
                set = Y.n(findImageUrisToDownload2, linkedHashSet3);
            } else if (paywallComponent instanceof TabsComponent) {
                TabsComponent tabsComponent = (TabsComponent) paywallComponent;
                Set<Uri> findImageUrisToDownload3 = findImageUrisToDownload(tabsComponent.getBackground());
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                for (ComponentOverride properties3 : tabsComponent.getOverrides()) {
                    C6565s.D(linkedHashSet4, findImageUrisToDownload(((PartialTabsComponent) properties3.getProperties()).getBackground()));
                }
                set = Y.n(findImageUrisToDownload3, linkedHashSet4);
            } else if (paywallComponent instanceof ImageComponent) {
                ImageComponent imageComponent = (ImageComponent) paywallComponent;
                Set<Uri> findImageUrisToDownload4 = findImageUrisToDownload(imageComponent.getSource());
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                for (ComponentOverride properties4 : imageComponent.getOverrides()) {
                    ThemeImageUrls source = ((PartialImageComponent) properties4.getProperties()).getSource();
                    Set<Uri> findImageUrisToDownload5 = source != null ? findImageUrisToDownload(source) : null;
                    if (findImageUrisToDownload5 == null) {
                        findImageUrisToDownload5 = Y.e();
                    }
                    C6565s.D(linkedHashSet5, findImageUrisToDownload5);
                }
                set = Y.n(findImageUrisToDownload4, linkedHashSet5);
            } else {
                set = Y.e();
            }
            C6565s.D(linkedHashSet, set);
        }
        return linkedHashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        r2 = (r2 = r2.getWebpLowRes()).toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Set<android.net.Uri> findImageUrisToDownload(com.revenuecat.purchases.paywalls.components.common.Background r2) {
        /*
            r1 = this;
            boolean r0 = r2 instanceof com.revenuecat.purchases.paywalls.components.common.Background.Image
            if (r0 == 0) goto L_0x003f
            com.revenuecat.purchases.paywalls.components.common.Background$Image r2 = (com.revenuecat.purchases.paywalls.components.common.Background.Image) r2
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls r0 = r2.getValue()
            com.revenuecat.purchases.paywalls.components.properties.ImageUrls r0 = r0.getLight()
            java.net.URL r0 = r0.getWebpLowRes()
            java.lang.String r0 = r0.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls r2 = r2.getValue()
            com.revenuecat.purchases.paywalls.components.properties.ImageUrls r2 = r2.getDark()
            if (r2 == 0) goto L_0x0035
            java.net.URL r2 = r2.getWebpLowRes()
            if (r2 == 0) goto L_0x0035
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L_0x0035
            android.net.Uri r2 = android.net.Uri.parse(r2)
            goto L_0x0036
        L_0x0035:
            r2 = 0
        L_0x0036:
            android.net.Uri[] r2 = new android.net.Uri[]{r0, r2}
            java.util.Set r2 = mf.Y.k(r2)
            goto L_0x004e
        L_0x003f:
            boolean r0 = r2 instanceof com.revenuecat.purchases.paywalls.components.common.Background.Color
            if (r0 == 0) goto L_0x0048
            java.util.Set r2 = mf.Y.e()
            goto L_0x004e
        L_0x0048:
            if (r2 != 0) goto L_0x004f
            java.util.Set r2 = mf.Y.e()
        L_0x004e:
            return r2
        L_0x004f:
            lf.s r2 = new lf.s
            r2.<init>()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.utils.OfferingImagePreDownloader.findImageUrisToDownload(com.revenuecat.purchases.paywalls.components.common.Background):java.util.Set");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        r2 = (r2 = r2.getWebpLowRes()).toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Set<android.net.Uri> findImageUrisToDownload(com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls r2) {
        /*
            r1 = this;
            com.revenuecat.purchases.paywalls.components.properties.ImageUrls r0 = r2.getLight()
            java.net.URL r0 = r0.getWebpLowRes()
            java.lang.String r0 = r0.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            com.revenuecat.purchases.paywalls.components.properties.ImageUrls r2 = r2.getDark()
            if (r2 == 0) goto L_0x0027
            java.net.URL r2 = r2.getWebpLowRes()
            if (r2 == 0) goto L_0x0027
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L_0x0027
            android.net.Uri r2 = android.net.Uri.parse(r2)
            goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            android.net.Uri[] r2 = new android.net.Uri[]{r0, r2}
            java.util.Set r2 = mf.Y.k(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.utils.OfferingImagePreDownloader.findImageUrisToDownload(com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls):java.util.Set");
    }
}
