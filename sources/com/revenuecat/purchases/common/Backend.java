package com.revenuecat.purchases.common;

import com.amazon.a.a.o.b;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.events.EventsRequest;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.JsonElementExtensionsKt;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import lf.C6502A;
import lf.C6514M;
import lh.C6538b;
import lh.o;
import mf.C6565s;
import mf.O;
import org.json.JSONArray;
import org.json.JSONObject;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(d1 = {"\u0000°\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00012\u00020\u0001:\u0002\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013Js\u0010!\u001a\u00020 \"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u0015* \u0012\u0004\u0012\u00020\u0017\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00190\u00180\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00172\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J[\u0010%\u001a\u00020 \"\u0004\b\u0000\u0010#\"\u0004\b\u0001\u0010$*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00180\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00028\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020 ¢\u0006\u0004\b'\u0010(JK\u00102\u001a\u00020 2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020 0-2\u0018\u00101\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020 00¢\u0006\u0004\b2\u00103J½\u0001\u0010F\u001a\u00020 2\u0006\u00104\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u00105\u001a\u00020+2\u0006\u00106\u001a\u00020+2 \u00108\u001a\u001c\u0012\u0004\u0012\u00020)\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020)\u0012\u0006\u0012\u0004\u0018\u00010\u000107072\u0006\u0010:\u001a\u0002092\b\u0010;\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010)2\u0006\u0010>\u001a\u00020=2\b\u0010@\u001a\u0004\u0018\u00010?2\u0016\u0010/\u001a\u0012\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020 0-j\u0002`B2$\u00101\u001a \u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010D\u0012\u0004\u0012\u00020 0Cj\u0002`E¢\u0006\u0004\bF\u0010GJK\u0010H\u001a\u00020 2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020 0-2\u0018\u00101\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020 00¢\u0006\u0004\bH\u00103JK\u0010L\u001a\u00020 2\u0006\u0010*\u001a\u00020)2\u0006\u0010I\u001a\u00020)2\u0018\u0010J\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020 002\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0-¢\u0006\u0004\bL\u0010MJI\u0010P\u001a\u00020 2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020D0N2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020 0-2\u0018\u0010K\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020 00¢\u0006\u0004\bP\u0010QJ=\u0010U\u001a\u00020 2\u0006\u0010S\u001a\u00020R2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020 0T2\u0018\u0010K\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020 00¢\u0006\u0004\bU\u0010VJ5\u0010X\u001a\u00020 2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020 0-2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0-¢\u0006\u0004\bX\u0010YJ=\u0010[\u001a\u00020 2\u0006\u0010*\u001a\u00020)2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020 0-2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0-¢\u0006\u0004\b[\u0010\\J1\u0010`\u001a\u00020 2\u0006\u0010*\u001a\u00020)2\u0006\u0010]\u001a\u00020)2\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020 0-¢\u0006\u0004\b`\u0010aJ\r\u0010b\u001a\u00020 ¢\u0006\u0004\bb\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010dR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010fRª\u0001\u0010i\u001aB\u0012\u0004\u0012\u00020\u0017\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020 0-\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020 000\u0019j\u0002`g0\u00180\u00162F\u0010h\u001aB\u0012\u0004\u0012\u00020\u0017\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020 0-\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020 000\u0019j\u0002`g0\u00180\u00168F@FX\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nRÞ\u0001\u0010q\u001a\\\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020)0Nj\u0002`o\u0012H\u0012F\u0012B\u0012@\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020 0-j\u0002`B\u0012\"\u0012 \u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010D\u0012\u0004\u0012\u00020 0Cj\u0002`E0\u0019j\u0002`p0\u00180\u00162`\u0010h\u001a\\\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020)0Nj\u0002`o\u0012H\u0012F\u0012B\u0012@\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020 0-j\u0002`B\u0012\"\u0012 \u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010D\u0012\u0004\u0012\u00020 0Cj\u0002`E0\u0019j\u0002`p0\u00180\u00168F@FX\u000e¢\u0006\u0012\n\u0004\bq\u0010j\u001a\u0004\br\u0010l\"\u0004\bs\u0010nRª\u0001\u0010u\u001aB\u0012\u0004\u0012\u00020\u0017\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020 0-\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020 000\u0019j\u0002`t0\u00180\u00162F\u0010h\u001aB\u0012\u0004\u0012\u00020\u0017\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020 0-\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020 000\u0019j\u0002`t0\u00180\u00168F@FX\u000e¢\u0006\u0012\n\u0004\bu\u0010j\u001a\u0004\bv\u0010l\"\u0004\bw\u0010nR¾\u0001\u0010y\u001aL\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020)0Nj\u0002`o\u00128\u00126\u00122\u00120\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020 00\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0-0\u0019j\u0002`x0\u00180\u00162P\u0010h\u001aL\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020)0Nj\u0002`o\u00128\u00126\u00122\u00120\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020 00\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0-0\u0019j\u0002`x0\u00180\u00168F@FX\u000e¢\u0006\u0012\n\u0004\by\u0010j\u001a\u0004\bz\u0010l\"\u0004\b{\u0010nR¾\u0001\u0010}\u001aL\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020)0Nj\u0002`o\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020 0-\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020 000\u0019j\u0002`|0\u00180\u00162P\u0010h\u001aL\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020)0Nj\u0002`o\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020 0-\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020 000\u0019j\u0002`|0\u00180\u00168F@FX\u000e¢\u0006\u0012\n\u0004\b}\u0010j\u001a\u0004\b~\u0010l\"\u0004\b\u0010nR¸\u0001\u0010\u0001\u001aG\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020)0Nj\u0002`o\u00123\u00121\u0012-\u0012+\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0T\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020 000\u0019j\u0003`\u00010\u00180\u00162K\u0010h\u001aG\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020)0Nj\u0002`o\u00123\u00121\u0012-\u0012+\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0T\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020 000\u0019j\u0003`\u00010\u00180\u00168F@FX\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010j\u001a\u0005\b\u0001\u0010l\"\u0005\b\u0001\u0010nR¤\u0001\u0010\u0001\u001a=\u0012\u0004\u0012\u00020)\u00123\u00121\u0012-\u0012+\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020 0-\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0-0\u0019j\u0003`\u00010\u00180\u00162A\u0010h\u001a=\u0012\u0004\u0012\u00020)\u00123\u00121\u0012-\u0012+\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020 0-\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0-0\u0019j\u0003`\u00010\u00180\u00168F@FX\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010j\u001a\u0005\b\u0001\u0010l\"\u0005\b\u0001\u0010nR¤\u0001\u0010\u0001\u001a=\u0012\u0004\u0012\u00020)\u00123\u00121\u0012-\u0012+\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020 0-\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0-0\u0019j\u0003`\u00010\u00180\u00162A\u0010h\u001a=\u0012\u0004\u0012\u00020)\u00123\u00121\u0012-\u0012+\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020 0-\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0-0\u0019j\u0003`\u00010\u00180\u00168F@FX\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010j\u001a\u0005\b\u0001\u0010l\"\u0005\b\u0001\u0010nRt\u0010\u0001\u001a%\u0012\u0004\u0012\u00020)\u0012\u001b\u0012\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020 0-j\u0003`\u00010\u00180\u00162)\u0010h\u001a%\u0012\u0004\u0012\u00020)\u0012\u001b\u0012\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020 0-j\u0003`\u00010\u00180\u00168F@FX\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010j\u001a\u0005\b\u0001\u0010l\"\u0005\b\u0001\u0010nR\u0015\u0010\u0001\u001a\u00030\u00018F¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"Lcom/revenuecat/purchases/common/Backend;", "", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "eventsDispatcher", "Lcom/revenuecat/purchases/common/HTTPClient;", "httpClient", "Lcom/revenuecat/purchases/common/BackendHelper;", "backendHelper", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/HTTPClient;Lcom/revenuecat/purchases/common/BackendHelper;)V", "", "responseCode", "Lcom/revenuecat/purchases/PurchasesError;", "purchasesError", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "determinePostReceiptErrorHandlingBehavior", "(ILcom/revenuecat/purchases/PurchasesError;)Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "S", "E", "", "Lcom/revenuecat/purchases/common/BackgroundAwareCallbackCacheKey;", "", "Lkotlin/Pair;", "Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;", "call", "cacheKey", "functions", "Lcom/revenuecat/purchases/common/Delay;", "delay", "Llf/M;", "addBackgroundAwareCallback", "(Ljava/util/Map;Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/BackgroundAwareCallbackCacheKey;Lkotlin/Pair;Lcom/revenuecat/purchases/common/Delay;)V", "K", "F", "addCallback", "(Ljava/util/Map;Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;Lcom/revenuecat/purchases/common/Dispatcher;Ljava/lang/Object;Ljava/lang/Object;Lcom/revenuecat/purchases/common/Delay;)V", "close", "()V", "", "appUserID", "", "appInBackground", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "onSuccess", "Lkotlin/Function2;", "onError", "getCustomerInfo", "(Ljava/lang/String;ZLyf/l;Lyf/p;)V", "purchaseToken", "isRestore", "finishTransactions", "", "subscriberAttributes", "Lcom/revenuecat/purchases/common/ReceiptInfo;", "receiptInfo", "storeAppUserID", "marketplace", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "paywallPostReceiptData", "Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "Lcom/revenuecat/purchases/common/PostReceiptDataSuccessCallback;", "Lkotlin/Function3;", "Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/common/PostReceiptDataErrorCallback;", "postReceiptData", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Lcom/revenuecat/purchases/common/ReceiptInfo;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;Lyf/l;Lyf/q;)V", "getOfferings", "newAppUserID", "onSuccessHandler", "onErrorHandler", "logIn", "(Ljava/lang/String;Ljava/lang/String;Lyf/p;Lyf/l;)V", "", "diagnosticsList", "postDiagnostics", "(Ljava/util/List;Lyf/l;Lyf/p;)V", "Lcom/revenuecat/purchases/common/events/EventsRequest;", "paywallEventRequest", "Lkotlin/Function0;", "postEvents", "(Lcom/revenuecat/purchases/common/events/EventsRequest;Lyf/a;Lyf/p;)V", "Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "getProductEntitlementMapping", "(Lyf/l;Lyf/l;)V", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "getCustomerCenterConfig", "(Ljava/lang/String;Lyf/l;Lyf/l;)V", "redemptionToken", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "onResultHandler", "postRedeemWebPurchase", "(Ljava/lang/String;Ljava/lang/String;Lyf/l;)V", "clearCaches", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Lcom/revenuecat/purchases/common/HTTPClient;", "Lcom/revenuecat/purchases/common/BackendHelper;", "Lcom/revenuecat/purchases/common/CustomerInfoCallback;", "<set-?>", "callbacks", "Ljava/util/Map;", "getCallbacks", "()Ljava/util/Map;", "setCallbacks", "(Ljava/util/Map;)V", "Lcom/revenuecat/purchases/common/CallbackCacheKey;", "Lcom/revenuecat/purchases/common/PostReceiptCallback;", "postReceiptCallbacks", "getPostReceiptCallbacks", "setPostReceiptCallbacks", "Lcom/revenuecat/purchases/common/OfferingsCallback;", "offeringsCallbacks", "getOfferingsCallbacks", "setOfferingsCallbacks", "Lcom/revenuecat/purchases/common/IdentifyCallback;", "identifyCallbacks", "getIdentifyCallbacks", "setIdentifyCallbacks", "Lcom/revenuecat/purchases/common/DiagnosticsCallback;", "diagnosticsCallbacks", "getDiagnosticsCallbacks", "setDiagnosticsCallbacks", "Lcom/revenuecat/purchases/common/PaywallEventsCallback;", "paywallEventsCallbacks", "getPaywallEventsCallbacks", "setPaywallEventsCallbacks", "Lcom/revenuecat/purchases/common/ProductEntitlementCallback;", "productEntitlementCallbacks", "getProductEntitlementCallbacks", "setProductEntitlementCallbacks", "Lcom/revenuecat/purchases/common/CustomerCenterCallback;", "customerCenterCallbacks", "getCustomerCenterCallbacks", "setCustomerCenterCallbacks", "Lcom/revenuecat/purchases/common/RedeemWebPurchaseCallback;", "redeemWebPurchaseCallbacks", "getRedeemWebPurchaseCallbacks", "setRedeemWebPurchaseCallbacks", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "getVerificationMode", "()Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "verificationMode", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Backend {
    private static final String APP_USER_ID = "app_user_id";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String FETCH_TOKEN = "fetch_token";
    private static final String NEW_APP_USER_ID = "new_app_user_id";
    /* access modifiers changed from: private */
    public static final C6538b json = o.b((C6538b) null, Backend$Companion$json$1.INSTANCE, 1, (Object) null);
    /* access modifiers changed from: private */
    public final AppConfig appConfig;
    /* access modifiers changed from: private */
    public final BackendHelper backendHelper;
    private volatile Map<BackgroundAwareCallbackCacheKey, List<Pair<C6798l, p>>> callbacks = new LinkedHashMap();
    private volatile Map<String, List<Pair<C6798l, C6798l>>> customerCenterCallbacks = new LinkedHashMap();
    private volatile Map<List<String>, List<Pair<C6798l, p>>> diagnosticsCallbacks = new LinkedHashMap();
    private final Dispatcher dispatcher;
    private final Dispatcher eventsDispatcher;
    /* access modifiers changed from: private */
    public final HTTPClient httpClient;
    private volatile Map<List<String>, List<Pair<p, C6798l>>> identifyCallbacks = new LinkedHashMap();
    private volatile Map<BackgroundAwareCallbackCacheKey, List<Pair<C6798l, p>>> offeringsCallbacks = new LinkedHashMap();
    private volatile Map<List<String>, List<Pair<C6787a, p>>> paywallEventsCallbacks = new LinkedHashMap();
    private volatile Map<List<String>, List<Pair<C6798l, q>>> postReceiptCallbacks = new LinkedHashMap();
    private volatile Map<String, List<Pair<C6798l, C6798l>>> productEntitlementCallbacks = new LinkedHashMap();
    private volatile Map<String, List<C6798l>> redeemWebPurchaseCallbacks = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/common/Backend$Companion;", "", "<init>", "()V", "Llh/b;", "json", "Llh/b;", "getJson$purchases_defaultsRelease", "()Llh/b;", "getJson$purchases_defaultsRelease$annotations", "", "APP_USER_ID", "Ljava/lang/String;", "FETCH_TOKEN", "NEW_APP_USER_ID", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getJson$purchases_defaultsRelease$annotations() {
        }

        public final C6538b getJson$purchases_defaultsRelease() {
            return Backend.json;
        }

        private Companion() {
        }
    }

    public Backend(AppConfig appConfig2, Dispatcher dispatcher2, Dispatcher dispatcher3, HTTPClient hTTPClient, BackendHelper backendHelper2) {
        C6496s.h(appConfig2, "appConfig");
        C6496s.h(dispatcher2, "dispatcher");
        C6496s.h(dispatcher3, "eventsDispatcher");
        C6496s.h(hTTPClient, "httpClient");
        C6496s.h(backendHelper2, "backendHelper");
        this.appConfig = appConfig2;
        this.dispatcher = dispatcher2;
        this.eventsDispatcher = dispatcher3;
        this.httpClient = hTTPClient;
        this.backendHelper = backendHelper2;
    }

    private final synchronized <S, E> void addBackgroundAwareCallback(Map<BackgroundAwareCallbackCacheKey, List<Pair<S, E>>> map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher2, BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey, Pair<? extends S, ? extends E> pair, Delay delay) {
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2;
        Map<BackgroundAwareCallbackCacheKey, List<Pair<S, E>>> map2 = map;
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey3 = backgroundAwareCallbackCacheKey;
        synchronized (this) {
            List list = null;
            try {
                BackgroundAwareCallbackCacheKey copy$default = BackgroundAwareCallbackCacheKey.copy$default(backgroundAwareCallbackCacheKey3, (List) null, false, 1, (Object) null);
                boolean containsKey = map.containsKey(copy$default);
                if (!backgroundAwareCallbackCacheKey.getAppInBackground() || !containsKey) {
                    backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey3;
                } else {
                    String format = String.format(NetworkStrings.SAME_CALL_SCHEDULED_WITHOUT_JITTER, Arrays.copyOf(new Object[]{copy$default}, 1));
                    C6496s.g(format, "format(this, *args)");
                    LogUtilsKt.debugLog(format);
                    backgroundAwareCallbackCacheKey2 = copy$default;
                }
                addCallback(map, asyncCall, dispatcher2, backgroundAwareCallbackCacheKey2, pair, delay);
                BackgroundAwareCallbackCacheKey copy$default2 = BackgroundAwareCallbackCacheKey.copy$default(backgroundAwareCallbackCacheKey3, (List) null, true, 1, (Object) null);
                boolean containsKey2 = map.containsKey(copy$default);
                if (!backgroundAwareCallbackCacheKey.getAppInBackground() && containsKey2) {
                    String format2 = String.format(NetworkStrings.SAME_CALL_SCHEDULED_WITH_JITTER, Arrays.copyOf(new Object[]{copy$default}, 1));
                    C6496s.g(format2, "format(this, *args)");
                    LogUtilsKt.debugLog(format2);
                    List remove = map.remove(copy$default2);
                    if (remove != null) {
                        if (!remove.isEmpty()) {
                            list = remove;
                        }
                        if (list != null) {
                            if (map.containsKey(backgroundAwareCallbackCacheKey3)) {
                                List list2 = map.get(backgroundAwareCallbackCacheKey3);
                                if (list2 != null) {
                                    list2.addAll(list);
                                }
                            } else {
                                map.put(backgroundAwareCallbackCacheKey3, list);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    static /* synthetic */ void addBackgroundAwareCallback$default(Backend backend, Map map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher2, BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey, Pair pair, Delay delay, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            delay = Delay.NONE;
        }
        backend.addBackgroundAwareCallback(map, asyncCall, dispatcher2, backgroundAwareCallbackCacheKey, pair, delay);
    }

    private final <K, F> void addCallback(Map<K, List<F>> map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher2, K k10, F f10, Delay delay) {
        if (!map.containsKey(k10)) {
            map.put(k10, C6565s.t(f10));
            this.backendHelper.enqueue(asyncCall, dispatcher2, delay);
            return;
        }
        U u10 = U.f71764a;
        String format = String.format(NetworkStrings.SAME_CALL_ALREADY_IN_PROGRESS, Arrays.copyOf(new Object[]{k10}, 1));
        C6496s.g(format, "format(format, *args)");
        LogUtilsKt.debugLog(format);
        List<F> list = map.get(k10);
        C6496s.e(list);
        list.add(f10);
    }

    static /* synthetic */ void addCallback$default(Backend backend, Map map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher2, Object obj, Object obj2, Delay delay, int i10, Object obj3) {
        if ((i10 & 16) != 0) {
            delay = Delay.NONE;
        }
        backend.addCallback(map, asyncCall, dispatcher2, obj, obj2, delay);
    }

    /* access modifiers changed from: private */
    public final PostReceiptErrorHandlingBehavior determinePostReceiptErrorHandlingBehavior(int i10, PurchasesError purchasesError) {
        if (RCHTTPStatusCodes.INSTANCE.isServerError(i10)) {
            return PostReceiptErrorHandlingBehavior.SHOULD_USE_OFFLINE_ENTITLEMENTS_AND_NOT_CONSUME;
        }
        if (purchasesError.getCode() == PurchasesErrorCode.UnsupportedError) {
            return PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME;
        }
        return PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED;
    }

    public static /* synthetic */ void postReceiptData$default(Backend backend, String str, String str2, boolean z10, boolean z11, Map map, ReceiptInfo receiptInfo, String str3, String str4, PostReceiptInitiationSource postReceiptInitiationSource, PaywallPostReceiptData paywallPostReceiptData, C6798l lVar, q qVar, int i10, Object obj) {
        String str5;
        if ((i10 & 128) != 0) {
            str5 = null;
        } else {
            str5 = str4;
        }
        backend.postReceiptData(str, str2, z10, z11, map, receiptInfo, str3, str5, postReceiptInitiationSource, paywallPostReceiptData, lVar, qVar);
    }

    public final void clearCaches() {
        this.httpClient.clearCaches();
    }

    public final void close() {
        this.dispatcher.close();
    }

    public final synchronized Map<BackgroundAwareCallbackCacheKey, List<Pair<C6798l, p>>> getCallbacks() {
        return this.callbacks;
    }

    public final synchronized Map<String, List<Pair<C6798l, C6798l>>> getCustomerCenterCallbacks() {
        return this.customerCenterCallbacks;
    }

    public final void getCustomerCenterConfig(String str, C6798l lVar, C6798l lVar2) {
        C6496s.h(str, "appUserID");
        C6496s.h(lVar, "onSuccessHandler");
        C6496s.h(lVar2, "onErrorHandler");
        Endpoint.GetCustomerCenterConfig getCustomerCenterConfig = new Endpoint.GetCustomerCenterConfig(str);
        String path = getCustomerCenterConfig.getPath();
        Backend$getCustomerCenterConfig$call$1 backend$getCustomerCenterConfig$call$1 = new Backend$getCustomerCenterConfig$call$1(this, getCustomerCenterConfig, path);
        synchronized (this) {
            addCallback(this.customerCenterCallbacks, backend$getCustomerCenterConfig$call$1, this.dispatcher, path, C6502A.a(lVar, lVar2), Delay.NONE);
            C6514M m10 = C6514M.f71813a;
        }
    }

    public final void getCustomerInfo(String str, boolean z10, C6798l lVar, p pVar) {
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey;
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2;
        Delay delay;
        C6496s.h(str, "appUserID");
        C6496s.h(lVar, "onSuccess");
        C6496s.h(pVar, "onError");
        Endpoint.GetCustomerInfo getCustomerInfo = new Endpoint.GetCustomerInfo(str);
        String path = getCustomerInfo.getPath();
        synchronized (this) {
            try {
                if (this.postReceiptCallbacks.isEmpty()) {
                    backgroundAwareCallbackCacheKey = new BackgroundAwareCallbackCacheKey(C6565s.e(path), z10);
                } else {
                    backgroundAwareCallbackCacheKey = new BackgroundAwareCallbackCacheKey(C6565s.L0(C6565s.e(path), String.valueOf(this.callbacks.size())), z10);
                }
                backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
            } finally {
            }
        }
        Backend$getCustomerInfo$call$1 backend$getCustomerInfo$call$1 = new Backend$getCustomerInfo$call$1(this, getCustomerInfo, backgroundAwareCallbackCacheKey2);
        synchronized (this) {
            if (z10) {
                try {
                    delay = Delay.DEFAULT;
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                delay = Delay.NONE;
            }
            addBackgroundAwareCallback(this.callbacks, backend$getCustomerInfo$call$1, this.dispatcher, backgroundAwareCallbackCacheKey2, C6502A.a(lVar, pVar), delay);
            C6514M m10 = C6514M.f71813a;
        }
    }

    public final synchronized Map<List<String>, List<Pair<C6798l, p>>> getDiagnosticsCallbacks() {
        return this.diagnosticsCallbacks;
    }

    public final synchronized Map<List<String>, List<Pair<p, C6798l>>> getIdentifyCallbacks() {
        return this.identifyCallbacks;
    }

    public final void getOfferings(String str, boolean z10, C6798l lVar, p pVar) {
        Delay delay;
        C6496s.h(str, "appUserID");
        C6496s.h(lVar, "onSuccess");
        C6496s.h(pVar, "onError");
        Endpoint.GetOfferings getOfferings = new Endpoint.GetOfferings(str);
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey = new BackgroundAwareCallbackCacheKey(C6565s.e(getOfferings.getPath()), z10);
        Backend$getOfferings$call$1 backend$getOfferings$call$1 = new Backend$getOfferings$call$1(this, getOfferings, backgroundAwareCallbackCacheKey);
        synchronized (this) {
            if (z10) {
                try {
                    delay = Delay.DEFAULT;
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                delay = Delay.NONE;
            }
            addBackgroundAwareCallback(this.offeringsCallbacks, backend$getOfferings$call$1, this.dispatcher, backgroundAwareCallbackCacheKey, C6502A.a(lVar, pVar), delay);
            C6514M m10 = C6514M.f71813a;
        }
    }

    public final synchronized Map<BackgroundAwareCallbackCacheKey, List<Pair<C6798l, p>>> getOfferingsCallbacks() {
        return this.offeringsCallbacks;
    }

    public final synchronized Map<List<String>, List<Pair<C6787a, p>>> getPaywallEventsCallbacks() {
        return this.paywallEventsCallbacks;
    }

    public final synchronized Map<List<String>, List<Pair<C6798l, q>>> getPostReceiptCallbacks() {
        return this.postReceiptCallbacks;
    }

    public final synchronized Map<String, List<Pair<C6798l, C6798l>>> getProductEntitlementCallbacks() {
        return this.productEntitlementCallbacks;
    }

    public final void getProductEntitlementMapping(C6798l lVar, C6798l lVar2) {
        C6496s.h(lVar, "onSuccessHandler");
        C6496s.h(lVar2, "onErrorHandler");
        Endpoint.GetProductEntitlementMapping getProductEntitlementMapping = Endpoint.GetProductEntitlementMapping.INSTANCE;
        String path = getProductEntitlementMapping.getPath();
        Backend$getProductEntitlementMapping$call$1 backend$getProductEntitlementMapping$call$1 = new Backend$getProductEntitlementMapping$call$1(this, getProductEntitlementMapping, path);
        synchronized (this) {
            addCallback(this.productEntitlementCallbacks, backend$getProductEntitlementMapping$call$1, this.dispatcher, path, C6502A.a(lVar, lVar2), Delay.LONG);
            C6514M m10 = C6514M.f71813a;
        }
    }

    public final synchronized Map<String, List<C6798l>> getRedeemWebPurchaseCallbacks() {
        return this.redeemWebPurchaseCallbacks;
    }

    public final SignatureVerificationMode getVerificationMode() {
        return this.httpClient.getSigningManager().getSignatureVerificationMode();
    }

    public final void logIn(String str, String str2, p pVar, C6798l lVar) {
        C6496s.h(str, "appUserID");
        C6496s.h(str2, "newAppUserID");
        C6496s.h(pVar, "onSuccessHandler");
        C6496s.h(lVar, "onErrorHandler");
        List s10 = C6565s.s(str, str2);
        Backend$logIn$call$1 backend$logIn$call$1 = new Backend$logIn$call$1(str, str2, this, s10);
        synchronized (this) {
            addCallback$default(this, this.identifyCallbacks, backend$logIn$call$1, this.dispatcher, s10, C6502A.a(pVar, lVar), (Delay) null, 16, (Object) null);
            C6514M m10 = C6514M.f71813a;
        }
    }

    public final void postDiagnostics(List<? extends JSONObject> list, C6798l lVar, p pVar) {
        C6496s.h(list, "diagnosticsList");
        C6496s.h(lVar, "onSuccessHandler");
        C6496s.h(pVar, "onErrorHandler");
        Iterable<JSONObject> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (JSONObject hashCode : iterable) {
            arrayList.add(String.valueOf(hashCode.hashCode()));
        }
        Backend$postDiagnostics$call$1 backend$postDiagnostics$call$1 = new Backend$postDiagnostics$call$1(this, O.f(C6502A.a("entries", new JSONArray(list))), arrayList);
        synchronized (this) {
            addCallback(this.diagnosticsCallbacks, backend$postDiagnostics$call$1, this.eventsDispatcher, arrayList, C6502A.a(lVar, pVar), Delay.LONG);
            C6514M m10 = C6514M.f71813a;
        }
    }

    public final void postEvents(EventsRequest eventsRequest, C6787a aVar, p pVar) {
        C6496s.h(eventsRequest, "paywallEventRequest");
        C6496s.h(aVar, "onSuccessHandler");
        C6496s.h(pVar, "onErrorHandler");
        C6538b defaultJson = JsonProvider.Companion.getDefaultJson();
        defaultJson.a();
        Map<String, Object> asMap = JsonElementExtensionsKt.asMap(defaultJson.e(EventsRequest.Companion.serializer(), eventsRequest));
        if (asMap == null) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.UnknownError, "Error encoding paywall event request");
            LogUtilsKt.errorLog(purchasesError);
            pVar.invoke(purchasesError, Boolean.TRUE);
            return;
        }
        Backend$postEvents$call$1 backend$postEvents$call$1 = new Backend$postEvents$call$1(this, asMap, eventsRequest);
        synchronized (this) {
            addCallback(this.paywallEventsCallbacks, backend$postEvents$call$1, this.eventsDispatcher, eventsRequest.getCacheKey(), C6502A.a(aVar, pVar), Delay.LONG);
            C6514M m10 = C6514M.f71813a;
        }
    }

    public final void postReceiptData(String str, String str2, boolean z10, boolean z11, Map<String, ? extends Map<String, ? extends Object>> map, ReceiptInfo receiptInfo, String str3, String str4, PostReceiptInitiationSource postReceiptInitiationSource, PaywallPostReceiptData paywallPostReceiptData, C6798l lVar, q qVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Price price;
        LegacyProrationMode access$getAsLegacyProrationMode;
        PresentedOfferingContext.TargetingContext targetingContext;
        String str5 = str;
        String str6 = str2;
        C6496s.h(str5, "purchaseToken");
        C6496s.h(str6, "appUserID");
        Map<String, ? extends Map<String, ? extends Object>> map2 = map;
        C6496s.h(map2, "subscriberAttributes");
        C6496s.h(receiptInfo, "receiptInfo");
        C6496s.h(postReceiptInitiationSource, "initiationSource");
        C6496s.h(lVar, "onSuccess");
        C6496s.h(qVar, "onError");
        List s10 = C6565s.s(str, str2, String.valueOf(z10), String.valueOf(z11), map.toString(), receiptInfo.toString(), str3);
        Pair a10 = C6502A.a(FETCH_TOKEN, str5);
        Pair a11 = C6502A.a("product_ids", receiptInfo.getProductIDs());
        List<PlatformProductId> platformProductIds$purchases_defaultsRelease = receiptInfo.getPlatformProductIds$purchases_defaultsRelease();
        String str7 = null;
        if (platformProductIds$purchases_defaultsRelease != null) {
            Iterable<PlatformProductId> iterable = platformProductIds$purchases_defaultsRelease;
            arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (PlatformProductId asMap : iterable) {
                arrayList.add(asMap.getAsMap());
            }
        } else {
            arrayList = null;
        }
        Pair a12 = C6502A.a("platform_product_ids", arrayList);
        Pair a13 = C6502A.a(APP_USER_ID, str6);
        Pair a14 = C6502A.a("is_restore", Boolean.valueOf(z10));
        PresentedOfferingContext presentedOfferingContext = receiptInfo.getPresentedOfferingContext();
        Pair a15 = C6502A.a("presented_offering_identifier", presentedOfferingContext != null ? presentedOfferingContext.getOfferingIdentifier() : null);
        PresentedOfferingContext presentedOfferingContext2 = receiptInfo.getPresentedOfferingContext();
        Pair a16 = C6502A.a("presented_placement_identifier", presentedOfferingContext2 != null ? presentedOfferingContext2.getPlacementIdentifier() : null);
        PresentedOfferingContext presentedOfferingContext3 = receiptInfo.getPresentedOfferingContext();
        Pair a17 = C6502A.a("applied_targeting_rule", (presentedOfferingContext3 == null || (targetingContext = presentedOfferingContext3.getTargetingContext()) == null) ? null : O.l(C6502A.a("revision", Integer.valueOf(targetingContext.getRevision())), C6502A.a("rule_id", targetingContext.getRuleId())));
        Pair a18 = C6502A.a("observer_mode", Boolean.valueOf(!z11));
        Pair a19 = C6502A.a(b.f37501x, receiptInfo.getPrice());
        Pair a20 = C6502A.a(b.f37469a, receiptInfo.getCurrency());
        if (map.isEmpty() || this.appConfig.getCustomEntitlementComputation()) {
            map2 = null;
        }
        Pair a21 = C6502A.a("attributes", map2);
        Pair a22 = C6502A.a("normal_duration", receiptInfo.getDuration());
        Pair a23 = C6502A.a("store_user_id", str3);
        List<PricingPhase> pricingPhases = receiptInfo.getPricingPhases();
        if (pricingPhases != null) {
            Iterable<PricingPhase> iterable2 = pricingPhases;
            arrayList2 = new ArrayList(C6565s.y(iterable2, 10));
            for (PricingPhase map3 : iterable2) {
                arrayList2.add(BackendKt.toMap(map3));
            }
        } else {
            arrayList2 = null;
        }
        Pair a24 = C6502A.a("pricing_phases", arrayList2);
        ReplacementMode replacementMode = receiptInfo.getReplacementMode();
        GoogleReplacementMode googleReplacementMode = replacementMode instanceof GoogleReplacementMode ? (GoogleReplacementMode) replacementMode : null;
        Map filterNotNullValues = MapExtensionsKt.filterNotNullValues(O.l(a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, C6502A.a("proration_mode", (googleReplacementMode == null || (access$getAsLegacyProrationMode = BackendKt.getAsLegacyProrationMode(googleReplacementMode)) == null) ? null : access$getAsLegacyProrationMode.name()), C6502A.a("initiation_source", postReceiptInitiationSource.getPostReceiptFieldValue()), C6502A.a("paywall", paywallPostReceiptData != null ? paywallPostReceiptData.toMap() : null)));
        List q10 = C6565s.q(C6502A.a(APP_USER_ID, str6), C6502A.a(FETCH_TOKEN, str5));
        StoreProduct storeProduct = receiptInfo.getStoreProduct();
        if (!(storeProduct == null || (price = storeProduct.getPrice()) == null)) {
            str7 = price.getFormatted();
        }
        Backend$postReceiptData$call$1 backend$postReceiptData$call$1 = new Backend$postReceiptData$call$1(this, filterNotNullValues, q10, MapExtensionsKt.filterNotNullValues(O.l(C6502A.a("price_string", str7), C6502A.a(b.f37490m, str4))), s10);
        synchronized (this) {
            addCallback$default(this, this.postReceiptCallbacks, backend$postReceiptData$call$1, this.dispatcher, s10, C6502A.a(lVar, qVar), (Delay) null, 16, (Object) null);
            C6514M m10 = C6514M.f71813a;
        }
    }

    public final void postRedeemWebPurchase(String str, String str2, C6798l lVar) {
        C6496s.h(str, "appUserID");
        C6496s.h(str2, "redemptionToken");
        C6496s.h(lVar, "onResultHandler");
        Endpoint.PostRedeemWebPurchase postRedeemWebPurchase = Endpoint.PostRedeemWebPurchase.INSTANCE;
        String path = postRedeemWebPurchase.getPath();
        Backend$postRedeemWebPurchase$call$1 backend$postRedeemWebPurchase$call$1 = new Backend$postRedeemWebPurchase$call$1(this, postRedeemWebPurchase, O.l(C6502A.a("redemption_token", str2), C6502A.a(APP_USER_ID, str)), path);
        synchronized (this) {
            addCallback(this.redeemWebPurchaseCallbacks, backend$postRedeemWebPurchase$call$1, this.dispatcher, path, lVar, Delay.NONE);
            C6514M m10 = C6514M.f71813a;
        }
    }

    public final synchronized void setCallbacks(Map<BackgroundAwareCallbackCacheKey, List<Pair<C6798l, p>>> map) {
        C6496s.h(map, "<set-?>");
        this.callbacks = map;
    }

    public final synchronized void setCustomerCenterCallbacks(Map<String, List<Pair<C6798l, C6798l>>> map) {
        C6496s.h(map, "<set-?>");
        this.customerCenterCallbacks = map;
    }

    public final synchronized void setDiagnosticsCallbacks(Map<List<String>, List<Pair<C6798l, p>>> map) {
        C6496s.h(map, "<set-?>");
        this.diagnosticsCallbacks = map;
    }

    public final synchronized void setIdentifyCallbacks(Map<List<String>, List<Pair<p, C6798l>>> map) {
        C6496s.h(map, "<set-?>");
        this.identifyCallbacks = map;
    }

    public final synchronized void setOfferingsCallbacks(Map<BackgroundAwareCallbackCacheKey, List<Pair<C6798l, p>>> map) {
        C6496s.h(map, "<set-?>");
        this.offeringsCallbacks = map;
    }

    public final synchronized void setPaywallEventsCallbacks(Map<List<String>, List<Pair<C6787a, p>>> map) {
        C6496s.h(map, "<set-?>");
        this.paywallEventsCallbacks = map;
    }

    public final synchronized void setPostReceiptCallbacks(Map<List<String>, List<Pair<C6798l, q>>> map) {
        C6496s.h(map, "<set-?>");
        this.postReceiptCallbacks = map;
    }

    public final synchronized void setProductEntitlementCallbacks(Map<String, List<Pair<C6798l, C6798l>>> map) {
        C6496s.h(map, "<set-?>");
        this.productEntitlementCallbacks = map;
    }

    public final synchronized void setRedeemWebPurchaseCallbacks(Map<String, List<C6798l>> map) {
        C6496s.h(map, "<set-?>");
        this.redeemWebPurchaseCallbacks = map;
    }
}
