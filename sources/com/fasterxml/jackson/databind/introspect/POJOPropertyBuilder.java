package com.fasterxml.jackson.databind.introspect;

import com.amazon.a.a.o.b;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class POJOPropertyBuilder extends BeanPropertyDefinition implements Comparable<POJOPropertyBuilder> {
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final MapperConfig<?> _config;
    protected Linked<AnnotatedParameter> _ctorParameters;
    protected Linked<AnnotatedField> _fields;
    protected final boolean _forSerialization;
    protected Linked<AnnotatedMethod> _getters;
    protected final PropertyName _internalName;
    protected final PropertyName _name;
    protected Linked<AnnotatedMethod> _setters;

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$10  reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.fasterxml.jackson.annotation.JsonProperty$Access[] r0 = com.fasterxml.jackson.annotation.JsonProperty.Access.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access = r0
                com.fasterxml.jackson.annotation.JsonProperty$Access r1 = com.fasterxml.jackson.annotation.JsonProperty.Access.READ_ONLY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.annotation.JsonProperty$Access r1 = com.fasterxml.jackson.annotation.JsonProperty.Access.READ_WRITE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.annotation.JsonProperty$Access r1 = com.fasterxml.jackson.annotation.JsonProperty.Access.WRITE_ONLY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.annotation.JsonProperty$Access r1 = com.fasterxml.jackson.annotation.JsonProperty.Access.AUTO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.AnonymousClass10.<clinit>():void");
        }
    }

    protected static final class Linked<T> {
        public final boolean isMarkedIgnored;
        public final boolean isNameExplicit;
        public final boolean isVisible;
        public final PropertyName name;
        public final Linked<T> next;
        public final T value;

        public Linked(T t10, Linked<T> linked, PropertyName propertyName, boolean z10, boolean z11, boolean z12) {
            PropertyName propertyName2;
            this.value = t10;
            this.next = linked;
            if (propertyName == null || propertyName.isEmpty()) {
                propertyName2 = null;
            } else {
                propertyName2 = propertyName;
            }
            this.name = propertyName2;
            if (z10) {
                if (propertyName2 == null) {
                    throw new IllegalArgumentException("Can not pass true for 'explName' if name is null/empty");
                } else if (!propertyName.hasSimpleName()) {
                    z10 = false;
                }
            }
            this.isNameExplicit = z10;
            this.isVisible = z11;
            this.isMarkedIgnored = z12;
        }

        /* access modifiers changed from: protected */
        public Linked<T> append(Linked<T> linked) {
            Linked<T> linked2 = this.next;
            if (linked2 == null) {
                return withNext(linked);
            }
            return withNext(linked2.append(linked));
        }

        public String toString() {
            String str = this.value.toString() + "[visible=" + this.isVisible + ",ignore=" + this.isMarkedIgnored + ",explicitName=" + this.isNameExplicit + "]";
            if (this.next == null) {
                return str;
            }
            return str + ", " + this.next.toString();
        }

        public Linked<T> trimByVisibility() {
            Linked<T> linked = this.next;
            if (linked == null) {
                return this;
            }
            Linked<T> trimByVisibility = linked.trimByVisibility();
            if (this.name != null) {
                if (trimByVisibility.name == null) {
                    return withNext((Linked) null);
                }
                return withNext(trimByVisibility);
            } else if (trimByVisibility.name != null) {
                return trimByVisibility;
            } else {
                boolean z10 = this.isVisible;
                if (z10 == trimByVisibility.isVisible) {
                    return withNext(trimByVisibility);
                }
                if (z10) {
                    return withNext((Linked) null);
                }
                return trimByVisibility;
            }
        }

        public Linked<T> withNext(Linked<T> linked) {
            if (linked == this.next) {
                return this;
            }
            return new Linked(this.value, linked, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
        }

        public Linked<T> withValue(T t10) {
            if (t10 == this.value) {
                return this;
            }
            return new Linked(t10, this.next, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
        }

        public Linked<T> withoutIgnored() {
            Linked<T> withoutIgnored;
            if (this.isMarkedIgnored) {
                Linked<T> linked = this.next;
                if (linked == null) {
                    return null;
                }
                return linked.withoutIgnored();
            }
            Linked<T> linked2 = this.next;
            if (linked2 == null || (withoutIgnored = linked2.withoutIgnored()) == this.next) {
                return this;
            }
            return withNext(withoutIgnored);
        }

        public Linked<T> withoutNext() {
            if (this.next == null) {
                return this;
            }
            return new Linked(this.value, (Linked) null, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
        }

        public Linked<T> withoutNonVisible() {
            Linked<T> linked;
            Linked<T> linked2 = this.next;
            if (linked2 == null) {
                linked = null;
            } else {
                linked = linked2.withoutNonVisible();
            }
            if (this.isVisible) {
                return withNext(linked);
            }
            return linked;
        }
    }

    protected static class MemberIterator<T extends AnnotatedMember> implements Iterator<T> {
        private Linked<T> next;

        public MemberIterator(Linked<T> linked) {
            this.next = linked;
        }

        public boolean hasNext() {
            if (this.next != null) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public T next() {
            Linked<T> linked = this.next;
            if (linked != null) {
                T t10 = (AnnotatedMember) linked.value;
                this.next = linked.next;
                return t10;
            }
            throw new NoSuchElementException();
        }
    }

    private interface WithMember<T> {
        T withMember(AnnotatedMember annotatedMember);
    }

    public POJOPropertyBuilder(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z10, PropertyName propertyName) {
        this(mapperConfig, annotationIntrospector, z10, propertyName, propertyName);
    }

    private <T> boolean _anyExplicitNames(Linked<T> linked) {
        while (linked != null) {
            if (linked.name != null && linked.isNameExplicit) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T> boolean _anyExplicits(Linked<T> linked) {
        while (linked != null) {
            PropertyName propertyName = linked.name;
            if (propertyName != null && propertyName.hasSimpleName()) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T> boolean _anyIgnorals(Linked<T> linked) {
        while (linked != null) {
            if (linked.isMarkedIgnored) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T> boolean _anyVisible(Linked<T> linked) {
        while (linked != null) {
            if (linked.isVisible) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T extends AnnotatedMember> Linked<T> _applyAnnotations(Linked<T> linked, AnnotationMap annotationMap) {
        AnnotatedMember annotatedMember = (AnnotatedMember) ((AnnotatedMember) linked.value).withAnnotations(annotationMap);
        Linked<T> linked2 = linked.next;
        if (linked2 != null) {
            linked = linked.withNext(_applyAnnotations(linked2, annotationMap));
        }
        return linked.withValue(annotatedMember);
    }

    private void _explode(Collection<PropertyName> collection, Map<PropertyName, POJOPropertyBuilder> map, Linked<?> linked) {
        for (Linked linked2 = linked; linked2 != null; linked2 = linked2.next) {
            PropertyName propertyName = linked2.name;
            if (linked2.isNameExplicit && propertyName != null) {
                POJOPropertyBuilder pOJOPropertyBuilder = map.get(propertyName);
                if (pOJOPropertyBuilder == null) {
                    pOJOPropertyBuilder = new POJOPropertyBuilder(this._config, this._annotationIntrospector, this._forSerialization, this._internalName, propertyName);
                    map.put(propertyName, pOJOPropertyBuilder);
                }
                if (linked == this._fields) {
                    pOJOPropertyBuilder._fields = linked2.withNext(pOJOPropertyBuilder._fields);
                } else if (linked == this._getters) {
                    pOJOPropertyBuilder._getters = linked2.withNext(pOJOPropertyBuilder._getters);
                } else if (linked == this._setters) {
                    pOJOPropertyBuilder._setters = linked2.withNext(pOJOPropertyBuilder._setters);
                } else if (linked == this._ctorParameters) {
                    pOJOPropertyBuilder._ctorParameters = linked2.withNext(pOJOPropertyBuilder._ctorParameters);
                } else {
                    throw new IllegalStateException("Internal error: mismatched accessors, property: " + this);
                }
            } else if (linked2.isVisible) {
                throw new IllegalStateException("Conflicting/ambiguous property name definitions (implicit name '" + this._name + "'): found multiple explicit names: " + collection + ", but also implicit accessor: " + linked2);
            }
        }
    }

    private Set<PropertyName> _findExplicitNames(Linked<? extends AnnotatedMember> linked, Set<PropertyName> set) {
        Linked<T> linked2;
        while (linked2 != null) {
            if (linked2.isNameExplicit && linked2.name != null) {
                if (set == null) {
                    set = new HashSet<>();
                }
                set.add(linked2.name);
            }
            Linked<T> linked3 = linked2.next;
            linked2 = linked;
            linked2 = linked3;
        }
        return set;
    }

    private <T extends AnnotatedMember> AnnotationMap _getAllAnnotations(Linked<T> linked) {
        AnnotationMap allAnnotations = ((AnnotatedMember) linked.value).getAllAnnotations();
        Linked<T> linked2 = linked.next;
        if (linked2 != null) {
            return AnnotationMap.merge(allAnnotations, _getAllAnnotations(linked2));
        }
        return allAnnotations;
    }

    private AnnotationMap _mergeAnnotations(int i10, Linked<? extends AnnotatedMember>... linkedArr) {
        AnnotationMap _getAllAnnotations = _getAllAnnotations(linkedArr[i10]);
        do {
            i10++;
            if (i10 >= linkedArr.length) {
                return _getAllAnnotations;
            }
        } while (linkedArr[i10] == null);
        return AnnotationMap.merge(_getAllAnnotations, _mergeAnnotations(i10, linkedArr));
    }

    private <T> Linked<T> _removeIgnored(Linked<T> linked) {
        if (linked == null) {
            return linked;
        }
        return linked.withoutIgnored();
    }

    private <T> Linked<T> _removeNonVisible(Linked<T> linked) {
        if (linked == null) {
            return linked;
        }
        return linked.withoutNonVisible();
    }

    private <T> Linked<T> _trimByVisibility(Linked<T> linked) {
        if (linked == null) {
            return linked;
        }
        return linked.trimByVisibility();
    }

    private static <T> Linked<T> merge(Linked<T> linked, Linked<T> linked2) {
        if (linked == null) {
            return linked2;
        }
        if (linked2 == null) {
            return linked;
        }
        return linked.append(linked2);
    }

    /* access modifiers changed from: protected */
    public String _findDefaultValue() {
        return (String) fromMemberAnnotations(new WithMember<String>() {
            public String withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.findPropertyDefaultValue(annotatedMember);
            }
        });
    }

    /* access modifiers changed from: protected */
    public String _findDescription() {
        return (String) fromMemberAnnotations(new WithMember<String>() {
            public String withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.findPropertyDescription(annotatedMember);
            }
        });
    }

    /* access modifiers changed from: protected */
    public Integer _findIndex() {
        return (Integer) fromMemberAnnotations(new WithMember<Integer>() {
            public Integer withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.findPropertyIndex(annotatedMember);
            }
        });
    }

    /* access modifiers changed from: protected */
    public Boolean _findRequired() {
        return (Boolean) fromMemberAnnotations(new WithMember<Boolean>() {
            public Boolean withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.hasRequiredMarker(annotatedMember);
            }
        });
    }

    /* access modifiers changed from: protected */
    public int _getterPriority(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.getName();
        if (name.startsWith(b.au) && name.length() > 3) {
            return 1;
        }
        if (!name.startsWith("is") || name.length() <= 2) {
            return 3;
        }
        return 2;
    }

    /* access modifiers changed from: protected */
    public int _setterPriority(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.getName();
        if (!name.startsWith("set") || name.length() <= 3) {
            return 2;
        }
        return 1;
    }

    public void addAll(POJOPropertyBuilder pOJOPropertyBuilder) {
        this._fields = merge(this._fields, pOJOPropertyBuilder._fields);
        this._ctorParameters = merge(this._ctorParameters, pOJOPropertyBuilder._ctorParameters);
        this._getters = merge(this._getters, pOJOPropertyBuilder._getters);
        this._setters = merge(this._setters, pOJOPropertyBuilder._setters);
    }

    public void addCtor(AnnotatedParameter annotatedParameter, PropertyName propertyName, boolean z10, boolean z11, boolean z12) {
        this._ctorParameters = new Linked(annotatedParameter, this._ctorParameters, propertyName, z10, z11, z12);
    }

    public void addField(AnnotatedField annotatedField, PropertyName propertyName, boolean z10, boolean z11, boolean z12) {
        this._fields = new Linked(annotatedField, this._fields, propertyName, z10, z11, z12);
    }

    public void addGetter(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z10, boolean z11, boolean z12) {
        this._getters = new Linked(annotatedMethod, this._getters, propertyName, z10, z11, z12);
    }

    public void addSetter(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z10, boolean z11, boolean z12) {
        this._setters = new Linked(annotatedMethod, this._setters, propertyName, z10, z11, z12);
    }

    public boolean anyIgnorals() {
        if (_anyIgnorals(this._fields) || _anyIgnorals(this._getters) || _anyIgnorals(this._setters) || _anyIgnorals(this._ctorParameters)) {
            return true;
        }
        return false;
    }

    public boolean anyVisible() {
        if (_anyVisible(this._fields) || _anyVisible(this._getters) || _anyVisible(this._setters) || _anyVisible(this._ctorParameters)) {
            return true;
        }
        return false;
    }

    public boolean couldDeserialize() {
        if (this._ctorParameters == null && this._setters == null && this._fields == null) {
            return false;
        }
        return true;
    }

    public boolean couldSerialize() {
        if (this._getters == null && this._fields == null) {
            return false;
        }
        return true;
    }

    public Collection<POJOPropertyBuilder> explode(Collection<PropertyName> collection) {
        HashMap hashMap = new HashMap();
        _explode(collection, hashMap, this._fields);
        _explode(collection, hashMap, this._getters);
        _explode(collection, hashMap, this._setters);
        _explode(collection, hashMap, this._ctorParameters);
        return hashMap.values();
    }

    public JsonProperty.Access findAccess() {
        return (JsonProperty.Access) fromMemberAnnotationsExcept(new WithMember<JsonProperty.Access>() {
            public JsonProperty.Access withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.findPropertyAccess(annotatedMember);
            }
        }, JsonProperty.Access.AUTO);
    }

    public Set<PropertyName> findExplicitNames() {
        Set<PropertyName> _findExplicitNames = _findExplicitNames(this._ctorParameters, _findExplicitNames(this._setters, _findExplicitNames(this._getters, _findExplicitNames(this._fields, (Set<PropertyName>) null))));
        if (_findExplicitNames == null) {
            return Collections.emptySet();
        }
        return _findExplicitNames;
    }

    public JsonInclude.Value findInclusion() {
        JsonInclude.Value value;
        AnnotatedMember accessor = getAccessor();
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            value = null;
        } else {
            value = annotationIntrospector.findPropertyInclusion(accessor);
        }
        if (value == null) {
            return JsonInclude.Value.empty();
        }
        return value;
    }

    public ObjectIdInfo findObjectIdInfo() {
        return (ObjectIdInfo) fromMemberAnnotations(new WithMember<ObjectIdInfo>() {
            public ObjectIdInfo withMember(AnnotatedMember annotatedMember) {
                ObjectIdInfo findObjectIdInfo = POJOPropertyBuilder.this._annotationIntrospector.findObjectIdInfo(annotatedMember);
                return findObjectIdInfo != null ? POJOPropertyBuilder.this._annotationIntrospector.findObjectReferenceInfo(annotatedMember, findObjectIdInfo) : findObjectIdInfo;
            }
        });
    }

    public AnnotationIntrospector.ReferenceProperty findReferenceType() {
        return (AnnotationIntrospector.ReferenceProperty) fromMemberAnnotations(new WithMember<AnnotationIntrospector.ReferenceProperty>() {
            public AnnotationIntrospector.ReferenceProperty withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.findReferenceType(annotatedMember);
            }
        });
    }

    public Class<?>[] findViews() {
        return (Class[]) fromMemberAnnotations(new WithMember<Class<?>[]>() {
            public Class<?>[] withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.findViews(annotatedMember);
            }
        });
    }

    /* access modifiers changed from: protected */
    public <T> T fromMemberAnnotations(WithMember<T> withMember) {
        Linked<AnnotatedField> linked;
        Linked<AnnotatedMethod> linked2;
        T t10 = null;
        if (this._annotationIntrospector == null) {
            return null;
        }
        if (this._forSerialization) {
            Linked<AnnotatedMethod> linked3 = this._getters;
            if (linked3 != null) {
                t10 = withMember.withMember((AnnotatedMember) linked3.value);
            }
        } else {
            Linked<AnnotatedParameter> linked4 = this._ctorParameters;
            if (linked4 != null) {
                t10 = withMember.withMember((AnnotatedMember) linked4.value);
            }
            if (t10 == null && (linked2 = this._setters) != null) {
                t10 = withMember.withMember((AnnotatedMember) linked2.value);
            }
        }
        if (t10 != null || (linked = this._fields) == null) {
            return t10;
        }
        return withMember.withMember((AnnotatedMember) linked.value);
    }

    /* access modifiers changed from: protected */
    public <T> T fromMemberAnnotationsExcept(WithMember<T> withMember, T t10) {
        T withMember2;
        T withMember3;
        T withMember4;
        T withMember5;
        T withMember6;
        T withMember7;
        T withMember8;
        T withMember9;
        if (this._annotationIntrospector == null) {
            return null;
        }
        if (this._forSerialization) {
            Linked<AnnotatedMethod> linked = this._getters;
            if (linked != null && (withMember9 = withMember.withMember((AnnotatedMember) linked.value)) != null && withMember9 != t10) {
                return withMember9;
            }
            Linked<AnnotatedField> linked2 = this._fields;
            if (linked2 != null && (withMember8 = withMember.withMember((AnnotatedMember) linked2.value)) != null && withMember8 != t10) {
                return withMember8;
            }
            Linked<AnnotatedParameter> linked3 = this._ctorParameters;
            if (linked3 != null && (withMember7 = withMember.withMember((AnnotatedMember) linked3.value)) != null && withMember7 != t10) {
                return withMember7;
            }
            Linked<AnnotatedMethod> linked4 = this._setters;
            if (linked4 == null || (withMember6 = withMember.withMember((AnnotatedMember) linked4.value)) == null || withMember6 == t10) {
                return null;
            }
            return withMember6;
        }
        Linked<AnnotatedParameter> linked5 = this._ctorParameters;
        if (linked5 != null && (withMember5 = withMember.withMember((AnnotatedMember) linked5.value)) != null && withMember5 != t10) {
            return withMember5;
        }
        Linked<AnnotatedMethod> linked6 = this._setters;
        if (linked6 != null && (withMember4 = withMember.withMember((AnnotatedMember) linked6.value)) != null && withMember4 != t10) {
            return withMember4;
        }
        Linked<AnnotatedField> linked7 = this._fields;
        if (linked7 != null && (withMember3 = withMember.withMember((AnnotatedMember) linked7.value)) != null && withMember3 != t10) {
            return withMember3;
        }
        Linked<AnnotatedMethod> linked8 = this._getters;
        if (linked8 == null || (withMember2 = withMember.withMember((AnnotatedMember) linked8.value)) == null || withMember2 == t10) {
            return null;
        }
        return withMember2;
    }

    public AnnotatedMember getAccessor() {
        AnnotatedMethod getter = getGetter();
        if (getter == null) {
            return getField();
        }
        return getter;
    }

    public AnnotatedParameter getConstructorParameter() {
        Linked linked = this._ctorParameters;
        if (linked == null) {
            return null;
        }
        while (!(((AnnotatedParameter) linked.value).getOwner() instanceof AnnotatedConstructor)) {
            linked = linked.next;
            if (linked == null) {
                return (AnnotatedParameter) this._ctorParameters.value;
            }
        }
        return (AnnotatedParameter) linked.value;
    }

    public Iterator<AnnotatedParameter> getConstructorParameters() {
        Linked<AnnotatedParameter> linked = this._ctorParameters;
        if (linked == null) {
            return ClassUtil.emptyIterator();
        }
        return new MemberIterator(linked);
    }

    public AnnotatedField getField() {
        Linked<AnnotatedField> linked = this._fields;
        if (linked == null) {
            return null;
        }
        AnnotatedField annotatedField = (AnnotatedField) linked.value;
        Linked<T> linked2 = linked.next;
        while (linked2 != null) {
            AnnotatedField annotatedField2 = (AnnotatedField) linked2.value;
            Class<?> declaringClass = annotatedField.getDeclaringClass();
            Class<?> declaringClass2 = annotatedField2.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    annotatedField = annotatedField2;
                } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                }
                linked2 = linked2.next;
            }
            throw new IllegalArgumentException("Multiple fields representing property \"" + getName() + "\": " + annotatedField.getFullName() + " vs " + annotatedField2.getFullName());
        }
        return annotatedField;
    }

    public PropertyName getFullName() {
        return this._name;
    }

    public AnnotatedMethod getGetter() {
        Linked<AnnotatedMethod> linked = this._getters;
        if (linked == null) {
            return null;
        }
        Linked<T> linked2 = linked.next;
        if (linked2 == null) {
            return (AnnotatedMethod) linked.value;
        }
        while (linked2 != null) {
            Class<?> declaringClass = ((AnnotatedMethod) linked.value).getDeclaringClass();
            Class<?> declaringClass2 = ((AnnotatedMethod) linked2.value).getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (!declaringClass.isAssignableFrom(declaringClass2)) {
                    if (declaringClass2.isAssignableFrom(declaringClass)) {
                        continue;
                        linked2 = linked2.next;
                    }
                }
                linked = linked2;
                linked2 = linked2.next;
            }
            int _getterPriority = _getterPriority((AnnotatedMethod) linked2.value);
            int _getterPriority2 = _getterPriority((AnnotatedMethod) linked.value);
            if (_getterPriority != _getterPriority2) {
                if (_getterPriority >= _getterPriority2) {
                    linked2 = linked2.next;
                }
                linked = linked2;
                linked2 = linked2.next;
            } else {
                throw new IllegalArgumentException("Conflicting getter definitions for property \"" + getName() + "\": " + ((AnnotatedMethod) linked.value).getFullName() + " vs " + ((AnnotatedMethod) linked2.value).getFullName());
            }
        }
        this._getters = linked.withoutNext();
        return (AnnotatedMethod) linked.value;
    }

    public String getInternalName() {
        return this._internalName.getSimpleName();
    }

    public PropertyMetadata getMetadata() {
        Boolean _findRequired = _findRequired();
        String _findDescription = _findDescription();
        Integer _findIndex = _findIndex();
        String _findDefaultValue = _findDefaultValue();
        if (_findRequired != null || _findIndex != null || _findDefaultValue != null) {
            return PropertyMetadata.construct(_findRequired, _findDescription, _findIndex, _findDefaultValue);
        }
        PropertyMetadata propertyMetadata = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        if (_findDescription == null) {
            return propertyMetadata;
        }
        return propertyMetadata.withDescription(_findDescription);
    }

    public AnnotatedMember getMutator() {
        AnnotatedParameter constructorParameter = getConstructorParameter();
        if (constructorParameter != null) {
            return constructorParameter;
        }
        AnnotatedMethod setter = getSetter();
        if (setter == null) {
            return getField();
        }
        return setter;
    }

    public String getName() {
        PropertyName propertyName = this._name;
        if (propertyName == null) {
            return null;
        }
        return propertyName.getSimpleName();
    }

    public AnnotatedMember getNonConstructorMutator() {
        AnnotatedMethod setter = getSetter();
        if (setter == null) {
            return getField();
        }
        return setter;
    }

    public AnnotatedMember getPrimaryMember() {
        if (this._forSerialization) {
            return getAccessor();
        }
        return getMutator();
    }

    public AnnotatedMethod getSetter() {
        Linked<AnnotatedMethod> linked = this._setters;
        if (linked == null) {
            return null;
        }
        Linked<T> linked2 = linked.next;
        if (linked2 == null) {
            return (AnnotatedMethod) linked.value;
        }
        while (linked2 != null) {
            Class<?> declaringClass = ((AnnotatedMethod) linked.value).getDeclaringClass();
            Class<?> declaringClass2 = ((AnnotatedMethod) linked2.value).getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (!declaringClass.isAssignableFrom(declaringClass2)) {
                    if (declaringClass2.isAssignableFrom(declaringClass)) {
                        continue;
                        linked2 = linked2.next;
                    }
                }
                linked = linked2;
                linked2 = linked2.next;
            }
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) linked2.value;
            AnnotatedMethod annotatedMethod2 = (AnnotatedMethod) linked.value;
            int _setterPriority = _setterPriority(annotatedMethod);
            int _setterPriority2 = _setterPriority(annotatedMethod2);
            if (_setterPriority != _setterPriority2) {
                if (_setterPriority >= _setterPriority2) {
                    linked2 = linked2.next;
                }
                linked = linked2;
                linked2 = linked2.next;
            } else {
                AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
                if (annotationIntrospector != null) {
                    AnnotatedMethod resolveSetterConflict = annotationIntrospector.resolveSetterConflict(this._config, annotatedMethod2, annotatedMethod);
                    if (resolveSetterConflict != annotatedMethod2) {
                        if (resolveSetterConflict != annotatedMethod) {
                        }
                        linked = linked2;
                        linked2 = linked2.next;
                    } else {
                        continue;
                        linked2 = linked2.next;
                    }
                }
                throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s vs %s", new Object[]{getName(), ((AnnotatedMethod) linked.value).getFullName(), ((AnnotatedMethod) linked2.value).getFullName()}));
            }
        }
        this._setters = linked.withoutNext();
        return (AnnotatedMethod) linked.value;
    }

    public PropertyName getWrapperName() {
        AnnotationIntrospector annotationIntrospector;
        AnnotatedMember primaryMember = getPrimaryMember();
        if (primaryMember == null || (annotationIntrospector = this._annotationIntrospector) == null) {
            return null;
        }
        return annotationIntrospector.findWrapperName(primaryMember);
    }

    public boolean hasConstructorParameter() {
        if (this._ctorParameters != null) {
            return true;
        }
        return false;
    }

    public boolean hasField() {
        if (this._fields != null) {
            return true;
        }
        return false;
    }

    public boolean hasGetter() {
        if (this._getters != null) {
            return true;
        }
        return false;
    }

    public boolean hasName(PropertyName propertyName) {
        return this._name.equals(propertyName);
    }

    public boolean hasSetter() {
        if (this._setters != null) {
            return true;
        }
        return false;
    }

    public boolean isExplicitlyIncluded() {
        if (_anyExplicits(this._fields) || _anyExplicits(this._getters) || _anyExplicits(this._setters) || _anyExplicitNames(this._ctorParameters)) {
            return true;
        }
        return false;
    }

    public boolean isExplicitlyNamed() {
        if (_anyExplicitNames(this._fields) || _anyExplicitNames(this._getters) || _anyExplicitNames(this._setters) || _anyExplicitNames(this._ctorParameters)) {
            return true;
        }
        return false;
    }

    public boolean isTypeId() {
        Boolean bool = (Boolean) fromMemberAnnotations(new WithMember<Boolean>() {
            public Boolean withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.isTypeId(annotatedMember);
            }
        });
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public void mergeAnnotations(boolean z10) {
        if (z10) {
            Linked<AnnotatedMethod> linked = this._getters;
            if (linked != null) {
                this._getters = _applyAnnotations(this._getters, _mergeAnnotations(0, linked, this._fields, this._ctorParameters, this._setters));
                return;
            }
            Linked<AnnotatedField> linked2 = this._fields;
            if (linked2 != null) {
                this._fields = _applyAnnotations(this._fields, _mergeAnnotations(0, linked2, this._ctorParameters, this._setters));
                return;
            }
            return;
        }
        Linked<AnnotatedParameter> linked3 = this._ctorParameters;
        if (linked3 != null) {
            this._ctorParameters = _applyAnnotations(this._ctorParameters, _mergeAnnotations(0, linked3, this._setters, this._fields, this._getters));
            return;
        }
        Linked<AnnotatedMethod> linked4 = this._setters;
        if (linked4 != null) {
            this._setters = _applyAnnotations(this._setters, _mergeAnnotations(0, linked4, this._fields, this._getters));
            return;
        }
        Linked<AnnotatedField> linked5 = this._fields;
        if (linked5 != null) {
            this._fields = _applyAnnotations(this._fields, _mergeAnnotations(0, linked5, this._getters));
        }
    }

    public void removeConstructors() {
        this._ctorParameters = null;
    }

    public void removeIgnored() {
        this._fields = _removeIgnored(this._fields);
        this._getters = _removeIgnored(this._getters);
        this._setters = _removeIgnored(this._setters);
        this._ctorParameters = _removeIgnored(this._ctorParameters);
    }

    public JsonProperty.Access removeNonVisible(boolean z10) {
        JsonProperty.Access findAccess = findAccess();
        if (findAccess == null) {
            findAccess = JsonProperty.Access.AUTO;
        }
        int i10 = AnonymousClass10.$SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access[findAccess.ordinal()];
        if (i10 == 1) {
            this._setters = null;
            this._ctorParameters = null;
            if (!this._forSerialization) {
                this._fields = null;
            }
        } else if (i10 != 2) {
            if (i10 != 3) {
                this._getters = _removeNonVisible(this._getters);
                this._ctorParameters = _removeNonVisible(this._ctorParameters);
                if (!z10 || this._getters == null) {
                    this._fields = _removeNonVisible(this._fields);
                    this._setters = _removeNonVisible(this._setters);
                }
            } else {
                this._getters = null;
                if (this._forSerialization) {
                    this._fields = null;
                }
            }
        }
        return findAccess;
    }

    public String toString() {
        return "[Property '" + this._name + "'; ctors: " + this._ctorParameters + ", field(s): " + this._fields + ", getter(s): " + this._getters + ", setter(s): " + this._setters + "]";
    }

    public void trimByVisibility() {
        this._fields = _trimByVisibility(this._fields);
        this._getters = _trimByVisibility(this._getters);
        this._setters = _trimByVisibility(this._setters);
        this._ctorParameters = _trimByVisibility(this._ctorParameters);
    }

    protected POJOPropertyBuilder(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z10, PropertyName propertyName, PropertyName propertyName2) {
        this._config = mapperConfig;
        this._annotationIntrospector = annotationIntrospector;
        this._internalName = propertyName;
        this._name = propertyName2;
        this._forSerialization = z10;
    }

    public int compareTo(POJOPropertyBuilder pOJOPropertyBuilder) {
        if (this._ctorParameters != null) {
            if (pOJOPropertyBuilder._ctorParameters == null) {
                return -1;
            }
        } else if (pOJOPropertyBuilder._ctorParameters != null) {
            return 1;
        }
        return getName().compareTo(pOJOPropertyBuilder.getName());
    }

    public POJOPropertyBuilder withName(PropertyName propertyName) {
        return new POJOPropertyBuilder(this, propertyName);
    }

    public POJOPropertyBuilder withSimpleName(String str) {
        PropertyName withSimpleName = this._name.withSimpleName(str);
        return withSimpleName == this._name ? this : new POJOPropertyBuilder(this, withSimpleName);
    }

    public POJOPropertyBuilder(POJOPropertyBuilder pOJOPropertyBuilder, PropertyName propertyName) {
        this._config = pOJOPropertyBuilder._config;
        this._annotationIntrospector = pOJOPropertyBuilder._annotationIntrospector;
        this._internalName = pOJOPropertyBuilder._internalName;
        this._name = propertyName;
        this._fields = pOJOPropertyBuilder._fields;
        this._ctorParameters = pOJOPropertyBuilder._ctorParameters;
        this._getters = pOJOPropertyBuilder._getters;
        this._setters = pOJOPropertyBuilder._setters;
        this._forSerialization = pOJOPropertyBuilder._forSerialization;
    }
}
