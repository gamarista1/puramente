package io.intercom.android.sdk.m5.home.ui.components;

import C.C1092j;
import Y.C1500m;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.SpaceItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class SpacesCardKt$SpacesCard$1 implements q {
    final /* synthetic */ HomeCards.HomeSpacesData $homeSpacesData;
    final /* synthetic */ C6798l $onItemClick;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                io.intercom.android.sdk.m5.home.data.SpaceItemType[] r0 = io.intercom.android.sdk.m5.home.data.SpaceItemType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.m5.home.data.SpaceItemType r1 = io.intercom.android.sdk.m5.home.data.SpaceItemType.MESSAGES     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.m5.home.data.SpaceItemType r1 = io.intercom.android.sdk.m5.home.data.SpaceItemType.HELP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                io.intercom.android.sdk.m5.home.data.SpaceItemType r1 = io.intercom.android.sdk.m5.home.data.SpaceItemType.TICKETS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.home.ui.components.SpacesCardKt$SpacesCard$1.WhenMappings.<clinit>():void");
        }
    }

    SpacesCardKt$SpacesCard$1(HomeCards.HomeSpacesData homeSpacesData, C6798l lVar) {
        this.$homeSpacesData = homeSpacesData;
        this.$onItemClick = lVar;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$4$lambda$3$lambda$2$lambda$1(C6798l lVar, SpaceItem spaceItem) {
        C6496s.h(lVar, "$onItemClick");
        C6496s.h(spaceItem, "$item");
        lVar.invoke(spaceItem.getType());
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1092j) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(C.C1092j r23, Y.C1500m r24, int r25) {
        /*
            r22 = this;
            r0 = r22
            r13 = r24
            r14 = 1
            java.lang.String r1 = "$this$IntercomCard"
            r2 = r23
            kotlin.jvm.internal.C6496s.h(r2, r1)
            r1 = r25 & 81
            r15 = 16
            if (r1 != r15) goto L_0x001e
            boolean r1 = r24.i()
            if (r1 != 0) goto L_0x0019
            goto L_0x001e
        L_0x0019:
            r24.I()
            goto L_0x01a3
        L_0x001e:
            io.intercom.android.sdk.m5.home.data.HomeCards$HomeSpacesData r1 = r0.$homeSpacesData
            yf.l r12 = r0.$onItemClick
            k0.i$a r2 = k0.i.f23074a
            C.c r3 = C.C1085c.f882a
            C.c$m r3 = r3.g()
            k0.c$a r4 = k0.c.f23044a
            k0.c$b r4 = r4.k()
            r11 = 0
            H0.F r3 = C.C1090h.a(r3, r4, r13, r11)
            int r4 = Y.C1494j.a(r13, r11)
            Y.y r5 = r24.p()
            k0.i r2 = k0.h.e(r13, r2)
            J0.g$a r6 = J0.C1241g.f3853J
            yf.a r7 = r6.a()
            Y.f r8 = r24.j()
            if (r8 != 0) goto L_0x0050
            Y.C1494j.c()
        L_0x0050:
            r24.F()
            boolean r8 = r24.f()
            if (r8 == 0) goto L_0x005d
            r13.U(r7)
            goto L_0x0060
        L_0x005d:
            r24.q()
        L_0x0060:
            Y.m r7 = Y.F1.a(r24)
            yf.p r8 = r6.c()
            Y.F1.b(r7, r3, r8)
            yf.p r3 = r6.e()
            Y.F1.b(r7, r5, r3)
            yf.p r3 = r6.b()
            boolean r5 = r7.f()
            if (r5 != 0) goto L_0x008a
            java.lang.Object r5 = r7.A()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C6496s.c(r5, r8)
            if (r5 != 0) goto L_0x0098
        L_0x008a:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r7.r(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.V(r4, r3)
        L_0x0098:
            yf.p r3 = r6.d()
            Y.F1.b(r7, r2, r3)
            C.k r2 = C.C1093k.f978a
            java.util.List r1 = r1.getSpaceItems()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00b0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00cf
            java.lang.Object r2 = r1.next()
            r3 = r2
            io.intercom.android.sdk.m5.home.data.SpaceItem r3 = (io.intercom.android.sdk.m5.home.data.SpaceItem) r3
            io.intercom.android.sdk.m5.home.data.SpaceItemType[] r4 = io.intercom.android.sdk.m5.home.data.SpaceItemType.values()
            io.intercom.android.sdk.m5.home.data.SpaceItemType r3 = r3.getType()
            boolean r3 = mf.C6559l.W(r4, r3)
            if (r3 == 0) goto L_0x00b0
            r10.add(r2)
            goto L_0x00b0
        L_0x00cf:
            r1 = -1735936299(0xffffffff9887b6d5, float:-3.5081295E-24)
            r13.T(r1)
            java.util.Iterator r16 = r10.iterator()
            r9 = r11
        L_0x00da:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x019d
            java.lang.Object r1 = r16.next()
            int r17 = r9 + 1
            if (r9 >= 0) goto L_0x00eb
            mf.C6565s.x()
        L_0x00eb:
            io.intercom.android.sdk.m5.home.data.SpaceItem r1 = (io.intercom.android.sdk.m5.home.data.SpaceItem) r1
            io.intercom.android.sdk.m5.home.data.SpaceItemType r2 = r1.getType()
            int[] r3 = io.intercom.android.sdk.m5.home.ui.components.SpacesCardKt$SpacesCard$1.WhenMappings.$EnumSwitchMapping$0
            int r2 = r2.ordinal()
            r2 = r3[r2]
            r8 = 2
            if (r2 == r14) goto L_0x010d
            if (r2 == r8) goto L_0x010a
            r3 = 3
            if (r2 != r3) goto L_0x0104
            int r2 = io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon
            goto L_0x010f
        L_0x0104:
            lf.s r1 = new lf.s
            r1.<init>()
            throw r1
        L_0x010a:
            int r2 = io.intercom.android.sdk.R.drawable.intercom_help_centre_icon
            goto L_0x010f
        L_0x010d:
            int r2 = io.intercom.android.sdk.R.drawable.intercom_messages_icon
        L_0x010f:
            java.lang.String r6 = r1.getLabel()
            io.intercom.android.sdk.m5.home.data.Badge r3 = r1.getBadge()
            io.intercom.android.sdk.m5.home.states.HomeItemBadge r18 = io.intercom.android.sdk.m5.home.reducers.HomeItemBadgeReducerKt.reduceHomeItemBadge(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = -1302667345(0xffffffffb25adfaf, float:-1.274013E-8)
            r13.T(r3)
            boolean r3 = r13.S(r12)
            boolean r4 = r13.S(r1)
            r3 = r3 | r4
            java.lang.Object r4 = r24.A()
            if (r3 != 0) goto L_0x013c
            Y.m$a r3 = Y.C1500m.f10026a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x0144
        L_0x013c:
            io.intercom.android.sdk.m5.home.ui.components.s r4 = new io.intercom.android.sdk.m5.home.ui.components.s
            r4.<init>(r12, r1)
            r13.r(r4)
        L_0x0144:
            r19 = r4
            yf.a r19 = (yf.C6787a) r19
            r24.M()
            r20 = 0
            r21 = 93
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = r18
            r15 = r9
            r9 = r19
            r18 = r10
            r10 = r24
            r11 = r20
            r19 = r12
            r12 = r21
            io.intercom.android.sdk.m5.components.HomeItemKt.HomeItem(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = -1735917837(0xffffffff9887fef3, float:-3.5154115E-24)
            r13.T(r1)
            int r1 = r18.size()
            int r1 = r1 - r14
            if (r15 == r1) goto L_0x018d
            k0.i$a r1 = k0.i.f23074a
            r2 = 0
            r3 = 0
            k0.i r1 = androidx.compose.foundation.layout.q.h(r1, r2, r14, r3)
            r4 = 16
            float r5 = (float) r4
            float r5 = c1.h.j(r5)
            r6 = 2
            k0.i r1 = androidx.compose.foundation.layout.n.k(r1, r5, r2, r6, r3)
            r2 = 6
            r3 = 0
            io.intercom.android.sdk.ui.component.IntercomDividerKt.IntercomDivider(r1, r13, r2, r3)
            goto L_0x0190
        L_0x018d:
            r3 = 0
            r4 = 16
        L_0x0190:
            r24.M()
            r11 = r3
            r15 = r4
            r9 = r17
            r10 = r18
            r12 = r19
            goto L_0x00da
        L_0x019d:
            r24.M()
            r24.u()
        L_0x01a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.home.ui.components.SpacesCardKt$SpacesCard$1.invoke(C.j, Y.m, int):void");
    }
}
