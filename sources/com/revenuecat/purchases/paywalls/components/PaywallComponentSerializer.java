package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import gh.C5978b;
import gh.C5986j;
import ih.f;
import ih.i;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import jh.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import lh.C6538b;
import lh.h;
import lh.j;
import lh.v;
import lh.x;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallComponentSerializer;", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "<init>", "()V", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;)V", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "Lih/f;", "descriptor", "Lih/f;", "getDescriptor", "()Lih/f;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class PaywallComponentSerializer implements C5978b {
    private final f descriptor = i.b("PaywallComponent", new f[0], PaywallComponentSerializer$descriptor$1.INSTANCE);

    public f getDescriptor() {
        return this.descriptor;
    }

    public void serialize(jh.f fVar, PaywallComponent paywallComponent) {
        C6496s.h(fVar, "encoder");
        C6496s.h(paywallComponent, "value");
    }

    public PaywallComponent deserialize(e eVar) {
        String vVar;
        x o10;
        C6496s.h(eVar, "decoder");
        v vVar2 = null;
        h hVar = eVar instanceof h ? (h) eVar : null;
        if (hVar != null) {
            v n10 = j.n(hVar.g());
            lh.i iVar = (lh.i) n10.get("type");
            String a10 = (iVar == null || (o10 = j.o(iVar)) == null) ? null : o10.a();
            if (a10 != null) {
                switch (a10.hashCode()) {
                    case -2076650431:
                        if (a10.equals("timeline")) {
                            C6538b d10 = hVar.d();
                            String vVar3 = n10.toString();
                            d10.a();
                            return (PaywallComponent) d10.b(TimelineComponent.Companion.serializer(), vVar3);
                        }
                        break;
                    case -1896978765:
                        if (a10.equals("tab_control")) {
                            C6538b d11 = hVar.d();
                            String vVar4 = n10.toString();
                            d11.a();
                            return (PaywallComponent) d11.b(TabControlComponent.INSTANCE.serializer(), vVar4);
                        }
                        break;
                    case -1822017359:
                        if (a10.equals("sticky_footer")) {
                            C6538b d12 = hVar.d();
                            String vVar5 = n10.toString();
                            d12.a();
                            return (PaywallComponent) d12.b(StickyFooterComponent.Companion.serializer(), vVar5);
                        }
                        break;
                    case -1391809488:
                        if (a10.equals("purchase_button")) {
                            C6538b d13 = hVar.d();
                            String vVar6 = n10.toString();
                            d13.a();
                            return (PaywallComponent) d13.b(PurchaseButtonComponent.Companion.serializer(), vVar6);
                        }
                        break;
                    case -1377687758:
                        if (a10.equals("button")) {
                            C6538b d14 = hVar.d();
                            String vVar7 = n10.toString();
                            d14.a();
                            return (PaywallComponent) d14.b(ButtonComponent.Companion.serializer(), vVar7);
                        }
                        break;
                    case -807062458:
                        if (a10.equals("package")) {
                            C6538b d15 = hVar.d();
                            String vVar8 = n10.toString();
                            d15.a();
                            return (PaywallComponent) d15.b(PackageComponent.Companion.serializer(), vVar8);
                        }
                        break;
                    case 2908512:
                        if (a10.equals("carousel")) {
                            C6538b d16 = hVar.d();
                            String vVar9 = n10.toString();
                            d16.a();
                            return (PaywallComponent) d16.b(CarouselComponent.Companion.serializer(), vVar9);
                        }
                        break;
                    case 3226745:
                        if (a10.equals("icon")) {
                            C6538b d17 = hVar.d();
                            String vVar10 = n10.toString();
                            d17.a();
                            return (PaywallComponent) d17.b(IconComponent.Companion.serializer(), vVar10);
                        }
                        break;
                    case 3552126:
                        if (a10.equals("tabs")) {
                            C6538b d18 = hVar.d();
                            String vVar11 = n10.toString();
                            d18.a();
                            return (PaywallComponent) d18.b(TabsComponent.Companion.serializer(), vVar11);
                        }
                        break;
                    case 3556653:
                        if (a10.equals(AttributeType.TEXT)) {
                            C6538b d19 = hVar.d();
                            String vVar12 = n10.toString();
                            d19.a();
                            return (PaywallComponent) d19.b(TextComponent.Companion.serializer(), vVar12);
                        }
                        break;
                    case 100313435:
                        if (a10.equals(AppearanceType.IMAGE)) {
                            C6538b d20 = hVar.d();
                            String vVar13 = n10.toString();
                            d20.a();
                            return (PaywallComponent) d20.b(ImageComponent.Companion.serializer(), vVar13);
                        }
                        break;
                    case 109757064:
                        if (a10.equals("stack")) {
                            C6538b d21 = hVar.d();
                            String vVar14 = n10.toString();
                            d21.a();
                            return (PaywallComponent) d21.b(StackComponent.Companion.serializer(), vVar14);
                        }
                        break;
                    case 318201406:
                        if (a10.equals("tab_control_button")) {
                            C6538b d22 = hVar.d();
                            String vVar15 = n10.toString();
                            d22.a();
                            return (PaywallComponent) d22.b(TabControlButtonComponent.Companion.serializer(), vVar15);
                        }
                        break;
                    case 827585120:
                        if (a10.equals("tab_control_toggle")) {
                            C6538b d23 = hVar.d();
                            String vVar16 = n10.toString();
                            d23.a();
                            return (PaywallComponent) d23.b(TabControlToggleComponent.Companion.serializer(), vVar16);
                        }
                        break;
                }
            }
            lh.i iVar2 = (lh.i) n10.get("fallback");
            if (iVar2 != null) {
                if (iVar2 instanceof v) {
                    vVar2 = (v) iVar2;
                }
                if (!(vVar2 == null || (vVar = vVar2.toString()) == null)) {
                    C6538b d24 = hVar.d();
                    d24.a();
                    PaywallComponent paywallComponent = (PaywallComponent) d24.b(PaywallComponent.Companion.serializer(), vVar);
                    if (paywallComponent != null) {
                        return paywallComponent;
                    }
                }
            }
            throw new C5986j("No fallback provided for unknown type: " + a10);
        }
        throw new C5986j("Can only deserialize PaywallComponent from JSON, got: " + O.b(eVar.getClass()));
    }
}
