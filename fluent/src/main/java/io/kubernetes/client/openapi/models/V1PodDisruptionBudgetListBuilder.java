package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1PodDisruptionBudgetListBuilder extends io.kubernetes.client.openapi.models.V1PodDisruptionBudgetListFluentImpl<io.kubernetes.client.openapi.models.V1PodDisruptionBudgetListBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1PodDisruptionBudgetList,io.kubernetes.client.openapi.models.V1PodDisruptionBudgetListBuilder>{
  public V1PodDisruptionBudgetListBuilder() {
    this(false);
  }
  public V1PodDisruptionBudgetListBuilder(java.lang.Boolean validationEnabled) {
    this(new V1PodDisruptionBudgetList(), validationEnabled);
  }
  public V1PodDisruptionBudgetListBuilder(io.kubernetes.client.openapi.models.V1PodDisruptionBudgetListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodDisruptionBudgetListBuilder(io.kubernetes.client.openapi.models.V1PodDisruptionBudgetListFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1PodDisruptionBudgetList(), validationEnabled);
  }
  public V1PodDisruptionBudgetListBuilder(io.kubernetes.client.openapi.models.V1PodDisruptionBudgetListFluent<?> fluent,io.kubernetes.client.openapi.models.V1PodDisruptionBudgetList instance) {
    this(fluent, instance, false);
  }
  public V1PodDisruptionBudgetListBuilder(io.kubernetes.client.openapi.models.V1PodDisruptionBudgetListFluent<?> fluent,io.kubernetes.client.openapi.models.V1PodDisruptionBudgetList instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1PodDisruptionBudgetListBuilder(io.kubernetes.client.openapi.models.V1PodDisruptionBudgetList instance) {
    this(instance,false);
  }
  public V1PodDisruptionBudgetListBuilder(io.kubernetes.client.openapi.models.V1PodDisruptionBudgetList instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1PodDisruptionBudgetListFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1PodDisruptionBudgetList build() {
    V1PodDisruptionBudgetList buildable = new V1PodDisruptionBudgetList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PodDisruptionBudgetListBuilder that = (V1PodDisruptionBudgetListBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}