package com.facebook.react.uimanager;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.view.C1680b0;
import com.facebook.react.C3367m;
import com.facebook.react.C3370p;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import f8.C3519a;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k8.C3676a;
import y1.B;
import y1.C2930A;

public class I extends G1.a {

    /* renamed from: s  reason: collision with root package name */
    private static int f41425s = 1056964608;

    /* renamed from: t  reason: collision with root package name */
    private static final int f41426t = 2;

    /* renamed from: u  reason: collision with root package name */
    public static final HashMap f41427u;

    /* renamed from: n  reason: collision with root package name */
    private final View f41428n;

    /* renamed from: o  reason: collision with root package name */
    private final d f41429o;

    /* renamed from: p  reason: collision with root package name */
    private Handler f41430p = new a();

    /* renamed from: q  reason: collision with root package name */
    private final HashMap f41431q = new HashMap();

    /* renamed from: r  reason: collision with root package name */
    View f41432r;

    class a extends Handler {
        a() {
        }

        public void handleMessage(Message message) {
            ((View) message.obj).sendAccessibilityEvent(4);
        }
    }

    class b extends com.facebook.react.uimanager.events.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WritableMap f41434a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i10, int i11, WritableMap writableMap) {
            super(i10, i11);
            this.f41434a = writableMap;
        }

        /* access modifiers changed from: protected */
        public WritableMap getEventData() {
            return this.f41434a;
        }

        public String getEventName() {
            return "topAccessibilityAction";
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f41436a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f41437b;

        /* JADX WARNING: Can't wrap try/catch for region: R(130:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|(2:69|70)|71|(2:73|74)|75|(2:77|78)|79|(2:81|82)|83|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|(3:173|174|176)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(131:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|(2:69|70)|71|(2:73|74)|75|(2:77|78)|79|(2:81|82)|83|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|(3:173|174|176)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(132:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|(2:69|70)|71|(2:73|74)|75|(2:77|78)|79|81|82|83|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|(3:173|174|176)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(133:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|(2:69|70)|71|(2:73|74)|75|(2:77|78)|79|81|82|83|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|(3:173|174|176)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(134:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|(2:69|70)|71|(2:73|74)|75|77|78|79|81|82|83|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|(3:173|174|176)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(135:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|(2:69|70)|71|(2:73|74)|75|77|78|79|81|82|83|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|(3:173|174|176)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(137:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|(2:69|70)|71|(2:73|74)|75|77|78|79|81|82|83|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|176) */
        /* JADX WARNING: Can't wrap try/catch for region: R(138:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|(2:69|70)|71|73|74|75|77|78|79|81|82|83|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|176) */
        /* JADX WARNING: Can't wrap try/catch for region: R(139:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|29|30|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|(2:69|70)|71|73|74|75|77|78|79|81|82|83|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|176) */
        /* JADX WARNING: Can't wrap try/catch for region: R(140:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|29|30|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|69|70|71|73|74|75|77|78|79|81|82|83|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|176) */
        /* JADX WARNING: Can't wrap try/catch for region: R(141:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|69|70|71|73|74|75|77|78|79|81|82|83|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|176) */
        /* JADX WARNING: Can't wrap try/catch for region: R(142:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|65|66|67|69|70|71|73|74|75|77|78|79|81|82|83|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|176) */
        /* JADX WARNING: Can't wrap try/catch for region: R(143:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|65|66|67|69|70|71|73|74|75|77|78|79|81|82|83|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|176) */
        /* JADX WARNING: Can't wrap try/catch for region: R(144:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|61|62|63|65|66|67|69|70|71|73|74|75|77|78|79|81|82|83|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|176) */
        /* JADX WARNING: Can't wrap try/catch for region: R(145:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|61|62|63|65|66|67|69|70|71|73|74|75|77|78|79|81|82|83|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|176) */
        /* JADX WARNING: Can't wrap try/catch for region: R(147:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|57|58|59|61|62|63|65|66|67|69|70|71|73|74|75|77|78|79|81|82|83|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|176) */
        /* JADX WARNING: Can't wrap try/catch for region: R(148:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|57|58|59|61|62|63|65|66|67|69|70|71|73|74|75|77|78|79|81|82|83|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|176) */
        /* JADX WARNING: Can't wrap try/catch for region: R(150:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|53|54|55|57|58|59|61|62|63|65|66|67|69|70|71|73|74|75|77|78|79|81|82|83|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|176) */
        /* JADX WARNING: Can't wrap try/catch for region: R(151:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|(2:49|50)|51|53|54|55|57|58|59|61|62|63|65|66|67|69|70|71|73|74|75|77|78|79|81|82|83|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|176) */
        /* JADX WARNING: Can't wrap try/catch for region: R(152:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|49|50|51|53|54|55|57|58|59|61|62|63|65|66|67|69|70|71|73|74|75|77|78|79|81|82|83|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|176) */
        /* JADX WARNING: Can't wrap try/catch for region: R(153:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|(2:45|46)|47|49|50|51|53|54|55|57|58|59|61|62|63|65|66|67|69|70|71|73|74|75|77|78|79|81|82|83|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|176) */
        /* JADX WARNING: Can't wrap try/catch for region: R(154:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|49|50|51|53|54|55|57|58|59|61|62|63|65|66|67|69|70|71|73|74|75|77|78|79|81|82|83|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|176) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x0153 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x015d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x0167 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x0171 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x017b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x0185 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:113:0x018f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x0199 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x01a3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:119:0x01ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:121:0x01b7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:123:0x01c1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:125:0x01cb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:127:0x01d5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:129:0x01e1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x01eb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x01f5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:135:0x01ff */
        /* JADX WARNING: Missing exception handler attribute for start block: B:137:0x0209 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:139:0x0213 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:141:0x021d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:143:0x0229 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:145:0x0235 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x0241 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:149:0x024d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:151:0x0259 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:153:0x0265 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:155:0x0271 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:157:0x027d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:159:0x0289 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:161:0x0295 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:163:0x02a1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:165:0x02ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:167:0x02b9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:169:0x02c5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:171:0x02d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:173:0x02dd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x0120 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x0149 */
        static {
            /*
                com.facebook.react.uimanager.I$f[] r0 = com.facebook.react.uimanager.I.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f41437b = r0
                r1 = 1
                com.facebook.react.uimanager.I$f r2 = com.facebook.react.uimanager.I.f.ALERT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f41437b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.uimanager.I$f r3 = com.facebook.react.uimanager.I.f.BUTTON     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f41437b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.uimanager.I$f r4 = com.facebook.react.uimanager.I.f.CHECKBOX     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f41437b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.react.uimanager.I$f r5 = com.facebook.react.uimanager.I.f.COMBOBOX     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f41437b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.react.uimanager.I$f r6 = com.facebook.react.uimanager.I.f.GRID     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f41437b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facebook.react.uimanager.I$f r7 = com.facebook.react.uimanager.I.f.HEADING     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f41437b     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.facebook.react.uimanager.I$f r8 = com.facebook.react.uimanager.I.f.IMG     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f41437b     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.facebook.react.uimanager.I$f r9 = com.facebook.react.uimanager.I.f.LINK     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f41437b     // Catch:{ NoSuchFieldError -> 0x006c }
                com.facebook.react.uimanager.I$f r10 = com.facebook.react.uimanager.I.f.LIST     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                r9 = 10
                int[] r10 = f41437b     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.facebook.react.uimanager.I$f r11 = com.facebook.react.uimanager.I.f.MENU     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r10[r11] = r9     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                r10 = 11
                int[] r11 = f41437b     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.facebook.react.uimanager.I$f r12 = com.facebook.react.uimanager.I.f.MENUBAR     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11[r12] = r10     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                r11 = 12
                int[] r12 = f41437b     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.facebook.react.uimanager.I$f r13 = com.facebook.react.uimanager.I.f.MENUITEM     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r12[r13] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                r12 = 13
                int[] r13 = f41437b     // Catch:{ NoSuchFieldError -> 0x009c }
                com.facebook.react.uimanager.I$f r14 = com.facebook.react.uimanager.I.f.NONE     // Catch:{ NoSuchFieldError -> 0x009c }
                int r14 = r14.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r13[r14] = r12     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                r13 = 14
                int[] r14 = f41437b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.facebook.react.uimanager.I$f r15 = com.facebook.react.uimanager.I.f.PROGRESSBAR     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r15 = r15.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r14[r15] = r13     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                r14 = 15
                int[] r15 = f41437b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.facebook.react.uimanager.I$f r16 = com.facebook.react.uimanager.I.f.RADIO     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r15[r16] = r14     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                r15 = 16
                int[] r16 = f41437b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.facebook.react.uimanager.I$f r17 = com.facebook.react.uimanager.I.f.RADIOGROUP     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r17 = r17.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r16[r17] = r15     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                r16 = 17
                int[] r17 = f41437b     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.facebook.react.uimanager.I$f r18 = com.facebook.react.uimanager.I.f.SCROLLBAR     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r18 = r18.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r17[r18] = r16     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                r17 = 18
                int[] r18 = f41437b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.facebook.react.uimanager.I$f r19 = com.facebook.react.uimanager.I.f.SEARCHBOX     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r19 = r19.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r18[r19] = r17     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                r18 = 19
                int[] r19 = f41437b     // Catch:{ NoSuchFieldError -> 0x00e4 }
                com.facebook.react.uimanager.I$f r20 = com.facebook.react.uimanager.I.f.SLIDER     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r20 = r20.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r19[r20] = r18     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                r19 = 20
                int[] r20 = f41437b     // Catch:{ NoSuchFieldError -> 0x00f0 }
                com.facebook.react.uimanager.I$f r21 = com.facebook.react.uimanager.I.f.SPINBUTTON     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r21 = r21.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r20[r21] = r19     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                r20 = 21
                int[] r21 = f41437b     // Catch:{ NoSuchFieldError -> 0x00fc }
                com.facebook.react.uimanager.I$f r22 = com.facebook.react.uimanager.I.f.SUMMARY     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r22 = r22.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r21[r22] = r20     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                r21 = 22
                int[] r22 = f41437b     // Catch:{ NoSuchFieldError -> 0x0108 }
                com.facebook.react.uimanager.I$f r23 = com.facebook.react.uimanager.I.f.SWITCH     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r23 = r23.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r22[r23] = r21     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r22 = f41437b     // Catch:{ NoSuchFieldError -> 0x0114 }
                com.facebook.react.uimanager.I$f r23 = com.facebook.react.uimanager.I.f.TAB     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r23 = r23.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r24 = 23
                r22[r23] = r24     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                int[] r22 = f41437b     // Catch:{ NoSuchFieldError -> 0x0120 }
                com.facebook.react.uimanager.I$f r23 = com.facebook.react.uimanager.I.f.TABLIST     // Catch:{ NoSuchFieldError -> 0x0120 }
                int r23 = r23.ordinal()     // Catch:{ NoSuchFieldError -> 0x0120 }
                r24 = 24
                r22[r23] = r24     // Catch:{ NoSuchFieldError -> 0x0120 }
            L_0x0120:
                int[] r22 = f41437b     // Catch:{ NoSuchFieldError -> 0x012c }
                com.facebook.react.uimanager.I$f r23 = com.facebook.react.uimanager.I.f.TIMER     // Catch:{ NoSuchFieldError -> 0x012c }
                int r23 = r23.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r24 = 25
                r22[r23] = r24     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                int[] r22 = f41437b     // Catch:{ NoSuchFieldError -> 0x0138 }
                com.facebook.react.uimanager.I$f r23 = com.facebook.react.uimanager.I.f.TOOLBAR     // Catch:{ NoSuchFieldError -> 0x0138 }
                int r23 = r23.ordinal()     // Catch:{ NoSuchFieldError -> 0x0138 }
                r24 = 26
                r22[r23] = r24     // Catch:{ NoSuchFieldError -> 0x0138 }
            L_0x0138:
                com.facebook.react.uimanager.I$e[] r15 = com.facebook.react.uimanager.I.e.values()
                int r15 = r15.length
                int[] r15 = new int[r15]
                f41436a = r15
                com.facebook.react.uimanager.I$e r23 = com.facebook.react.uimanager.I.e.BUTTON     // Catch:{ NoSuchFieldError -> 0x0149 }
                int r23 = r23.ordinal()     // Catch:{ NoSuchFieldError -> 0x0149 }
                r15[r23] = r1     // Catch:{ NoSuchFieldError -> 0x0149 }
            L_0x0149:
                int[] r1 = f41436a     // Catch:{ NoSuchFieldError -> 0x0153 }
                com.facebook.react.uimanager.I$e r15 = com.facebook.react.uimanager.I.e.DROPDOWNLIST     // Catch:{ NoSuchFieldError -> 0x0153 }
                int r15 = r15.ordinal()     // Catch:{ NoSuchFieldError -> 0x0153 }
                r1[r15] = r0     // Catch:{ NoSuchFieldError -> 0x0153 }
            L_0x0153:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x015d }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.TOGGLEBUTTON     // Catch:{ NoSuchFieldError -> 0x015d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015d }
            L_0x015d:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x0167 }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.SEARCH     // Catch:{ NoSuchFieldError -> 0x0167 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0167 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0167 }
            L_0x0167:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x0171 }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.IMAGE     // Catch:{ NoSuchFieldError -> 0x0171 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0171 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0171 }
            L_0x0171:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x017b }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.IMAGEBUTTON     // Catch:{ NoSuchFieldError -> 0x017b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x017b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x017b }
            L_0x017b:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x0185 }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.KEYBOARDKEY     // Catch:{ NoSuchFieldError -> 0x0185 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0185 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0185 }
            L_0x0185:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x018f }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.TEXT     // Catch:{ NoSuchFieldError -> 0x018f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x018f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x018f }
            L_0x018f:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x0199 }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.ADJUSTABLE     // Catch:{ NoSuchFieldError -> 0x0199 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0199 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0199 }
            L_0x0199:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x01a3 }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.CHECKBOX     // Catch:{ NoSuchFieldError -> 0x01a3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a3 }
                r0[r1] = r9     // Catch:{ NoSuchFieldError -> 0x01a3 }
            L_0x01a3:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x01ad }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.RADIO     // Catch:{ NoSuchFieldError -> 0x01ad }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ad }
                r0[r1] = r10     // Catch:{ NoSuchFieldError -> 0x01ad }
            L_0x01ad:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x01b7 }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.SPINBUTTON     // Catch:{ NoSuchFieldError -> 0x01b7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b7 }
                r0[r1] = r11     // Catch:{ NoSuchFieldError -> 0x01b7 }
            L_0x01b7:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x01c1 }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.SWITCH     // Catch:{ NoSuchFieldError -> 0x01c1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c1 }
                r0[r1] = r12     // Catch:{ NoSuchFieldError -> 0x01c1 }
            L_0x01c1:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x01cb }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.LIST     // Catch:{ NoSuchFieldError -> 0x01cb }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01cb }
                r0[r1] = r13     // Catch:{ NoSuchFieldError -> 0x01cb }
            L_0x01cb:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x01d5 }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.GRID     // Catch:{ NoSuchFieldError -> 0x01d5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d5 }
                r0[r1] = r14     // Catch:{ NoSuchFieldError -> 0x01d5 }
            L_0x01d5:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x01e1 }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.SCROLLVIEW     // Catch:{ NoSuchFieldError -> 0x01e1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e1 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01e1 }
            L_0x01e1:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x01eb }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.HORIZONTALSCROLLVIEW     // Catch:{ NoSuchFieldError -> 0x01eb }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01eb }
                r0[r1] = r16     // Catch:{ NoSuchFieldError -> 0x01eb }
            L_0x01eb:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x01f5 }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.PAGER     // Catch:{ NoSuchFieldError -> 0x01f5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01f5 }
                r0[r1] = r17     // Catch:{ NoSuchFieldError -> 0x01f5 }
            L_0x01f5:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x01ff }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.DRAWERLAYOUT     // Catch:{ NoSuchFieldError -> 0x01ff }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ff }
                r0[r1] = r18     // Catch:{ NoSuchFieldError -> 0x01ff }
            L_0x01ff:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x0209 }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.SLIDINGDRAWER     // Catch:{ NoSuchFieldError -> 0x0209 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0209 }
                r0[r1] = r19     // Catch:{ NoSuchFieldError -> 0x0209 }
            L_0x0209:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x0213 }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.ICONMENU     // Catch:{ NoSuchFieldError -> 0x0213 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0213 }
                r0[r1] = r20     // Catch:{ NoSuchFieldError -> 0x0213 }
            L_0x0213:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x021d }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.VIEWGROUP     // Catch:{ NoSuchFieldError -> 0x021d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x021d }
                r0[r1] = r21     // Catch:{ NoSuchFieldError -> 0x021d }
            L_0x021d:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x0229 }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.WEBVIEW     // Catch:{ NoSuchFieldError -> 0x0229 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0229 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0229 }
            L_0x0229:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x0235 }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.NONE     // Catch:{ NoSuchFieldError -> 0x0235 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0235 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0235 }
            L_0x0235:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x0241 }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.LINK     // Catch:{ NoSuchFieldError -> 0x0241 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0241 }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0241 }
            L_0x0241:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x024d }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.SUMMARY     // Catch:{ NoSuchFieldError -> 0x024d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x024d }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x024d }
            L_0x024d:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x0259 }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.HEADER     // Catch:{ NoSuchFieldError -> 0x0259 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0259 }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0259 }
            L_0x0259:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x0265 }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.ALERT     // Catch:{ NoSuchFieldError -> 0x0265 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0265 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0265 }
            L_0x0265:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x0271 }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.COMBOBOX     // Catch:{ NoSuchFieldError -> 0x0271 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0271 }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0271 }
            L_0x0271:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x027d }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.MENU     // Catch:{ NoSuchFieldError -> 0x027d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x027d }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x027d }
            L_0x027d:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x0289 }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.MENUBAR     // Catch:{ NoSuchFieldError -> 0x0289 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0289 }
                r2 = 31
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0289 }
            L_0x0289:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x0295 }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.MENUITEM     // Catch:{ NoSuchFieldError -> 0x0295 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0295 }
                r2 = 32
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0295 }
            L_0x0295:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x02a1 }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.PROGRESSBAR     // Catch:{ NoSuchFieldError -> 0x02a1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02a1 }
                r2 = 33
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02a1 }
            L_0x02a1:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x02ad }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.RADIOGROUP     // Catch:{ NoSuchFieldError -> 0x02ad }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02ad }
                r2 = 34
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02ad }
            L_0x02ad:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x02b9 }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.SCROLLBAR     // Catch:{ NoSuchFieldError -> 0x02b9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02b9 }
                r2 = 35
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02b9 }
            L_0x02b9:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x02c5 }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.TAB     // Catch:{ NoSuchFieldError -> 0x02c5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02c5 }
                r2 = 36
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02c5 }
            L_0x02c5:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x02d1 }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.TABLIST     // Catch:{ NoSuchFieldError -> 0x02d1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02d1 }
                r2 = 37
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02d1 }
            L_0x02d1:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x02dd }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.TIMER     // Catch:{ NoSuchFieldError -> 0x02dd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02dd }
                r2 = 38
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02dd }
            L_0x02dd:
                int[] r0 = f41436a     // Catch:{ NoSuchFieldError -> 0x02e9 }
                com.facebook.react.uimanager.I$e r1 = com.facebook.react.uimanager.I.e.TOOLBAR     // Catch:{ NoSuchFieldError -> 0x02e9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02e9 }
                r2 = 39
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02e9 }
            L_0x02e9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.I.c.<clinit>():void");
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private final List f41438a;

        private static class a {

            /* renamed from: a  reason: collision with root package name */
            public String f41439a;

            /* renamed from: b  reason: collision with root package name */
            public int f41440b;

            /* renamed from: c  reason: collision with root package name */
            public int f41441c;

            /* renamed from: d  reason: collision with root package name */
            public int f41442d;

            private a() {
            }
        }

        public d(ClickableSpan[] clickableSpanArr, Spannable spannable) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < clickableSpanArr.length; i10++) {
                ClickableSpan clickableSpan = clickableSpanArr[i10];
                int spanStart = spannable.getSpanStart(clickableSpan);
                int spanEnd = spannable.getSpanEnd(clickableSpan);
                if (spanStart != spanEnd && spanStart >= 0 && spanEnd >= 0 && spanStart <= spannable.length() && spanEnd <= spannable.length()) {
                    a aVar = new a();
                    aVar.f41439a = spannable.subSequence(spanStart, spanEnd).toString();
                    aVar.f41440b = spanStart;
                    aVar.f41441c = spanEnd;
                    aVar.f41442d = (clickableSpanArr.length - 1) - i10;
                    arrayList.add(aVar);
                }
            }
            this.f41438a = arrayList;
        }

        public a a(int i10) {
            for (a aVar : this.f41438a) {
                if (aVar.f41442d == i10) {
                    return aVar;
                }
            }
            return null;
        }

        public a b(int i10, int i11) {
            for (a aVar : this.f41438a) {
                if (aVar.f41440b == i10 && aVar.f41441c == i11) {
                    return aVar;
                }
            }
            return null;
        }

        public int c() {
            return this.f41438a.size();
        }
    }

    public enum e {
        NONE,
        BUTTON,
        DROPDOWNLIST,
        TOGGLEBUTTON,
        LINK,
        SEARCH,
        IMAGE,
        IMAGEBUTTON,
        KEYBOARDKEY,
        TEXT,
        ADJUSTABLE,
        SUMMARY,
        HEADER,
        ALERT,
        CHECKBOX,
        COMBOBOX,
        MENU,
        MENUBAR,
        MENUITEM,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        SCROLLBAR,
        SPINBUTTON,
        SWITCH,
        TAB,
        TABLIST,
        TIMER,
        LIST,
        GRID,
        PAGER,
        SCROLLVIEW,
        HORIZONTALSCROLLVIEW,
        VIEWGROUP,
        WEBVIEW,
        DRAWERLAYOUT,
        SLIDINGDRAWER,
        ICONMENU,
        TOOLBAR;

        public static e b(f fVar) {
            switch (c.f41437b[fVar.ordinal()]) {
                case 1:
                    return ALERT;
                case 2:
                    return BUTTON;
                case 3:
                    return CHECKBOX;
                case 4:
                    return COMBOBOX;
                case 5:
                    return GRID;
                case 6:
                    return HEADER;
                case 7:
                    return IMAGE;
                case 8:
                    return LINK;
                case 9:
                    return LIST;
                case 10:
                    return MENU;
                case 11:
                    return MENUBAR;
                case 12:
                    return MENUITEM;
                case 13:
                    return NONE;
                case StdKeyDeserializer.TYPE_URL /*14*/:
                    return PROGRESSBAR;
                case StdKeyDeserializer.TYPE_CLASS /*15*/:
                    return RADIO;
                case 16:
                    return RADIOGROUP;
                case 17:
                    return SCROLLBAR;
                case 18:
                    return SEARCH;
                case 19:
                    return ADJUSTABLE;
                case InboxPagingSource.PAGE_SIZE /*20*/:
                    return SPINBUTTON;
                case 21:
                    return SUMMARY;
                case 22:
                    return SWITCH;
                case 23:
                    return TAB;
                case 24:
                    return TABLIST;
                case 25:
                    return TIMER;
                case 26:
                    return TOOLBAR;
                default:
                    return null;
            }
        }

        public static e c(String str) {
            if (str == null) {
                return NONE;
            }
            for (e eVar : values()) {
                if (eVar.name().equalsIgnoreCase(str)) {
                    return eVar;
                }
            }
            throw new IllegalArgumentException("Invalid accessibility role value: " + str);
        }

        public static e e(View view) {
            f fVar = (f) view.getTag(C3367m.f40950z);
            if (fVar != null) {
                return b(fVar);
            }
            return (e) view.getTag(C3367m.f40931g);
        }

        public static String f(e eVar) {
            switch (c.f41436a[eVar.ordinal()]) {
                case 1:
                    return "android.widget.Button";
                case 2:
                    return "android.widget.Spinner";
                case 3:
                    return "android.widget.ToggleButton";
                case 4:
                    return "android.widget.EditText";
                case 5:
                    return "android.widget.ImageView";
                case 6:
                    return "android.widget.ImageButton";
                case 7:
                    return "android.inputmethodservice.Keyboard$Key";
                case 8:
                    return "android.widget.TextView";
                case 9:
                    return "android.widget.SeekBar";
                case 10:
                    return "android.widget.CheckBox";
                case 11:
                    return "android.widget.RadioButton";
                case 12:
                    return "android.widget.SpinButton";
                case 13:
                    return "android.widget.Switch";
                case StdKeyDeserializer.TYPE_URL /*14*/:
                    return "android.widget.AbsListView";
                case StdKeyDeserializer.TYPE_CLASS /*15*/:
                    return "android.widget.GridView";
                case 16:
                    return "android.widget.ScrollView";
                case 17:
                    return "android.widget.HorizontalScrollView";
                case 18:
                    return "androidx.viewpager.widget.ViewPager";
                case 19:
                    return "androidx.drawerlayout.widget.DrawerLayout";
                case InboxPagingSource.PAGE_SIZE /*20*/:
                    return "android.widget.SlidingDrawer";
                case 21:
                    return "com.android.internal.view.menu.IconMenuView";
                case 22:
                    return "android.view.ViewGroup";
                case 23:
                    return "android.webkit.WebView";
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case com.amazon.c.a.a.c.f37660h:
                case CharsToNameCanonicalizer.HASH_MULT /*33*/:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                    return "android.view.View";
                default:
                    throw new IllegalArgumentException("Invalid accessibility role value: " + eVar);
            }
        }
    }

    public enum f {
        ALERT,
        ALERTDIALOG,
        APPLICATION,
        ARTICLE,
        BANNER,
        BUTTON,
        CELL,
        CHECKBOX,
        COLUMNHEADER,
        COMBOBOX,
        COMPLEMENTARY,
        CONTENTINFO,
        DEFINITION,
        DIALOG,
        DIRECTORY,
        DOCUMENT,
        FEED,
        FIGURE,
        FORM,
        GRID,
        GROUP,
        HEADING,
        IMG,
        LINK,
        LIST,
        LISTITEM,
        LOG,
        MAIN,
        MARQUEE,
        MATH,
        MENU,
        MENUBAR,
        MENUITEM,
        METER,
        NAVIGATION,
        NONE,
        NOTE,
        OPTION,
        PRESENTATION,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        REGION,
        ROW,
        ROWGROUP,
        ROWHEADER,
        SCROLLBAR,
        SEARCHBOX,
        SEPARATOR,
        SLIDER,
        SPINBUTTON,
        STATUS,
        SUMMARY,
        SWITCH,
        TAB,
        TABLE,
        TABLIST,
        TABPANEL,
        TERM,
        TIMER,
        TOOLBAR,
        TOOLTIP,
        TREE,
        TREEGRID,
        TREEITEM;

        public static f b(String str) {
            for (f fVar : values()) {
                if (fVar.name().equalsIgnoreCase(str)) {
                    return fVar;
                }
            }
            return null;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f41427u = hashMap;
        hashMap.put("activate", Integer.valueOf(C2930A.a.f28602i.b()));
        hashMap.put("longpress", Integer.valueOf(C2930A.a.f28603j.b()));
        hashMap.put("increment", Integer.valueOf(C2930A.a.f28610q.b()));
        hashMap.put("decrement", Integer.valueOf(C2930A.a.f28611r.b()));
        hashMap.put("expand", Integer.valueOf(C2930A.a.f28616w.b()));
        hashMap.put("collapse", Integer.valueOf(C2930A.a.f28617x.b()));
    }

    public I(View view, boolean z10, int i10) {
        super(view);
        this.f41428n = view;
        view.setFocusable(z10);
        C1680b0.y0(view, i10);
        this.f41429o = (d) view.getTag(C3367m.f40930f);
    }

    public static C2930A L(View view) {
        if (view == null) {
            return null;
        }
        C2930A f02 = C2930A.f0();
        try {
            C1680b0.b0(view, f02);
            return f02;
        } catch (NullPointerException unused) {
            if (f02 != null) {
                f02.j0();
            }
            return null;
        }
    }

    private Rect M(d.a aVar) {
        float f10;
        View view = this.f41428n;
        boolean z10 = false;
        if (!(view instanceof TextView)) {
            return new Rect(0, 0, this.f41428n.getWidth(), this.f41428n.getHeight());
        }
        TextView textView = (TextView) view;
        Layout layout = textView.getLayout();
        if (layout == null) {
            return new Rect(0, 0, textView.getWidth(), textView.getHeight());
        }
        double d10 = (double) aVar.f41440b;
        double d11 = (double) aVar.f41441c;
        int i10 = (int) d10;
        int lineForOffset = layout.getLineForOffset(i10);
        if (d10 > ((double) layout.getLineEnd(lineForOffset))) {
            return null;
        }
        Rect rect = new Rect();
        double primaryHorizontal = (double) layout.getPrimaryHorizontal(i10);
        Paint paint = new Paint();
        AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) N(aVar.f41440b, aVar.f41441c, AbsoluteSizeSpan.class);
        if (absoluteSizeSpan != null) {
            f10 = (float) absoluteSizeSpan.getSize();
        } else {
            f10 = textView.getTextSize();
        }
        paint.setTextSize(f10);
        int ceil = (int) Math.ceil((double) paint.measureText(aVar.f41439a));
        if (lineForOffset != layout.getLineForOffset((int) d11)) {
            z10 = true;
        }
        layout.getLineBounds(lineForOffset, rect);
        int scrollY = textView.getScrollY() + textView.getTotalPaddingTop();
        rect.top += scrollY;
        rect.bottom += scrollY;
        rect.left = (int) (((double) rect.left) + ((primaryHorizontal + ((double) textView.getTotalPaddingLeft())) - ((double) textView.getScrollX())));
        if (z10) {
            return new Rect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int i11 = rect.left;
        return new Rect(i11, rect.top, ceil + i11, rect.bottom);
    }

    public static CharSequence O(View view, C2930A a10) {
        C2930A a11;
        if (a10 == null) {
            a11 = L(view);
        } else {
            a11 = C2930A.h0(a10);
        }
        if (a11 == null) {
            return null;
        }
        try {
            CharSequence u10 = a11.u();
            CharSequence F10 = a11.F();
            boolean isEmpty = TextUtils.isEmpty(F10);
            boolean z10 = view instanceof EditText;
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(u10) && (!z10 || isEmpty)) {
                sb2.append(u10);
                return sb2;
            } else if (!isEmpty) {
                sb2.append(F10);
                a11.j0();
                return sb2;
            } else if (view instanceof ViewGroup) {
                StringBuilder sb3 = new StringBuilder();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    C2930A f02 = C2930A.f0();
                    C1680b0.b0(childAt, f02);
                    if (V(f02, childAt) && !T(f02, childAt)) {
                        CharSequence O10 = O(childAt, (C2930A) null);
                        if (!TextUtils.isEmpty(O10)) {
                            sb3.append(O10 + ", ");
                        }
                    }
                    f02.j0();
                }
                String W10 = W(sb3);
                a11.j0();
                return W10;
            } else {
                a11.j0();
                return null;
            }
        } finally {
            a11.j0();
        }
    }

    public static boolean P(C2930A a10, View view) {
        if (!(a10 == null || view == null || !(view instanceof ViewGroup))) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    boolean f02 = C2930A.f0();
                    try {
                        C1680b0.b0(childAt, f02);
                        if (f02.e0()) {
                            if (!T(f02, childAt)) {
                                f02 = V(f02, childAt);
                                if (f02) {
                                    f02.j0();
                                    return true;
                                }
                            }
                        }
                    } finally {
                        if (f02 != null) {
                            f02.j0();
                        }
                    }
                }
            }
        }
        return false;
    }

    private static boolean Q(C2930A a10) {
        if (a10 == null || (TextUtils.isEmpty(a10.E()) && !a10.N() && !S(a10))) {
            return false;
        }
        return true;
    }

    public static boolean R(C2930A a10) {
        if (a10 == null || a10.s() != null || (TextUtils.isEmpty(a10.F()) && TextUtils.isEmpty(a10.u()) && TextUtils.isEmpty(a10.x()))) {
            return false;
        }
        return true;
    }

    public static boolean S(C2930A a10) {
        C2930A.g C10;
        if (a10 == null || (C10 = a10.C()) == null) {
            return false;
        }
        float b10 = C10.b();
        float c10 = C10.c();
        float a11 = C10.a();
        if (b10 - c10 <= 0.0f || a11 < c10 || a11 > b10) {
            return false;
        }
        return true;
    }

    public static boolean T(C2930A a10, View view) {
        if (a10 == null || view == null || !a10.e0()) {
            return false;
        }
        if (a10.Z() || U(a10)) {
            return true;
        }
        return false;
    }

    public static boolean U(C2930A a10) {
        if (a10 == null) {
            return false;
        }
        if (a10.P() || a10.X() || a10.T()) {
            return true;
        }
        List i10 = a10.i();
        if (i10.contains(16) || i10.contains(32) || i10.contains(1)) {
            return true;
        }
        return false;
    }

    public static boolean V(C2930A a10, View view) {
        int y10;
        if (a10 == null || view == null || (y10 = C1680b0.y(view)) == 4) {
            return false;
        }
        if (y10 == 2 && a10.p() <= 0) {
            return false;
        }
        if (R(a10) || Q(a10) || a10.N() || P(a10, view)) {
            return true;
        }
        return false;
    }

    private static String W(StringBuilder sb2) {
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - f41426t, length);
        }
        return sb2.toString();
    }

    public static void X(View view, boolean z10, int i10) {
        C1680b0.o0(view, new I(view, z10, i10));
    }

    private void Y(View view) {
        if (this.f41430p.hasMessages(1, view)) {
            this.f41430p.removeMessages(1, view);
        }
        this.f41430p.sendMessageDelayed(this.f41430p.obtainMessage(1, view), 200);
    }

    public static void Z(View view, boolean z10, int i10) {
        if (C1680b0.M(view)) {
            return;
        }
        if (view.getTag(C3367m.f40931g) != null || view.getTag(C3367m.f40932h) != null || view.getTag(C3367m.f40925a) != null || view.getTag(C3367m.f40944t) != null || view.getTag(C3367m.f40927c) != null || view.getTag(C3367m.f40930f) != null || view.getTag(C3367m.f40950z) != null) {
            C1680b0.o0(view, new I(view, z10, i10));
        }
    }

    public static void a0(C2930A a10, e eVar, Context context) {
        if (eVar == null) {
            eVar = e.NONE;
        }
        a10.t0(e.f(eVar));
        if (eVar.equals(e.LINK)) {
            a10.T0(context.getString(C3370p.f41170v));
        } else if (eVar.equals(e.IMAGE)) {
            a10.T0(context.getString(C3370p.f41168t));
        } else if (eVar.equals(e.IMAGEBUTTON)) {
            a10.T0(context.getString(C3370p.f41169u));
            a10.u0(true);
        } else if (eVar.equals(e.BUTTON)) {
            a10.u0(true);
        } else if (eVar.equals(e.TOGGLEBUTTON)) {
            a10.u0(true);
            a10.r0(true);
        } else if (eVar.equals(e.SUMMARY)) {
            a10.T0(context.getString(C3370p.f41145H));
        } else if (eVar.equals(e.HEADER)) {
            a10.E0(true);
        } else if (eVar.equals(e.ALERT)) {
            a10.T0(context.getString(C3370p.f41149a));
        } else if (eVar.equals(e.COMBOBOX)) {
            a10.T0(context.getString(C3370p.f41167s));
        } else if (eVar.equals(e.MENU)) {
            a10.T0(context.getString(C3370p.f41171w));
        } else if (eVar.equals(e.MENUBAR)) {
            a10.T0(context.getString(C3370p.f41172x));
        } else if (eVar.equals(e.MENUITEM)) {
            a10.T0(context.getString(C3370p.f41173y));
        } else if (eVar.equals(e.PROGRESSBAR)) {
            a10.T0(context.getString(C3370p.f41174z));
        } else if (eVar.equals(e.RADIOGROUP)) {
            a10.T0(context.getString(C3370p.f41138A));
        } else if (eVar.equals(e.SCROLLBAR)) {
            a10.T0(context.getString(C3370p.f41140C));
        } else if (eVar.equals(e.SPINBUTTON)) {
            a10.T0(context.getString(C3370p.f41141D));
        } else if (eVar.equals(e.TAB)) {
            a10.T0(context.getString(C3370p.f41139B));
        } else if (eVar.equals(e.TABLIST)) {
            a10.T0(context.getString(C3370p.f41146I));
        } else if (eVar.equals(e.TIMER)) {
            a10.T0(context.getString(C3370p.f41147J));
        } else if (eVar.equals(e.TOOLBAR)) {
            a10.T0(context.getString(C3370p.f41148K));
        }
    }

    private static void b0(C2930A a10, ReadableMap readableMap, Context context) {
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            Dynamic dynamic = readableMap.getDynamic(nextKey);
            if (nextKey.equals("selected") && dynamic.getType() == ReadableType.Boolean) {
                a10.W0(dynamic.asBoolean());
            } else if (nextKey.equals("disabled") && dynamic.getType() == ReadableType.Boolean) {
                a10.A0(!dynamic.asBoolean());
            } else if (nextKey.equals("checked") && dynamic.getType() == ReadableType.Boolean) {
                boolean asBoolean = dynamic.asBoolean();
                a10.r0(true);
                a10.s0(asBoolean);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void C(int i10, C2930A a10) {
        d dVar = this.f41429o;
        if (dVar == null) {
            a10.x0("");
            a10.p0(new Rect(0, 0, 1, 1));
            return;
        }
        d.a a11 = dVar.a(i10);
        if (a11 == null) {
            a10.x0("");
            a10.p0(new Rect(0, 0, 1, 1));
            return;
        }
        Rect M10 = M(a11);
        if (M10 == null) {
            a10.x0("");
            a10.p0(new Rect(0, 0, 1, 1));
            return;
        }
        a10.x0(a11.f41439a);
        a10.a(16);
        a10.p0(M10);
        a10.T0(this.f41428n.getResources().getString(C3370p.f41170v));
        a10.t0(e.f(e.BUTTON));
    }

    /* access modifiers changed from: protected */
    public Object N(int i10, int i11, Class cls) {
        View view = this.f41428n;
        if (!(view instanceof TextView) || !(((TextView) view).getText() instanceof Spanned)) {
            return null;
        }
        Object[] spans = ((Spanned) ((TextView) this.f41428n).getText()).getSpans(i10, i11, cls);
        if (spans.length > 0) {
            return spans[0];
        }
        return null;
    }

    public B getAccessibilityNodeProvider(View view) {
        if (this.f41429o != null) {
            return super.getAccessibilityNodeProvider(view);
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        ReadableType readableType;
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        ReadableMap readableMap = (ReadableMap) view.getTag(C3367m.f40934j);
        if (readableMap != null && readableMap.hasKey("min") && readableMap.hasKey("now") && readableMap.hasKey("max")) {
            Dynamic dynamic = readableMap.getDynamic("min");
            Dynamic dynamic2 = readableMap.getDynamic("now");
            Dynamic dynamic3 = readableMap.getDynamic("max");
            if (dynamic != null && dynamic.getType() == (readableType = ReadableType.Number) && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                int asInt = dynamic.asInt();
                int asInt2 = dynamic2.asInt();
                int asInt3 = dynamic3.asInt();
                if (asInt3 > asInt && asInt2 >= asInt && asInt3 >= asInt2) {
                    accessibilityEvent.setItemCount(asInt3 - asInt);
                    accessibilityEvent.setCurrentItemIndex(asInt2);
                }
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
        boolean z10;
        ReadableType readableType;
        String str;
        int i10;
        super.onInitializeAccessibilityNodeInfo(view, a10);
        if (view.getTag(C3367m.f40933i) != null) {
            if (((Boolean) view.getTag(C3367m.f40933i)).booleanValue()) {
                i10 = 524288;
            } else {
                i10 = 262144;
            }
            a10.a(i10);
        }
        e e10 = e.e(view);
        String str2 = (String) view.getTag(C3367m.f40928d);
        if (e10 != null) {
            a0(a10, e10, view.getContext());
        }
        if (str2 != null) {
            a10.d1(str2);
        }
        Object tag = view.getTag(C3367m.f40941q);
        if (tag != null) {
            View a11 = C3676a.a(view.getRootView(), (String) tag);
            this.f41432r = a11;
            if (a11 != null) {
                a10.I0(a11);
            }
        }
        ReadableMap readableMap = (ReadableMap) view.getTag(C3367m.f40932h);
        if (readableMap != null) {
            b0(a10, readableMap, view.getContext());
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(C3367m.f40925a);
        ReadableMap readableMap2 = (ReadableMap) view.getTag(C3367m.f40927c);
        if (readableMap2 != null) {
            a10.w0(C2930A.f.a(readableMap2.getInt("rowIndex"), readableMap2.getInt("rowSpan"), readableMap2.getInt("columnIndex"), readableMap2.getInt("columnSpan"), readableMap2.getBoolean("heading")));
        }
        boolean z11 = true;
        if (readableArray != null) {
            int i11 = 0;
            while (i11 < readableArray.size()) {
                ReadableMap map = readableArray.getMap(i11);
                if (map.hasKey("name")) {
                    int i12 = f41425s;
                    if (map.hasKey("label")) {
                        str = map.getString("label");
                    } else {
                        str = null;
                    }
                    HashMap hashMap = f41427u;
                    if (hashMap.containsKey(map.getString("name"))) {
                        i12 = ((Integer) hashMap.get(map.getString("name"))).intValue();
                    } else {
                        f41425s++;
                    }
                    this.f41431q.put(Integer.valueOf(i12), map.getString("name"));
                    a10.b(new C2930A.a(i12, str));
                    i11++;
                } else {
                    throw new IllegalArgumentException("Unknown accessibility action.");
                }
            }
        }
        ReadableMap readableMap3 = (ReadableMap) view.getTag(C3367m.f40934j);
        if (readableMap3 != null && readableMap3.hasKey("min") && readableMap3.hasKey("now") && readableMap3.hasKey("max")) {
            Dynamic dynamic = readableMap3.getDynamic("min");
            Dynamic dynamic2 = readableMap3.getDynamic("now");
            Dynamic dynamic3 = readableMap3.getDynamic("max");
            if (dynamic != null && dynamic.getType() == (readableType = ReadableType.Number) && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                int asInt = dynamic.asInt();
                int asInt2 = dynamic2.asInt();
                int asInt3 = dynamic3.asInt();
                if (asInt3 > asInt && asInt2 >= asInt && asInt3 >= asInt2) {
                    a10.S0(C2930A.g.d(0, (float) asInt, (float) asInt3, (float) asInt2));
                }
            }
        }
        String str3 = (String) view.getTag(C3367m.f40944t);
        if (str3 != null) {
            a10.i1(str3);
        }
        boolean isEmpty = TextUtils.isEmpty(a10.u());
        boolean isEmpty2 = TextUtils.isEmpty(a10.F());
        if (!isEmpty || !isEmpty2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (readableArray == null && readableMap == null && tag == null && e10 == null) {
            z11 = false;
        }
        if (z10 && z11) {
            a10.x0(O(view, a10));
        }
    }

    public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        if (i10 == 524288) {
            view.setTag(C3367m.f40933i, Boolean.FALSE);
        }
        if (i10 == 262144) {
            view.setTag(C3367m.f40933i, Boolean.TRUE);
        }
        if (!this.f41431q.containsKey(Integer.valueOf(i10))) {
            return super.performAccessibilityAction(view, i10, bundle);
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putString("actionName", (String) this.f41431q.get(Integer.valueOf(i10)));
        ReactContext reactContext = (ReactContext) view.getContext();
        if (reactContext.hasActiveReactInstance()) {
            int id2 = view.getId();
            int e10 = n0.e(reactContext);
            UIManager g10 = n0.g(reactContext, C3519a.a(id2));
            if (g10 != null) {
                g10.getEventDispatcher().h(new b(e10, id2, createMap));
            }
        } else {
            ReactSoftExceptionLogger.logSoftException("ReactAccessibilityDelegate", new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
        }
        e eVar = (e) view.getTag(C3367m.f40931g);
        ReadableMap readableMap = (ReadableMap) view.getTag(C3367m.f40934j);
        if (eVar != e.ADJUSTABLE) {
            return true;
        }
        if (i10 != C2930A.a.f28610q.b() && i10 != C2930A.a.f28611r.b()) {
            return true;
        }
        if (readableMap != null && !readableMap.hasKey(AttributeType.TEXT)) {
            Y(view);
        }
        return super.performAccessibilityAction(view, i10, bundle);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        r6 = (android.text.Spanned) r0.getText();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int q(float r5, float r6) {
        /*
            r4 = this;
            com.facebook.react.uimanager.I$d r0 = r4.f41429o
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L_0x0069
            int r0 = r0.c()
            if (r0 == 0) goto L_0x0069
            android.view.View r0 = r4.f41428n
            boolean r2 = r0 instanceof android.widget.TextView
            if (r2 != 0) goto L_0x0013
            goto L_0x0069
        L_0x0013:
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r2 = r0.getText()
            boolean r2 = r2 instanceof android.text.Spanned
            if (r2 != 0) goto L_0x001e
            return r1
        L_0x001e:
            android.text.Layout r2 = r0.getLayout()
            if (r2 != 0) goto L_0x0025
            return r1
        L_0x0025:
            int r3 = r0.getTotalPaddingLeft()
            float r3 = (float) r3
            float r5 = r5 - r3
            int r3 = r0.getTotalPaddingTop()
            float r3 = (float) r3
            float r6 = r6 - r3
            int r3 = r0.getScrollX()
            float r3 = (float) r3
            float r5 = r5 + r3
            int r3 = r0.getScrollY()
            float r3 = (float) r3
            float r6 = r6 + r3
            int r6 = (int) r6
            int r6 = r2.getLineForVertical(r6)
            int r5 = r2.getOffsetForHorizontal(r6, r5)
            java.lang.Class<android.text.style.ClickableSpan> r6 = android.text.style.ClickableSpan.class
            java.lang.Object r5 = r4.N(r5, r5, r6)
            android.text.style.ClickableSpan r5 = (android.text.style.ClickableSpan) r5
            if (r5 != 0) goto L_0x0051
            return r1
        L_0x0051:
            java.lang.CharSequence r6 = r0.getText()
            android.text.Spanned r6 = (android.text.Spanned) r6
            int r0 = r6.getSpanStart(r5)
            int r5 = r6.getSpanEnd(r5)
            com.facebook.react.uimanager.I$d r6 = r4.f41429o
            com.facebook.react.uimanager.I$d$a r5 = r6.b(r0, r5)
            if (r5 == 0) goto L_0x0069
            int r1 = r5.f41442d
        L_0x0069:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.I.q(float, float):int");
    }

    /* access modifiers changed from: protected */
    public void r(List list) {
        if (this.f41429o != null) {
            for (int i10 = 0; i10 < this.f41429o.c(); i10++) {
                list.add(Integer.valueOf(i10));
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean y(int i10, int i11, Bundle bundle) {
        return false;
    }
}
