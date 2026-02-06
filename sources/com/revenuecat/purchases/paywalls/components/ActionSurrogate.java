package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.paywalls.components.ButtonComponent;
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
import lf.C6535s;

@C5985i
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0003\u0018\u0000 %2\u00020\u0001:\u0002&%B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fB9\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\b\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate;", "", "Lcom/revenuecat/purchases/paywalls/components/ActionTypeSurrogate;", "type", "Lcom/revenuecat/purchases/paywalls/components/DestinationSurrogate;", "destination", "Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;", "url", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/ActionTypeSurrogate;Lcom/revenuecat/purchases/paywalls/components/DestinationSurrogate;Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;)V", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "action", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/ActionTypeSurrogate;Lcom/revenuecat/purchases/paywalls/components/DestinationSurrogate;Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate;Ljh/d;Lih/f;)V", "toAction", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "Lcom/revenuecat/purchases/paywalls/components/ActionTypeSurrogate;", "getType", "()Lcom/revenuecat/purchases/paywalls/components/ActionTypeSurrogate;", "Lcom/revenuecat/purchases/paywalls/components/DestinationSurrogate;", "getDestination", "()Lcom/revenuecat/purchases/paywalls/components/DestinationSurrogate;", "Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;", "getUrl", "()Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ActionSurrogate {
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers = {ActionTypeSurrogate.Companion.serializer(), DestinationSurrogate.Companion.serializer(), null};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final DestinationSurrogate destination;
    private final ActionTypeSurrogate type;
    private final UrlSurrogate url;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return ActionSurrogate$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        static {
            /*
                com.revenuecat.purchases.paywalls.components.DestinationSurrogate[] r0 = com.revenuecat.purchases.paywalls.components.DestinationSurrogate.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.revenuecat.purchases.paywalls.components.DestinationSurrogate r2 = com.revenuecat.purchases.paywalls.components.DestinationSurrogate.customer_center     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                com.revenuecat.purchases.paywalls.components.DestinationSurrogate r3 = com.revenuecat.purchases.paywalls.components.DestinationSurrogate.privacy_policy     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                com.revenuecat.purchases.paywalls.components.DestinationSurrogate r4 = com.revenuecat.purchases.paywalls.components.DestinationSurrogate.terms     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.revenuecat.purchases.paywalls.components.DestinationSurrogate r4 = com.revenuecat.purchases.paywalls.components.DestinationSurrogate.url     // Catch:{ NoSuchFieldError -> 0x002b }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r5 = 4
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                com.revenuecat.purchases.paywalls.components.ActionTypeSurrogate[] r0 = com.revenuecat.purchases.paywalls.components.ActionTypeSurrogate.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.revenuecat.purchases.paywalls.components.ActionTypeSurrogate r4 = com.revenuecat.purchases.paywalls.components.ActionTypeSurrogate.restore_purchases     // Catch:{ NoSuchFieldError -> 0x003c }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                com.revenuecat.purchases.paywalls.components.ActionTypeSurrogate r1 = com.revenuecat.purchases.paywalls.components.ActionTypeSurrogate.navigate_back     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                com.revenuecat.purchases.paywalls.components.ActionTypeSurrogate r1 = com.revenuecat.purchases.paywalls.components.ActionTypeSurrogate.navigate_to     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.ActionSurrogate.WhenMappings.<clinit>():void");
        }
    }

    @C6521e
    public /* synthetic */ ActionSurrogate(int i10, ActionTypeSurrogate actionTypeSurrogate, DestinationSurrogate destinationSurrogate, UrlSurrogate urlSurrogate, t0 t0Var) {
        if (1 != (i10 & 1)) {
            C6456i0.a(i10, 1, ActionSurrogate$$serializer.INSTANCE.getDescriptor());
        }
        this.type = actionTypeSurrogate;
        if ((i10 & 2) == 0) {
            this.destination = null;
        } else {
            this.destination = destinationSurrogate;
        }
        if ((i10 & 4) == 0) {
            this.url = null;
        } else {
            this.url = urlSurrogate;
        }
    }

    public static final /* synthetic */ void write$Self(ActionSurrogate actionSurrogate, d dVar, f fVar) {
        C5978b[] bVarArr = $childSerializers;
        dVar.B(fVar, 0, bVarArr[0], actionSurrogate.type);
        if (dVar.q(fVar, 1) || actionSurrogate.destination != null) {
            dVar.p(fVar, 1, bVarArr[1], actionSurrogate.destination);
        }
        if (dVar.q(fVar, 2) || actionSurrogate.url != null) {
            dVar.p(fVar, 2, UrlSurrogate$$serializer.INSTANCE, actionSurrogate.url);
        }
    }

    public final DestinationSurrogate getDestination() {
        return this.destination;
    }

    public final ActionTypeSurrogate getType() {
        return this.type;
    }

    public final UrlSurrogate getUrl() {
        return this.url;
    }

    public final ButtonComponent.Action toAction() {
        int i10;
        ButtonComponent.Destination destination2;
        int i11 = WhenMappings.$EnumSwitchMapping$1[this.type.ordinal()];
        if (i11 == 1) {
            return ButtonComponent.Action.RestorePurchases.INSTANCE;
        }
        if (i11 == 2) {
            return ButtonComponent.Action.NavigateBack.INSTANCE;
        }
        if (i11 == 3) {
            DestinationSurrogate destinationSurrogate = this.destination;
            if (destinationSurrogate == null) {
                i10 = -1;
            } else {
                i10 = WhenMappings.$EnumSwitchMapping$0[destinationSurrogate.ordinal()];
            }
            if (i10 != -1) {
                if (i10 == 1) {
                    destination2 = ButtonComponent.Destination.CustomerCenter.INSTANCE;
                } else if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new C6535s();
                        } else if (this.url != null) {
                            destination2 = new ButtonComponent.Destination.Url(this.url.m84getUrl_lidz7Tp4o(), this.url.getMethod(), (DefaultConstructorMarker) null);
                        } else {
                            throw new IllegalStateException("`url` cannot be null when `destination` is `url`.");
                        }
                    } else if (this.url != null) {
                        destination2 = new ButtonComponent.Destination.Terms(this.url.m84getUrl_lidz7Tp4o(), this.url.getMethod(), (DefaultConstructorMarker) null);
                    } else {
                        throw new IllegalStateException("`url` cannot be null when `destination` is `terms`.");
                    }
                } else if (this.url != null) {
                    destination2 = new ButtonComponent.Destination.PrivacyPolicy(this.url.m84getUrl_lidz7Tp4o(), this.url.getMethod(), (DefaultConstructorMarker) null);
                } else {
                    throw new IllegalStateException("`url` cannot be null when `destination` is `privacy_policy`.");
                }
                return new ButtonComponent.Action.NavigateTo(destination2);
            }
            throw new IllegalStateException("`destination` cannot be null when `action` is `navigate_to`.");
        }
        throw new C6535s();
    }

    public ActionSurrogate(ActionTypeSurrogate actionTypeSurrogate, DestinationSurrogate destinationSurrogate, UrlSurrogate urlSurrogate) {
        C6496s.h(actionTypeSurrogate, "type");
        this.type = actionTypeSurrogate;
        this.destination = destinationSurrogate;
        this.url = urlSurrogate;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActionSurrogate(ActionTypeSurrogate actionTypeSurrogate, DestinationSurrogate destinationSurrogate, UrlSurrogate urlSurrogate, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionTypeSurrogate, (i10 & 2) != 0 ? null : destinationSurrogate, (i10 & 4) != 0 ? null : urlSurrogate);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionSurrogate(com.revenuecat.purchases.paywalls.components.ButtonComponent.Action r7) {
        /*
            r6 = this;
            java.lang.String r0 = "action"
            kotlin.jvm.internal.C6496s.h(r7, r0)
            boolean r0 = r7 instanceof com.revenuecat.purchases.paywalls.components.ButtonComponent.Action.NavigateBack
            if (r0 == 0) goto L_0x000c
            com.revenuecat.purchases.paywalls.components.ActionTypeSurrogate r1 = com.revenuecat.purchases.paywalls.components.ActionTypeSurrogate.navigate_back
            goto L_0x0019
        L_0x000c:
            boolean r1 = r7 instanceof com.revenuecat.purchases.paywalls.components.ButtonComponent.Action.NavigateTo
            if (r1 == 0) goto L_0x0013
            com.revenuecat.purchases.paywalls.components.ActionTypeSurrogate r1 = com.revenuecat.purchases.paywalls.components.ActionTypeSurrogate.navigate_to
            goto L_0x0019
        L_0x0013:
            boolean r1 = r7 instanceof com.revenuecat.purchases.paywalls.components.ButtonComponent.Action.RestorePurchases
            if (r1 == 0) goto L_0x00d9
            com.revenuecat.purchases.paywalls.components.ActionTypeSurrogate r1 = com.revenuecat.purchases.paywalls.components.ActionTypeSurrogate.restore_purchases
        L_0x0019:
            r2 = 1
            if (r0 == 0) goto L_0x001e
            r3 = r2
            goto L_0x0020
        L_0x001e:
            boolean r3 = r7 instanceof com.revenuecat.purchases.paywalls.components.ButtonComponent.Action.RestorePurchases
        L_0x0020:
            r4 = 0
            if (r3 == 0) goto L_0x0025
            r3 = r4
            goto L_0x004b
        L_0x0025:
            boolean r3 = r7 instanceof com.revenuecat.purchases.paywalls.components.ButtonComponent.Action.NavigateTo
            if (r3 == 0) goto L_0x00d3
            r3 = r7
            com.revenuecat.purchases.paywalls.components.ButtonComponent$Action$NavigateTo r3 = (com.revenuecat.purchases.paywalls.components.ButtonComponent.Action.NavigateTo) r3
            com.revenuecat.purchases.paywalls.components.ButtonComponent$Destination r3 = r3.getDestination()
            boolean r5 = r3 instanceof com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.CustomerCenter
            if (r5 == 0) goto L_0x0037
            com.revenuecat.purchases.paywalls.components.DestinationSurrogate r3 = com.revenuecat.purchases.paywalls.components.DestinationSurrogate.customer_center
            goto L_0x004b
        L_0x0037:
            boolean r5 = r3 instanceof com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.PrivacyPolicy
            if (r5 == 0) goto L_0x003e
            com.revenuecat.purchases.paywalls.components.DestinationSurrogate r3 = com.revenuecat.purchases.paywalls.components.DestinationSurrogate.privacy_policy
            goto L_0x004b
        L_0x003e:
            boolean r5 = r3 instanceof com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.Terms
            if (r5 == 0) goto L_0x0045
            com.revenuecat.purchases.paywalls.components.DestinationSurrogate r3 = com.revenuecat.purchases.paywalls.components.DestinationSurrogate.terms
            goto L_0x004b
        L_0x0045:
            boolean r3 = r3 instanceof com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.Url
            if (r3 == 0) goto L_0x00cd
            com.revenuecat.purchases.paywalls.components.DestinationSurrogate r3 = com.revenuecat.purchases.paywalls.components.DestinationSurrogate.url
        L_0x004b:
            if (r0 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            boolean r2 = r7 instanceof com.revenuecat.purchases.paywalls.components.ButtonComponent.Action.RestorePurchases
        L_0x0050:
            if (r2 == 0) goto L_0x0053
            goto L_0x00bd
        L_0x0053:
            boolean r0 = r7 instanceof com.revenuecat.purchases.paywalls.components.ButtonComponent.Action.NavigateTo
            if (r0 == 0) goto L_0x00c7
            com.revenuecat.purchases.paywalls.components.ButtonComponent$Action$NavigateTo r7 = (com.revenuecat.purchases.paywalls.components.ButtonComponent.Action.NavigateTo) r7
            com.revenuecat.purchases.paywalls.components.ButtonComponent$Destination r0 = r7.getDestination()
            boolean r2 = r0 instanceof com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.CustomerCenter
            if (r2 == 0) goto L_0x0062
            goto L_0x00bd
        L_0x0062:
            boolean r2 = r0 instanceof com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.PrivacyPolicy
            if (r2 == 0) goto L_0x0081
            com.revenuecat.purchases.paywalls.components.UrlSurrogate r0 = new com.revenuecat.purchases.paywalls.components.UrlSurrogate
            com.revenuecat.purchases.paywalls.components.ButtonComponent$Destination r2 = r7.getDestination()
            com.revenuecat.purchases.paywalls.components.ButtonComponent$Destination$PrivacyPolicy r2 = (com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.PrivacyPolicy) r2
            java.lang.String r2 = r2.m61getUrlLidz7Tp4o()
            com.revenuecat.purchases.paywalls.components.ButtonComponent$Destination r7 = r7.getDestination()
            com.revenuecat.purchases.paywalls.components.ButtonComponent$Destination$PrivacyPolicy r7 = (com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.PrivacyPolicy) r7
            com.revenuecat.purchases.paywalls.components.ButtonComponent$UrlMethod r7 = r7.getMethod()
            r0.<init>(r2, r7, r4)
        L_0x007f:
            r4 = r0
            goto L_0x00bd
        L_0x0081:
            boolean r2 = r0 instanceof com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.Terms
            if (r2 == 0) goto L_0x009f
            com.revenuecat.purchases.paywalls.components.UrlSurrogate r0 = new com.revenuecat.purchases.paywalls.components.UrlSurrogate
            com.revenuecat.purchases.paywalls.components.ButtonComponent$Destination r2 = r7.getDestination()
            com.revenuecat.purchases.paywalls.components.ButtonComponent$Destination$Terms r2 = (com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.Terms) r2
            java.lang.String r2 = r2.m65getUrlLidz7Tp4o()
            com.revenuecat.purchases.paywalls.components.ButtonComponent$Destination r7 = r7.getDestination()
            com.revenuecat.purchases.paywalls.components.ButtonComponent$Destination$Terms r7 = (com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.Terms) r7
            com.revenuecat.purchases.paywalls.components.ButtonComponent$UrlMethod r7 = r7.getMethod()
            r0.<init>(r2, r7, r4)
            goto L_0x007f
        L_0x009f:
            boolean r0 = r0 instanceof com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.Url
            if (r0 == 0) goto L_0x00c1
            com.revenuecat.purchases.paywalls.components.UrlSurrogate r0 = new com.revenuecat.purchases.paywalls.components.UrlSurrogate
            com.revenuecat.purchases.paywalls.components.ButtonComponent$Destination r2 = r7.getDestination()
            com.revenuecat.purchases.paywalls.components.ButtonComponent$Destination$Url r2 = (com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.Url) r2
            java.lang.String r2 = r2.m69getUrlLidz7Tp4o()
            com.revenuecat.purchases.paywalls.components.ButtonComponent$Destination r7 = r7.getDestination()
            com.revenuecat.purchases.paywalls.components.ButtonComponent$Destination$Url r7 = (com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.Url) r7
            com.revenuecat.purchases.paywalls.components.ButtonComponent$UrlMethod r7 = r7.getMethod()
            r0.<init>(r2, r7, r4)
            goto L_0x007f
        L_0x00bd:
            r6.<init>(r1, r3, r4)
            return
        L_0x00c1:
            lf.s r7 = new lf.s
            r7.<init>()
            throw r7
        L_0x00c7:
            lf.s r7 = new lf.s
            r7.<init>()
            throw r7
        L_0x00cd:
            lf.s r7 = new lf.s
            r7.<init>()
            throw r7
        L_0x00d3:
            lf.s r7 = new lf.s
            r7.<init>()
            throw r7
        L_0x00d9:
            lf.s r7 = new lf.s
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.ActionSurrogate.<init>(com.revenuecat.purchases.paywalls.components.ButtonComponent$Action):void");
    }
}
