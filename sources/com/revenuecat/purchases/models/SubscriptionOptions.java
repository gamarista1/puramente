package com.revenuecat.purchases.models;

import com.revenuecat.purchases.common.SharedConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6488j;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import zf.C6828a;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\b\u0017J\u0011\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0003J\u0017\u0010\u001b\u001a\u00020\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0001J\u0013\u0010\u001e\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0018\u0010!\u001a\u0004\u0018\u00010\u00022\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002J\u0018\u0010#\u001a\u0004\u0018\u00010\u00022\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002J\u0011\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0011H\u0003J\b\u0010&\u001a\u00020\u0011H\u0016J\u0011\u0010'\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0002H\u0001J\t\u0010(\u001a\u00020\u0019H\u0001J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020*H\u0003J\u0011\u0010+\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0002H\u0001J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020-H\u0001J\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020-2\u0006\u0010%\u001a\u00020\u0011H\u0001J\u001f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0011H\u0001J\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u00102\u001a\u000203R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028F¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\u0007R\u0013\u0010\f\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0012\u0010\u0010\u001a\u00020\u0011X\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/revenuecat/purchases/models/SubscriptionOptions;", "", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "subscriptionOptions", "(Ljava/util/List;)V", "basePlan", "getBasePlan", "()Lcom/revenuecat/purchases/models/SubscriptionOption;", "defaultOffer", "getDefaultOffer$annotations", "()V", "getDefaultOffer", "freeTrial", "getFreeTrial", "introOffer", "getIntroOffer", "size", "", "getSize", "()I", "billingPeriodToDays", "period", "Lcom/revenuecat/purchases/models/Period;", "billingPeriodToDays$purchases_defaultsRelease", "contains", "", "element", "containsAll", "elements", "", "equals", "other", "", "findLongestFreeTrial", "offers", "findLowestNonFreeOffer", "get", "index", "hashCode", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "withTag", "tag", "", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SubscriptionOptions implements List<SubscriptionOption>, C6828a {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Deprecated
    public static final String RC_IGNORE_OFFER_TAG = "rc-ignore-offer";
    private final List<SubscriptionOption> subscriptionOptions;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/models/SubscriptionOptions$Companion;", "", "()V", "RC_IGNORE_OFFER_TAG", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SubscriptionOptions(List<? extends SubscriptionOption> list) {
        C6496s.h(list, "subscriptionOptions");
        this.subscriptionOptions = list;
    }

    private final SubscriptionOption findLongestFreeTrial(List<? extends SubscriptionOption> list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            Pair pair = null;
            if (!it.hasNext()) {
                break;
            }
            SubscriptionOption subscriptionOption = (SubscriptionOption) it.next();
            PricingPhase freePhase = subscriptionOption.getFreePhase();
            if (freePhase != null) {
                pair = new Pair(subscriptionOption, Integer.valueOf(billingPeriodToDays$purchases_defaultsRelease(freePhase.getBillingPeriod())));
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            obj = null;
        } else {
            obj = it2.next();
            if (it2.hasNext()) {
                int intValue = ((Number) ((Pair) obj).d()).intValue();
                do {
                    Object next = it2.next();
                    int intValue2 = ((Number) ((Pair) next).d()).intValue();
                    if (intValue < intValue2) {
                        obj = next;
                        intValue = intValue2;
                    }
                } while (it2.hasNext());
            }
        }
        Pair pair2 = (Pair) obj;
        if (pair2 != null) {
            return (SubscriptionOption) pair2.c();
        }
        return null;
    }

    private final SubscriptionOption findLowestNonFreeOffer(List<? extends SubscriptionOption> list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            Pair pair = null;
            if (!it.hasNext()) {
                break;
            }
            SubscriptionOption subscriptionOption = (SubscriptionOption) it.next();
            PricingPhase introPhase = subscriptionOption.getIntroPhase();
            if (introPhase != null) {
                pair = new Pair(subscriptionOption, Long.valueOf(introPhase.getPrice().getAmountMicros()));
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            obj = null;
        } else {
            obj = it2.next();
            if (it2.hasNext()) {
                long longValue = ((Number) ((Pair) obj).d()).longValue();
                do {
                    Object next = it2.next();
                    long longValue2 = ((Number) ((Pair) next).d()).longValue();
                    if (longValue > longValue2) {
                        obj = next;
                        longValue = longValue2;
                    }
                } while (it2.hasNext());
            }
        }
        Pair pair2 = (Pair) obj;
        if (pair2 != null) {
            return (SubscriptionOption) pair2.c();
        }
        return null;
    }

    public static /* synthetic */ void getDefaultOffer$annotations() {
    }

    public void add(int i10, SubscriptionOption subscriptionOption) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i10, Collection<? extends SubscriptionOption> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int billingPeriodToDays$purchases_defaultsRelease(Period period) {
        int i10;
        C6496s.h(period, "period");
        Integer num = (Integer) SubscriptionOptionsKt.DAYS_IN_UNIT.get(period.getUnit());
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        return period.getValue() * i10;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(SubscriptionOption subscriptionOption) {
        C6496s.h(subscriptionOption, "element");
        return this.subscriptionOptions.contains(subscriptionOption);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C6496s.h(collection, "elements");
        return this.subscriptionOptions.containsAll(collection);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        SubscriptionOptions subscriptionOptions2 = null;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C6496s.c(SubscriptionOptions.class, cls)) {
            return false;
        }
        if (obj instanceof SubscriptionOptions) {
            subscriptionOptions2 = (SubscriptionOptions) obj;
        }
        if (subscriptionOptions2 == null || !C6496s.c(C6565s.e(this.subscriptionOptions), C6565s.e(((SubscriptionOptions) obj).subscriptionOptions))) {
            return false;
        }
        return true;
    }

    public SubscriptionOption get(int i10) {
        return this.subscriptionOptions.get(i10);
    }

    public final SubscriptionOption getBasePlan() {
        Object obj;
        Iterator it = iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SubscriptionOption) obj).isBasePlan()) {
                break;
            }
        }
        return (SubscriptionOption) obj;
    }

    public final SubscriptionOption getDefaultOffer() {
        Object obj;
        Iterator it = iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SubscriptionOption) obj).isBasePlan()) {
                break;
            }
        }
        SubscriptionOption subscriptionOption = (SubscriptionOption) obj;
        if (subscriptionOption == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : this) {
            if (!((SubscriptionOption) next).isBasePlan()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            if (!((SubscriptionOption) next2).getTags().contains(RC_IGNORE_OFFER_TAG)) {
                arrayList2.add(next2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object next3 : arrayList2) {
            if (!((SubscriptionOption) next3).getTags().contains(SharedConstants.RC_CUSTOMER_CENTER_TAG)) {
                arrayList3.add(next3);
            }
        }
        SubscriptionOption findLongestFreeTrial = findLongestFreeTrial(arrayList3);
        if (findLongestFreeTrial != null) {
            return findLongestFreeTrial;
        }
        SubscriptionOption findLowestNonFreeOffer = findLowestNonFreeOffer(arrayList3);
        if (findLowestNonFreeOffer == null) {
            return subscriptionOption;
        }
        return findLowestNonFreeOffer;
    }

    public final SubscriptionOption getFreeTrial() {
        Object obj;
        Iterator it = iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SubscriptionOption) obj).getFreePhase() != null) {
                break;
            }
        }
        return (SubscriptionOption) obj;
    }

    public final SubscriptionOption getIntroOffer() {
        Object obj;
        Iterator it = iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SubscriptionOption) obj).getIntroPhase() != null) {
                break;
            }
        }
        return (SubscriptionOption) obj;
    }

    public int getSize() {
        return this.subscriptionOptions.size();
    }

    public int hashCode() {
        return C6565s.e(this.subscriptionOptions).hashCode();
    }

    public int indexOf(SubscriptionOption subscriptionOption) {
        C6496s.h(subscriptionOption, "element");
        return this.subscriptionOptions.indexOf(subscriptionOption);
    }

    public boolean isEmpty() {
        return this.subscriptionOptions.isEmpty();
    }

    public Iterator<SubscriptionOption> iterator() {
        return this.subscriptionOptions.iterator();
    }

    public int lastIndexOf(SubscriptionOption subscriptionOption) {
        C6496s.h(subscriptionOption, "element");
        return this.subscriptionOptions.lastIndexOf(subscriptionOption);
    }

    public ListIterator<SubscriptionOption> listIterator() {
        return this.subscriptionOptions.listIterator();
    }

    public SubscriptionOption remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<SubscriptionOption> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public SubscriptionOption set(int i10, SubscriptionOption subscriptionOption) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public void sort(Comparator<? super SubscriptionOption> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<SubscriptionOption> subList(int i10, int i11) {
        return this.subscriptionOptions.subList(i10, i11);
    }

    public Object[] toArray() {
        return C6488j.a(this);
    }

    public final List<SubscriptionOption> withTag(String str) {
        C6496s.h(str, "tag");
        ArrayList arrayList = new ArrayList();
        for (Object next : this) {
            if (((SubscriptionOption) next).getTags().contains(str)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends SubscriptionOption> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof SubscriptionOption)) {
            return false;
        }
        return contains((SubscriptionOption) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof SubscriptionOption)) {
            return -1;
        }
        return indexOf((SubscriptionOption) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof SubscriptionOption)) {
            return -1;
        }
        return lastIndexOf((SubscriptionOption) obj);
    }

    public ListIterator<SubscriptionOption> listIterator(int i10) {
        return this.subscriptionOptions.listIterator(i10);
    }

    public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public <T> T[] toArray(T[] tArr) {
        C6496s.h(tArr, "array");
        return C6488j.b(this, tArr);
    }

    public boolean add(SubscriptionOption subscriptionOption) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
