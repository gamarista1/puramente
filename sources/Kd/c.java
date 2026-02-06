package Kd;

import android.graphics.Matrix;
import android.util.Size;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private Size f51519a;

    /* renamed from: b  reason: collision with root package name */
    private Size f51520b;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f51521a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f51522b;

        /* JADX WARNING: Can't wrap try/catch for region: R(71:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|(3:87|88|90)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(72:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|(3:87|88|90)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(73:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|(3:87|88|90)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(74:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|(3:87|88|90)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(75:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|(3:87|88|90)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(76:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|(3:87|88|90)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(77:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|(3:87|88|90)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(79:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|90) */
        /* JADX WARNING: Can't wrap try/catch for region: R(81:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|90) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0087 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0091 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x009b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00a5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00af */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00b9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00c3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00cd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00d9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00e5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00f1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0109 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0115 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0121 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0139 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0145 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0151 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x015d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0169 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x0175 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0181 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x018d */
        static {
            /*
                Kd.a[] r0 = Kd.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f51522b = r0
                r1 = 1
                Kd.a r2 = Kd.a.LEFT_TOP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f51522b     // Catch:{ NoSuchFieldError -> 0x001d }
                Kd.a r3 = Kd.a.LEFT_CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f51522b     // Catch:{ NoSuchFieldError -> 0x0028 }
                Kd.a r4 = Kd.a.LEFT_BOTTOM     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f51522b     // Catch:{ NoSuchFieldError -> 0x0033 }
                Kd.a r5 = Kd.a.CENTER_TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f51522b     // Catch:{ NoSuchFieldError -> 0x003e }
                Kd.a r6 = Kd.a.CENTER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f51522b     // Catch:{ NoSuchFieldError -> 0x0049 }
                Kd.a r7 = Kd.a.CENTER_BOTTOM     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f51522b     // Catch:{ NoSuchFieldError -> 0x0054 }
                Kd.a r8 = Kd.a.RIGHT_TOP     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f51522b     // Catch:{ NoSuchFieldError -> 0x0060 }
                Kd.a r9 = Kd.a.RIGHT_CENTER     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f51522b     // Catch:{ NoSuchFieldError -> 0x006c }
                Kd.a r10 = Kd.a.RIGHT_BOTTOM     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                Kd.b[] r9 = Kd.b.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f51521a = r9
                Kd.b r10 = Kd.b.NONE     // Catch:{ NoSuchFieldError -> 0x007d }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r1 = f51521a     // Catch:{ NoSuchFieldError -> 0x0087 }
                Kd.b r9 = Kd.b.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r0 = f51521a     // Catch:{ NoSuchFieldError -> 0x0091 }
                Kd.b r1 = Kd.b.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0091 }
            L_0x0091:
                int[] r0 = f51521a     // Catch:{ NoSuchFieldError -> 0x009b }
                Kd.b r1 = Kd.b.FIT_START     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                int[] r0 = f51521a     // Catch:{ NoSuchFieldError -> 0x00a5 }
                Kd.b r1 = Kd.b.FIT_END     // Catch:{ NoSuchFieldError -> 0x00a5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a5 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x00a5 }
            L_0x00a5:
                int[] r0 = f51521a     // Catch:{ NoSuchFieldError -> 0x00af }
                Kd.b r1 = Kd.b.LEFT_TOP     // Catch:{ NoSuchFieldError -> 0x00af }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00af }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x00af }
            L_0x00af:
                int[] r0 = f51521a     // Catch:{ NoSuchFieldError -> 0x00b9 }
                Kd.b r1 = Kd.b.LEFT_CENTER     // Catch:{ NoSuchFieldError -> 0x00b9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b9 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x00b9 }
            L_0x00b9:
                int[] r0 = f51521a     // Catch:{ NoSuchFieldError -> 0x00c3 }
                Kd.b r1 = Kd.b.LEFT_BOTTOM     // Catch:{ NoSuchFieldError -> 0x00c3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c3 }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x00c3 }
            L_0x00c3:
                int[] r0 = f51521a     // Catch:{ NoSuchFieldError -> 0x00cd }
                Kd.b r1 = Kd.b.CENTER_TOP     // Catch:{ NoSuchFieldError -> 0x00cd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cd }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x00cd }
            L_0x00cd:
                int[] r0 = f51521a     // Catch:{ NoSuchFieldError -> 0x00d9 }
                Kd.b r1 = Kd.b.CENTER     // Catch:{ NoSuchFieldError -> 0x00d9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d9 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d9 }
            L_0x00d9:
                int[] r0 = f51521a     // Catch:{ NoSuchFieldError -> 0x00e5 }
                Kd.b r1 = Kd.b.CENTER_BOTTOM     // Catch:{ NoSuchFieldError -> 0x00e5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e5 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e5 }
            L_0x00e5:
                int[] r0 = f51521a     // Catch:{ NoSuchFieldError -> 0x00f1 }
                Kd.b r1 = Kd.b.RIGHT_TOP     // Catch:{ NoSuchFieldError -> 0x00f1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f1 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f1 }
            L_0x00f1:
                int[] r0 = f51521a     // Catch:{ NoSuchFieldError -> 0x00fd }
                Kd.b r1 = Kd.b.RIGHT_CENTER     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f51521a     // Catch:{ NoSuchFieldError -> 0x0109 }
                Kd.b r1 = Kd.b.RIGHT_BOTTOM     // Catch:{ NoSuchFieldError -> 0x0109 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0109 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0109 }
            L_0x0109:
                int[] r0 = f51521a     // Catch:{ NoSuchFieldError -> 0x0115 }
                Kd.b r1 = Kd.b.LEFT_TOP_CROP     // Catch:{ NoSuchFieldError -> 0x0115 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0115 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0115 }
            L_0x0115:
                int[] r0 = f51521a     // Catch:{ NoSuchFieldError -> 0x0121 }
                Kd.b r1 = Kd.b.LEFT_CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0121 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0121 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0121 }
            L_0x0121:
                int[] r0 = f51521a     // Catch:{ NoSuchFieldError -> 0x012d }
                Kd.b r1 = Kd.b.LEFT_BOTTOM_CROP     // Catch:{ NoSuchFieldError -> 0x012d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012d }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012d }
            L_0x012d:
                int[] r0 = f51521a     // Catch:{ NoSuchFieldError -> 0x0139 }
                Kd.b r1 = Kd.b.CENTER_TOP_CROP     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                int[] r0 = f51521a     // Catch:{ NoSuchFieldError -> 0x0145 }
                Kd.b r1 = Kd.b.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0145 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0145 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0145 }
            L_0x0145:
                int[] r0 = f51521a     // Catch:{ NoSuchFieldError -> 0x0151 }
                Kd.b r1 = Kd.b.CENTER_BOTTOM_CROP     // Catch:{ NoSuchFieldError -> 0x0151 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0151 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0151 }
            L_0x0151:
                int[] r0 = f51521a     // Catch:{ NoSuchFieldError -> 0x015d }
                Kd.b r1 = Kd.b.RIGHT_TOP_CROP     // Catch:{ NoSuchFieldError -> 0x015d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015d }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015d }
            L_0x015d:
                int[] r0 = f51521a     // Catch:{ NoSuchFieldError -> 0x0169 }
                Kd.b r1 = Kd.b.RIGHT_CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0169 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0169 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0169 }
            L_0x0169:
                int[] r0 = f51521a     // Catch:{ NoSuchFieldError -> 0x0175 }
                Kd.b r1 = Kd.b.RIGHT_BOTTOM_CROP     // Catch:{ NoSuchFieldError -> 0x0175 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0175 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0175 }
            L_0x0175:
                int[] r0 = f51521a     // Catch:{ NoSuchFieldError -> 0x0181 }
                Kd.b r1 = Kd.b.START_INSIDE     // Catch:{ NoSuchFieldError -> 0x0181 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0181 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0181 }
            L_0x0181:
                int[] r0 = f51521a     // Catch:{ NoSuchFieldError -> 0x018d }
                Kd.b r1 = Kd.b.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x018d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x018d }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x018d }
            L_0x018d:
                int[] r0 = f51521a     // Catch:{ NoSuchFieldError -> 0x0199 }
                Kd.b r1 = Kd.b.END_INSIDE     // Catch:{ NoSuchFieldError -> 0x0199 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0199 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0199 }
            L_0x0199:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Kd.c.a.<clinit>():void");
        }
    }

    public c(Size size, Size size2) {
        this.f51519a = size;
        this.f51520b = size2;
    }

    private Matrix a() {
        if (this.f51520b.getHeight() > this.f51519a.getWidth() || this.f51520b.getHeight() > this.f51519a.getHeight()) {
            return c();
        }
        return l(a.CENTER);
    }

    private Matrix b() {
        if (this.f51520b.getHeight() > this.f51519a.getWidth() || this.f51520b.getHeight() > this.f51519a.getHeight()) {
            return d();
        }
        return l(a.RIGHT_BOTTOM);
    }

    private Matrix c() {
        return h(a.CENTER);
    }

    private Matrix d() {
        return h(a.RIGHT_BOTTOM);
    }

    private Matrix e() {
        return h(a.LEFT_TOP);
    }

    private Matrix f() {
        return j(1.0f, 1.0f, a.LEFT_TOP);
    }

    private Matrix g(a aVar) {
        float width = ((float) this.f51519a.getWidth()) / ((float) this.f51520b.getWidth());
        float height = ((float) this.f51519a.getHeight()) / ((float) this.f51520b.getHeight());
        float max = Math.max(width, height);
        return j(max / width, max / height, aVar);
    }

    private Matrix h(a aVar) {
        float width = ((float) this.f51519a.getWidth()) / ((float) this.f51520b.getWidth());
        float height = ((float) this.f51519a.getHeight()) / ((float) this.f51520b.getHeight());
        float min = Math.min(width, height);
        return j(min / width, min / height, aVar);
    }

    private Matrix i(float f10, float f11, float f12, float f13) {
        Matrix matrix = new Matrix();
        matrix.setScale(f10, f11, f12, f13);
        return matrix;
    }

    private Matrix j(float f10, float f11, a aVar) {
        switch (a.f51522b[aVar.ordinal()]) {
            case 1:
                return i(f10, f11, 0.0f, 0.0f);
            case 2:
                return i(f10, f11, 0.0f, ((float) this.f51519a.getHeight()) / 2.0f);
            case 3:
                return i(f10, f11, 0.0f, (float) this.f51519a.getHeight());
            case 4:
                return i(f10, f11, ((float) this.f51519a.getWidth()) / 2.0f, 0.0f);
            case 5:
                return i(f10, f11, ((float) this.f51519a.getWidth()) / 2.0f, ((float) this.f51519a.getHeight()) / 2.0f);
            case 6:
                return i(f10, f11, ((float) this.f51519a.getWidth()) / 2.0f, (float) this.f51519a.getHeight());
            case 7:
                return i(f10, f11, (float) this.f51519a.getWidth(), 0.0f);
            case 8:
                return i(f10, f11, (float) this.f51519a.getWidth(), ((float) this.f51519a.getHeight()) / 2.0f);
            case 9:
                return i(f10, f11, (float) this.f51519a.getWidth(), (float) this.f51519a.getHeight());
            default:
                throw new IllegalArgumentException("Illegal PivotPoint");
        }
    }

    private Matrix k() {
        return j(((float) this.f51520b.getWidth()) / ((float) this.f51519a.getWidth()), ((float) this.f51520b.getHeight()) / ((float) this.f51519a.getHeight()), a.LEFT_TOP);
    }

    private Matrix l(a aVar) {
        return j(((float) this.f51520b.getWidth()) / ((float) this.f51519a.getWidth()), ((float) this.f51520b.getHeight()) / ((float) this.f51519a.getHeight()), aVar);
    }

    private Matrix n() {
        if (this.f51520b.getHeight() > this.f51519a.getWidth() || this.f51520b.getHeight() > this.f51519a.getHeight()) {
            return e();
        }
        return l(a.LEFT_TOP);
    }

    public Matrix m(b bVar) {
        switch (a.f51521a[bVar.ordinal()]) {
            case 1:
                return k();
            case 2:
                return f();
            case 3:
                return c();
            case 4:
                return e();
            case 5:
                return d();
            case 6:
                return l(a.LEFT_TOP);
            case 7:
                return l(a.LEFT_CENTER);
            case 8:
                return l(a.LEFT_BOTTOM);
            case 9:
                return l(a.CENTER_TOP);
            case 10:
                return l(a.CENTER);
            case 11:
                return l(a.CENTER_BOTTOM);
            case 12:
                return l(a.RIGHT_TOP);
            case 13:
                return l(a.RIGHT_CENTER);
            case StdKeyDeserializer.TYPE_URL:
                return l(a.RIGHT_BOTTOM);
            case StdKeyDeserializer.TYPE_CLASS:
                return g(a.LEFT_TOP);
            case 16:
                return g(a.LEFT_CENTER);
            case 17:
                return g(a.LEFT_BOTTOM);
            case 18:
                return g(a.CENTER_TOP);
            case 19:
                return g(a.CENTER);
            case InboxPagingSource.PAGE_SIZE /*20*/:
                return g(a.CENTER_BOTTOM);
            case 21:
                return g(a.RIGHT_TOP);
            case 22:
                return g(a.RIGHT_CENTER);
            case 23:
                return g(a.RIGHT_BOTTOM);
            case 24:
                return n();
            case 25:
                return a();
            case 26:
                return b();
            default:
                return null;
        }
    }
}
